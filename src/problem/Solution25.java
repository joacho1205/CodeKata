package problem;

import java.util.Arrays;
class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        Arrays.sort(answer);
        if (count == 0) {
            return new int[] {-1};
        }
        return answer;
    }
}
