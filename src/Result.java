import java.util.Scanner;

public class Result {
	
	public void FinalResult_Student(){  //Method to get and print values from user.
		
		Student S_Obj = new Student();		//Object of Student Class
			
		System.out.println("Enter Hindi Marks: ");     //taking input from user
		Scanner inputHindi = new Scanner(System.in); 	
		int HindiMarks =  inputHindi.nextInt();				
		
		System.out.println("\nEnter English Marks:");
		Scanner inputEnglish = new Scanner(System.in); 
		int EnglishMarks =  inputEnglish.nextInt();
		
		System.out.println("\nEnter Maths Marks: ");
		Scanner inputMaths = new Scanner(System.in); 
		int MathsMarks =  inputMaths.nextInt();
		
		System.out.println("\nEnter Student Name: ");
		Scanner inputName = new Scanner(System.in); 
		String StudentName =  inputName.nextLine();
		S_Obj.setName(StudentName);						//Calling object of student class and setting the value of the student
		
		System.out.println("\nEnter Phone Number: ");
		Scanner inputPNumber = new Scanner(System.in); 
		int S_Phone_Number =  inputPNumber.nextInt();
		S_Obj.setPhoneNumber(S_Phone_Number);  //Calling object of student class and setting the value of the student
		
		System.out.println("\nEnter Roll Number: ");
		Scanner inputRollNumber = new Scanner(System.in); 
		int S_RollNumber =  inputRollNumber .nextInt();
		S_Obj.setRollNumber(S_RollNumber); //Calling object of student class and setting the value of the student
		
		System.out.println("\nEnter Class of Student: ");
		Scanner inputClass= new Scanner(System.in); 
		String S_Class =  inputClass.nextLine();
		S_Obj.setMyClass(S_Class);
		
		String FinalResult;
		if(HindiMarks > 30 && EnglishMarks >35 && MathsMarks > 35  ) {   //checking for condition
			FinalResult = "Pass";
		}
		else {
			FinalResult ="Fail";
		}
		System.out.println("\nName of the student is: "+ S_Obj.getName());
		System.out.println("\nPhone number of student: "+ S_Obj.getPhoneNumber());
		System.out.println("\nRoll number of student is: "+ S_Obj.getRollNumber());
		System.out.println("\nClass of student is: "+ S_Obj.getMyClass());
		
		System.out.println("\n\nFinal Result of Student is: "+ FinalResult);

		}
	
	public static void main(String args[]) {
		Result Obj1 = new Result();
		Obj1.FinalResult_Student(); 
		
	}
	}
