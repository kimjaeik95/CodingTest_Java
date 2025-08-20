import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine());

        long n = Integer.parseInt(st.nextToken());
        long k = Integer.parseInt(st.nextToken());
        
        // 5! (팩토리얼) : 5,4,3,2,1  팩토리얼 값 다구할 필요없다 . 불필요한 계산하지않는다.
        // result 누적값 더한다. 정확히 k번만 업데이트  
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;  //  1 * 3 / 1  3
        }
       
        System.out.println(result);
    }
}