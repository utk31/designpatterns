package behavioural.mediator;

public interface Mediator {
	public void send(String message, Colleague colleague);
}