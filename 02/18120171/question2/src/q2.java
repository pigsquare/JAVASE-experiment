
public class q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1;i<=100;i++){
			if(num>=5)break;
			if(i%3==0){
				System.out.println(i);
				num++;
			}
		}

	}

}
