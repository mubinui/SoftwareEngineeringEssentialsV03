package Polymorphism;

public class Employee extends Person{
    @Override
    public void showDetails() {
        System.out.println("Showing the details of an Employee");
    }
    public void CanYouRun(){
        System.out.println("Yes !!!! I am running !!!");
    }
}
