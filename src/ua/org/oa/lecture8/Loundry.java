package ua.org.oa.lecture8;

/**
 * Created by dmitr on 24.07.2017.
 */
public class Loundry {
    public void clean(Cleanable thing){
        System.out.println(thing.getClass().getSimpleName() + " cleaned with " + thing.howToClean());
    }
}
