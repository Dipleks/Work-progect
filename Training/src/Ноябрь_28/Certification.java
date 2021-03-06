package Ноябрь_28;/*Сертификация - Certification*/
public class Certification {
/*Сертификаты нужны для подверждения личности, например,
* при отправке электронного письма или jar-ка.
* Существуют такие понятия как открытый м закрытый ключ:
* Например, я создаю письмо и провожу его через приватный ключ,
* т.е ключ который есть только у меня и получается электронная подпись.
* Всем тем кому я отправляю сообщение я посылаю свой публичный ключ.
* После этого я отправляю свое подписанное сообщение. Человек
* получивший письмо, проверяет его полученным ранее публичным ключом.
* В JAVA есть инструмент keytool - который может генерировать ключи.
* В командной строке пишем:
* keytool -genkeypair -keystore denis.certs -alias denis,
* где denis.certs наш фаил электронной подписи, denis - псевдоним.
* Далее вводим пароль минимум из 6 символов, подтверждаем его,
* пишем имя, название отдела организации, название организации,
* город, страна, краткое название страны (RU, US...), подтверждаем - yes.
* В папке по пути из командной строки C:\Users\zagarodnev> появляется наш фаил
* denis.certs.
*
* Теперь создадим свой публичный ключ:
* keytool -exportcert -keystore denis.certs -alias denis -file denispublic.cer
* Вводим наш пароль и по выше указанному пути появляется наш denispublic.
* И его мы уже можем отправить.
*
* Получаетель может проверить подлинность моей подписи, моим denispublic:
* keytool -printcert -file denispublic.cer
* В командной строке получим всю информацию о нас.
*
* Мы можем вывести все стандартные certs, пароль changeit:
* keytool -list -v -keystore \
*
* Человек получивший мой сертификат, может его добавить к себе:
* keytool -importcert -keystore kristina.certs -alias denis -file denispublic.cer
*
* Теперь создадим джарник и поместим нашу подпись в него:
* jar cvf Test.jar Test.class - создаем;
* jarsigner -keystore denis.certs Test.jar denis - подпишем джарник.
*
* Тепрь пользователю надо удоставериться что это мой джарник:
* jarsigner -verify -keystore kristina.certs Test.jar*/
}
