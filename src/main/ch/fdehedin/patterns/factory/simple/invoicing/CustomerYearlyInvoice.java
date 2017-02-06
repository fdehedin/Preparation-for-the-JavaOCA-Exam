package ch.fdehedin.patterns.factory.simple.invoicing;

import java.util.logging.Logger;

public class CustomerYearlyInvoice implements Invoice {
	private static final Logger LOGGER = Logger.getLogger(CustomerMonthlyInvoice.class.getSimpleName());

	private InvoiceType invoiceType = InvoiceType.CUSTOMER_YEARLY_INVOICE;

	public void calculate() {
		LOGGER.info(invoiceType + " is calculating");
	}

	public void print() {
		LOGGER.info(invoiceType + " is printing");
	}

	public void sendForPayment() {
		LOGGER.info(invoiceType + " sending for payment");
	}

}
