package ua.pro.hw5;


import java.util.Arrays;


public class MyListDemo implements MyList {

    private Object[] someObjects = new Object[10];
    private Object[] newArrayObjects;

    private int pointer = 0;

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public Object remove(int index) {
        Object removed = someObjects[index - 1];
        someObjects[index - 1] = null;
        pointer--;
        return removed;
    }

    @Override
    public boolean addAll(MyList list) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int pointer) {
        return someObjects[pointer - 1];
    }

    @Override
    public void set(int index, Object o) {

    }

    @Override
    public void add(int index, Object o) {

    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public MyList subList(int fromIndex) {
        return null;
    }

    @Override
    public MyList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void add(Object o) {
        if (someObjects.length == pointer){
            System.out.println("Упс заполнен массив, копируем в другой");
           newArrayObjects = Arrays.copyOf(someObjects, someObjects.length+1);
            Arrays.fill(someObjects, null);
            pointer = 0;
        }

            someObjects[pointer] = o;
            pointer++;


    }

    @Override
    public boolean remove(Object o) {
        return false;
    }
}
