package programmers.day01;

public class AEIOU 
{
	public static void main(String[] args) 
	{
		String test = "nice to meet you";
		
		System.out.println(solution(test));
		System.out.println(solution2(test));
	}

	public static String solution (String my_string)
	{
		String answer = "";
		
		for (int i=0;i<my_string.length();i++)
		{	// 문자열 길이만큼 for 실행
			char ch = my_string.charAt(i); // a에 for 실행 시 문자 저장
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') 
				answer+=ch; // ch가 "a,e,i,o,u"가 아니면 answer에 연결하여 저장
		}
		
		// answer = my_string.replaceAll("[aeiou]", "");
		// 다른 풀이 - replace(지정 문자,대체할 문자) -> 지정한 문자를 대체할 문자로 변경하는 method
		//		  - replaceALL(지정 문자,대체할 문자) -> 지정한 문자를 대체할 문자로 전부 변경하는 method
		return answer; // 저장된 문자열 반환
	}
	
	// 다른 풀이
	public static String solution2 (String my_string)
	{
		String  answer ="";
		char[] moeum = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i=0;i<my_string.length();i++)
		{
			char ch = my_string.charAt(i);
			int j;
			for(j=0;j<moeum.length;j++)
				if(ch == moeum[j]) break; // my_string.charAt(i)이 mouem[j]와 동일 시 for문 중단
			
			if(j==moeum.length) answer+=ch; 
			// 동일 문자가 없을 시 j를 counting하여 moeum.length와 같다면 a,e,i,o,u가 아니므로 answer에 추가
		}
		return answer;
	}
}

