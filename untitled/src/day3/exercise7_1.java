//package untitled.src.day3;
//
//class SutdaDeck {
//  final int CARD_NUM = 20;
//  SutdaCard[] cards = new SutdaCard[CARD_NUM + 1];
//
//  public SutdaDeck() {
//    for (int i = 0; i <= CARD_NUM; i++) {
//      if(i >= 11) cards[i] = new SutdaCard((i - 10), false);
//      else if(i == 1 || i == 3 || i == 8) cards[i] = new SutdaCard(i, true);
//      else cards[i] = new SutdaCard(i, false);
//    }
//  }
//
//class SutdaCard {
//  int num;
//  boolean isKwang;
//
//  public SutdaCard() {
//    this(1, true);
//  }
//
//  SutdaCard(int num, boolean isKwang) {
//    this.num = num;
//    this.isKwang = isKwang;
//  }
//
//  @Override
//  public String toString() {
//    return num + (isKwang ? "K":"");
//  }
//}
//
//public class exercise7_1 {
//  public static void main(String[] args) {
//    SutdaDeck deck = new SutdaDeck();
//
//    for (int i = 0; i < deck.cards.length; i++) {
//      System.out.print(deck.cards[i] + ",");
//    }
//  }
//}
