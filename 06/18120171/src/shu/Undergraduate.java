package shu;

public class Undergraduate extends Student implements Manageable{
	double aver;

	@Override
	public String getDegree() {
		boolean p=getPass();
		if(p==true)return "授予学士学位";
		else return "不授予学士学位";
	}

	@Override
	public double computeAverage() throws Exception {
		int len=score.length;
		if(len==0){
			aver=0;
			return 0.0;
		}
		double sum=0;
		for(int i=0;i<len;i++){
			if(score[i]<0||score[i]>100) {
				throw new UndergraduateException(score[i]);
			}
			sum+=score[i];
		}
		aver=sum/(len+0.0);
		return aver;
	}

	@Override
	public boolean getPass(){
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
	public void printInfo() {
		System.out.println("姓名："+name);
		System.out.println("性别："+gender);
		System.out.println("出生日期："+birthDay);
		System.out.println("学校："+school);
		System.out.println("学号："+stuId);
		System.out.println("学生类别："+category);
		System.out.println("平均成绩："+aver);
		System.out.println(getDegree());
	}

}
