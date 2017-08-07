// package ua.org.oa.anna.shevelieva.home_work_ATMAYXII_5;
package ua.org.oa.anna_shevelieva.home_work_ATMAYXVII_54;

import java.util.Arrays;

public class DynamicStringList implements SimpleList
{

    private int index = 0;
    private String[] stringElements;

    public DynamicStringList() {
        stringElements = new String[0];
    }

    public DynamicStringList(int size) {
        stringElements = new String[size];
    }

    @Override
    public void add(String s) {
        if (index + 1 - stringElements.length > 0)
            stringElements = Arrays.copyOf(stringElements, index + 1);
        stringElements[index++] = s;
    }

    @Override
    public String get() {
        return stringElements[index - 1];
    }

    @Override
    public String get(int id) {
        return stringElements[id];
    }

    @Override
    public String remove() {

        return stringElements[--index] = null;

    }

    @Override
    public String remove(int id) {

        String oldValue = stringElements[id];
        int numMoved = index - id - 1;
        System.arraycopy(stringElements, id + 1, stringElements, id, numMoved);
        return stringElements[--index] = null;

    }

    @Override
    public boolean delete() {
        for (int i = 0; i < index; i++)
            stringElements[i] = null;
        index = 0;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < index; i++) {
            if (i != 0)
                sb.append(", ");
            sb.append(stringElements[i]);
        }
        sb.append("]");

        return sb.toString();
    }

}
