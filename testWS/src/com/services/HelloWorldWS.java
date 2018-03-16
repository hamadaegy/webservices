package com.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName="hello")
@SOAPBinding(style=Style.RPC)
public interface HelloWorldWS
{
	@WebMethod
	String goToHell();
}
