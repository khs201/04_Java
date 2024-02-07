package edu.kh.poly.pack2.model.dto;

// 마우스 커서를 올려대서 오류 해결로 추상 메서드들을 바로 불러올 수 있다!!!

public class Snake extends Animal {

	public Snake(String type, boolean poison) {
		super(type);
		this.poison = poison;
	}

	private boolean poison; // 독 유무

	// 기본 생성자
	public Snake() {
	}

	// 매개 변수 생성자
	public Snake(boolean poison) {
		super();
		this.poison = poison;
	}

	public boolean isPoison() {
		return poison;
	}

	public void setPoison(boolean poison) {
		this.poison = poison;
	}

	@Override
	public void eat() {
		System.out.println("한번에 꿀꺽");
	}

	@Override
	public void sleep() {
		System.out.println("똬리 틀어 잠");
	}

	@Override
	public String toString() {
		return super.toString() + " / 독 유무 : " + poison;
	}

}
