
import java.util.Scanner;

public class question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("����������������");
		int num=reader.nextInt();
		int a[]=new int[num];
		System.out.println("������һ�����ݣ�");
		for(int i=0;i<num;i++){
			a[i]=reader.nextInt();
		}
		bubble(a);
		while(true){
			System.out.println("������Ҫ���ҵ����ݣ�����0�˳���");
			int idx=reader.nextInt();
			if(idx==0)break;
			search(a,idx);
		}
		
		
	}
	private static void search(int[] a, int idx) {
		// TODO Auto-generated method stub
		int left=0,right=a.length-1;
		while(left<=right){
			if(a[left]==idx){
				System.out.println("�����ţ�"+left);
				return;
			}
			if(a[right]==idx){
				System.out.println("�����ţ�"+right);
				return;
			}
			int mid=(right+left)/2;
			if(a[mid]==idx){
				System.out.println("�����ţ�"+mid);
				return;
			}
			if(a[mid]<idx){
				left=mid+1;
			}
			else right=mid-1;
		}
		if(left>right)System.out.println("�Ҳ�������");
	}
	private static void bubble(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;i++){
			boolean s=false;
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
					s=true;
				}
			}
			if(!s)break;
		}
	}
	private static void swap(int[] a, int i1, int i2) {
		// TODO Auto-generated method stub
		int t=a[i1];
		a[i1]=a[i2];
		a[i2]=t;
	}

}
