import java.io.*;
import java.util.*;

public class Main {
    static int[] myArr; // checkArr 비교할 배열  
    static int checkCount; // 4가지 경우가 다 맞아야함 
    static int[] checkArr; // 주어진 체크 수 값 담는 배열
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        char[] m = br.readLine().toCharArray();
        myArr = new int[4];
        st = new StringTokenizer(br.readLine());
        checkArr = new int[4];
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkCount++; // 어차피 0이면 만족이니까
            }
        }
        
        int result = 0;
        // 슬라이딩 윈도우 전 부분문자열 시작   
        for (int i = 0; i < p; i++) {
            Add(m[i]);
        }
        
        if (checkCount == 4) {
            result++;
        }
        
        // 슬라이딩 윈도우 시작  처음 부분문자열에서 뒤로 추가될 인덱스
        for (int i = p; i < s; i++) {  
            int j = i - p;
            Add(m[i]);      // 오른쪽 문자 추가
            Remove(m[j]);   // 왼쪽 문자 제거
            
            if (checkCount == 4) {
                result++;
            }
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
    }
    
    private static void Remove(char c) {
        switch(c) {
            case 'A' :
                if (myArr[0] == checkArr[0]) {
                    checkCount--;
                }
                myArr[0]--;
                break;
            case 'C' :
                if (myArr[1] == checkArr[1]) {
                    checkCount--;
                }
                myArr[1]--;
                break; 
            case 'G' :
                if (myArr[2] == checkArr[2]) {
                    checkCount--;
                }
                myArr[2]--;
                break;
            case 'T' :
                if (myArr[3] == checkArr[3]) {
                    checkCount--;
                }
                myArr[3]--;
                break;
        }
    }
    
    private static void Add(char c) {
        switch (c) {
            case 'A' :
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkCount++;
                }
                break;
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1]) {
                    checkCount++;
                }
                break;
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]) {
                    checkCount++;
                }
                break;
            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3]) {
                    checkCount++;
                }
                break;
        }
    }
}