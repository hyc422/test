package programmers.day04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class pick2number 
{
	public static void main(String[] args) 
	{
		int[] numbers = {2,1,3,4,1};
		int[] numbers2 = {5,0,2,7};
		
		int n = 3;
		Integer in = new Integer(4);	// deprecated
		Integer in2 = Integer.valueOf(5);	// int값을 Integer 타입으로 대입할때 사용하는 method
		Integer in3 = 11;	// 자동 캐스팅
		
		n = in;	// 자동캐스팅
		in = n;
		
		System.out.println(Arrays.toString(solution(numbers)));
		System.out.println(Arrays.toString(solution(numbers2)));
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();	// 정렬 기능이 있는 Set
		
		s1.add(11);	s1.add(5);	s1.add(15);	s1.add(25);	s1.add(8);	s1.add(15);	
		s2.add(11);	s2.add(5);	s2.add(15);	s2.add(25);	s2.add(8);	s1.add(15);
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		System.out.println("s1");	// 무작위
		for(Integer a : s1)
			System.out.println(a);
		
		System.out.println("\ns2");	// 정렬된 상테로 데이터를 가져옴
		for(Integer a : s2)
			System.out.println(a);
	
		
	}	// main end
	
	public static int[] solution(int[] numbers)
	{
		// Set<Integer> set = new HashSet<>();
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0;i<numbers.length;i++)
			for(int j=i+1;j<numbers.length;j++)
				set.add(numbers[i]+numbers[j]);
		
		int[] answer = new int[set.size()];
		int i = 0;
		
		for(Integer a : set)
			answer[i++] = a;
				
		//Arrays.sort(answer);
		
		return answer;
	}

}
