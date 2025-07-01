import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNumber = 1;

        // new int[] for문으로 갯수를 미리 지정 안해줘도 된다.
        // n1~n4 각종변수를 삼항연산자로 코드르 줄일 수 도 있지만 가독성땜에 하지 않았다.
        while (true) {
            int n0 = Integer.parseInt(br.readLine());
            if (n0 == 0) break;

            int n1 = 3 * n0;
            int n2;

            if (n1 % 2 != 0) {
                n2 = (n1 + 1) / 2;
            } else {
                n2 = n1 / 2;
            }

            int n3 = 3 * n2;
            int n4 = n3 / 9;

            if (n1 % 2 != 0) {
                bw.write(caseNumber + ". odd " + n4 + "\n");
            } else {
                bw.write(caseNumber + ". even " + n4 + "\n");
            }
            caseNumber++;
        }
        bw.flush();
    }
}