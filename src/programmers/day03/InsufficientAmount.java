package programmers.day03;

public class InsufficientAmount 
{

	public static void main(String[] args) 
	{
		int price = 3;
		int money = 20;
		int count = 4;
		/*
		long price2 = 3;
		long money2 = 20;
		long count2 = 4;
		*/
		System.out.println(solution(price,money,count));
		// System.out.println(solution2(price2,money2,count2));
	}
	
	public static long solution(int price, int money, int count)
	{
		long answer = 0;
		
		for(int i=1;i<=count;i++)
			answer+=price*i;
		// 놀이기구 이용 요금의 총합, 횟수가 증가할때마다 요금이 증가하므로 price*i
		// 1부터 시작, count까지 포함 
		
		return answer>money? answer-money:0;
		// 삼항 연산, 소지금액보다 이용 요금이 많다면 answer-money 반환, 적다면 0 반환
	}
	
	/* 다른풀이
	public static long solution2(long price, long money, long count)
	{
	public static long solution2(long price, long money, long count)
	{
		return Math.max(price*(count*(count+1)/2)-money, 0);
		// 수식 문제 : count는 등차가 1인 수열, count/2 * (count+1) => 1~count의 등차수열 합
		// 등차수열 합 * price는 count 횟수까지의 가격 총합
		// Math.max는 두개의 값중 중 더 큰값를 찾을 때 쓰는 함수
		// 가격 총합 - 소지금액 > 0 이면 return 가격총합 - money
		// 가격 총합 - 소지금액 < 0 이면 return 0
	}
	}
	*/

}
