package problem;

class Solution30 {
    public String solution(String s) {
        String answer = "";
        int lng = s.length();

        answer = lng % 2 == 0 ? s.substring((lng/2)-1,(lng/2)+1) : s.substring((lng/2),(lng/2)+1);

        return answer;
    }
}