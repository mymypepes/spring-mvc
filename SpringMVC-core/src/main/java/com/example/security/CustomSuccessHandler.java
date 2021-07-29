package com.example.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}
	
	public void setRedirectStrategy(final RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}
	
	@Override
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		String url = determineTargetUrl();
		if(response.isCommitted()) {
			return;
		}
		redirectStrategy.sendRedirect(request, response, url);
		
	}
	public String determineTargetUrl() {
		String result = "";
		List<String> roles = SecurityUtils.getAuthorities();
		// kiểm tra những role này là admin hay user và trả ra url của trang admin hoặc user
		if(isAdmin(roles)) {
			result = "/admin";
		}else if(isUser(roles)) {
			result = "/";
		}
		return result;
		
	}
	public boolean isUser(List<String> roles) {
		if(roles.contains("USER")) {
			return true;
		}
		return false;
		
	}
	public boolean isAdmin(List<String> roles) {
		if(roles.contains("ADMIN")) {
			return true;
		}
		return false;
		
	}
	
}
