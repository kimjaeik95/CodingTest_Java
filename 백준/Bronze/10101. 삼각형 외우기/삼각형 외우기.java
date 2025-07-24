import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && b == 60 && c == 60) {
            bw.write("Equilateral");
        } else if (a + b +c == 180 && (a == b || a == c || b == c)) {
            bw.write("Isosceles");
        } else if (a + b + c == 180 && a != b && a != c && b != c) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }
        bw.flush();
    }
}