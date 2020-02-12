package practiceprgrms;

import java.util.Scanner;

public class AdamNumber {
	public int first;
	public int second;
	public int square1,square2;
	public int reverse;
	Scanner s = new Scanner(System.in);
	public static void main(String[] arr){
		AdamNumber adm = new AdamNumber();
		adm.getReverse();
		System.out.println("enter number to be reversed");
		adm.square1 = adm.s.nextInt();
		if((adm.square1*adm.square1) == (adm.reverse*adm.reverse)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}
	public void makeReverse(){
		square1 *= square1;
		    int two=0;
		    while(two != 0){
		    two = two*10;
	        two = two + square1%10;
	        two = two/10;
		    
		 }
		    
		    
	}
	public void getReverse(){
		int one;
		System.out.println("number to reverse");
		one = s.nextInt();
		while(one != 0){
			reverse = reverse * 10;
			reverse = reverse + one%10;
			one = one/10;
		}
		//System.out.println(reverse);
	
      }
  }
