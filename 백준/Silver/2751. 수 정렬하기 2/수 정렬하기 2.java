import java.io.*;
import java.util.*;

public class Main {
    private static int[] arr;
    private static int[] s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        s = new int[n]; // 재배열시 필요한 배열
        mergeSort(arr,0, arr.length - 1);
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
    }

    /* 병합정렬 
     구간 나누기, 재귀호출 , 집합 병합
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) { // 쪼갤수 없는상태
            return;
        }

        int mid = (left + right) / 2; // 쪼개기 위한 중위 값
        mergeSort(arr, left, mid); // 쪼갤수 있는지를 검사 재귀함수  못쪼개면 return ,  쪼갤 수 있으면  mid 값 계산해서 한번더 재귀함수 호출
        // 쪼개질떄까지 재귀함수로  계속 왼쪽만 호출하다가  return 만나면 오른쪽 재귀함수로 실행 여기도 마찬가지로 쪼개질떄까지
        mergeSort(arr, mid + 1, right); // 3 ~ 5  배열인덱스 길이에서 겹치면 안됨  + 1 필수
        merge(arr,left,mid,right);

    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int i = left; // 왼쪽 구간 시작   투포인터
        int j = mid + 1;  // 오른쪽구간 시작 투포인터
        int k = left; // 임시 배열 인덱스

        // 0  < 3  &&  3 <= 5  i가 미드값을 넘거나, j가  right 배열인덱스 끝값까지가면 while 문 끝남
         while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) { //  0 1
                s[k++] = arr[i++]; // 왼쪽 값이 작으면 넣고  왼쪽 인덱스 증가
            } else {
                s[k++] = arr[j++]; // 오른쪽 값이 더 작으면  넣고 오른쪽 인덱스 증가
            }
        }
        // 왼쪽이나 오른쪽이 더 이상 값을 비교 할게 없으면  부분정렬은 되어있으니 그냥 몰아서 넣기
        while (i <= mid) {
            s[k++] = arr[i++];
        }

        while (j <= right) {
            s[k++] = arr[j++];
        }

        // 원본배열, 시작인덱스, 복사배열, 시작인덱스, 길이  메모리 사용해서 복사로  복사할 값이 많아지면  더 효율적
        System.arraycopy(s, left, arr, left, right + 1 - left);
        
    }
}
