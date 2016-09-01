package guvi;

import java.util.Scanner;

public class reversestrremovevow {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char ch;
		for(int i=str.length()-1;i>=0;i--){
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	
		continue;
			}
			System.out.print(ch);
		}
	}}
