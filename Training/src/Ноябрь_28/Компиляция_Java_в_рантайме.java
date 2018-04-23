package Ноябрь_28;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Компиляция_Java_в_рантайме {
    public static void main(String[] args) throws Exception{
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //компилируем наш фаил (фаил Test.class появится по указанному пути):
        //compiler.run(null, null, null, "D:Test.java");
        int result = compiler.run(null, null, null, "D:Test.java");
        System.out.println(result); //получим информацию об ошибках, 0 означает все хорошо!
    }
}
