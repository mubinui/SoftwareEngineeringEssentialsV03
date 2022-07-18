package CustomAnnotations;

import java.lang.annotation.Annotation;

public class AnnoTester {
    public static void main(String[] args) {
        //Using reflection api ... we are getting data from the annotations
        Tester t = new Tester();
        Class c = t.getClass();
        System.out.println(c.getName());
        MyAnnotation a =(MyAnnotation) c.getAnnotation(MyAnnotation.class);
        System.out.println(a.myValue());
        System.out.println(a.name());
        System.out.println(a.city());
    }
}
