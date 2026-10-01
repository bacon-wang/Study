import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algorithm {
    static boolean threeOdd(int[] arr) {
        int count = 0;
        for(int x : arr) {
            if (x % 2 != 0) ++count;
            else count = 0;

            if (count >= 3) return true;
        }

        return false;
    }

    static void main() {
        System.out.println(threeOdd(new int[] {1,3,5,12}));
        System.out.println(threeOdd(new int[] {1,2,34,3,4,5,7,23,12}));
        System.out.println(threeOdd(new int[] {1,3,12}));
    }

    static int majorityElement(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int limit = arr.length / 2;

        for (int x : arr) {
            int times = count.getOrDefault(x, 0) + 1;
            count.put(x, times);

            if (times > limit) {
                return x;
            }
        }

        return -1; // 题目保证一定存在多数元素
    }

    static void main5() {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    static int appearOnce(int[] arr) {
        int result = 0;

        for (int x : arr) {
            result ^= x;
        }

        return result;
    }

    static int appearOnce1(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            // 当前数字已经在前面出现过，跳过
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // 在后面的有序区间中查找
            if (Arrays.binarySearch(arr, i + 1, arr.length, arr[i]) < 0) {
                return arr[i];
            }
        }

        return -1;
    }

    static void main4() {
        System.out.println(appearOnce(new int[] {4,1,2,1,2,3,5,4,5}));
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return new int[] {i, j};
            }
        }

        return new int[] {};
    }

    static void main3() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 18)));
    }

    static void oddBeforeEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // 左边的偶数放右边，右边的偶数放左边
            if (arr[left] % 2 == 0 && arr[right] % 2 != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;
            right--;
        }
    }

    static void main2() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        oddBeforeEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    static void main1() {
        int[] arr = {1, 2, 3, 4};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
}
