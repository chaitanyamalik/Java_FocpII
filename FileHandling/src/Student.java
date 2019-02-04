import java.io.*;
import java.util.*;
import java.lang.*;
class StudentDeets{
	int serialNo;
	String firstName;
	float cgpa;
	char grade;

	void setDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Srno:- ");
		serialNo = sc.nextInt();
		System.out.print("First Name:- ");
		firstName = sc.next();
		System.out.print("CGPA:- ");
		cgpa = sc.nextFloat();
		System.out.print("Grade:- ");
		grade = sc.next().charAt(0);
	}

	String Tab(){
		return (serialNo+"\t"+firstName+"\t"+cgpa+"\t"+grade);
	}

	static void input(){
		Scanner sc = new Scanner(System.in);
		File f = null;
		try{
			f = new File("C:\\Users\\Ajay\\Desktop\\JAVA\\Java_FocpII\\FileHandling\\files\\file1.txt");
            FileWriter finp = new FileWriter(f);
            BufferedWriter binp= new BufferedWriter(finp); 
            StudentDeets st[] = new StudentDeets[5];
            for(int i=0;i<5;i++){
            	st[i] = new StudentDeets();
            	st[i].setDetails();
            	binp.write(st[i].Tab());
            	binp.newLine();
            }
            binp.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	static void output(){
		Scanner sc = new Scanner(System.in);
		File f = null;
		try{
			f = new File("C:\\Users\\Ajay\\Desktop\\JAVA\\Java_FocpII\\FileHandling\\files\\file1.txt");
			FileReader fout = new FileReader(f);
			BufferedReader bout = new BufferedReader(fout);
			System.out.println("SrNo.\tName\tCGPA\tGrade");
			String s = bout.readLine();
			while(s != null){
				System.out.println(s);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	static void search(){
		Scanner sc = new Scanner(System.in);
		File f = null;
		try{
			f = new File("C:\\Users\\Ajay\\Desktop\\JAVA\\Java_FocpII\\FileHandling\\files\\file1.txt");
			FileReader fout = new FileReader(f);
			BufferedReader bout = new BufferedReader(fout);
			String s = bout.readLine();
			System.out.print("Search:- ");
			String srch = sc.next();
			System.out.println("SrNo\tName\tCGPA\tGrade");
			int index = s.indexOf(srch);
			while(s != null){
				for(int i=0;i<s.length();i++){
					if(i == index)
						System.out.println(s);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Student{
	public static void main(String[] args) {
		StudentDeets std = new StudentDeets();
		char ch;
		Scanner in = new Scanner(System.in);
	    do{
			System.out.print("Press i for input, o for output, s for search, n to exit:- ");
			ch = in.next().charAt(0);
			switch(ch){
			case 'i': std.input();
					  break;
			case 'o': std.output();
					  break;
			case 's': std.search();
					  break;		  
			}
		}while(ch != 'n');
		
	}
}