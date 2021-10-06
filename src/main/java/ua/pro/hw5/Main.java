package ua.pro.hw5;


public class Main {

    String field = "phrase";
    int number = 90;


    public static void main(String[] args) {
        MyListDemo<Object> listDemo = new MyListDemo<>();
        Main obj1 = new Main();
        Main obj2 = new Main();
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode() == obj2.hashCode());


        listDemo.add(new Object());
        listDemo.add(new Object());
        listDemo.add(new Object());
        listDemo.add(new Object());



        System.out.println(listDemo.size());
        System.out.println(listDemo.remove(2));
        System.out.println(listDemo.size());


    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass().equals(obj.getClass())) {
            Main otherList1 = (Main) obj;
            return this.field.equals(otherList1.field) && this.number == otherList1.number;
        }
        return false;
    }
}
