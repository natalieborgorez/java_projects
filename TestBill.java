// code by Natalie Borgorez

package bill;

import java.util.Scanner;

public class TestBill {
	
public static void main(String[] args){
	
   Scanner sc = new Scanner(System.in);
   
   Bill waterBill = new WaterBill(sc.nextDouble());
   
   Bill gasBill = new GasBill(sc.nextDouble());
   
   System.out.println("该居民缴费总额为" + (waterBill.getBill() + gasBill.getBill()));
   
   sc.close();
 }
}

//code by Natalie Borgorez
