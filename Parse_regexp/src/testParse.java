import java.util.regex.*;
import java.io.BufferedReader;
import java.io.*;

public class testParse {
	static void printResult(String s){
		
		
	}
	public static void main(String[] arg){
		String s = "12 + 3";
		Pattern p = Pattern.compile("([0-9]+)\\s?([\\+\\-\\*\\/])\\s?([0-9]+)");
		Matcher m = p.matcher(s);
//		double a1 = Double.parseDouble(m.group(1)),
//				a2 = Double.parseDouble(m.group(3));
		System.out.print(m.group());
//		if(m.group(2).equals("+")){
//			System.out.print(a1+a2+'\n');
//		}else if(m.group(2).equals("-")){
//			System.out.print(a1-a2+'\n');
//		}else if(m.group(2).equals("*")){
//			System.out.print(a1*a2+'\n');
//		}else if(m.group(2).equals("/")){
//			System.out.print(a1/a2+'\n');
//		}
    }  
}
