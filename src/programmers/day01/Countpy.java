package programmers.day01;

public class Countpy 
{
	public static void main(String[] args) 
	{
		String test = "Hello Java";
		System.out.println(solution(test));
	}
	
	public static boolean solution (String s)
	{
		int p = 0, y = 0; // counting할 변수 선정
		for(int i=0;i<s.length();i++)	// 문자열 길이만큼 for 실행
			if(s.charAt(i)=='p' || s.charAt(i)=='P')
				p++; // 위치별 문자열을 확인하여 P or p일 시 변수 p++
			else if(s.charAt(i)=='Y' || s.charAt(i)=='y')
				y++; // 위치별 문자열을 확인하여 Y or y일 시 변수 y++
		
		if(p==y) // 변수 p와 y가 같다면 true 반환, p,y가 하나도 없는 경우도 만족 p=y=0
			return true;
		else	// 다르다면 false 반환
			return false;
	}
	
	/* 다른 풀이 - 1
	public static boolean solution (String s)
	{
		s = s.toLowerCase(); // 문자열을 전부 소문자로 전환 P=p, Y=y가 되므로 구분 필요없음
		
		int count = 0; // counting할 변수 선정
		
		for(int i=0;i<s.length();i++)	// 문자열 길이만큼 for 실행
			if(s.charAt(i)=='p')
				count++; // 위치별 문자열을 확인하여 p일 시 count++
			else if(s.charAt(i)=='y')
				count--; // 위치별 문자열을 확인하여 y일 시 count--
		
		if(count == 0) 		// count==0이라면 true 반환, p와 y의 수가 같다면 증감이 동일해지므로 count == 0
			return true;	// p,y가 하나도 없는경우도 만족 p=y=0
		else	// count!=0이면 false 반환
			return false;
	}
	*/
	
	/*
	public static boolean solution (String s)
	{
		s = s.toUpperCase(); // 문자열을 전부 대문자로 전환 P=p, Y=y가 되므로 구분 필요없음
		
		return s.chars().filter( e -> 'P'==e).count() == s.chars().filter( e -> 'Y'==e).count();
		// chars() -> String의 문자들을 steam으로 생성
		// filter() -> 인자로 함수를 받아서 steam 요소들을 필터링
		// count() -> steam의 갯수를 셈
		// s.chars().filter( e -> 'P'==e).count() -> s의 문자열을 steam으로 생성, 인자 e가 e=='P'일때
		//										     필터링된 steam의 갯수를 센다.
	}
	*/
	
}
