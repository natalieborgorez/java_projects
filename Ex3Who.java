// code by Natalie Borgorez

package ch01;
import java.util.Scanner;
public class Ex3Who {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("您是谁？请输入您的姓名：");
		String str = scan.next();
		System.out.println(str + "，您好，欢迎学习Java！");
		scan.close();
	}

}

// code by Natalie Borgorez