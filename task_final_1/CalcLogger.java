package task_final_1;

public class CalcLogger implements ILoggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}