package shu;

public class StudentDegree {
	public void printStudentInfo(Student student){
		System.out.println("������"+student.name);
		System.out.println("�Ա�"+student.gender);
		System.out.println("�������ڣ�"+student.birthDay);
		System.out.println("ѧУ��"+student.school);
		System.out.println("ѧ�ţ�"+student.stuId);
		System.out.println("ѧ�����"+student.category);
		System.out.println("ƽ���ɼ���"+student.computeAverage());
	}
	public void issueDegree(Student student){
		System.out.println(student.getDegree());
	}

}
