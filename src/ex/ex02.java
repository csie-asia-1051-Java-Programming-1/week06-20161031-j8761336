package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入2個整數");
		Scanner scn = new Scanner(System.in);
		long a =scn.nextLong();
		long b =scn.nextLong();
		System.out.print(fun1(a)/fun1(b)/fun1(a-b));
		}
	public static int fun1(long x){
		int sum=1;
		for(int i=1;i<=x;i++){
			sum*=i;
		}return sum;
	}

}
