package com.Login;

public class UserDAO {
	DUBtil db=new DUBtil();
	public boolean findUser(String userName,String userPassward) {
		if(db.getConnection()) {
			return true;
		}
		else {
		    return false;
		}
	}

}
