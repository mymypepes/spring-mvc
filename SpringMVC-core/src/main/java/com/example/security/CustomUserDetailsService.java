package com.example.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.converter.UserConverter;
import com.example.dto.MyUserDetail;
import com.example.dto.RoleDto;
import com.example.dto.UserDto;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserConverter userConverter;
	
	@Override
	@Transactional(readOnly = true) // Transactional: 1 phiên giao dịch gồm 2 ý:
	//+1: Phiên giao dịch phải đồng bộ 4 bước và thành công 4 bước
	//+2: Phiên giao dịch bị lỗi ở bước 1 or 2 or 3 chỉ được lưu ở dưới log(không được lưu ở dưới db), nếu 4 bước thành công sẽ lưu dưới db
	// readOnly: chỉ được quyền đọc
	public UserDetails loadUserByUsername(String username){
		UserEntity entity = userRepository.findByUserName(username);
		UserDto userDto = userConverter.convertEntityToDto(entity);
		// kiểm tra coi user có tồn tại trong db ko
		if(userDto == null) {
			throw new UsernameNotFoundException("user not found");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();// lấy tất cả các quyền của user đag login
		for(RoleDto roleDto : userDto.getRoles()) {
			SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(roleDto.getRoleId());
			authorities.add(simpleGrantedAuthority);
		}
		MyUserDetail myUserDetail = new MyUserDetail(username, userDto.getPassWord(), true, true, true, true, authorities);
		myUserDetail.setFullName(userDto.getFullName()); 
		
		return myUserDetail;
	}

}
