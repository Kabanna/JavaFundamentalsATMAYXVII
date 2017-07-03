package ua.org.oa.lecture7.inharitance;

import java.util.ArrayList;

/**
 * Created by dmitr on 03.07.2017.
 */
public class App {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("My shirt", 500, 50);

        System.out.println("myShirt = " + myShirt);

        myShirt.size = 'M';

        Clothing clothing = myShirt;
        clothing.size = 'L';
        myShirt.wash();
        System.out.println("myShirt = " + myShirt);

        C c = new C();

        Class aClass = c.getClass();
        for (java.lang.reflect.Field field : aClass.getDeclaredFields()) {
            System.out.println(field);
        }

        Object o = new B();

        System.out.println(o instanceof A);
        System.out.println(o instanceof B);
        System.out.println(o instanceof C);
    }
}
class A{
    private Field fieldA = new Field("field A");
    {
        System.out.println("init block A");
    }
    public A(){
        System.out.println("constructor A");
    }
    static {
        System.out.println("static nit block A");
    }
    private static Field staticFieldA = new Field("field static A");

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize class A");
    }
}
class B extends A{
    private Field fieldB = new Field("field B");
    {
        System.out.println("init block B");
    }
    public B(){
        this(5);
        System.out.println("constructor B");
    }
    public B(int i){
        super();
        System.out.println("constructor B(int i)");
    }
    static {
        System.out.println("static nit block B");
    }
    private static Field staticFieldB = new Field("field static B");

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize class B");
    }
}
class C extends B{
    private Field fieldC = new Field("field C");
    {
        System.out.println("init block C");
    }
    public C(){
        super();
        System.out.println("constructor C");
    }
    static {
        System.out.println("static nit block C");
    }
    private static Field staticFieldC = new Field("field static C");

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize class C");
    }
}
class Field{
    public Field(String s){
        System.out.println(s);
    }
}
