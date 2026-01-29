import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        /*
        기수 정렬 n 크고 자릿수가 작을때  효과 O(k.n)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixSort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void radixSort(int[] arr) {
        // 큐방식과 달리 배열방식은
        // 각 자리수(digit)가 들어갈 위치를 미리 계산한 뒤 채운다.
        int[] output = new int[arr.length];

        // 배열에서 가장 큰 수 찾기
        // 자릿수가 몇 번까지 필요한지 결정하기 위함
        int max = arr[0];
        for (int number : arr) {
            if (max < number) {
                max = number;
            }
        }

        //  1, 10, 100 ~  자릿수 단위로 반복
        for (int exp = 1; max / exp > 0; exp *= 10) {

            // 각 자릿수(0~9)가 몇 개 있는지 세기 위한 배열
            int[] count = new int[10];

            // 현재 자릿수(exp 기준)의 숫자 개수 세기
            //  count[d] = d라는 자릿수를 가진 숫자의 개수
            for (int i = 0; i < arr.length; i++) {
                count[(arr[i] / exp) % 10]++;
            }

            // 누적합 만들기
            // count[d] = d 이하 숫자들이 output 배열에서 차지하는 끝 위치
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // 뒤에서부터 순회하며 output 배열에 값 배치
            // 같은 자릿수일 경우 순서가 유지되도록(안정 정렬)
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[--count[digit]] = arr[i];
            }

            // 이번 자릿수 정렬 결과를 원본 배열로 복사
         
            System.arraycopy(output, 0, arr, 0, arr.length);
        }
    }
}
