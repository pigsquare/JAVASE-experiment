package shu;

public class MasterException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
	public MasterException(char n) {
		message="���ĵȼ�Ϊ"+n+"������A-E��Χ�ڣ�";
	}
	
	public String warnMess() {
		return message;
	}

}
