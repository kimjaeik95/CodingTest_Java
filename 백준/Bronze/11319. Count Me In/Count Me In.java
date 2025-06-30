import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String[] writes = new String[a];
        for (int i = 0; i < writes.length; i++) {
            writes[i] = br.readLine();
        }

        for (int i = 0; i < writes.length; i++) {
            int b = 0;
            int d = 0;
            for (char c : writes[i].toCharArray()) {   // 영어의 모음을 알아야한다.
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                        c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    d++;
                } else if (Character.isLetter(c)){  // c != ' ' 숫자랑 기호는 포함되어서 isLetter()메서드가 안전
                    b++;
                }
            }
            bw.write(b + " " + d + '\n');
        }

        bw.flush();
    }
}
