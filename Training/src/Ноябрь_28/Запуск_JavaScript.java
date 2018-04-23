package Ноябрь_28;/*Запускаем скриптовые языки с помощью JAVA
* на примере JavaScript*/

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Запуск_JavaScript {
    public static void main(String[] args) throws Exception {
        //Для этого нам нужно создать менеджер:
        ScriptEngineManager manager = new ScriptEngineManager();
        //из него получеам нужный нам язык:
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        //Далее берем код из фала или пишем сами:
        engine.put("k", 4); //задаим свое значение
        String code = "print('hello');" +
                "function f(a){return a + 6;};"+
                "var n = 1 + 2;" + "n + 3 + k"; //после 2 обязательно ";"
        Object o = engine.eval(code);
        System.out.println(o); //Ответ: hello 10.0
        //Вызовим отдельно функцию:
        Object o2 = ((Invocable)engine).invokeFunction("f", 1); //1 - это "а"
        Object o21 = ((Invocable)engine).invokeFunction("f", "1"); //"1" - это "а"
        //результаты будут отличатся, это особенности JavaScript:
        System.out.println(o2); //Ответ: 7
        System.out.println(o21); //Ответ: 16
        //получим переменную n:
        System.out.println(engine.get("n")); // Ответ: 3
    }
}
