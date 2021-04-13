/**
 * Viết chương trình: Nhập vào hai số nguyên x, y. 
 * Xuất ra màn hình tổng, hiệu, tích, thương của hai số trên.
 */
package practice04;

import java.util.Scanner;

/**
 * @author bachnn92
 *
 */
public class class04
{
	/**
	 * @param Numbers
	 * 	/** Basic algebra function
	 * Addition: sum S of X and Y equal addend X plus addend Y
	 * Subtraction: difference D of X and Y equal minuend X minus subtrahend Y
	 * Multiplication: product P of X and Y equal factor X times factor Y
	 * Division: quotient Q of X and Y equal divisor X divide by diviend Y minus remainder R
	 * @return combine_Result
	 */
	public static void main(String[] args)
	{
		// Start input method
		int number[] = data();
		System.out.println(number[0] + " plus " + number[1] + " is equal " + addition(number[0], number[1]));
		System.out.println(number[0] + " minus " + number[1] + " is equal " + subtraction(number[0], number[1]));
		System.out.println(number[0] + " times " + number[1] + " is equal " + multiplication(number[0], number[1]));
		System.out.println(number[0] + " devided by " + number[1] + " equals " + division(number[0], number[1])[0]
													+ 	" and remainder " + division(number[0], number[1])[1]);
	}
	public static int[] data () {
		Scanner MyData = new Scanner(System.in);
		System.out.println("Input Integer X: ");
		int number1 = MyData.nextInt();		
		System.out.println("Input Integer Y: ");
		int number2 = MyData.nextInt();
		System.out.println("Integer X is " + number1 +  " and Integer Y is " + number2);
		MyData.close();
		return new int[] {number1, number2};
	}
	private static int addition(int addend1, int addend2)
	{
		int sum = addend1 + addend2;
		return sum;
	}
	private static int subtraction(int minuend, int subtrahend)
	{
		int difference = minuend - subtrahend;
		return difference;
	}
	private static int multiplication(int factor1, int factor2)
	{
		int product = factor1 * factor2;
		return product;
	}
	public static int[] division(int divisor, int diviend){
		int quotient = divisor / diviend;
		int remainer = divisor % diviend;
		return new int[] {quotient, remainer};
	}

}
