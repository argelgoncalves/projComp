public class Vetor {
	
	private Animal[] animais = new Animal[10];
	private final Led led = new Led();
	
	public void adiciona(Animal animal)	{
		
		for(int i=0;i<animais.length;i++){
			if(animais[i]==null){
				animais[i]=animal;
				System.out.println("Animal adicionado: "+ animal.getTipo());
				led.piscarLed(animais[i]);
				break;
			}
		}
		
	}
	public void remover(int index){
		animais[index]=null;
	}
		
}

