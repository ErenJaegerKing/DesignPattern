package designPatterns.bridge;

public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼三");
    }
}
