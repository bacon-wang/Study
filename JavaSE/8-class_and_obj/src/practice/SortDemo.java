package practice;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] words = { "java", "c", "python", "go" };
        // ① 补全：Arrays.sort 的第二个参数是 Comparator<String>
        // Comparator 的 compare(a, b) 返回负数表示 a 排在 b 前面
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
                return o1.compareTo(o2);
            }
        });
        for (String w : words) {
            System.out.println(w);
        }
    }
}