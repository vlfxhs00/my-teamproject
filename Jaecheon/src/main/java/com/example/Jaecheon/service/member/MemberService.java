package com.example.Jaecheon.service.member;

import javax.servlet.http.HttpSession;

import com.example.Jaecheon.model.member.dto.MemberDTO;

public interface MemberService {
	public boolean loginCheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
	public MemberDTO viewMember(String userid);
	

}
