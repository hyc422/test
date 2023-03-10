package programmers.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SameNumberRemove 
{
	public static void main(String[] args) 
	{

		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		// List
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
		
		// Stack
		System.out.println(Arrays.toString(solution2(arr1)));
		System.out.println(Arrays.toString(solution2(arr2)));
	}	// main end
	
	public static int[] solution(int arr[])
	{	// List
		List<Integer> list = new ArrayList<>();
		int j = 0;
		for(int i : arr)
			if(list.size() == 0)
				list.add(i);
			else if (list.get(j) != i)	// arr[i-1] != arr[i] 
			{
				list.add(i);
				j++;
			}

		int[] answer = new int[list.size()];
		
		for(int i=0;i<list.size();i++)
			answer[i]=list.get(i);
		return answer;
	}	// method end
	
	public static int[] solution2(int arr[])
	{	// Stack
		Stack<Integer> stack = new Stack<>();
		
		for(int i : arr)
			if(stack.size() == 0) //  stack이 비어있으면 s.push(arr[i]);
				stack.push(i);
			else if (stack.peek() != i)	// arr[i-1] != arr[i] 
				stack.push(i);

		int[] answer = new int[stack.size()];
		
		for(int i=stack.size()-1;i>=0;i--)
			answer[i]=stack.pop();
		return answer;
	}	// method end
	
}	// Class end

