/**
 * @requirement
 * Viết chương trình sử dụng hàm: Nhập vào 2 số nguyên dương a, b. 
 * Tìm USCLN và BSCNN của a và b.
 */
package practice05;

import java.util.Scanner;

/**
 * @author bachnn92
 *
 */
public class class05 {

	/**
	 * @param positive_integers
	 * GCD is greatest common divisor 
	 * LCM is least common multiple 
	 * @return GCD, LCM
	 */
	public static void main(String[] args) {
		int number[] = data();
		System.out.println("Greatest common divisor of "+ number[0] + " and " + number[1] + " is " + GCD(number[0],number[1]));
		System.out.println("Least common multiply of "+ number[0] + " and " + number[1] + " is " + LCM(number[0],number[1]));

	}
	// Collect Data
	public static int[] data ()
	{
		Scanner MyData = new Scanner(System.in);
		System.out.println("Input Integer X: ");
		int number1 = MyData.nextInt();		
		System.out.println("Input Integer Y: ");
		int number2 = MyData.nextInt();
		MyData.close();
		return new int[] {number1, number2};
	}
	// Greatest Common Divisor
	private  static int GCD(int divisor, int diviend)
	{
		int remainer = divisor % diviend;
		if (remainer == 0) return diviend;
		else return GCD(diviend,remainer);
	}
	// Least Common Multiply
	private static int LCM(int factor1, int factor2)
	{
		int product = factor1 * factor2;
		int LCM = product/GCD(factor1,factor2);
		return LCM;
	}
}
