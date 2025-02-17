package exception;

import java.util.Scanner;

public class Login_main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String usernamedemo="aaa",passworddemo="123";
		
		try {
			System.out.println("enter username : ");
			String username=sc.nextLine();
			System.out.println("enter password : ");
			String password=sc.nextLine();
			
			if(username==""  || username==null) {
				throw new LoginException("enter username");
			}
			else if(password=="" || password==null) {
				throw new LoginException("enter password");
			}
			else if(usernamedemo.equals(username)==false) {
				throw new LoginException("enter correct username");
			}
			else if(passworddemo.equals(password)==false) {
				throw new LoginException("enter correct password");
			}
			else if(usernamedemo.equals(username)==true && passworddemo.equals(username)==true) {
				throw new LoginException("login sucessfully");
			}
			}catch(LoginException a){
				a.showerror();
			}
	}

}
