package 수학;
import java.util.*;
class Solution{
     public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 첫번째 수: ");
        int a = scanner.nextInt();
        System.out.println("+, -, *, /, %");
        String b = scanner.next();
        System.out.println(" 두번째 수: ");
        int c = scanner.nextInt();
        System.out.println(solution.solution(a, b, c));
     }   
     String solution(int a,String b,int c){
        String title = " ### 계산기 ### ";
        int answer = 0;
        if(b.equals("+")){answer = a + c;}
        else if(b.equals("-")){answer = a - c;}
        else if(b.equals("*")){answer = a * c;}
        else if(b.equals("/")){answer = a / c;}
        else if(b.equals("%")){answer = a % c;}
        else{System.out.println("잘못된 연산자입니다"); }
        return String.format(" %s \n %d %s %d = %d", title, a, b, c, answer);
     }
}
