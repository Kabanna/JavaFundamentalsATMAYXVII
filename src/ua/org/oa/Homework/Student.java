package ua.org.oa.Homework;

public class Student {
    int age;
    int visit;
    boolean smart;
    boolean rich;
    String name;

    Student(int a, int v, boolean s, boolean r, String n) {
        age = a;
        visit = v;
        smart = s;
        rich = r;
        name = n;
    }
    public int chance() {
        int chance;
        if ((smart & rich) & (visit > 50 & visit < 100)) {
            chance = 100;
        } else if ((smart | rich) & (visit > 0 & visit < 50)) {
            chance = 50;
        } else {
            chance = 0;
        }
        return chance;
    }
}
