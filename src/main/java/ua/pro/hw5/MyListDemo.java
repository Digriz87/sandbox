package ua.pro.hw5;


import org.w3c.dom.ls.LSOutput;

public class MyListDemo implements MyList {

    Object[] array = new Object[0];


    @Override
    public int size() {
        return array.length;
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
    public boolean remove(int index) {
        boolean temp = false;
        if (index < array.length) {
            array[index] = null;
            temp = true;
        }
        return temp;
    }

    @Override
    public boolean addAll(MyList list) {
        return false;
    }

    @Override
    public void clear() {
        if (array != null) {
            array = new Object[0];
        }

    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, Object o) {
        Object[] arrSet = new Object[array.length];

        for (int i = 0; i < arrSet.length; i++) {
            if (i == index) {
                arrSet[i] = o;
            } else {
                arrSet[i] = array[i];
            }
        }
        array = new Object[arrSet.length];

        for (int i = 0; i < arrSet.length; i++) {
            array[i] = arrSet[i];
        }
    }

    @Override
    public void add(int index, Object o) {

    }


    @Override
    public int indexOf(Object o) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
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
        Object[] arrayAdd = new Object[array.length + 1];

        for (int i = 0; i < arrayAdd.length; i++) {
            if (i == arrayAdd.length - 1) {
                arrayAdd[i] = o;
            } else {
                arrayAdd[i] = array[i];
            }
        }

        array = new Object[arrayAdd.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayAdd[i];
        }


    }


    @Override
    public boolean remove(Object o) {
        return false;
    }
}
