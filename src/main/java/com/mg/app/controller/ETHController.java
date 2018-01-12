package com.mg.app.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mg.app.bean.ETHModel;
import com.mg.app.service.ETHService;

@Controller
@RequestMapping({"/eth"})
public class ETHController {
	
	@Autowired
	ETHService ETHService;
	
	@RequestMapping("/requestPage")
	public ModelAndView request(){
		return new ModelAndView("ETH");
	}
	
    @RequestMapping("/getBalance")
    public ModelAndView getBalance(ETHModel model) throws Exception {
    	JSONObject BalanceJb = ETHService.getbalance(model.getAddress().trim());
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("Balance", BalanceJb);
    	mv.setViewName("ETH");
        return mv;
    }
    
    // 添加钱包
    @RequestMapping("/getNewaddress")
    public ModelAndView getNewAddress(ETHModel model) throws Exception {
    	JSONObject  newAddressJb = ETHService.getNewaddress(model.getPassword().trim());
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("newAddress", newAddressJb);
    	mv.setViewName("ETH");
        return mv;
    }
    
    // 获取账户数量
    @RequestMapping("/accounts")
    public ModelAndView eth_accounts(ETHModel model) throws Exception {
    	JSONObject  accountsJb = ETHService.eth_accounts();
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("accounts", accountsJb);
    	mv.setViewName("ETH");
        return mv;
    }
}
