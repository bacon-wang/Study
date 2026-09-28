public class Example {
    static void main() {


    }

    static void main1() {
        int num = 10;

        num += 12.5; // ok
//        num = num + 12.5; // err
        num = (int)(num + 12.5); // ok
    }
}
