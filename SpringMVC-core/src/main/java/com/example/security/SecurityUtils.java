package com.example.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.example.dto.MyUserDetail;

public class SecurityUtils {
	public static MyUserDetail getPrincipal() {
		return (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal(); //lay lai user vua dang nhap
	}
	public static List<String> getAuthorities() {
		List<String> result = new ArrayList<>();
		// lấy lại những quyền mà đã đc setter trong customUserDetailsService
		List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
		for(GrantedAuthority authority : authorities) {
			result.add(authority.getAuthority());
		}
		return result;
	}
	public static boolean  incognito() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		/*if(auth == null) {
			return true;
		}
			return false;*/
		return auth == null ? true : false;
	}
}
