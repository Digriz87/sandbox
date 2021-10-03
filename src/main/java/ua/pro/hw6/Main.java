package ua.pro.hw6;




public class Main {
    public static void main(String[] args) {

        MyList mylist = new LinkedListTwo();
        mylist.add("first");
        mylist.add("second");
        mylist.add("three");


        System.out.println(mylist.get(0));
        System.out.println(mylist.indexOf("second"));
        System.out.println(mylist.contains("gggg"));
        System.out.println(mylist.remove("gggg"));
        System.out.println(mylist.get(1));
        System.out.println(mylist.get(2));
        System.out.println(mylist.size());

    }
}
