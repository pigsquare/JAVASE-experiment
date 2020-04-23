package question2;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("请输入三角形的三条边：");
		double x=reader.nextDouble(),y=reader.nextDouble(),z=reader.nextDouble();
		Triangle s=new Triangle(x,y,z);
		if(s.isValid())System.out.println("是合法的三角形，周长="+s.circum);
		else System.out.println("不能构成三角形");
		System.out.println("请输入圆的半径：");
		x=reader.nextDouble();
		Circle yuan=new Circle(x);
		System.out.println("圆的面积："+yuan.area);
		System.out.println("请输入圆锥的高：");
		x=reader.nextDouble();
		Cone zhui=new Cone(yuan,x);
		System.out.println("圆锥的体积="+zhui.vol());

	}

}
