package ua.pro.hw5;


public class MyListDemo implements MyList {

    Object[] array = new Object[10];
    private int pointer;
    Object removed;

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) return false;
            if (array[i].equals(o)) return true;
        }
        return false;
    }


    @Override
    public Object remove(int index) {
        if (array[index] == null) throw new IndexOutOfBoundsException("index out");

        removed = array[index];
        int tillEnd = pointer - index - 1;
        System.arraycopy(array, index + 1, array, index, tillEnd);
        pointer--;
        array[pointer] = null;

        return removed;
    }

    @Override
    public boolean addAll(MyList list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        Object[] newArray = new Object[10];
        array = newArray;
        pointer = 0;

    }

    @Override
    public Object get(int index) {
        if (array[index] == null) throw new IndexOutOfBoundsException("index out of range");
        return array[index];
    }

    @Override
    public Object set(int index, Object o) {
        if (array[index] == null) throw new IndexOutOfBoundsException("index out of range");
        Object previousObj = array[index];
        array[index] = o;
        return previousObj;
    }

    @Override
    public void add(int index, Object o) {
        if (array[index] == null) throw new IndexOutOfBoundsException("index out of range");
        if (index == pointer) {
            add(o);
            return;
        }
        if (pointer == array.length - 1) {
            Object[] newArray = new Object[(int) (array.length * 1.3)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        int tillEnd = pointer - index;
        System.arraycopy(array, index, array, index + 1, tillEnd);
        array[index] = o;
        pointer++;
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
        return subList(fromIndex, pointer);
    }

    @Override
    public MyList subList(int fromIndex, int toIndex) {
        if (toIndex > size()) throw new IndexOutOfBoundsException("final index out of range");
        MyList result = new MyListDemo();
        for (int i = fromIndex; i < toIndex; i++) {
            result.add(array[i]);
        }
        return result;
    }


    @Override
    public boolean add(Object o) {
        if (pointer == array.length - 1) {
            Object[] newArray = new Object[(int) (array.length * 1.3)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[pointer] = o;
        pointer++;
        return true;


    }


    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) throw new IndexOutOfBoundsException("index out of range");
            if (array[i].equals(o)) {
                int tillEnd = pointer - i - 1;
                System.arraycopy(array, i + 1, array, i, tillEnd);
                pointer--;
                array[pointer] = null;
                return true;
            }
        }
        return false;
    }
}
