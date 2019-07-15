package main;
/**
 * 
 */

/**
 * @author vigneshs
 *
 */
public class Calculator {

	public int add(int i, int j, int k) {
		// TODO Auto-generated method stub
		k = i+j;
		System.out.println("add()--->:"+k);
		return k;
	}

	public int subtract(int i, int j, int k) {
		// TODO Auto-generated method stub
		k = i-j;
		System.out.println("subtract()--->:"+k);
		return k;
	}

	public int div(int i, int j, int k) {
		// TODO Auto-generated method stub
		try {
			k = i/j;
			System.out.println("division()--->:"+k);
		} catch (ArithmeticException e) {
			if(j==0) {
				System.out.println("Denominator cannot be 0");
			}		
		}	
		return k;
	}

	public int multi(int i, int j, int k) {
		// TODO Auto-generated method stub
		k = i*j;
		System.out.println("Multiplication()--->:"+k);
		return k;
	}


}
