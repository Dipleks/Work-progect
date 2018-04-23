package Ноябрь_29;
/*native код - это код написанный на другом языке программирования,
* к которому java получает доступ.*/
public class Запуск_native_кода {
/*Для создания своего native кода, создадим в текстовом файле
* класс HelloNative и скомпелируем его!
* Теперь создадим h класс, в консоле пишем:
* javah HelloNative.
* Тепрб создадим "с" фаил, для этого берем копируем наш HelloNative.h и
* меняем ему расширение HelloNative.с, в файле HelloNative.h копируем шапку:
* JNIEXPORT void JNICALL Java_HelloNative_method
  (JNIEnv *, jclass);
  И вставляем скопированное в пустой фаил HelloNative.с.
  Тепрь редактируем фаил, должно получится так:
  #include "HelloNative.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_HelloNative_method
  (JNIEnv *, jclass){printf("Hello Native World!\n");}
  Это код на с++.
* Теперь сомпилируем код с++:
* описание проводить не буду!
* В результате компиляции получим so фаил.
* Теперь создаем класс который будет вызывать наш method().
* Компилируем его и все теперь мы можем вызвать наш "Hello World"*/
}
