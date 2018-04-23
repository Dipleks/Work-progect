package RegEx;/*Atomic Groups - атомарные группы*/
/*Atomic группы начинаются с такого символа: (?>группа)*/
public class RegEx_15 {
    public static void main(String[] args) {
        //В данных выражениях в обоих случаях мы получим true
        System.out.println("abcc".matches("a(bc|b)c"));
        System.out.println("abc".matches("a(bc|b)c"));

        /*Если мы сделаем их Atomic, то 2е выражение будет false.
        * Эта группа ищет "а", затем "bc", затем выходит из группы
        * и идет дальше к "c". В 1м случае она у нас есть abcc, а
        * во вотором нет abc!*/
        System.out.println("abcc".matches("a(?>bc|b)c"));
        System.out.println("abc".matches("a(?>bc|b)c"));

        /*Теперь в 1м случае будет "лож", т.к в выражении integers на
        * конце буква "s", и (integers|insert|in)\b не может ее найти!
        * В этом случае нам помогут атомарные группы, т.к Atomic группа
        * найдет integer и выйдет из выражения, т.е далее поиск продолжать не будет!
        * Т.е сработают они одинаково, оба выражения вернут нам false, но 1е
        * выражение будет рабоать дольше, т.к идет до самого конца, а Atomic
        * группа идет до тех пор пока не найдет первое совпадение, в нашем примере
        * это integer!*/
        System.out.println("integers".matches("\b(integer|insert|in)\\b"));
        System.out.println("integers".matches("\b(?>integer|insert|in)\\b"));
    }
}
