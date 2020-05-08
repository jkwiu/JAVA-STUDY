package ch6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = new MemberCall().iv; // 이처럼 객체를 사용해야 가능

    static void staticMethod1(){
        System.out.println(cv);
        MemberCall t = new MemberCall();
        System.out.println(t.iv);
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
        MemberCall t = new MemberCall();
        t.instanceMethod1();
    }

    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }
}