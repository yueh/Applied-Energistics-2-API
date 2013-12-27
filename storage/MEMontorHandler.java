package appeng.api.storage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import appeng.api.AEApi;
import appeng.api.config.AccessRestriction;
import appeng.api.config.Actionable;
import appeng.api.storage.data.IAEStack;
import appeng.api.storage.data.IItemList;

/**
 * Common implementation of a simple class that monitors injection/extraction of a inventory to send events to a list of
 * listeners.
 * 
 * @param <StackType>
 */
public class MEMontorHandler<StackType extends IAEStack> implements IMEMonitor<StackType>
{

	private final IMEInventoryHandler<StackType> internalHandler;
	private final IItemList<StackType> cachedList = AEApi.instance().storage().createItemList();
	private final HashMap<IMEMontorHandlerReciever<StackType>, Object> listeners = new HashMap<IMEMontorHandlerReciever<StackType>, Object>();

	private boolean hasChanged = true;

	protected IMEInventoryHandler<StackType> getHandler()
	{
		return internalHandler;
	}

	protected void postChange(StackType diff)
	{
		hasChanged = true;// need to update the cache.
		Iterator<Entry<IMEMontorHandlerReciever<StackType>, Object>> i = listeners.entrySet().iterator();
		while (i.hasNext())
		{
			Entry<IMEMontorHandlerReciever<StackType>, Object> o = i.next();
			IMEMontorHandlerReciever<StackType> recv = o.getKey();
			if ( recv.isValid( o.getValue() ) )
				recv.postChange( diff );
			else
				i.remove();
		}
	}

	private StackType monitorDiffrence(IAEStack original, StackType leftOvers, boolean extraction)
	{
		StackType diff = (StackType) original.copy();

		if ( extraction )
			diff.setStackSize( leftOvers == null ? 0 : -leftOvers.getStackSize() );
		else if ( leftOvers != null )
			diff.decStackSize( leftOvers.getStackSize() );

		if ( diff.getStackSize() != 0 )
			postChange( diff );

		return leftOvers;
	}

	public MEMontorHandler(IMEInventoryHandler<StackType> t) {
		internalHandler = t;
	}

	@Override
	public void addListener(IMEMontorHandlerReciever<StackType> l, Object verificationToken)
	{
		listeners.put( l, verificationToken );
	}

	@Override
	public void removeListener(IMEMontorHandlerReciever<StackType> l)
	{
		listeners.remove( l );
	}

	@Override
	public StackType injectItems(StackType input, Actionable mode)
	{
		if ( mode == Actionable.SIMULATE )
			return getHandler().injectItems( input, mode );
		return monitorDiffrence( (StackType) input.copy(), getHandler().injectItems( input, mode ), false );
	}

	@Override
	public StackType extractItems(StackType request, Actionable mode)
	{
		if ( mode == Actionable.SIMULATE )
			return getHandler().extractItems( request, mode );
		return monitorDiffrence( (StackType) request.copy(), getHandler().extractItems( request, mode ), true );
	}

	@Override
	public IItemList<StackType> getStorageList()
	{
		if ( hasChanged )
		{
			hasChanged = false;
			cachedList.resetStatus();
			return getAvailableItems( cachedList );
		}

		return cachedList;
	}

	@Override
	public IItemList<StackType> getAvailableItems(IItemList out)
	{
		return getHandler().getAvailableItems( out );
	}

	@Override
	public StorageChannel getChannel()
	{
		return getHandler().getChannel();
	}

	@Override
	public AccessRestriction getAccess()
	{
		return getHandler().getAccess();
	}

	@Override
	public boolean isPrioritized(StackType input)
	{
		return getHandler().isPrioritized( input );
	}

	@Override
	public boolean canAccept(StackType input)
	{
		return getHandler().canAccept( input );
	}

	@Override
	public int getPriority()
	{
		return getHandler().getPriority();
	}

	@Override
	public int getSlot()
	{
		return getHandler().getSlot();
	}

}
