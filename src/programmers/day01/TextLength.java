package programmers.day01;

public class TextLength 
{	//문자열 길이 및 숫자 확인
	public static void main(String[] args) 
	{
		String test = "456878a";


		System.out.println("결과 " + soluton(test));
				
		
	}

	public static boolean soluton (String s)
	{
		boolean answer = true;
		int l = s.length(); // 문자열 길이 확인
		
		if(l==4 || l==6)	// 문자열이 길이가 4 혹은 6일때만 실행
			for(int i=0; i<l;i++)
			{	 // 위치별 문자열 확인
				s.charAt(i);
				if (!(s.charAt(i) >= '0' && s.charAt(i) <='9'))
				{	// 해당 위치의 문자열이 숫자가 아니면 false로 전환
					answer = false;
					break;	// for 종료
				}
			}
		else	// 문자열이 길이가 4 혹은 6 아니면 false로 전환
			answer = false;
		
		return answer;	// answer 반환
	}

	/* 
	다른 풀이
	public static boolean soluton (String s)
	{
		if(s.length()==4 || s.length()==6)	// 문자열이 길이가 4 혹은 6일때만 실행
			try // 예외 처리 구문
			{
				int x = Integer.parseInt(s);	// parseInt(String) String타입의 숫자를 int타입으로 변환
												// 문자열에 숫자이외의 형식의 문자가 있을 경우 오류 발생
				return true;	// s 문자열이 전부 숫자일시 error 발생 없음, true를 반환
			}
			catch(NumberFormatException e)	// 숫자형식오류(NumberFormatException) 발생 시 catch에서 처리
			{
				return false; // 오류 발생 시 false값 반환
			}
		else	// 문자열이 길이가 4 혹은 6 아니면 false 반환
			return  false;
	}
	*/
}


