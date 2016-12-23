package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {//定義Pokemon是一抽象類別，且實作介面的方法
	//抽象類別可以有一些不是abstract的method(有實作的方法)，但是介面不能(一定只能宣告無實作的方法)，都不能被  new 出來。
	//一個類別可以implements很多個介面，但只能extends一個父類別。
	
	private String nickName;
	
	private final PokemonType type;
	
	private int cp;
	
	public Pokemon(String nickName,PokemonType type,int cp){
		this.nickName=nickName;
		this.type=type;
		this.cp=cp;
	}

	public PokemonType getType(){
		return this.type;
	}
	
	public String getNickName(){
		return this.nickName;
	}
	
	public void setNickName(String nickName){
		this.nickName=nickName;
	}
	
	public int getCp(){
		return this.cp;
	}
	
	public void setCp(int cp){
		this.cp=cp;
	}
	
	
	@Override
	public void attack() {//在此可因Pokemon是一抽象類別，而有無實作的方法和有實作的方法
		// TODO 自動產生的方法 Stub
	}

}
