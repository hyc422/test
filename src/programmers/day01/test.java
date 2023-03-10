package programmers.day01;

//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
//solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class test {
	public static void main(String[] args) {
		
		System.out.println("결과: " + solution2("11134"));
		System.out.println("결과: " + solution3("1234"));
		System.out.println("결과: " + solution3("123"));
		System.out.println("결과: " + solution3("123a"));
	}
	
	public static boolean solution1(String s) {  //김경준
	      boolean answer = false;
	      if(s.length()==4||s.length()==6){ // 문자열 길이가 4 혹은 6
	          for(int i=0;i<s.length();i++){
	              if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
	                  answer = true;
	              }else{
	                  answer = false;
	                  break;
	              }
	          }
	      }
	      return answer;
	}
	
	public static boolean solution2(String str) {  //김상훈
		boolean answer = true;
		if(str.length()>3&&str.length()<7) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i) ;
				if(c>='A'&& c<='Z' || c>='a'&& c<='z') {
					return false;
				}
			}
			return answer;
		}
		return !answer;
	}
	
	public static boolean solution3(String s) {     //김종훈

		boolean result = true;
		int len = s.length();
		if(len == 4 || len == 6) {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
			}
		}
		else  return false;
		return result;
	}
}



