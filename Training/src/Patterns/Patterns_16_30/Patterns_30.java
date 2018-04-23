package Patterns.Patterns_16_30;/*Business Delegate (J2EE)*/

public class Patterns_30 {
    public static void main(String[] args) {
/*Тепрь мы можем получить инфо:*/
        BusinessDelegat businessDelegat = new BusinessDelegat();
        businessDelegat.doTask("ejb");
    }
}
//есть бизнес сервис который что-то делает
interface BusinessService {
    void doJob();
}
//у нас есть сервисы которые получаю информацию
class EJBService implements BusinessService{
    @Override
    public void doJob() {
        System.out.println("is ejb service");
    }
}
class JMSService implements BusinessService{
    @Override
    public void doJob() {
        System.out.println("is jms service");
    }
}
//мы хотим пользоваться сервисами но днлать это нужно через лукапс:
class LookupService{
    BusinessService getservise (String serviceType){
        if (serviceType.equals("ejb")){
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
//далее у нас должен быть бизнесделгат, который делегирует (передает) наши сервисы:
class BusinessDelegat {
    LookupService lookupService = new LookupService();
    BusinessService businessService;
    void doTask(String serviceType){
        businessService = lookupService.getservise(serviceType);
        businessService.doJob();
    }
}