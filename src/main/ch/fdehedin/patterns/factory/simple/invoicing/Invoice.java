package ch.fdehedin.patterns.factory.simple.invoicing;

public interface Invoice {
	public enum InvoiceType {
		CUSTOMER_MONTHLY_INVOICE, CUSTOMER_YEARLY_INVOICE, INTERNAL_INVOICE
	}

	public void calculate();

	public void print();

	public void sendForPayment();

}
