
//문제 풀어 보세요 ^^
//
//요구사항
//
//카트 (Cart)
//
//카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
//
//카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
//
//고객이 물건을 구매 하면 ... 카트에 담는다

//계산대에 가면 전체 계산
//
//계산기능이 필요
//
//summary() 기능 추가해 주세요
//
//당신이 구매한 물건이름 과 가격정보 나열
//
//총 누적금액 계산 출력

//hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )
//
//hint) Buyer ..>> summary() main 함수에서 계산할때

//구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        this.bonusPoint = (int) (this.price / 10.0);
    }
}

// Tv 정보 클래스.
class LGTv extends Product2 {
    // 가격정보 부모
    LGTv() {
        super(500);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

// Audio 정보 클래스.
class LGAudio extends Product2 {
    // 가격정보 부모
    LGAudio() {
        super(100);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

// NoteBook 정보 클래스.
class LGNoteBook extends Product2 {
    // 가격정보 부모
    LGNoteBook() {
        super(150);
    }

    @Override
    public String toString() {
        return "NoteBook";
    }
}

// 키보드 정보 클래스.
class KeyBoard extends Product2 {
    KeyBoard() {
        super(5);
    }
   @Override
    public String toString() {
        return "KeyBoard";
    }
}

// 구매자
class Buyer2 {
    int money;
    int bonuspoint;
    int count;
    Product2[] cart;

    Buyer2() {
        money = 1000;
        cart = new Product2[20];
    }

    // 물건 담는 클래스.
    void Buy(Product2 n) { // 구매자가 어떤 물건을 사는지에 대한 정보를 알아야 (그 물건의 가격 정보)를 얻어온다.
        // 실 구매 행위
        cart[count] = n;
        this.count++;

        System.out.printf("[%s] 을 담았습니다. \t", n.toString());
        System.out.printf("카트 [%s]/[10]\n", count);
    }

    // 물건 계산대 올린 클래스.
    void summary() {
        int sumPrice = 0;
        if (this.count > 10) {
            System.out.println("물건은 10개이상 담을수 없습니다.");
            System.out.println("물건을 빼주세요.");
        } else if (this.count <= 10) {
            System.out.println("---현재 담긴 상품---");
            System.out.println("현재 가지고 있는 금액 :" + this.money + "만원");
            for (int i = 0; i < count; i++) {
                sumPrice += cart[i].price;
                this.bonuspoint += cart[i].bonusPoint;
                System.out.printf("상품명: [%s], 가격:[%s만원]\n", cart[i].toString(), cart[i].price);
            }
            System.out.printf("상품의 총 금액 : %s만원\n", sumPrice);
            if (this.money < sumPrice) {
                System.out.println("-----------------");
                System.out.printf("금액이 부족합니다. \n현재 고객님의 잔액은 : %s만원, 상품의 금액 : %s만원", this.money, sumPrice);
            } else if (this.money > sumPrice) {
                this.money -= sumPrice; // 잔액
                System.out.println("-----------------");
                System.out.printf("구매가 완료 되었습니다. \n현재 금액: %s만원, 누적 포인트: %s포인트\n", this.money, this.bonuspoint);
            }
        }
    }
}

// 쇼핑 시나리오.
public class Ex13_Inherit_KeyPoint {
    public static void main(String[] args) {
        LGTv lgtv = new LGTv();
        LGAudio audio = new LGAudio();
        LGNoteBook notebook = new LGNoteBook();
        KeyBoard keyboard = new KeyBoard();

        Buyer2 buyer = new Buyer2();
        buyer.Buy(lgtv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(keyboard);
        buyer.Buy(lgtv);

        buyer.summary();
    }
}