import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     

        // 모든 조합에서 자기자신  색이 맞는 자기 상하의 뺀다.
        int result = n * n - n;
        System.out.println(result);

    }
}