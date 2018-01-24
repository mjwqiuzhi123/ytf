package com.mg.app.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class ETHUtils {
	//用户名
		private  String ACCESS_KEY = null;
		//密码
		private  String SECRET_KEY = null;
		//钱包IP地址
		private  String IP = null;
		//端口
		private  String PORT = null;
		//比特币钱包密码
		private  String PASSWORD = null;
	
//	'{"jsonrpc":"2.0","method":"eth_getBalance","params":["0x407d73d8a49eeb85d32cf465507dd71d507100c1", "latest"],"id":1}'
	public String main(String method,String condition) throws Exception {
        String result = "";
		String tonce = "" + (System.currentTimeMillis() * 1000);
		String params = "tonce=" + tonce.toString()
				//+ "&accesskey="
				//+ ACCESS_KEY
				+ "&requestmethod=post&id=1&method="+method+"&params="+condition;

		String url = "http://"+"localhost"+":"+"8545"; // 119.28.16.55
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("accept", "*/*");
		con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
		con.setRequestProperty("Json-Rpc-Tonce", tonce.toString());
		
		if(condition == null)
			return "参数不能为null";
		//String postdata = "{\"jsonrpc\":\"2.0\",\"method\":\""+method+"\", \"params\":"+condition+", \"id\": 1}";
		String postdata = condition;
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(postdata);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		if(responseCode != 200){
			return "{\"result\":null,\"error\":"+responseCode+",\"id\":1}";
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		inputLine = in.readLine();
		response.append(inputLine);
		in.close();
		result = response.toString();
		return result;
	}
	
}
