package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		float a =scn.nextInt();
		int b =scn.nextInt();
		System.out.println(fun(a, b));
	}
	public static float fun (float x,int y){
		if(y == 1){
			x = x*9/5+32;
		}
		else if(y == 2){
			x = (x-32) * (5/9);
		}
		return x;
	}

}
