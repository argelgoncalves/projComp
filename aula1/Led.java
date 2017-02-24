import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


public class Led {
	 private final GpioController gpio = GpioFactory.getInstance();
     private final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
	
	public void piscarLed(Animal animal){
		try{
			pin.setShutdownOptions(true, PinState.LOW);
			
			if(animal.getTipo().equals("mamifero")){
				 pin.high();
				 Thread.sleep(5000);
				 pin.low();
				 Thread.sleep(2000);
				 pin.high();
				 Thread.sleep(1000);
				 pin.low();
			}else if(animal.getTipo().equals("reptil")){
				pin.high();
				 Thread.sleep(1000);
				 pin.low();
				 Thread.sleep(2000);
				 pin.high();
				 Thread.sleep(1000);
				 pin.low();
				 Thread.sleep(1000);
				 pin.high();
				 Thread.sleep(1000);
				 pin.low();
			}else if(animal.getTipo().equals("ave")){
				pin.high();
				 Thread.sleep(5000);
				 pin.low();
				 Thread.sleep(1000);
				 pin.high();
				 Thread.sleep(2000);
				 pin.low();
			}
			
			Thread.sleep(5000);
		}catch(Exception ex){
			
		}
	}
}

