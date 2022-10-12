package 부르트포스;
/**
국어. 영어, 수학점수를 입력받아서 학점을 출력하는 프로그램을 완성하시오.
각 과목 점수는 0 ~ 100 사이이다.
평균에 따라 다음과 같이 학점이 결정된다
90이상은 A학점
80이상은 B학점
70이상은 C학점
60이상은 D학점
50이상은 E학점
그 이하는 F학점

출력되는 결과는 다음과 같다.

### 성적표 ###
********************************
이름 국어 영어 수학 총점 평균 학점
*******************************
홍길동 90 90 92 272 90.6 A
********************************
 */
import java.util.*;
class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.next();
        System.out.println("국어: ");
        int ko = scanner.nextInt();
        System.out.println("영어: ");
        int en = scanner.nextInt();
        System.out.println("수학: ");
        int ma = scanner.nextInt();
        System.out.println(solution.solution(name, ko, en, ma));
        scanner.close();
    }
    String solution(String name,int ko,int en,int ma){
        String title = "### 성적표 ###";
        int tot = ko + en + ma;
        float avg = tot / 3;
        String grade = ""; 
        if(avg >= 90){grade = "A";}
        else if(avg >= 80){grade = "B";}
        else if(avg >= 70){grade = "C";}
        else if(avg >= 60){grade = "D";}
        else if(avg >= 50){grade = "E";}
        else{grade = "F";}
        return String.format(
        "%s \n ********************************\n"
        +"이름 국어 영어 수학 총점 평균 학점\n"
        +"*******************************\n"
        +"%s %d %d %d %d %.1f %s학점\n"
        +"********************************", title, name, ko, en, ma, tot, avg, grade);
    }
    
}
