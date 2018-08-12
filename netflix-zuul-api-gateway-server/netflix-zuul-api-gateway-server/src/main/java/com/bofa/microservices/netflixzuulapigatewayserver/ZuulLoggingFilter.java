package com.bofa.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter{

	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		//real logic implement here	
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		LOG.info("Request -> {} Request URI -> {}",request, request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
	//when should be execute pre,post,error	
		return "pre"; 
	}

	@Override
	public int filterOrder() {
		//set priority based on FilterType -r ZuulFilter, SecurityFilter
		return 1;
	}
	
}
