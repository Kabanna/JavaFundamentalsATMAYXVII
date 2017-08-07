package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_54;


public class DynamicStringListTest {
    public static void main(String[] args) {
        DynamicStringList listString = new DynamicStringList();

        listString.add("Str0");
        listString.add("Str1");
        listString.add("Str2");
        listString.add("Str3");
        listString.add("Str4");
        System.out.println("add a string to an array: " + listString);
        System.out.println("get the last element from an array: " + listString.get());
        System.out.println("get element by its index 3 : " + listString.get(3));
        listString.remove();
        System.out.println("delete last element: " + listString);
        listString.remove(2);
        System.out.println("remove element by index 1, 2, 4: " + listString);
        listString.delete();
        System.out.println("delete all elements of the array: " + listString);

    }
}
