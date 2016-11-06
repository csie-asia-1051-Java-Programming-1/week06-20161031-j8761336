package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		double b =scn.nextInt();
		System.out.print(fun(a,b));
	}
	public static double fun(int x,double y){
		if (x==1){
			y = ((y-170)*0.6+62); 
		}
		else if(x==2){
			y= ((y-158)*0.5+52);
		}
		return y;
	}}
