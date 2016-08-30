package model.dao;



import java.util.HashMap;

import model.dto.User;

public class UserDao{


	//회원추가 
	public int addUser(User user) {
		int check = 0;
		return check;
	}
	
	//비밀번호 수정
	public int updatePassword(User user) {
		int check = 0;
		return check;
	}
		
	//아이디 중복체크
	public int checkId(String id) {
		int check = 0;
		return check;
	}

	//로그인 아이디 패스워드 체크
	public int checkUser(String id, String password) {
		int check = 0;
		return check;
	}
	
	//개인회원정보 가져오기
	public User userInfo(String id) {
		User user = null;
		return user;
	}
	
	//전체회원정보
	public HashMap userListCont() {
		HashMap map =null;
		return map;
	}
	
	//회원수
	public int userLength(){
		int check = 0;
		return check;
	}
	
	
	
}
