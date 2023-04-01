package Basic.Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// Number pattern pyramid with increasing numbers in each line of pyramid 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int val;
		//rows
		int row=1;
		while(row<=n) {
			
			val=row;
			
			//spaces work
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			//stars work
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val); 
				
			}
			
			System.out.println();
			nst= nst+2;
			nsp=nsp-1;
			row++;

		}
	}

}
