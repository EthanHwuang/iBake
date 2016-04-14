package com.mxchip.callbacks;

public abstract ControlDeviceCallBack {
	public void onSuccess(String message);
	public void onFailure(int code, String message);
	public void onDeviceStatusReceived(String msgType, String messages);
}
