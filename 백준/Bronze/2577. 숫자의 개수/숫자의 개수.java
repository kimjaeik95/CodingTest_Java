import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] n = new int[10];  //숫자 0~9 체크용
        int sum = a * b * c;
        
        // String - char 로 바꾸는게 메모리를 더 사용하기 때문 숫자로 자릿값구하기 
        while(sum > 0) {
            n[sum % 10]++; // 나머지  몫으로 인덱스 위치
            sum /= 10; // 오른쪽부터 십진수로 자른다.
        }
        
        for (int s : n) {
            bw.write(s + "\n");
        }
        
        bw.flush();

    }
}