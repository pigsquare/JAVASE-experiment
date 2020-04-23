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
		System.out.println("������"+name);
		System.out.println("�Ա�"+gender);
		System.out.println("�������ڣ�"+birthDay);
		System.out.println("ѧУ��"+school);
		System.out.println("ѧ�ţ�"+stuId);
		System.out.println("ѧ�����"+category);
		System.out.println("ƽ���ɼ���"+aver);
		System.out.println("���ĳɼ���"+thesisLevel);
		System.out.println(getDegree());
	}

	@Override
	public String getDegree() {
		if(status==true)return "����˶ʿѧλ";
		else return "������˶ʿѧλ";
	}
	

}
