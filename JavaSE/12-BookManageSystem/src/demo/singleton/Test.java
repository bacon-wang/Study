package demo.singleton;

public class Test {
    public static void main(String[] args) {
        Principal principal = Principal.getInstance("LiPeng");
        principal.giveASpeech("Hi everyone, I'm LiPeng.");
        principal.approve("关于开展校运会的决议");
    }

    public static void main1(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
