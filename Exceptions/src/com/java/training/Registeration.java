package com.java.training;

import java.util.Scanner;

import com.java.exception.NameExistsException;
import com.java.exception.TooLongException;
import com.java.exception.TooShortException;

public class Registeration {

	public static void main(String[] args) {
		Validation validator = new Validation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String username = sc.next();
		try {
			boolean valid = validator.validateName(username);
			if(valid)
			{
				System.out.println("welcome "+ username);
				System.out.println("Enter the pwd");
				String password = sc.next();
				if(validator.validatePassword(password))
				{
					System.out.println("Registeration Successfull!!");
				}
			}
		} catch (NameExistsException e) {
	
			System.out.println("username already exists");
		} catch (TooLongException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (TooShortException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
