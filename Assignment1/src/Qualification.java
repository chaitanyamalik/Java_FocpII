class Qualification{
	String qualname;
	String university;
	String institute;
	float cgpa;
	Qualification(){
		qualname=" ";
		university=" ";
		institute=" ";
		cgpa=0.0f;
	}
	Qualification(String qualname,String university,String institute,float cgpa){
		this.qualname=qualname;
		this.university=university;
		this.institute=institute;
		this.cgpa=cgpa;
	}
	void DisplayQual(){
		System.out.println(qualname);
		System.out.println(university);
		System.out.println(institute);
		System.out.println(cgpa);
	}
}