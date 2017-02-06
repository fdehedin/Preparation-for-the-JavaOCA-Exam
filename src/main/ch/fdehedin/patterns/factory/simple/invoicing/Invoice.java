package ch.fdehedin.patterns.factory.simple.invoicing;

public interface Invoice {


	public void calculate();

	public void print();

	public void sendForPayment();

}
