package shu;

public class Undergraduate extends Student{
	double aver;

	@Override
	public boolean getPass() {
		// TODO Auto-generated method stub
		computeAverage();
		if(aver>=60){
			status=true;
			return true;
		}
		else{
			status=false;
			return false;
		}
		
	}

	@Override
	public double computeAverage() {
		// TODO Auto-generated method stub
		int len=score.length;
		if(len==0){
			aver=0;
			return 0.0;
		}
		double sum=0;
		for(int i=0;i<len;i++){
			sum+=score[i];
		}
		aver=sum/(len+0.0);
		return aver;
	}

	@Override
	public String getDegree() {
		// TODO Auto-generated method stub
		boolean p=getPass();
		if(p==true)return "授予学士学位";
		else return "不授予学士学位";
	}

}
