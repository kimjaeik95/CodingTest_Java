import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        String s = br.readLine().trim();
        int count2 = 0;
        int countE = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                count2++;
            } else if (s.charAt(i) == 'e') {
                countE++;
            }
        }
        if (count2 > countE) {
            bw.write("2");
        } else if (count2 == countE){
            bw.write("yee");
        } else {
            bw.write("e");
        }

        bw.flush();
        bw.close();
    }
}