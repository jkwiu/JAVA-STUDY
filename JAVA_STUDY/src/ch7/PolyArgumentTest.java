package ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv(){
        super(100); // Tv의 가격을 100으로 한다
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    Computer(){
        super(2000); // Computer의 가격을 200으로 한다
    }
    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 구매할 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint =+ p.bonusPoint;
        System.out.println(p+"를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer jk = new Buyer();
        jk.buy(new Tv());
        jk.buy(new Computer());

        System.out.println("현재 남은 돈은 "+jk.money);
        System.out.println("현재 보너스 점수는 "+jk.bonusPoint);
    }

}