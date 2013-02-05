package com.linkedhole.marketplace.antsrun.account;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class AccountHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

	public boolean supportsParameter(MethodParameter parameter) {
		//return Account.class.isAssignableFrom(parameter.getParameterType());
		return false;
	}

	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest webRequest,	WebDataBinderFactory binderFactory) throws Exception {
		//Authentication auth = (Authentication) webRequest.getAttribute(name, scope);
		//return auth != null && auth.getPrincipal() instanceof Account ? auth.getPrincipal() : null;
		return null;
	}
	
}
