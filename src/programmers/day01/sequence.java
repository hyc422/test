package programmers.day01;

public class sequence 
{
	public static void main(String[] args) 
	{
		int[] common = {1,2,3,4};
		// int[] common = {2,4,8};

		System.out.println(solution(common));
	}
	
	public static int solution (int[] common)
	{	// 등차 or 등비수열 판별하여 마지막 배열 다음 수를 계산하는 method
		if(common[1]-common[0] == common[2]-common[1]) // 등차수열 : 배열간의 차가 일정
			return common[common.length-1]+(common[1]-common[0]);
		else	// 등비수열 : 배열간의 비(공비)가 일정한 수열
			return common[common.length-1]*common[1]/common[0];
	}
}
