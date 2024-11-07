package designPatterns.responsibility;

public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void submit(LeaveRequest leave) {
        if (this.numStart == 0) {
            return;
        }
        if (leave.getNum() >= this.numStart) {
            this.handleLeave(leave);
            if (this.nextHandler != null && leave.getNum() > numEnd) {
                this.nextHandler.submit(leave);
            } else {
                System.out.println("流程结束了");
            }
        }
    }

    protected abstract void handleLeave(LeaveRequest leave);
}
