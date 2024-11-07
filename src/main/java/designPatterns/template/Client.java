package designPatterns.template;

import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        ConcreteClass_BaoCai baocai = new ConcreteClass_BaoCai();
        baocai.cookProcess();
        ConcreteClass_CaiXin caixin = new ConcreteClass_CaiXin();
        caixin.cookProcess();
    }
}
