package programmers.day03;

public class NoNumberSum 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,6,7,8,0};
		int[] arr2 = {5,8,4,0,6,7,9};
		
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));

	}
	
	public static int solution(int[] numbers)
	{
		
		int sum = 0; // 주어진 배열을 더할 변수
		
		for(int i=0;i<numbers.length;i++)
			sum+=numbers[i];
		// 정수 배열 numbers 요소의 합 = sum
		
		return 45-sum;
		// 45 = 1~9까지의 합, 0은 고려할 필요 x
		// 1~9까지의 합 45에서 정수 배열 numbers의 합 sum을 빼면
		// 없는 숫자의 합을 구할 수 있음
	}
	
	
	/* 다른 풀이
	public static int solution(int[] numbers)
	{
		
		int sum = 45; // 45 = 1~9까지의 합, 0은 고려할 필요 x
		
		for(int i=0;i<numbers.length;i++)
			sum-=numbers[i];
		// 1~9까지의 합 45에서 정수 배열 numbers의 요소들 빼면
		// 없는 숫자의 합을 구할 수 있음
		
		return sum;
	}
	*/
}


