package shu;

public class Undergraduate extends Student implements Manageable{
	double aver;

	@Override
	public String getDegree() {
		boolean p=getPass();
		if(p==true)return "����ѧʿѧλ";
		else return "������ѧʿѧλ";
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
		System.out.println("������"+name);
		System.out.println("�Ա�"+gender);
		System.out.println("�������ڣ�"+birthDay);
		System.out.println("ѧУ��"+school);
		System.out.println("ѧ�ţ�"+stuId);
		System.out.println("ѧ�����"+category);
		System.out.println("ƽ���ɼ���"+aver);
		System.out.println(getDegree());
	}

}
