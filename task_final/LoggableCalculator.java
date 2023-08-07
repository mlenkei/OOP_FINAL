package task_final;

public class LoggableCalculator implements ICalculable{

    protected ICalculable calc;
    ILoggable calcLogger = new CalcLogger();


    public LoggableCalculator(ICalculable calc) {
        calcLogger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public ICalculable sum(int arg) {
        calcLogger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public ICalculable multi(int arg) {
        calcLogger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}
