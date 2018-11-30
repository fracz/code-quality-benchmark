// original filename: 00046796.txt
// after
public class Class00000604Worse {
    public int doWork() {
        int workDone = (null != driverAgentInvoker) ? driverAgentInvoker.invoke() : 0;
        workDone += aeronClientAgentInvoker.invoke();
        workDone += preSessionWork();
        workDone += super.doWork();
        return workDone;
    }
}
