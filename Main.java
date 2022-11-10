import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("身長(m)を入力してください");
		double height = sc.nextDouble();
		System.out.print("体重(kg)を入力してください");
		double weight = sc.nextDouble();

		double bmi = weight / Math.pow(height, 2);

		System.out.println("BMI値は"+(Math.floor(bmi*100)/100)+"です。");
	}
}	
