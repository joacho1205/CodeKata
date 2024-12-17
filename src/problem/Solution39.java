package problem;

class Solution39 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int bigger = Math.max(n, m);
        int smaller = Math.min(n, m);

        while(smaller > 0) {
            int temp = bigger % smaller;
            bigger = smaller;
            smaller = temp;
        }

        answer[0] = bigger;
        answer[1] = (n*m) / answer[0];

        return answer;
    }
}
