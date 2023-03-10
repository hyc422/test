package programmers.day01;

public class Spassword 
{

	public static void main(String[] args) 
	{
		// String test = "A B";
		// String test = "z";
		String test = "a B z";
		
		// int n = 1;
		int n = 4;
		
		int t = 1%26;

		System.out.println(solution(test,n));
		System.out.println(t);
	}
	
	
	public static String solution(String s, int n)
	{
		String answer = "";
	
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			int t = (int)ch;
			if(t>=65 && t<=90)
				if(t+n<91)
					answer+=(char)(t+n);
				else
					answer+=(char)(t+n-26);
			else if(t>=97 && t<=122)
				if(t+n<123)
					answer+=(char)(t+n);
				else
					answer+=(char)(t+n-26);
			else
				answer+=ch;
		}
		
		return answer;
	}
	
	
}
