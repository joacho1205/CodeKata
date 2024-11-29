package problem;

class Solution21 {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] numArr = str.split("");

        int sum = 0;
        for (String num : numArr) {
            sum += Integer.parseInt(num);
        }

        boolean answer = (x % sum == 0? true : false);
        return answer;
    }
}
