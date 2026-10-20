package demo.singleton;

public class Principal {
    private static Principal instance;
    private String name;

    private Principal(String name) {
        this.name = name;
    }

    public static Principal getInstance(String name) {
        if (instance == null) {
            instance = new Principal(name);
        }
        return instance;
    }

    public void giveASpeech(String speechDraft) {
        System.out.println(name + " speaking: " + speechDraft);
    }

    public void approve(String file) {
        System.out.println(name + " approved: " + file);
    }
}
