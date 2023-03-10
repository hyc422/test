package programmers.day03;

import java.util.Arrays;

public class Check7 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {7,77,17};
		int[] arr2 = {10,29};

		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
	}
	
	public static int solution(int[] array)
	{
		int answer=0;
		String a = Arrays.toString(array);
		// array 전체를 문자열로 전환, arr1 = [7,77,17]; -> s = "[7,77,17]";
		// String.valueof(array[i]) for문 // 정수를 문자열로 변환

		for(int i=0;i<a.length();i++)
			if (a.charAt(i) == '7')
				answer++;
		// 문자열 s를 처음부터 끝까지 7과 비교하여 같을 시 answer 증가, 반환
		return answer;
	}
	
	/* 다른 풀이
	public static int solution(int[] array)
	{
		int answer=0;
		for(int a:array)	// for each문
		{
			while(a!=0)		// a가 0이 아닐동안 반복
			{
				if(a%10 == 7)
					answer++;	// a를 10으로 나누었을 때 나머지가 7이면 answer 증가
								// 1의 자리가 7이면 나머지가 7
				a/=10;
				// a=a/10 -> a의 자리수를 줄여서 a에 저장
				// ex) 177 -> 17로 변환
				
				// 1의 자리를 7과 비교 후 a의 자리수를 변환하여 다시 1의 자리를 비교하여
				// 전체 자리수를 7과 비교하는 반복문
			}
		}
		return answer;
	}
	*/
}
