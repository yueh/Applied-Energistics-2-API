package appeng.api.storage;

import java.util.Iterator;
import java.util.LinkedList;

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
public class MEMontorHandler<StackType extends IAEStack> implements IMEInventoryHandler<StackType>
{

	private final IMEInventoryHandler<StackType> internal;
	private final LinkedList<IMEMontorHandlerReciever<StackType>> listeners = new LinkedList<IMEMontorHandlerReciever<StackType>>();

	public MEMontorHandler(IMEInventoryHandler<StackType> t) {
		internal = t;
	}

	public void addListener(IMEMontorHandlerReciever<StackType> l)
	{
		listeners.add( l );
	}

	public void removeListener(IMEMontorHandlerReciever<StackType> l)
	{
		listeners.remove( l );
	}

	private StackType monitorDiffrence(IAEStack original, StackType leftOvers, boolean extraction)
	{
		StackType diff = (StackType) original.copy();

		if ( extraction )
			diff.setStackSize( leftOvers == null ? 0 : -leftOvers.getStackSize() );
		else if ( leftOvers != null )
			diff.decStackSize( leftOvers.getStackSize() );

		if ( diff.getStackSize() != 0 )
		{
			Iterator<IMEMontorHandlerReciever<StackType>> i = listeners.iterator();
			while (i.hasNext())
			{
				IMEMontorHandlerReciever<StackType> recv = i.next();
				recv.postChange( diff );
			}
		}

		return leftOvers;
	}

	@Override
	public StackType injectItems(StackType input, Actionable mode)
	{
		if ( mode == Actionable.SIMULATE )
			return internal.injectItems( input, mode );
		return monitorDiffrence( (StackType) input.copy(), internal.injectItems( input, mode ), false );
	}

	@Override
	public StackType extractItems(StackType request, Actionable mode)
	{
		if ( mode == Actionable.SIMULATE )
			return internal.extractItems( request, mode );
		return monitorDiffrence( (StackType) request.copy(), internal.extractItems( request, mode ), true );
	}

	@Override
	public IItemList<StackType> getAvailableItems(IItemList out)
	{
		return internal.getAvailableItems( out );
	}

	@Override
	public StorageChannel getChannel()
	{
		return internal.getChannel();
	}

	@Override
	public AccessRestriction getAccess()
	{
		return internal.getAccess();
	}

	@Override
	public boolean isPrioritized(StackType input)
	{
		return internal.isPrioritized( input );
	}

	@Override
	public boolean canAccept(StackType input)
	{
		return internal.canAccept( input );
	}

	@Override
	public int getPriority()
	{
		return internal.getPriority();
	}

	@Override
	public int getSlot()
	{
		return internal.getSlot();
	}

}
