package com.ncu.Security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebInitializer extends 
AbstractSecurityWebApplicationInitializer {
	public SecurityWebInitializer() {
		super(DemoSecurityConfigApp.class);
	}
}

