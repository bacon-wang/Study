package example;

public class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    //  comparable 是写死的，不够灵活
    // 假设我改成年龄比较，别人使用我这份实现的代码就会出 bug
    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) return 1;
        if (this.score == o.score) return 0;
        return -1;
    }

}
