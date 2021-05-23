package repeticao;

public class Repeticao {

	public static void main(String[] args) {
		repeteNome("Claudio",10);
	}
	
	public static void repeteNome(String nome , int vezes) {
		if(vezes>=1){
			System.out.println(nome);
			vezes--;
			repeteNome(nome,vezes);
		}
	}
}
