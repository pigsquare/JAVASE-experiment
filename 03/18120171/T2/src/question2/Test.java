package question2;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("�����������ε������ߣ�");
		double x=reader.nextDouble(),y=reader.nextDouble(),z=reader.nextDouble();
		Triangle s=new Triangle(x,y,z);
		if(s.isValid())System.out.println("�ǺϷ��������Σ��ܳ�="+s.circum);
		else System.out.println("���ܹ���������");
		System.out.println("������Բ�İ뾶��");
		x=reader.nextDouble();
		Circle yuan=new Circle(x);
		System.out.println("Բ�������"+yuan.area);
		System.out.println("������Բ׶�ĸߣ�");
		x=reader.nextDouble();
		Cone zhui=new Cone(yuan,x);
		System.out.println("Բ׶�����="+zhui.vol());

	}

}
