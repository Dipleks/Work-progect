package Patterns.Patterns_16_30;/*Interpreter -
позволяет написать парсер или компилятор и тому подобное.*/
import java.util.Stack;

/*Разберем на примере канкулятора*/
public class Patterns_19 {
    public static void main(String[] args) {
        String expression = "1+2+3-4"; //2
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpretator(evaluator)); }}
//Создадими интерфейс:
interface Expression{
    int interpretator(Expression context);
}
//разобъем наше выражение (1+2+3-4) на эспрешены:
class Number implements Expression{
    int number;
    public Number(int number) { this.number = number; }
    @Override
    public int interpretator(Expression context) { return number; }}

class Plus implements Expression{
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight; }
    @Override
    public int interpretator(Expression context) {
        return expressionLeft.interpretator(context) + expressionRight.interpretator(context); }}

class Minus extends Plus{
    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight); }
    @Override
    public int interpretator(Expression context) {
        return expressionLeft.interpretator(context) - expressionRight.interpretator(context); }}
//создадим класс который будет все это вычислять:
class Evaluate implements Expression{
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRever = new StringBuilder(expression).reverse().toString();
        for (String s : expressionRever.split("\\D")){
            expressions.push(new Number(Integer.parseInt(s))); }
        for (String s : expression.split("\\d")){
            if (s.equals("+")){
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            } else if (s.equals("-")){
                expressions.push(new Minus(expressions.pop(), expressions.pop())); } }
        evaluate = expressions.pop(); }
    @Override
    public int interpretator(Expression context) {
        return evaluate.interpretator(context); }}
