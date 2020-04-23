package q2;

public class Lei {
	static double x;
	int y;
	Lei(double a,int b){
		x=a;
		y=b;
	}
	Lei(){
		
	}
	static void setx(double a){
		x=a;
	}
	void sety(int a){
		y=a;
	}
	static double getx(){
		return x;
	}
	int gety(){
		return y;
	}

}
