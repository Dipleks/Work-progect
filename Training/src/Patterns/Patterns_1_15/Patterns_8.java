package Patterns.Patterns_1_15;/*Object Pool - нужен для того чтобы уменьшить колличество
создаваемых объектов, т.е переиспользовать их!*/

import java.util.LinkedList;
import java.util.List;
/*Примитивный пример!*/
public class Patterns_8 {
    public static void main(String[] args) {
//Теперь мы може использовать наш пул:
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject(); //достаем
        objectPool.releasePooledObject(pooledObject); //перевыпускаем
    }}
//Создадим объекты которые будет хранить в бассеине (pool):
class PooledObject { }
//Создадим сам pool (бассеин):
class ObjectPool {
/*Создадим два листа PooledObject
* одни будет свободный а 2й будет занятый:*/
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();
//создадим 2 метода, 1й будт давать PooledObject, а 2й перевыпускать:

    public PooledObject getPooledObject(){
        if (free.isEmpty()){
//Если у нас нет свободного листа то мы его создаем и помещаем в массив:
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return  pooledObject;
//иначе, если есть:
        } else {
            PooledObject pooledObject = free.get(0);
            //добавляем в занятый
            used.add(pooledObject);
            //снимаем его со свободного
            free.remove(pooledObject);
            //возвращаем
            return pooledObject; } }
    public void releasePooledObject(PooledObject pooledObject){
//Тут обратное действие:
        //удаляем из зянятых
        used.remove(pooledObject);
        //возращаем в свободные
        free.add(pooledObject); }}