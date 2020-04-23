package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexChk {
	
	public static void main(String[] args) {
		String regInt = "-?\\d+(\\.(0*))?";
		String regEmail = "\\p{Alnum}{3,}@(\\p{Alnum}+\\.){1,2}\\p{Alnum}+";
		String regMail = "\\d{6}";
		String regID = "\\d{15}(\\d{3})?";
		System.out.println("�������ַ�����");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.print("������֤��");
		Pattern patternInt = Pattern.compile(regInt);
		Matcher matcherInt = patternInt.matcher(str);
		boolean resultInt = matcherInt.matches();
		System.out.print(resultInt);
		if(resultInt) {
			double a = Double.parseDouble(str);
			if(a>0)System.out.print("  Ϊ������");
			if(a==0)System.out.print("  Ϊ��");
			if(a<0)System.out.print("  Ϊ������");
		}
		System.out.print("\nEmail��֤��");
		Pattern patternEmail = Pattern.compile(regEmail);
		Matcher matcherEmail = patternEmail.matcher(str);
		boolean resultEmail = matcherEmail.matches();
		System.out.println(resultEmail);
		System.out.print("�ʱ���֤��");
		Pattern patternMail = Pattern.compile(regMail);
		Matcher matcherMail = patternMail.matcher(str);
		boolean resultMail = matcherMail.matches();
		System.out.println(resultMail);
		System.out.print("���֤��֤��");
		Pattern patternID = Pattern.compile(regID);
		Matcher matcherID = patternID.matcher(str);
		boolean resultID = matcherID.matches();
		System.out.println(resultID);		

	}
}
