import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 서브태스크2에서  10^15 int를 넘는다. 많이 헤맸다.. 문제를 잘 읽자 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n1 = Long.parseLong(st.nextToken()); // 출력이 8 14 붙어있다. br.read로 받으면 오류
        long n2 = Long.parseLong(st.nextToken()); // StringTokenizer는 공백 기준으로 "8", "14"를 잘라냄
        
        long start = Math.min(n1, n2);
        long end = Math.max(n1, n2);
       
        long count = end - start - 1;
        if (count < 0) count = 0;
        bw.write(count + "\n");
        
        for(long i = start + 1; i < end; i++) { 
            bw.write(i + (i < end - 1 ? " " : "")); // i + " " 할 경우 공백만 남기때문에
            /* 삼항연산자가 사실 까다롭다 생각안날때도 있고 그러면 StringBuilder로 
               sb.append(i).append(" ");
               bw.write(sb.toString().trim()); 공백제거해도 간단하다. 
            */
        }
        if(count > 0) bw.write("\n");
        
        bw.flush();
    }
}