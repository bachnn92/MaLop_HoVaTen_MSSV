/**
 * Viết chương trình: Nhập các thông tin của 1 sinh viên
 * gồm mã sinh viên, họ tên, tuổi, năm sinh, điểm trung bình.
 * Xuất các thông tin ra màn hình (hãy sử dụng kiểu dữ liệu thích hợp).
 */
package practice03;

import java.util.Scanner;

/**
 * @author bachnn92
 *
 */
public class class03 {

	/**
	 * @param  Infomation
	 * this class can improve collect data method by using try/catch
	 * @return moreInformation
	 */
	public static void main(String[] args) {
		// Start input method
		Scanner Data = new Scanner(System.in);
		// Collect data
		System.out.println("Please fill your information in this console!");
		System.out.println("Your First Name");
		String FirstName = Data.nextLine();
		
		System.out.println("Your Last Name");
		String LastName = Data.nextLine();
		
		System.out.println("Your Birthday");
		String Birthday = Data.nextLine();
		
		System.out.println("Your Age");
		String Age = Data.nextLine();
		
		System.out.println("Input your GPA");
		String GPA = Data.nextLine();
		
		// Report
		System.out.println("=== Report ===");
		System.out.println("Full Name: " + FirstName + " " + LastName);
		System.out.println("Birthday: " + Birthday + " " + "(" + Age + " years old)");
		System.out.println("GPA: " + GPA);
		
		Data.close();
		
		
	}

}
