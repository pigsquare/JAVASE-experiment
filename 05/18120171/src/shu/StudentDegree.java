package shu;

public class StudentDegree {
	public void printStudentInfo(Student student){
		System.out.println("姓名："+student.name);
		System.out.println("性别："+student.gender);
		System.out.println("出生日期："+student.birthDay);
		System.out.println("学校："+student.school);
		System.out.println("学号："+student.stuId);
		System.out.println("学生类别："+student.category);
		System.out.println("平均成绩："+student.computeAverage());
	}
	public void issueDegree(Student student){
		System.out.println(student.getDegree());
	}

}
