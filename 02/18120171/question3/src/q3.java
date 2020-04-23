import java.util.Scanner;


public class q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		while(true){
			System.out.print("1=剪刀，2=石头，3=布，0=退出：");
			int x=reader.nextInt();
			int diannao=(int)(Math.random()*3+1);
			if(x==0)break;
			switch(x){
			case 1:
				if(diannao==1)System.out.println("电脑：剪刀，平局");
				if(diannao==2)System.out.println("电脑：石头，你输了");
				if(diannao==3)System.out.println("电脑：布，你赢了");
				break;
			case 2:
				if(diannao==1)System.out.println("电脑：剪刀，你赢了");
				if(diannao==2)System.out.println("电脑：石头，平局");
				if(diannao==3)System.out.println("电脑：布，你输了");
				break;
			case 3:
				if(diannao==1)System.out.println("电脑：剪刀，你输了");
				if(diannao==2)System.out.println("电脑：石头，你赢了");
				if(diannao==3)System.out.println("电脑：布，平局");
				break;
			}
		}

	}

}
