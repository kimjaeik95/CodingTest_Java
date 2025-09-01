
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int idx = 0;

        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            arr[idx++] = num;
        }

        // 1번 인덱스는 제외
        // [2,2], [1,3], [-3,4], [-1,5]
        for (int i = 1; i < n; i++) {
            deque.offer(new int[]{arr[i], i + 1});
        }

        bw.write(1 + " ");

        int move = arr[0]; // 3시작

        for (int i = 1; i < n; i++) {  //  1 < 5
            if (move > 0) {  // 3 > 0  참 
                for (int j = 1; j < move; j++) {  // 1 < 3
                    deque.offer(deque.poll());  // 앞에 제거하고 뒤에넣는다
                }

                // int[0] 값 , int[1] 인덱스
                // 양수는 오른쪽에 넣는다.
                int[] move_arr = deque.poll();  
                move = move_arr[0]; // -3 저장
                bw.write(move_arr[1] + " "); // 인덱스 번호
                
            } else {
                // 음수는 왼쪽 첫번째에 넣는다. 
                for (int j = 1; j < -move; j++) {
                    deque.offerFirst(deque.pollLast());
                }

                int[] move_arr = deque.pollLast();
                move = move_arr[0];
                bw.write(move_arr[1] + " ");
            }
        }
        
        bw.flush();
        }
    }