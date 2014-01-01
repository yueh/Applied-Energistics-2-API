package appeng.api.storage;

import appeng.api.storage.data.IAEStack;

public interface IMEMonitorHandlerReciever<StackType extends IAEStack>
{

	/**
	 * return true if this object should remain as a listener.
	 * 
	 * @param verificationToken
	 * @return
	 */
	boolean isValid(Object verificationToken);

	/**
	 * called when changes are made to the Monitor, but only if listener is still valid.
	 * 
	 * @param change
	 */
	void postChange(StackType change);

}
