package creatboard14.dto;

import creatboard14.dto.Dto;

public class Member extends Dto {

	
	public String loginId;
	public String loginPw;
	public String name;



	public Member(int id, String regDate, String loginId, String loginPw, String name) {
		this.id = id;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.name = name;
	
	}

}
