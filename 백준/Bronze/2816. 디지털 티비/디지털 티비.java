import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 받기 (예: 3줄 → 각 채널명 입력)
        int n = Integer.parseInt(br.readLine());  // 예: 3
        String[] channels = new String[n];
        for (int i = 0; i < n; i++) {
            channels[i] = br.readLine();
        }

        String temp;
        int kbs1FoundIdx = 0;
        int kbs2FoundIdx = 0;

        // KBS1 위치 찾기
        for (int i = 0; i < channels.length; i++) {
            if (channels[i].equals("KBS1")) {
                kbs1FoundIdx = i;
                break;
            }
            sb.append('1');
        }

        // KBS1을 맨 위로 올리기
        while (kbs1FoundIdx > 0) {
            sb.append('4');
            temp = channels[kbs1FoundIdx];
            channels[kbs1FoundIdx] = channels[kbs1FoundIdx - 1];
            channels[kbs1FoundIdx - 1] = temp;
            kbs1FoundIdx--;
        }

        // KBS2 위치 다시 찾기 (KBS1이 움직이며 위치가 바뀌었을 수 있으므로)
        for (int i = 0; i < channels.length; i++) {
            if (channels[i].equals("KBS2")) {
                kbs2FoundIdx = i;
                break;
            }
            sb.append('1');
        }

        // KBS2를 두 번째로 올리기
        while (kbs2FoundIdx > 1) {
            sb.append('4');
            temp = channels[kbs2FoundIdx];
            channels[kbs2FoundIdx] = channels[kbs2FoundIdx - 1];
            channels[kbs2FoundIdx - 1] = temp;
            kbs2FoundIdx--;
        }

        System.out.print(sb);
    }
}