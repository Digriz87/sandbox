package ua.pro.hw6;




public class Main {
    public static void main(String[] args) {

        MyList<Object> mist = new LinkedListTwo<>();
        mist.add("first");
        mist.add("second");
        mist.add("three");


        System.out.println(mist.get(0));
        System.out.println(mist.indexOf("second"));
        System.out.println(mist.contains("gggg"));
        System.out.println(mist.remove("gggg"));
        System.out.println(mist.get(1));
        System.out.println(mist.get(2));
        System.out.println(mist.size());

    }
}
