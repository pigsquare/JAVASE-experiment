package question2;

public class Triangle {
	double a,b,c,circum;
	
	Triangle(double x,double y,double z){
		a=x;
		b=y;
		c=z;
		circum=x+y+z;
	}
	boolean isValid(){
		if(a<=0||b<=0||c<=0) return false;
		if(a+b<=c||b+c<=a||a+c<=b) return false;
		return true;
	}

}
