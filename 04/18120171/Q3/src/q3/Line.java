package q3;

public class Line {
	Point a,b;
	Line(Point c,Point d){
		a=c;
		b=d;
	}
	Line(){
		
	}
	double length(){
		double t=(a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
		t=Math.sqrt(t);
		return t;
	}

}
