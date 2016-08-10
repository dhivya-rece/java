import java.util.Scanner;


public class day {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b;
		int sum=0;
		while(a>0){
			b=a%10;
			sum=(int) (sum+Math.pow(b, b));
			a=a/10;
		}
		System.out.println(sum);
		
	}

}
