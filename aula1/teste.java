public class teste {

	public static void main(String[] args) {
	 
		Vetor vetor = new Vetor();
		vetor.adiciona(new Animal("mamifero"));
		vetor.adiciona(new Animal("ave"));
		vetor.adiciona(new Animal("reptil"));
		vetor.adiciona(new Animal("ave"));
		vetor.remover(2);
		vetor.adiciona(new Animal("reptil"));
	}

}

