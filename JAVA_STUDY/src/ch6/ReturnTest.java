package ch6;

class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};
        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }   
    
    int add(int a, int b){
        return a+b;
    }

    // 배열 또한 참조형 변수이므로 다음과 같이 값을 변경하는 것이 가능하다.
    void add(int a, int b, int[] result){
        result[0] = a + b;
    }
}