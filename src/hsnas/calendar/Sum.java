package hsnas.calendar;

import java.util.Scanner;


public class Sum {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31,30 ,31, 30, 31};
	public int getmaxDays(int month){
		return MAX_DAYS[month-1];
	}


	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		Sum cal = new Sum();
		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
		sc.close();
		//int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31,30 ,31, 30, 31};
		System.out.println(month+"월은"+cal.getmaxDays(month)+"일 까지 있습니다.");

	}
}
