package com.sysveda.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysveda.microservices.limitsservices.bean.LimitConfiguration;



@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrivelimitsFromConfiguratoin() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
		
	}
	
}
