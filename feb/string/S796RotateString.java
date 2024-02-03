package leetcode.feb.string;

public class S796RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself and check if goal is a substring
        String concatenatedS = s + s;
        return concatenatedS.contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("golo","olog"));
    }
}
