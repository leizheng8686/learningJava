import java.util.regex.*;
import java.io.*;

public class parse {
	public static void printResult(String s){
		
		Pattern p = Pattern.compile("([0-9]+)\\s?([\\+\\-\\*\\/])\\s?([0-9]+)");
		Matcher m = p.matcher(s);
		if(m.find()){
			double a1 = Double.parseDouble(m.group(1)),
					a2 = Double.parseDouble(m.group(3));
			if(m.group(2).equals("+")){
				System.out.print(a1+a2+"\n");
			}else if(m.group(2).equals("-")){
				System.out.print(a1-a2+"\n");
			}else if(m.group(2).equals("*")){
				System.out.print(a1*a2+"\n");
			}else if(m.group(2).equals("/")){
				System.out.print(a1/a2+"\n");
			}
		}else
			System.out.print("NULL\n");
	}
	
	public static void main(String[] arg){
        BufferedReader reader;  
		try {  
			reader = new BufferedReader(new FileReader("hw10a.dat"));
            String tempString = null;  
            while ((tempString = reader.readLine()) != null) {  
                System.out.print(tempString + " = ");
            	printResult(tempString);
            }  
            reader.close();
        } catch (IOException e) {  
            e.printStackTrace();  
        }
		
    }  
}
