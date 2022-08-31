package kavishna;
import java.util.Scanner;

class bank2
{
	String cus_name;
	String ac_no;
	double bal_amt;
	float wt_drw;
	double dop_amt;
	int opt;
 
void input()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the customer name:");
cus_name=sc.nextLine();
System.out.println("Enter the account number:");
ac_no=sc.nextLine();
while(true)
{
System.out.println("\n1.balancecheck \n2.withdrawal \n3.deposit");
System.out.println("Enter your option");
opt=sc.nextInt();
switch(opt)
{
case 1:
{
balancecheck();
break;
}
case 2:
{
withdrawal();
break;
}
case 3:
{
deposit();
break;
}
case 4:
{
System.exit(0);
}
}
}
}
void balancecheck()
{
	System.out.println("your balance amount is="+bal_amt);
}
void withdrawal()
{
	System.out.println("the amount to withdrawal is=");
	Scanner sc=new Scanner(System.in);
	wt_drw=sc.nextFloat();
	if(wt_drw<=bal_amt)
	{
		System.out.println("The amount can be withdrawn");
		bal_amt=wt_drw;
		System.out.println("The balance amount is="+bal_amt);
		
	}
	else
		System.out.println("No sufficient amoint is available");
}
void deposit()
{
	System.out.println("The amount to be deposited is=");
	Scanner sc=new Scanner(System.in);
	dop_amt=sc.nextDouble();
	bal_amt=bal_amt+dop_amt;
	System.out.println("The balance amount is="+bal_amt);
}
}
public class java
{
	public static void main(String args[])
	{
		bank2 S1=new bank2();
		S1.input();
	}
}
