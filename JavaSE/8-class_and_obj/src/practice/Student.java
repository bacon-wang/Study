package practice;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    class ReportCard {
        String subject;
        double score;

        public ReportCard(String subject, double score) {
            this.subject = subject;
            this.score = score;
        }

        void show() {
            System.out.println(name + "的" + subject + "成绩：" + score + "分");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("张三");
        Student.ReportCard reportCard1 = student.new ReportCard("数学", 130);
        Student.ReportCard reportCard2 = student.new ReportCard("英语",  120);
        reportCard1.show();
        reportCard2.show();
    }
}
