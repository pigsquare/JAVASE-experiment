import java.util.Scanner;


public class q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		while(true){
			System.out.print("1=������2=ʯͷ��3=����0=�˳���");
			int x=reader.nextInt();
			int diannao=(int)(Math.random()*3+1);
			if(x==0)break;
			switch(x){
			case 1:
				if(diannao==1)System.out.println("���ԣ�������ƽ��");
				if(diannao==2)System.out.println("���ԣ�ʯͷ��������");
				if(diannao==3)System.out.println("���ԣ�������Ӯ��");
				break;
			case 2:
				if(diannao==1)System.out.println("���ԣ���������Ӯ��");
				if(diannao==2)System.out.println("���ԣ�ʯͷ��ƽ��");
				if(diannao==3)System.out.println("���ԣ�����������");
				break;
			case 3:
				if(diannao==1)System.out.println("���ԣ�������������");
				if(diannao==2)System.out.println("���ԣ�ʯͷ����Ӯ��");
				if(diannao==3)System.out.println("���ԣ�����ƽ��");
				break;
			}
		}

	}

}
