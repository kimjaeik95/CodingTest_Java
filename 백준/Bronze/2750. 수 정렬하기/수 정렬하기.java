import java.io.*;
import java.util.*;

public class Main {
    private static int[] arr;
    
    public static void main(String[] args) throws IOException {
        // 퀵소트 구현  O(nlog)  최악의 경우 O(n제곱)
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        quickSort(0, n - 1);
        
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.print(sb);
    }
    
    private static void quickSort(int left, int right) {
        int start = left;
        int end = right;
        int pivot = arr[(left + right) / 2];  // 중간 값 pivot 설정
        while (start <= end) {
            while (arr[start] < pivot) { // start 가 작으면 인덱스 올리기
                start++;
            }
            
            while (arr[end] > pivot) {  // end 가 크면 인덱스 줄이기
                end--;
            }
            if (start <= end) { // start++ end-- 가 조건에 맞춰진 다음 start  end 서로 교차하기전까지
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;  // 다음 비교를 위해서 이때 pivot 유지 
                end--; 
            }
        }
        
        // 교차가 발생하면  집합이 생기게 됨
            if (left < end) {
                quickSort(left, end); // 재귀 함수 실행
            }
            
            if (start < right) {
                quickSort(start, right);
            }
    }
 }
       