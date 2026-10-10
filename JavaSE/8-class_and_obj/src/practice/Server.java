package practice;

public class Server {
    private static int maxConnections = 100;

    static class Tuning {
        void showMaxConnections() {
            System.out.println(Server.maxConnections);
        }

        static void version() {
            System.out.println("v1.0");
        }
    }

    static void start() {
        System.out.println("服务器启动");
    }

    public static void main(String[] args) {
        Server.start();
        new Server.Tuning().showMaxConnections();
        Server.Tuning.version();
    }
}
