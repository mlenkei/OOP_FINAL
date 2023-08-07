package task_final;

public class CalcLogger implements ILoggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}