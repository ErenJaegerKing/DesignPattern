package designPatterns.state;

public class StoppingState extends LiftState {


    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
