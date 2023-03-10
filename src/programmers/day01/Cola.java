package programmers.day01;

// import java.util.Scanner;

public class Cola {

	public static void main(String[] args) 
	{
        // Scanner sc = new Scanner(System.in);
        
		int a=2,b=1,n=20;
		
        System.out.println("소유 콜라 병수 : "+ n);
        // n = sc.nextInt();
        //소유 콜라 병수 = 콜라 빈 병수
        System.out.println("요구하는 콜라 빈 병수 : " + a);
        //a = sc.nextInt();
        
        System.out.println("돌려주는 콜라 병수 : "+ b);
        //b = sc.nextInt();
        
		System.out.println(solution(a,b,n));
		
		//sc.close();

	}
	
	public static int solution (int a, int b, int n)
	{
 
        int answer = 0;
        
        if(b>=1 && a>b && n>=a && n<=1000000)
        {
        	while(true) 
        	{	
        		System.out.println("보유 콜라 " + n);
        		
        		if(n%a==0)
        		{
        			b=n/a;
        			System.out.println("보유 콜라 " + n);
        			
        		}
        		else
        		{
        			b=n/a+n%a;
        			System.out.println("보유 콜라 " + n);
        			
        		}
        		
        		answer+=n/a;
        		n=b;
        		System.out.println("받은 콜라 총 병 " + answer);
        		
        		if(n<a) break;
        	}
        }
		
        return answer;
	}

}
