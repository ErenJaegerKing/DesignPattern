package designPatterns.command;

import java.util.ArrayList;

public class Waitor {
    private ArrayList<Command> commands;

    public Waitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
