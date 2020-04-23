import java.util.Scanner;


public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int validtimes=0,a[]=new int[3];
		Scanner reader=new Scanner(System.in);
		while(validtimes<3){
			System.out.print("请输入一个整数：");
			int x=reader.nextInt();
			if(x>=1&&x<=100){
				a[validtimes++]=x;
			}
			else{
				System.out.println("输入无效！");
			}
			System.out.println("当前有效输入次数："+validtimes);
		}
		for(int i=0;i<3;i++){
			System.out.println("a"+i+"="+a[i]);
		}

	}

}
