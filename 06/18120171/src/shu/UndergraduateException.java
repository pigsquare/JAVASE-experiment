package shu;

public class UndergraduateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public UndergraduateException(double n) {
		message="�ɼ�Ϊ"+n+"������0-100��Χ�ڣ�";
	}
	
	public String warnMess() {
		return message;
	}

}
