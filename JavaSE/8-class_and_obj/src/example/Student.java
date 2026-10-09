package example;

class Project implements Cloneable {
    public String name;
    public String direction;
    // ...


    public Project(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Student implements Comparable<Student>, Cloneable {
    public String name;
    public int age;
    public double score;
    public Project project;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.project = new Project("默认项目名", "默认方向");
    }

    public Student(String name, int age, double score, String projectName, String projectDirection) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.project = new Project(projectName, projectDirection);
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

    // 浅拷贝（Project 对象没有深拷贝）
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // 深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student tmp = (Student) super.clone();
        tmp.project = (Project) this.project.clone();
        return tmp;
    }
}
