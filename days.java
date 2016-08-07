import java.util.Scanner;
public class workingday {
public static void main(String[] args) {
		boolean b=false;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the day");
		String a=in.nextLine();
		if(a=="monday"||a=="tuesday"||a=="wednesday"||a=="tuesday"||a=="friday"||a=="saturday")
		{
			b=true;
			System.out.println(b);
		}
		 if(a=="sunday")
			b=false;
			System.out.println(b);
		
	}

}
