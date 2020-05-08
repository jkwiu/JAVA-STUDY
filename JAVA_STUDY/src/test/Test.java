package test;

class Document {
    static int count = 0;
    String name;

    Document(){
        this("제목없음" + ++count);
    }

    Document(String name){
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}

class Test {
    public static void main(String[] args) {
        Document t1 = new Document();
        Document t2 = new Document();
        Document t3 = new Document();
        Document t4 = new Document();
        Document t5 = new Document();
    }
}