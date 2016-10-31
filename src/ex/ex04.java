package ex;
import java.util.Scanner;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("輸入有幾個值&輸入值");
		int b =scn.nextInt();
		int[] a =new int[b];
		for(int i=0;i<b;i++){
			a[i]=scn.nextInt();
		}
		fun1(a,b);
		for(int i=0;i<b;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static int[] fun1(int[] x,int y){
		for(int i=0;i<y;i++){
			x[i] =x[i]*x[i];
		}return x;
	}

}
