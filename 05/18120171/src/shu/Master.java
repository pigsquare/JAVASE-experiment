package shu;

public class Master extends Student{
	double aver;
	char thesisLevel;
	void setThesisLevel(char c){
		thesisLevel=c;
	}
	char getThesisLevel(){
		return thesisLevel;
	}

	@Override
	public boolean getPass() {
		// TODO Auto-generated method stub
		computeAverage();
		if(aver>=80&&(thesisLevel=='C'||thesisLevel=='B'||thesisLevel=='A')){
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
		double sum=1;
		for(int i=0;i<len;i++){
			sum*=score[i];
		}
		aver=Math.pow(sum,1.0/len);
		return aver;
	}

	@Override
	public String getDegree() {
		// TODO Auto-generated method stub
		boolean p=getPass();
		if(p==true)return "授予硕士学位";
		else return "不授予硕士学位";
	}

}
