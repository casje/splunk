package br.com.itau.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
	
	Logger logger = LoggerFactory.getLogger(LogUtil.class);
	//Logger logger = LoggerFactory.getLogger("jsonLogger");
	
	public void WriteLog(String message) {
		
		logger.trace(message);

	}
}
