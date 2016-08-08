import java.util.Scanner;
public class substring {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		int b=in.nextInt();
		String c1 = null;
		int i = 1;
		char k=a.charAt(0);
		char l=a.charAt(i+1);
		String s=String.valueOf(k);
		String p=String.valueOf(l);
		
		System.out.println(s+p);
		String c=a.substring(0,1);
		while( i<a.length()){
			 c1=a.substring(i, b);
		i=i+2;
		b=b+2;
		System.out.println(c+c1);
		}
		
	}
		
	}


