package ua.org.oa.lecture5.incapsulation;


public class Boss {
    private static Boss instance = null;
    private String name;

    private Boss(String name) {
       setName(name);
    }

    public static Boss getInstance(String name){
        if(instance == null){
            instance = new Boss(name);
        }else{
            instance.setName(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                '}';
    }
}
