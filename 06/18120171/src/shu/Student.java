package shu;

//import java.util.Date;

public abstract class Student {
	String name;
	char gender;
	String birthDay;
	String school;
	String stuId;
	String category;
	double[] score;
	boolean status;
	void setName(String s){
		name=s;
	}
	void setGender(char c){
		gender=c;
	}
	void setBirth(String string){
		birthDay=string;
	}
	void setSchool(String s){
		school=s;
	}
	void setId(String s){
		stuId=s;
	}
	void setCategory(String s){
		category=s;
	}
	void setScore(double d[]){
		int len=d.length;
		score=new double[len];
		for(int i=0;i<len;i++){
			score[i]=d[i];
		}
	}
	void setStatus(boolean b){
		status=b;
	}
	boolean getStatus(){
		return status;
	}
	double[] getScore(){
		return score;
	}
	String getName(){
		return name;
	}
	char getGender(){
		return gender;
	}
	String getBirth(){
		return birthDay;
	}
	String getId(){
		return stuId;
	}
	String getCategory(){
		return category;
	}
	public abstract String getDegree();

}
