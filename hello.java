import java.util.Scanner;
public class day {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		int count=0;
		int d=0;
		char[] b=a.toCharArray();
		for(int i=0;i<b.length-2;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[i]==b[j]){
					break;
					}
				}
					
						++count;
						}
		System.out.println(count);
		}
	}


