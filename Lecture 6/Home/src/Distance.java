class Distance{
	private double inch;
	private double feet;
	Distance(){
		inch = 0.0;
		feet = 0.0;
	}
	Distance(double feet, double inch){
		this.feet = feet;
		this.inch = inch;
	}
	double getFeet(){
		return feet;
	}
	double getInch(){
		return inch;
	}
	void setFeet(double feet){
		this.feet = feet;
	}
	void setInch(double inch){
		this.inch = inch;
	}
	Distance sum(Distance d1){
		d1 = new Distance();
		double s = feet+(inch/12);
		System.out.println("The sum is :- "+s+" feet");
		return d1;
	}

}