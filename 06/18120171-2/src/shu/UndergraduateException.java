package shu;

public class UndergraduateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public UndergraduateException(double n) {
		message="成绩为"+n+"，不在0-100范围内！";
	}
	
	public String warnMess() {
		return message;
	}

}
