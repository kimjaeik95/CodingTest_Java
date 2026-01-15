import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /* sum == n  count 올리고 
           sum > n  start_index 올리고  sum - start_index
           sum < n  end_index 올리고  sum + end_index
        */
        int n = Integer.parseInt(br.readLine());
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        int count = 1;
        
        while (end_index != n) {
            if (sum == n) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > n) {
                sum = sum - start_index;
                start_index++;
            } else { // sum < n
                end_index++;
                sum = sum + end_index;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
  