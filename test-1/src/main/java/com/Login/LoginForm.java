package com.Login;

public class LoginForm {
	UserDAO dao=new UserDAO();
	public void init() {
		System.out.println("初始化完成");
	}
	public void display() {
		System.out.println("显示窗口成功");
	}
	public void validate() {
		System.out.println("登陆成功");
	}

}
