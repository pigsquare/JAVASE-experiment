
public class q4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count= 0 ; 
        for(int i=0; i<3; i++) { 
          for(int j=0; j<3; j++) { 
               if ( i==1 && j==1 ) 
                   continue ; 
               count++; 
            }  
       } 
       System.out.println(count); 

	}

}
