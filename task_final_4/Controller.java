package task_final_4;

import java.util.Stack;


public class Controller {
    public static void main(String[] args) {
        String input = View.getInput();
        int result = calculate(input);
        View.displayResult(result);
    }

    public static int calculate(String input) {
        String[] tokens = input.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("[0-9]+")) {
                stack.push(Integer.parseInt(token));
            }else{
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();

                switch(token) {
                    case "+":
                        stack.push(Model.add(firstOperand, secondOperand));
                        break;
                    case "-":
                        stack.push(Model.subtract(firstOperand, secondOperand));
                        break;
                    case "*":
                        stack.push(Model.multiply(firstOperand, secondOperand));
                        break;
                    case "/":
                        stack.push(Model.divide(firstOperand, secondOperand));
                        break;
                }
            }
        }
        return stack.pop();
    }
}
