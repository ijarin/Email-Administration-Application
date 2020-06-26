package emailApp;

import com.sun.java_cup.internal.runtime.Scanner;

public class Email {
	private String firstname; 
	private String lastname;
	private String password;
	private String department;
	private int mailboxcap=500;
	private String alteremail;
	private int defaultPasswordL=10;
	private String companySf="company.com";
	private String email;
	
	//constructor to receive 1stname and lastname 
	public Email(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		//Call the department
		//System.out.println("Email_Created: "+this.firstname+" "+this.lastname);
		this.department=SetDepartment();
		//System.out.println("Department is: "+ this.department);
		
		//Call a method which will generate a random Password 
		this.password=randomPass(defaultPasswordL);
		System.out.println("Your Password is: "+this.password);
		
		//combine elements to generate email 
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySf;
		//System.out.println("Print Your Email: "+ email);
		
	}
	
	//Ask for the department and we can return the department 
	private String SetDepartment() {
		System.out.print("Enter the department\n 1 for sales \n 2 for development \n 3 for accounting\n0 for none \n Enter the Department Code:");
		java.util.Scanner in=new java.util.Scanner(System.in);
		
		int DeptChoice=in.nextInt();
		
		if (DeptChoice==1) {
			return "sales";}
		else if (DeptChoice==2) {
			return "dev";
		}
		else if (DeptChoice==3) {
			return "Acc";
		}
		else{
			return "nothing";
		}
		
		
		
		
		
	}
	
	//generate random password 
	private String randomPass(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#&@%";
		char[] password=new char[length];
		for (int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
		
		
	}
	
	//set the mailbox capacity 
	public void SetmailboxCap(int capacity) {
		this.mailboxcap=capacity;
		
	}
	
	//Set the alternate email 
	public void Setalternatemail(String altmail) {
		this.alteremail=altmail;
		
	}
	
	//Change the password
	public void Changepass(String PassWord) {
		this.password=PassWord;
	}
	
	public int getMailboxCap() {
		return mailboxcap;
	}
	
	public String getAltermail() {
		return alteremail;
	}
	public String getPassWord() {
		return password;
	}
	
	public String showinfo() {
		//going to display their name, email-address, mailbox-capacity 
		return "Display name: " + firstname + " " + lastname+ 
				"\nCompany Name: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxcap+"mb";
		
	}
	

}
