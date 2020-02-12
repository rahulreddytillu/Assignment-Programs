package strings;

import java.util.Scanner;

public class StringExample {
         static String str2 = "";
	public static void main(String[] args) {
		String str3 = "";
		Scanner sc= new Scanner(System.in);
		str3 = sc.next();
		//System.out.println("reversed string");
		StringExample se = new StringExample();
		System.out.println(se.reverse(str3));
		if(str2.equals(str3)){
			System.out.println("its a palindrome");
		}else{
			System.out.println("not a palindrome");
		}
		sc.close();
	}
	public String reverse(String str1){
		//System.out.println("enter a string");
		for(int i=str1.length()-1;i>=0;i--){
			str2 = str2+str1.charAt(i);
		}
		System.out.println("reversed string is: ");
		return str2;
	}

}
