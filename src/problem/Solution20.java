package problem;

import java.util.Arrays;
import java.lang.StringBuilder;

class Solution20 {
    public long solution(long n) {
        // solution메서드는 long타입 정수를 입력받아 정렬된 long타입 결과를 반환한다
        long answer = 0;

        // String.valueOf(n) 으로 n을 문자열로 변환, .toCharArray()으로 문자열을 문자 배열로 분리하여 charArr에 담는다.
        char[] charArr = String.valueOf(n).toCharArray();

        // 문자 배열을 오름차순으로 정렬한다.
        Arrays.sort(charArr);

        // new String(charArr) 으로 문자 배열을 문자열로 변환
        // new StringBuilder().reverse()로 문자열 뒤집기
        // .toString()으로 뒤집힌 결과를 문자열로 변환
        String result = new StringBuilder(new String(charArr)).reverse().toString();

        // Long.parseLong()으로 문자열로 변환된 값을 long타입 정수로 변환
        answer = Long.parseLong(result);

        return answer;
    }
}