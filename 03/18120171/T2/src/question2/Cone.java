package question2;

public class Cone {
	Circle cir;
	double h;
	double vol(){
		return cir.area*h/3.0;
	}
	Cone(Circle c,double x){
		cir=c;
		h=x;
	}

}
