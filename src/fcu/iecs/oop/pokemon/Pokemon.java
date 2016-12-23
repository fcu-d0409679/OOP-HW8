package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {//�w�qPokemon�O�@��H���O�A�B��@��������k
	//��H���O�i�H���@�Ǥ��Oabstract��method(����@����k)�A���O��������(�@�w�u��ŧi�L��@����k)�A������Q  new �X�ӡC
	//�@�����O�i�Himplements�ܦh�Ӥ����A���u��extends�@�Ӥ����O�C
	
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
	public void attack() {//�b���i�]Pokemon�O�@��H���O�A�Ӧ��L��@����k�M����@����k
		// TODO �۰ʲ��ͪ���k Stub
	}

}
