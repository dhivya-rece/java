import java.util.*;
public class prime {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int l=in.nextInt();
	int array[]=new int[l];
	int array1[]=new int[l];
	int sum=0;
	int j=0;
	System.out.println("enter the elements in array");
	for(int k=0;k<l;k++)
	{
		array[k]=in.nextInt();
	}
	
		
		for(int i=2;i<l;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				}
				}
				if(j==i){
				sum=sum+array[i];
					
				}
					
				}
		System.out.println(sum);
		
	}

}
