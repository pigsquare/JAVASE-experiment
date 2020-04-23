package shu;

public class Master extends Student implements Manageable{

	double aver;
	char thesisLevel;
	void setThesisLevel(char c){
		thesisLevel=c;
	}
	char getThesisLevel(){
		return thesisLevel;
	}
	
	@Override
	public double computeAverage() throws Exception {
		int len=score.length;
		if(len==0){
			aver=0;
			return 0.0;
		}
		double sum=1;
		for(int i=0;i<len;i++){
			if(score[i]<0||score[i]>100) {
				throw new UndergraduateException(score[i]);
			}
			sum*=score[i];
		}
		aver=Math.pow(sum,1.0/len);
		if(thesisLevel>'E'||thesisLevel<'A') {
			throw new MasterException(thesisLevel);
		}
		return aver;
	}

	@Override
	public boolean getPass() {
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
	public void printInfo() {
		System.out.println("姓名："+name);
		System.out.println("性别："+gender);
		System.out.println("出生日期："+birthDay);
		System.out.println("学校："+school);
		System.out.println("学号："+stuId);
		System.out.println("学生类别："+category);
		System.out.println("平均成绩："+aver);
		System.out.println("论文成绩："+thesisLevel);
		System.out.println(getDegree());
	}

	@Override
	public String getDegree() {
		if(status==true)return "授予硕士学位";
		else return "不授予硕士学位";
	}
	

}
