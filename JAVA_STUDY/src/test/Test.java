package test;

class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        System.out.println(p.x);
        System.out.println(c.x);
        p.method();
        c.method();
    }

}


class Parent{
    int x = 100;
    void method(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    int x = 200;
   void method(){
       System.out.println(x);
       System.out.println(super.x);
       System.out.println(this.x);
   }
}