package ch.fdehedin.patterns.factory.simple.invoicing;

import org.junit.Test;

import ch.fdehedin.patterns.factory.simple.invoicing.Invoice;
import ch.fdehedin.patterns.factory.simple.invoicing.InvoiceFactory;
import ch.fdehedin.patterns.factory.simple.invoicing.InvoicingApplication;

public class InvoiceApplicationTest {

	@Test
	public void testInvoiceCreation() {
		InvoicingApplication appCloud = new InvoicingApplicationCloud();

		appCloud.startGenerateInvoice(InvoiceType.CUSTOMER_MONTHLY_INVOICE);

		appCloud.startGenerateInvoice(InvoiceType.CUSTOMER_YEARLY_INVOICE);

		appCloud.startGenerateInvoice(InvoiceType.INTERNAL_INVOICE);

		InvoicingApplication appOnPrem = new InvoicingApplicationOnPremise();

		appOnPrem.startGenerateInvoice(InvoiceType.VIRTUAL_INVOICE);

	}

}
