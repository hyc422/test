package programmers.day02;

import java.util.Arrays;

public class StringtoArray 
{
	public static void main(String[] args) 
	{
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String my_str2 = "abcdef123";
		int n2 = 3;
		
		System.out.println(Arrays.toString(solution(my_str,n)));
		System.out.println(Arrays.toString(solution(my_str2,n2)));
	
	} // end main
	
	public static String[] solution (String my_str, int n)
	{
		int length = (my_str.length()+n-1)/n;
		// answer 길이 my_str.length()+n-1)/n -> java의 /는 몫만 나옴
		// (my_str.length()+(n-1))/n == my_str.length()/n
		// ex) (12+(3-1))/3 == 12/3
		
		String[] answer	= new String[length];	

		for (int i = 0;i<length;i++)
			// substring(start_index, end_index) -> start_index부터 *end_index-1까지*
			answer[i]=my_str.substring(i*n,(i+1)*n<my_str.length()? (i+1)*n:my_str.length());
			// answer[0 ~ my_str.length()/n] = my_str.substring(0 ~ n-1, n ~ 2*n-1, 2*n ~ 3n-1...);
			// answer[my_str.length()/n+1] = my_str.substring(i*n ~ my_str.length());
		
		return answer;
	}

}
