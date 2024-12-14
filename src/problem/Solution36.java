package problem;

class Solution36 {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int i = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}
