package appeng.api.storage;

import appeng.api.storage.data.IAEStack;

public interface IMEMontorHandlerReciever<StackType extends IAEStack>
{

	void postChange(StackType change);

}
