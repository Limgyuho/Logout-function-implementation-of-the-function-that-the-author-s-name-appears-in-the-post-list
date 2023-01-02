package article.controller;

import creatboard14.dto.Member;

public abstract class Controller {

	public static Member loginedMember;

	public abstract void doAction(String actionMethName, String cmd);

	public abstract void makeTestDate();

	public boolean isLogined() {
		return loginedMember != null;
	}

}
