package shu;
import java.util.Date;
public class StudentApplication {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student student;
		Undergraduate undergraduate = new Undergraduate();
		undergraduate.setName("��С��");
		undergraduate.setGender('��');
		undergraduate.setBirth("1995-6-1");
		undergraduate.setSchool("�Ϻ���ѧ");
		undergraduate.setId("11128981");
		undergraduate.setCategory("��ѧ������");
		double[] score1={89.6, 82, 87, 73};
		undergraduate.setScore(score1);
		undergraduate.setStatus(false);
		Master master = new Master();
		master.setName("����");
		master.setGender('Ů');
		master.setBirth("1991-6-12");
		master.setSchool("�Ϻ���ѧ");
		master.setId("10306");
		master.setCategory("˶ʿ�о���");
		double[] score2={70,52.5,95,88,89,91};
		master.setScore(score2);
		master.setThesisLevel('B');
		master.setStatus(false);
		StudentDegree studentDegree= new StudentDegree();
		studentDegree.printStudentInfo(undergraduate);
		studentDegree.issueDegree(undergraduate);
		studentDegree.printStudentInfo(master);
		studentDegree.issueDegree(master);
		
		
	}

}
