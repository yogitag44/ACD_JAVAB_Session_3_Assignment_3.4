import java.util.Scanner;   //To take input from user.
import java.io.*;   //to accept input and output


public class Student {

	private String Name;		//private string;
	private int Phone_Number;	//private integer;
	private int roll_number;	//private integer;
	private String MyClass;		//private String;
	
	public String getName() {  //To display Name from user
		return Name;
	}
	
	public void setName (String Name) {
		this.Name = Name;  //To take name from User
	}

	public int getPhoneNumber() {   //To take input from user
		return Phone_Number;
	}
	
	public void setPhoneNumber(int Phone_Number) {  
		this.Phone_Number = Phone_Number;
	}
	
	public int getRollNumber() {
		return roll_number;
	}
	
	public void setRollNumber(int roll_number) {
		this.roll_number = roll_number;
	}
	
	public String getMyClass() {
		return MyClass;
	}
	
	public void setMyClass(String MyClass) {
		this.MyClass = MyClass;
	}

	
}
