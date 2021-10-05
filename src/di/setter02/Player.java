package di.setter02;

public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	//Dice객체를 스프링컨테이너로 부터 전달받기 위해 준비할 생성자
	//=> Constructor Injection을 이용해서 전달 - DI를 위한 준비
	public Player() {
		
	}
	public Player(AbstractDice d) {
		super();
		this.d = d;
		
	}
	public void setD(AbstractDice d) {
		this.d = d;
		
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
	
}