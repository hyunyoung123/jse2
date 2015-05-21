package oop01.syntax;

public class CardVO {
	private String kind; // 카드의 무늬
	private int number; // 카드의 숫자
	static int width=150; // 카드의 넓이
	static int height=300; // 카드의 높이
	
	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String getKind() {
		return kind;
	}
		
	public int getNumber() {
		return number;
	}	
}

