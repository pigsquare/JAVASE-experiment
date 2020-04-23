package q2;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lei a=new Lei(),b=new Lei();
		a.setx(3.4);
		a.sety(6);
		System.out.println("After set A:");
		System.out.println("a.x="+a.x+",a.y="+a.y);
		b.setx(5.1);
		b.sety(1);
		System.out.println("After set B:");
		System.out.println("a.x="+a.x+",a.y="+a.y);
		System.out.println("b.x="+b.x+",b.y="+b.y);
	}

}
