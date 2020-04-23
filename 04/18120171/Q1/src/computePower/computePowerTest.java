package computePower;

public class computePowerTest {

	/**
	 * @param args
	 */
	static void comPower(double a,double b){
		double c=a*a;
		double d=b*b;
		System.out.println("in comPower1:");
		System.out.println("a="+a+",b="+b);
		System.out.println("a^2="+c+",b^2="+d);
	}
	static void comPower(Parameter p){
		double c=p.a*p.a;
		double d=p.b*p.b;
		p.a=c+d;
		System.out.println("in comPower1:");
		System.out.println("a^2="+c+",b^2="+d);
		System.out.println("a="+p.a+",b="+p.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=2.4,b=6.5;
		System.out.println("a="+a+",b="+b);
		comPower(a,b);
		System.out.println("after comPower1:");
		System.out.println("a="+a+",b="+b);
		Parameter c=new Parameter(a,b);
		comPower(c);
		System.out.println("after comPower2:");
		System.out.println("a="+c.a+",b="+c.b);
		

	}

}
