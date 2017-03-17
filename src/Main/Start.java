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
		
		
		System.out.println("������� ����� �������");
		
		try
		{
			sum = (new Scanner(System.in)).nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("������������ �������� ������� �������");
			run();
		}
		
		try
		{
			System.out.println("������� ���� � �������");
			dtime = (new Scanner(System.in)).nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("������������ �������� ����");
			run();
		}
		
		try
		{
			System.out.println("������� ������� ���������� ������");
			percent = (new Scanner(System.in)).nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("����������� ������� ���������� ������");
			run();
		}
		
		System.out.println("����� ����� ������� - "+calculateTotalSumm(sum, percent, dtime));
		System.out.println("��������� - "+calculateOverPaid(calculateTotalSumm(sum, percent, dtime), sum));
		
		double mPay = calculateMountlyPaid(calculateTotalSumm(sum, percent, dtime), dtime);
		System.out.println("����������� ������ - "+mPay);
		System.out.println("~~~~~~~~~~~~~����������� ������� �� ��������~~~~~~~~~~~~~");
		
		double arrPay[] = mountlyPaid(dtime, mPay ,calculateTotalSumm(sum, percent, dtime));
		
		for(int i = 0; i<arrPay.length; i++){
			System.out.println("������� � "+(i+1)+" ������ - "+arrPay[i]);
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
