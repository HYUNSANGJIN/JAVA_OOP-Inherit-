/*
 시나리오(요구사항)
 저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다.
 A라는 전자제품 매장이 오픈되면
 [클라이언트 요구사항]
 가전제품은 제품의 가격, 제품의 포인트 정보를 공통적으로 가지고 있습니다.
 각각의 가전제품은 제품별 고유한 이름을 가지고 있다.
 ex)
 각각의 전자제품은 이름을 가지고 있다. (ex. Tv, Audio, Computer ...)
 각각의 전자제품은 다른 가격을 가지고 있다.(ex. Tv:5000, Audio: 6000 ... ) 
 제품의 포인트는 가격의  10%를 적용한다.
 
 
 시뮬레이션 시나리오
 구매자: 제품을 구매하기 위한 금액정보, 포인트 정보를 가지고 있다.
 예를 들면: 10만원 , 포인트 0
 구매자는 제품을 구매할 수 있다. 구매행위를 하게 되면 가지고 있는 돈은 감소하고 포인트는
 구매자는 처음 초기 금액을 가질 수 있다


프로그램의 문제시 변화에 대응하는 코드 만드느범
>> 
 */

// 제품
class Product {
    int price;
    int bonuspoint;

    public Product(int price) {
        this.price = price;
        this.bonuspoint = (int) (this.price / 10.0);
    }

}

// 브랜드 티비
class KtTv extends Product {
    // 가격정보는 부모가 가지고 있다.
    KtTv() {
        super(500); // 부모가 가지고 있던 기본적인 가격을 super로 통해 초기화 시켜버림
    }

    @Override
    public String toString() {
        return "KtTv";
    }
}

// 상품
class Audio extends Product {
    // 가격정보는 부모가 가지고 있다.
    Audio() {
        super(100); // 부모가 가지고 있던 기본적인 가격을 super로 통해 초기화 시켜버림
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

// 상품
class NoteBook extends Product {
    // 가격정보는 부모가 가지고 있다.
    NoteBook() {
        super(150); // 부모가 가지고 있던 기본적인 가격을 super로 통해 초기화 시켜버림
    }

    @Override
    public String toString() {
        return "NoteBook";
    }
}

// 구매자
class Buyer {
    int money = 1000;
    int bonuspoint;

    // 구매자는 구매 행위를 할 수 있다. (기능 -> method)
    // 구매행위(잔액 - 제품의 가격 , 포인트 정보 갱신(증가))
    // ******구매자는 매장에 있는 모든 물건을 구매할 수 있다******

//    void KttvBuy(KtTv n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
//        if(this.money < n.price) {
//            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
//            return; // 함수의 종료(구매행위 종료)
//        }
//        //실제 구매 행위
//        this.money -= n.price; // 잔액
//        this.bonuspoint += n.bonuspoint; // 누적
//        System.out.println("구매한 물건: "+n.toString());
//    }
//    
//    void AudioBuy(Audio n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
//        if(this.money < n.price) {
//            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
//            return; // 함수의 종료(구매행위 종료)
//        }
//        //실제 구매 행위
//        this.money -= n.price; // 잔액
//        this.bonuspoint += n.bonuspoint; // 누적
//        System.out.println("구매한 물건: "+n.toString());
//    }
//    
//    void NoteBookBuy(NoteBook n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
//        if(this.money < n.price) {
//            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
//            return; // 함수의 종료(구매행위 종료)
//        }
//        //실제 구매 행위
//        this.money -= n.price; // 잔액
//        this.bonuspoint += n.bonuspoint; // 누적
//        System.out.println("구매한 물건: "+n.toString());
//    }

    // 2차개선 : 하나의 기능으로 여러가지 기능(overloading)
    // 반복되는 코드를....모든 제품은 Product상속... 모든 제품의 부모 Product
    // 다형성
    // Product p;
    // KtTv T = new KtTv();
    // p= t;
    void Buy(Product n) { // 구매자가 어떤 물건 정보를 알아야한다. (그 물건의 가격 정보를 얻어올 수 있다)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수의 종료(구매행위 종료)
        }
        // 실제 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonuspoint; // 누적
        System.out.println("구매한 물건: " + n.toString());
    }

}

public class Ex12_Inherit_KeyPoint {

    public static void main(String[] args) {
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();

        Buyer buyer = new Buyer();
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);

    }
}
