package problem;

class Solution17 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = Integer.parseInt(s.substring(s.length() - 1 - i, s.length() - i));
        }

        return answer;
    }
}