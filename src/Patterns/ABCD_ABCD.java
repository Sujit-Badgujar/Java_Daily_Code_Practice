package Patterns;

import java.util.Scanner;

public class ABCD_ABCD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char c=(char)('A' + j - 1);
				System.out.print(c);
				
				j+=1;
			}
			System.out.println();
			i++;
		}
	}

}
