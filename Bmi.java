import java.util.Scanner;

public class Bmi {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("１人目の身長(m)を入力してください");
		double height = sc.nextDouble();
		System.out.print("１人目の体重(kg)を入力してください");
		double weight = sc.nextDouble();
		System.out.print("２人目の身長(m)を入力してください");
		double height2 = sc.nextDouble();
		System.out.print("２人目の体重(kg)を入力してください");
		dpuble weight2 = sc.nextDouble();

		double bmi = weight / Math.pow(height, 2);
		double bmi2 = weight2 / Math.pow(height2, 2);

		System.out.println("１人目のBMI値は"+(Math.floor(bmi*100)/100)+"です。");
		System.out.println("２人目のBMI値は"+(Math.floor(bmi2*100)/100)+"です。");
	}
}	
