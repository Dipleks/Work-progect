package Patterns.Patterns_16_30;/*State изменяя объект меняет и его параметры*/

public class Patterns_24 {
    public static void main(String[] args) {
        Context context = new Context(new LoverCaisState(), "Dennis");
        context.doAction(); //выведет все мальникими буквами
        context.setState(new UpperCaisState());
        context.doAction(); //выведет все большими буквами
    }
}
interface State {
    void doAction(Context context);
}
class LoverCaisState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toLowerCase());
    }}
class UpperCaisState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println(context.name.toUpperCase()); }}

class Context {
    State state;
    String name;

    public Context(State state, String name) {
        this.state = state;
        this.name = name; }

    public void setState(State state) {
        this.state = state; }

    void doAction() {
        state.doAction(this); }}