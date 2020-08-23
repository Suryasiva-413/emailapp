package emailapp;

import java.util.Scanner;

public class emailapp {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity;
	private String alternateemail;


public emailapp (String firstname, String lastname) {
	this.firstname= firstname;
	this.lastname= lastname;
	System.out.println("email created" + this.firstname+""+this.lastname);

this.department = setDepartment();
System.out.println("department:" + this.department);}



private String setDepartment() {
	System.out.print("department codes\n 1 for sales\n 2 for development \n 3 for accounting \n enter department code:");
	
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if (depChoice == 1) {return "sales";}
	if (depChoice ==2) { return "dev";}
	else if (depChoice ==3) {return "acct";}
	else {return " ";}

}
}

