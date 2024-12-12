package problem;

import java.util.*;

class Solution34 {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String str = new String(charArr);
        answer = new StringBuilder(str).reverse().toString();
        return answer;
    }
}