package shu;

public class MasterException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public MasterException(char n) {
		message="论文等级为"+n+"，不在A-E范围内！";
	}
	
	public String warnMess() {
		return message;
	}

}
