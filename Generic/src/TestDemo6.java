import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//扑克牌
class card{
    private String park;
    private int count;

    public card(String park, int count) {
        this.park = park;
        this.count = count;
    }
    @Override
    public String toString() {
        return "["+park+","+count+"]";
    }
}
//买牌
class buyCard{
    public static final String[] str = {"♥","♠","♦","♣"};
    public List<card> buyCards(){
        List<card> cards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new card(str[i],j));
            }
        }
        return cards;
    }
}
//洗牌
class washPai{
    public List<card> washPai1(List<card> cards){
        for (int i = cards.size()-1; i >0 ; i--) {
            int n = new Random().nextInt(i);
            swap(cards,i,n);
        }
        return cards;
    }

    public void swap(List<card> cards, int i, int n) {
        card tmp = cards.get(i);
        cards.set(i,cards.get(n));
        cards.set(n,tmp);
    }
}

public class TestDemo6 {
    public static void main(String[] args) {
        buyCard buyCard = new buyCard();
        List<card> cards = buyCard.buyCards();
        System.out.println(cards);
        System.out.println("------------------------------");
        washPai washPai = new washPai();
        washPai.washPai1(cards);
        System.out.println(cards);
        //发牌
        List<card> list1 = new ArrayList<>();
        List<card> list2 = new ArrayList<>();
        List<card> list3 = new ArrayList<>();
        List<List<card>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                card card = cards.remove(0);
                lists.get(j).add(card);
            }
        }
        System.out.println("第一个人");
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(0).get(i));
        }
        System.out.println("第2个人");
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(1).get(i));
        }
        System.out.println("第3个人");
        for (int i = 0; i < 3; i++) {
            System.out.println(lists.get(2).get(i));
        }
    }
}
