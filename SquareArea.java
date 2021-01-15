// code by Natalie Borgorez

package ch01;  //打包语句
import java.util.Scanner;  //导入语句
public class SquareArea {  //定义一个类，名为SquareArea
       public static void main(String args[]) {  //main是类的主方法
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter a number: ");
             float a = scanner.nextFloat();  //输入浮点数，回车结束
             double area = a * a;       
             System.out.println("area=" + area); //控制台输出面积
             scanner.close();
    }
}

// code by Natalie Borgorez
