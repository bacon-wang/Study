import java.util.Arrays;
import java.util.Scanner;

public class StudentScoreManager {

    // 学生姓名数组
    private static String[] names;
    // 学生成绩数组
    private static int[] scores;
    // 当前学生数量
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入班级学生人数：");
        int capacity = scanner.nextInt();
        names = new String[capacity];
        scores = new int[capacity];

        while (true) {
            printMenu();
            System.out.print("请选择操作：");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputScores(scanner);
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    findMaxMin();
                    break;
                case 4:
                    sortByScore();
                    break;
                case 5:
                    searchStudent(scanner);
                    break;
                case 6:
                    displayAllScores();
                    break;
                case 0:
                    System.out.println("感谢使用，再见！");
                    return;
                default:
                    System.out.println("无效选择，请重新输入");
            }
        }
    }

    // 打印菜单
    private static void printMenu() {
        System.out.println("\n========== 学生成绩管理系统 ==========");
        System.out.println("1. 录入学生成绩");
        System.out.println("2. 计算平均分");
        System.out.println("3. 查找最高分和最低分");
        System.out.println("4. 按成绩降序排列");
        System.out.println("5. 查询指定学生成绩");
        System.out.println("6. 显示所有学生成绩");
        System.out.println("0. 退出系统");
        System.out.println("=====================================");
    }

    // 1. 录入学生成绩
    private static void inputScores(Scanner scanner) {
        if (count >= names.length) {
            System.out.println("学生人数已满，无法继续录入！");
            return;
        }

        System.out.print("请输入学生姓名：");
        String name = scanner.next();
        System.out.print("请输入学生成绩（0-100）：");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("成绩无效，请输入 0-100 之间的分数");
            return;
        }

        names[count] = name;
        scores[count] = score;
        count++;
        System.out.println("录入成功！");
    }

    // 2. 计算平均分
    private static void calculateAverage() {
        if (count == 0) {
            System.out.println("暂无学生数据！");
            return;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += scores[i];
        }
        double average = (double) sum / count;
        System.out.printf("班级平均分：%.2f\n", average);
    }

    // 3. 查找最高分和最低分
    private static void findMaxMin() {
        if (count == 0) {
            System.out.println("暂无学生数据！");
            return;
        }

        int maxScore = scores[0];
        int minScore = scores[0];
        String maxName = names[0];
        String minName = names[0];

        for (int i = 1; i < count; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxName = names[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
                minName = names[i];
            }
        }

        System.out.println("最高分：" + maxName + " - " + maxScore + "分");
        System.out.println("最低分：" + minName + " - " + minScore + "分");
    }

    // 4. 按成绩降序排列
    private static void sortByScore() {
        if (count == 0) {
            System.out.println("暂无学生数据！");
            return;
        }

        // 冒泡排序（降序）
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    // 交换成绩
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // 交换姓名
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        System.out.println("排序完成！");
        displayAllScores();
    }

    // 5. 查询指定学生成绩
    private static void searchStudent(Scanner scanner) {
        if (count == 0) {
            System.out.println("暂无学生数据！");
            return;
        }

        System.out.print("请输入要查询的学生姓名：");
        String name = scanner.next();

        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                System.out.println("学生：" + names[i] + "，成绩：" + scores[i] + "分");
                return;
            }
        }

        System.out.println("未找到该学生！");
    }

    // 6. 显示所有学生成绩
    private static void displayAllScores() {
        if (count == 0) {
            System.out.println("暂无学生数据！");
            return;
        }

        System.out.println("\n========== 学生成绩列表 ==========");
        System.out.println("序号\t姓名\t\t成绩");
        System.out.println("----------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\t%s\t\t%d\n", i + 1, names[i], scores[i]);
        }
        System.out.println("==================================\n");
    }
}