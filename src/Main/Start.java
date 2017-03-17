package Main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Start {
	
	static double sum;
	static double percent;
	static int dtime;

	public static void main(String[] args) {
		
		
		
		run();
	}
	
	private static void run(){
		
		
		System.out.println("¬ведите сумму кредита");
		
		try
		{
			sum = (new Scanner(System.in)).nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Ќекорректное значение размера кредита");
			run();
		}
		
		try
		{
			System.out.println("¬ведите срок в мес€цах");
			dtime = (new Scanner(System.in)).nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Ќекорректное значение даты");
			run();
		}
		
		try
		{
			System.out.println("¬ведите годовую процентную ставку");
			percent = (new Scanner(System.in)).nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Ќекорректно введена процентна€ ставка");
			run();
		}
		
		System.out.println("ќбща€ сумма кредита - "+calculateTotalSumm(sum, percent, dtime));
		System.out.println("ѕереплата - "+calculateOverPaid(calculateTotalSumm(sum, percent, dtime), sum));
		
		double mPay = calculateMountlyPaid(calculateTotalSumm(sum, percent, dtime), dtime);
		System.out.println("≈жемес€чный платеж - "+mPay);
		System.out.println("~~~~~~~~~~~~~≈жемес€чный остаток по платежам~~~~~~~~~~~~~");
		
		double arrPay[] = mountlyPaid(dtime, mPay ,calculateTotalSumm(sum, percent, dtime));
		
		for(int i = 0; i<arrPay.length; i++){
			System.out.println("ќстаток в "+(i+1)+" мес€це - "+arrPay[i]);
		}
	}
	
	public static double calculateTotalSumm(double sum, double percent, int dtime){
		return (((sum/100)*(percent/12))*dtime)+sum;
	}
	
	public static double calculateOverPaid(double total, double sum){
		return total-sum;
	}
	
	public static double calculateMountlyPaid(double total, int dtime){
		return total/dtime;
	}
	
	public static double[] mountlyPaid(int mounts, double pay, double total){
		double[] pays = new double[mounts];
		
		for(int i = 0; i<mounts; i++){
			pays[i] = total;
			total = total-pay;
		}
		
		return pays;
	}
}
