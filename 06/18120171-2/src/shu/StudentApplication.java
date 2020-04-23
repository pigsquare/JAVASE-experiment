package shu;

public class StudentApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Undergraduate undergraduate = new Undergraduate();
		undergraduate.setName("王小二");
		undergraduate.setGender('男');
		undergraduate.setBirth("1995-6-1");
		undergraduate.setSchool("上海大学");
		undergraduate.setId("11128981");
		undergraduate.setCategory("大学本科生");
		double[] score1={89.6, 82, 87, 73};
		undergraduate.setScore(score1);
		undergraduate.setStatus(false);
		Master master = new Master();
		master.setName("李燕");
		master.setGender('女');
		master.setBirth("1991-6-12");
		master.setSchool("上海大学");
		master.setId("10306");
		master.setCategory("硕士研究生");
		double[] score2={70,52.5,95,88,89,91};
		master.setScore(score2);
		master.setThesisLevel('B');
		master.setStatus(false);
		StudentDegree studentDegree= new StudentDegree();
		studentDegree.issueDegree(undergraduate);
		studentDegree.issueDegree(master);

	}

}
