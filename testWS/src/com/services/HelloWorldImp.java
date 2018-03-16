package com.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.services.HelloWorldWS")
public class HelloWorldImp implements HelloWorldWS
{
	public String goToHell()
	{
		return "FFFFFFFFFFXXXXXXXXXXXXXX";
	}
}
