package ua.pro.hw6;


public class LinkedListTwo implements MyList {

    private static int counter;
    private Node head;


    public LinkedListTwo() {

    }

    private class Node {

        Node next;
        Object data;

        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        @SuppressWarnings("unused")
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }


        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }


    @Override
    public int size() {
        return getCounter();
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node t = head;
        while (t != null) {
            if (t.getData() == o) {
                return true;
            }
            t = t.next;
        }
        return false;
    }

    @Override
    public boolean add(Object data) {

        if (head == null) {
            head = new Node(data);
        }

        Node Temp = new Node(data);
        Node Current = head;


        if (Current != null) {


            while (Current.getNext() != null) {
                Current = Current.getNext();
            }


            Current.setNext(Temp);
        }


        incrementCounter();
        return true;
    }



    @Override
    public boolean remove(Object o) {
    return false;
    }

    @Override
    public Object remove(int index) {

        if (index < 1 || index > size())
            return false;

        Node Current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (Current.getNext() == null)
                    return false;

                Current = Current.getNext();
            }
            Current.setNext(Current.getNext().getNext());


            decrementCounter();
            return true;

        }
        return false;
    }

    @Override
    public boolean addAll(MyList list) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        counter = 0;
    }

    @Override
    public Object get(int index) {
        if (index < 0)
            return null;
        Node Current = null;
        if (head != null) {
            Current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (Current.getNext() == null)
                    return null;

                Current = Current.getNext();
            }
            return Current.getData();
        }
        return Current;
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }

    @Override
    public void add(int index, Object data) {
        Node Temp = new Node(data);
        Node Current = head;


        if (Current != null) {

            for (int i = 0; i < index && Current.getNext() != null; i++) {
                Current = Current.getNext();
            }
        }


        Temp.setNext(Current.getNext());


        Current.setNext(Temp);


        incrementCounter();
    }


    @Override
    public int indexOf(Object o) {
        Node pointerNode = head;
        int index = 0;
        while (pointerNode != null && pointerNode.getData() != null) {
            if (pointerNode.getData().equals(o)) {
                return index;
            } else {
                pointerNode = pointerNode.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public MyList subList(int fromIndex) {
        return null;
    }

    @Override
    public MyList subList(int fromIndex, int toIndex) {
        return null;
    }
}
