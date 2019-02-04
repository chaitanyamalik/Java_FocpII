class Time{
	private int hour;
	private int minute;
	private int second;

	Time(){
		hour = 0;
		minute = 0;
		second = 0;
	}
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void setTime(int hour, int minute, int second){
		this.second = second;
		this.hour = hour;
		this.minute = minute;
	}
	int getHour(){
		return hour;
	}
	int getMinute(){
		return minute;
	}
	int getSecond(){
		return second;
	}
	void setHour(int hour){
		this.hour = hour;
	}
	void setMinute(int minute){
		this.minute = minute;
	}
	void setSecond(int second){
		this.second = second;
	}
	public String toString(){
		if(hour < 10)
			hour = Integer.parseInt("0"+hour);
		if(minute < 10)
			minute = Integer.parseInt("0"+minute);
		if(second < 10)
			second = Integer.parseInt("0"+second);
		System.out.println(hour+":"+minute+":"+second);
		return null;
	}
	public Time nextSecond(){
		Time t = new Time(hour,minute,second);
		++t.hour
	}
	public Time nextMinute(){
		return (s+1);
	}
	public Time nextHour(){
		return (second+1);
	}

}