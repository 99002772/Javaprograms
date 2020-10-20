package com.java.training;

import com.java.exception.NameExistsException;
import com.java.exception.TooLongException;
import com.java.exception.TooShortException;

public class Validation {
	
	private String[] names = {"Ganga","Abi","Balau","Mani","Ramtya"};
	public boolean validateName(String username) throws NameExistsException{
		for(String uname:names)
		{
			if(uname.equals(username))
			{
				throw new NameExistsException();
			}
		}
		return true;
	}

		public boolean validatePassword(String password) throws TooLongException,TooShortException {
			if(password.length()>=20)
			{
				throw new TooLongException("Password is too long!!!");
			}
			if(password.length()<=3)
			{
				throw new TooShortException("Password is too short!!!");
			}
			return true;
		}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
