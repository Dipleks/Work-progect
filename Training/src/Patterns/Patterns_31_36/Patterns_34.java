package Patterns.Patterns_31_36;/*Intercepting Filter*/

import java.util.ArrayList;
import java.util.List;

public class Patterns_34 {
    static FilterManager filterManager =new FilterManager();
    public static void main(String[] args) {
        filterManager.setFilter(new AuthFilter());
        filterManager.setFilter(new IpFilter());
        filterManager.filterRequest("hello");
    }
}
interface Filter{ void executer (String data);}

class AuthFilter implements Filter{
    @Override
    public void executer(String data) {
        System.out.println("Отработка 1го фильтра: " + data); }}

class IpFilter implements Filter{
    @Override
    public void executer(String data) {
        System.out.println("Отработка 2го фильтра: " + data); }}

//создадим фильтр который хранит ссылки на все наши фильтры:
class FilterCain{
    List<Filter> list = new ArrayList<>();
    Target target = new Target();
    void addFilter(Filter filter){ list.add(filter); }
    void filter(String data){
        for (Filter filter : list){
            filter.executer(data); }
        target.doJob(data); }}
//класс запускающий фитры
class Target{
    void doJob(String data){
        System.out.println("Результат фильтрации: " + data); }}
class FilterManager {
    FilterCain filterCain = new FilterCain();
    void setFilter (Filter filter){ filterCain.addFilter(filter); }
    void filterRequest (String request){ filterCain.filter(request); }}
