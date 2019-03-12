package br.com.itau.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.helpers.LogUtil;

@RestController
public class HomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		LogUtil logUtil = new LogUtil();
		logUtil.WriteLog("Acesso a aplicação Logtest - hello");
		
		return "Hello World - logtest";
	}
	
	@RequestMapping(value = "/writelog/{msg}", method = RequestMethod.GET)
	public String writeLog(@PathVariable("msg") String msg) {
		
		msg = String.format("Log de: %s", msg);
		
		LogUtil logUtil = new LogUtil();
		logUtil.WriteLog(msg);
		
		return msg;
	}
	
	@RequestMapping(value = "/divide/{n1}/{n2}", method = RequestMethod.GET)
	public @ResponseBody double divide(@PathVariable("n1") double n1, @PathVariable("n2") double n2) {
		try {
			if(n2 == 0) {
				throw new Exception("Divisão por zero");
			}
			return n1 / n2;
		}
		catch(Exception exc) {
			String message = String.format("Erro realizar a operação, usando os valores: %s e %s.\n Detalhes: %s", n1, n2, exc.getMessage());
			
			LogUtil logUtil = new LogUtil();
			logUtil.WriteLog(message);
		}
		
		return 0;
	}
}
