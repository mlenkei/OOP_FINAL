package task_final;

public class CalculableFactory implements ICalculableFactory {
    public ICalculable create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            ICalculable calculator =  new Calculator(primaryArg);
            return new LoggableCalculator(calculator);
        }
        return new Calculator(primaryArg);
    }
}