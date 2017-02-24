import java.util.Scanner;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


public class Pisca {

    public static void main(String[] args) throws InterruptedException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("piscadas:");
    	int piscadas = scanner.nextInt();
    	System.out.println("tempo ligado:");
    	int ligado = scanner.nextInt();
    	System.out.println("tempo desligado");
    	int desligado = scanner.nextInt();
    	
    	    	
    	System.out.println("Ligando");

       
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
       
        pin.setShutdownOptions(true, PinState.LOW);

        for(int i=0;i<piscadas;i++){
        	pin. high();
        	Thread.sleep(ligado);
        	pin.low();
        	Thread.sleep(desligado);
        }

        gpio.shutdown();

        System.out.println("cabo");
    }
}
