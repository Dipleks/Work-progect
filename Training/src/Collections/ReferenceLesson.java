package Collections;/*Reference - ссылка*/

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceLesson {
    public static void main(String[] args) throws Exception{
        //Начнем со стронгссылки:
        Object o = new Object(); //это стронговая ссылка
        /*До тех пор пока у нас есть ссылка на объект (о), мы не
        * выйдем из метода(пока "о" не равно null)*/

        /*Так же у нас есть WeakReference, представми что уже o = null и это
        значение нам опять понадобилось и WeakReference позволяет нам её вызвать:*/
//        WeakReference<Object> weakReference = new WeakReference<>(o);
//        Object o1 = weakReference.get(); //это тоже самое что и "о"
        /*weakReference удаляется при первом Grabber collector*/

//        SoftReference<Object> softReference = new SoftReference<>(o);
        /*SoftReference работает приерно также как и WeakReference, она не
        * запустится до тех пор пока не возникнет проблем с памятью.
        * Как память будет заканичавться произойдет Grabber collector и
        * ссылка softReference будет удалена. Т.е weakReference удаляется при
        * первом запуске "чистильщика мусора", а softReference только при
        * недостатке памяти!*/

        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(o, referenceQueue);
        o = null;
        /*PhantomReference ни когда не возращает объект, возращает только null, и работает в паре
        * с ReferenceQueue. Необходим он для: у ReferenceQueue есть метод remove, при его запуске программа зависнет
        * до тех пор пока не произойдет Grabber collector и "о" не зачистится. Это нужно в основном для проверки
        * конета, баз данных и т.д. где необходимо проверить зачистилась память или нет!*/
//        referenceQueue.remove();
        /*как правило делать так мы не будет, а у нас будет что-то типа этого:*/
        new Thread(){
            @Override
            public void run() {
                try {
                    referenceQueue.remove();
                    System.out.println("reference was removed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        System.out.println("start gc");
        System.gc();
        System.out.println("gc was started");
        /*После того как мы все ссылки на объект закоментировали, оьбъявили о=null, у нас
        * запускется start gc, затем gc was started, и после выполняется reference was removed, что
        * свидетельствует о том что память зачистилась и ссылок на объект нет!*/
    }
}
