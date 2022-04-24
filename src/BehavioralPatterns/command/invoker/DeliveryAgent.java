package BehavioralPatterns.command.invoker;

//Invoker
public class DeliveryAgent  extends Invoker  {
	
	@Override
	public void invokeCommand() {
		this.getCommand().execute();
	}
	
	public void takeOrder() {
		invokeCommand();
	}
	
	public void serveOrder() {
		invokeCommand();
	}	
}
