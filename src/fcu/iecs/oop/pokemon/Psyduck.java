package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon{//一個類別可以implements很多個介面，但只能extends一個父類別。

	public Psyduck(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);//呼叫父類別的建構子
		// TODO 自動產生的建構子 Stub
	}

	@Override
	public void attack() {//在此可因Pokemon是一抽象類別，而有無實作的方法和有實作的方法，繼承的子類別則要完成
		// TODO 自動產生的方法 Stub
		System.out.println("Aqua Tail…");
	}
	
}
