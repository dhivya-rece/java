import java.util.Scanner;
public class consecutive {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=a;
		int len=0;
		int c;
		int d=0;
		int  sum=0;
		while(a>0){
			a=a/10;
			++len;
			
		}
		int k=1;
		while(b>0){
			c=b%10;
			b=b/10;
			sum= sum+k*c;
		    k++;
			
			
		}
		System.out.println(sum);
	}
}
