import java.util.Scanner;
public class consecutive {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=a;
		int len=0;
		int c;
		while(a>0){
			a=a/10;
			++len;
			
		}
		int[] d=new int[len];
		int i=0;
		while(b>0){
			c=b%10;
			b=b/10;
			d[i]=c;
			++i;
		}
		int l=0;
		int[] f=new int[3];
		for(int j=0;j<=d.length;j++){
			
		System.out.println(d[j]);
		if(j==2){
			break;
		}
		if(d[j]==d[j+1]+1){
			f[l]=d[j];
			l++;
			
			
		}
		
		
		}
		for(int p=0;p<3;p++){
		if(f[p]>f[p+1]){
			System.out.println(f[p]);
		}
		
	}}

}
