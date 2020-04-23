
public class question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=101;i<=200;i++){
			boolean f=false; 
			for(int j=2;j*j<=i;j++){
				if(i%j==0){
					f=true;
					break;
				}
			}
			if(f==false){
					System.out.println(i);
			}
		}

	}

}
