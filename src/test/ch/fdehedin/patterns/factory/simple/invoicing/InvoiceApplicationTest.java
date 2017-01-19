package ch.fdehedin.patterns.factory.simple.invoicing;

import org.junit.Test;

import ch.fdehedin.patterns.factory.simple.invoicing.Invoice;
import ch.fdehedin.patterns.factory.simple.invoicing.InvoiceFactory;
import ch.fdehedin.patterns.factory.simple.invoicing.InvoicingApplication;

public class InvoiceApplicationTest {

	@Test
	public void testInvoiceCreation() {
		InvoicingApplication app = new InvoicingApplication(new InvoiceFactory());

		app.generateInvoice(Invoice.InvoiceType.CUSTOMER_MONTHLY_INVOICE);

		app.generateInvoice(Invoice.InvoiceType.CUSTOMER_YEARLY_INVOICE);

		app.generateInvoice(Invoice.InvoiceType.INTERNAL_INVOICE);

	}

}
