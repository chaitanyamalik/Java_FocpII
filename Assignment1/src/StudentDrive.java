import java.util.*;
class StudentDrive{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		String firstName;
		String lastName;
		String dob;
		String eMail;
		String contactNo;
		String line1;
		String line2;
		String city;
		String state;
		int pinCode;
		String name;
		String startDate;
		String endDate;
		String role;
		String responsibilities[];
		String qualname;
		String university;
		String institute;
		float cgpa;
		String skills[]=new String[10];
		//String qual[]=new String[10];
		//String projects[]=new String[10];
		int nskills;
		int nprojects;
		int numqual;
		int nresp;
		int i;
		int j;
		int k;
		int a;
		System.out.println("Please enter Student's first name:");
		firstName=in.next();
		System.out.println("Please enter Student's last name:");
		lastName=in.next();
		System.out.println("Please enter student's date of birth in day/month/year format");
		dob=in.next();
		System.out.println("Please enter Student's eMail id");
		eMail=in.next();
		System.out.println("Please enter student's contactNo");
		contactNo=in.next();
		System.out.println("Please enter number of skills");
		nskills=in.nextInt();
		for(i=0;i<nskills;i++){
			skills[i]=in.next();
		}
		System.out.println("Please enter the number of projects done by the student");
		nprojects=in.nextInt();
		Project nproj[] = new Project[nprojects];
		for(j=0;j<nprojects;j++){
			System.out.println("Please enter project name:");
			name=in.next();
			System.out.println("Please enter startDate:");
			startDate=in.next();
			System.out.println("Please enter endDate :");
			endDate=in.next();
			System.out.println("Please enter role");
			role=in.next();
			System.out.println("Please enter number of responsibilities");
			nresp=in.nextInt();
			responsibilities = new String[nresp];
			for(a=0;a<nresp;a++){
				System.out.println("Enter responsibilities");
				responsibilities[a]=in.next();
			}
			nproj[j] = new Project(name,startDate,endDate,role,responsibilities);
		}
		System.out.println("Please enter number of qualifications student have");
		numqual=in.nextInt();
		Qualification nqual[]=new Qualification[numqual];
		for(k=0;k<numqual;k++){
			System.out.println("Please enter name of qualification");
			qualname=in.next();
			System.out.println("Enter university");
			university=in.next();
			System.out.println("Enter institute");
			institute=in.next();
			System.out.println("Enter cgpa");
			cgpa=in.nextFloat();
			nqual[k] = new Qualification(qualname,university,institute,cgpa);

		}
		
		System.out.println("Please enter student's address:");
		System.out.println("Line 1");
		line1=in.next();
		System.out.println("Line 2");
		line2=in.next();
		System.out.println("city :");
		city=in.next();
		System.out.println("state :");
		state=in.next();
		System.out.println("PIN code:");
		pinCode=in.nextInt();
		Address addr= new Address(line1,line2,city,state,pinCode);
		Student s1 = new Student(firstName,lastName,addr,dob,skills,nqual,nproj,eMail,contactNo);
		s1.DisplayStudent();
	}
}