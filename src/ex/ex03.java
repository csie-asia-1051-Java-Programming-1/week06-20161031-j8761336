package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一串數字");
		Scanner scn =new Scanner(System.in);
		String a =scn.next();
		System.out.println(fun1(a));}
	public static String fun1(String x){
		String str ="";
		for(int i=0;i<x.length();i++){
			str+=x.charAt(i)+" ";
		}return str;
	}

}
