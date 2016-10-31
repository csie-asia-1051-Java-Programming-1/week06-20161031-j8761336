package ex;
import java.util.Scanner;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021026 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入n跟圖形c");
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		char c =scn.next().charAt(0);
		for(int i=n;i>0;i--){
			for(int j=n;j>0;j--){
				System.out.print(c);
			}
			System.out.println();
		}
		
	}

}
