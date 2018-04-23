package Best_practice.BestPractice_1_15;/*ToString*/

public class BestPractice_9 {
    int i;
    public static void main(String[] args) {
        BestPractice_9 bestToString = new BestPractice_9();
        bestToString.i = 5;
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(bestToString);
        }
        /*если мы запустим этот код, то отловим наш эксепшен, но
        * там будут написаны куча непонятных символов, для того чтоб этого небыло
        * нужно переопределить ToString:*/
    }
    @Override
    public String toString() {
        return "BestPractice_9{" +
                "i=" + i +
                '}';
    }
    /*теперь мы увидем BestPractice_9{i=5}. При этом возможно написать свой формат вывода!*/
}
