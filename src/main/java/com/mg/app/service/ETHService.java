package com.mg.app.service;

import net.sf.json.JSONObject;


public interface ETHService {
	// 新建钱包
	public JSONObject getNewaddress(String walletPassword) throws Exception;

	// 获取账户数量
	public JSONObject eth_accounts() throws Exception;
	
	public JSONObject getbalance(String address) throws Exception;

	public JSONObject getAbstractMethod(String method, String paramsString) throws Exception;

	public JSONObject getBalance(String walletAddress) throws Exception;
	
}
