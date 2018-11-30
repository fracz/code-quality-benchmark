// original filename: 00046796.txt
// before
public class Class00000604Better {
    public int doWork() {
        int workDone = safeInvoke(driverAgentInvoker);
        workDone += aeronClientAgentInvoker.invoke();
        workDone += preSessionWork();
        workDone += super.doWork();
        return workDone;
    }
}
