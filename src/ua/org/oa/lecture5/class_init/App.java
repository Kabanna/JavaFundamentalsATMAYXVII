package ua.org.oa.lecture5.class_init;


public class App {
    public static void main(String[] args) {
        String s = new String("Hello");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        MyClass myClass1 = new MyClass();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        MyClass myClass2 = new MyClass();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        MyClass myClass3 = new MyClass();
    }
}
class MyClass{
    public Field field1 = new Field("field1");
    public static Field staticField1 = new Field("staticField1");
    {
        System.out.println("Init block");
    }
    public MyClass() {
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static init block");
    }
    public Field field2 = new Field("field2");
    public static Field staticField2 = new Field("staticField2");
}

class Field{
    public Field(String s) {
        System.out.println(s);
    }
}