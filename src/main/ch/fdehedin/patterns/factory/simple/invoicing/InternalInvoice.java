package ch.fdehedin.patterns.factory.simple.invoicing;

import java.util.logging.Logger;

import ch.fdehedin.patterns.factory.simple.invoicing.Invoice.InvoiceType;

public class InternalInvoice implements Invoice {
	private static final Logger LOGGER = Logger.getLogger(InternalInvoice.class.getSimpleName());

	private InvoiceType invoiceType = Invoice.InvoiceType.INTERNAL_INVOICE;

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
