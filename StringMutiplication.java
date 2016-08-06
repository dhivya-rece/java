import java.util.*;
public class StringMultiplication {
public static void main(String[] args) {
		int e = 0;
		Scanner in=new Scanner(System.in);
		String a;
		String b;
		a=in.nextLine();
		b=in.nextLine();
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		if(c>0&&d>0){
	 e=c*d;
		}
		else{
		System.out.println("invalid number");
		}
		
		 StringBuffer f=new StringBuffer();
	        f.append(e);
	String g=f.toString();
	System.out.println(g);

}

}
