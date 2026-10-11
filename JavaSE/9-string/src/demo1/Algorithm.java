package demo1;

public class Algorithm {
    public static int firstUniqChar(String s) {
        int[] appeared = new int['z'];

        for (int i = 0; i < s.length(); i++) {
            appeared[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (appeared[s.charAt(i)] == 1) return i;
        }

        return -1;
    }

    public boolean isPalindrome1(String s) {
        // 大转小
        String s1 = s.toLowerCase();
        System.out.println(s1);

        // 去空格
        String s2 = s1.replaceAll("\\s", "");
        System.out.println(s2);


        // 移除非字母数字字符
        char[] validChars = new char[s.length()];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                validChars[i] = ch;
            } else {
                validChars[i] = ' ';
            }
        }

        String s3 = new String(validChars);
        String s4 = s3.replaceAll("\\s", "");
        System.out.println(s4);

        // 左右往中间走，两两必须相等
        int left = 0, right = s4.length() - 1;
        while (left < right) {
            if (s4.charAt(left) != s4.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public boolean isDigitOrLetter(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }

    public boolean isPalindrome(String s) {
        // 大转小
        s = s.toLowerCase();
        System.out.println(s);

        // 去空格
        s = s.replaceAll("\\s", "");
        System.out.println(s);

        // 左右往中间走，两两必须相等（只拿数字和字母字符比较）
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isDigitOrLetter(s.charAt(left))) {
                left++;
            }

            while (left < right && !isDigitOrLetter(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public int lastWordLength(String input) {
        return input.substring(input.lastIndexOf(' ') +  1).length();
    }

    public static void main(String[] args) {
//        System.out.println(firstUniqChar("leetcode"));
        System.out.println(new Algorithm().isPalindrome("A man, a plan, a canal: Panama"));
//        new Algorithm().lastWordLength("Hello World");
    }
}
