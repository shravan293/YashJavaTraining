package com.example.exception01;

public class StudentResult {

	int math, phy, eng;

	
	public StudentResult(int math, int phy, int eng) {
		super();
		this.math = math;
		this.phy = phy;
		this.eng = eng;
	}


	@Override
	public String toString() {
		return "StudentResult [math=" + math + ", phy=" + phy + ", eng=" + eng + "]";
	}


	public float percentage() {
        int total=math+eng+phy;
        float perc=(float)total/300*100;
        //System.out.println("total Marks= "+total);
        //System.out.println("percentage="+perc);
        return perc;
	}
	
	public String passFail() {
		
		String status=null;
		if(math>=40 && eng>=40 && phy>=40) {
			return "pass";
		}else {
			return "fail";
		}
	}
	
}
