package Polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) throws InterruptedException {
        Person p = new Employee();
        p.showDetails();
        //p.CanYouRun(); will not run ;
        Employee e = new Employee();
        e.CanYouRun();
        Person p1 = new Person();
        p1.showDetails();
        System.out.println("****************SAMINDRA**********");
        Samindra s = new Samindra();
        s.doLove(p);
        System.out.println("**************FUNCTIONALITY CHECKING**********");
        Employee e1 = (Employee) new Person();
        //e1.CanYouRun();
        e1.showDetails();
    }
}
