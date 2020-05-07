package test;

class Data {
    int x;
}

class Test {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println("after: " + d.x);
    }

    static void change(Data x) {
        x.x = 1000;
        System.out.println("change: " + x);
    }
}