import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		int len,val,val1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		len = scan.nextInt();
		
		val = len;
		for(int i=0; i<len ; i++){
			
			boolean flag =false;
			for(int j=0;j<len;j++){
				if(j==0){
					System.out.print(len);
				}
				else if(flag){
					System.out.print(val);
				}
				else if(j==i){
					val = val-1;
					flag = true;
					System.out.print(val);
				}
				else{
					System.out.print(len-j);
				}
			}
			System.out.print("\n");
		
		}
	}
	
	

}
