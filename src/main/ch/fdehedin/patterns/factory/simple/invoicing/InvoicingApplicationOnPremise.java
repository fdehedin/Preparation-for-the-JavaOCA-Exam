package ch.fdehedin.patterns.factory.simple.invoicing;

public class InvoicingApplicationOnPremise extends InvoicingApplication {

	@Override
	protected Invoice generateInvoice(InvoiceType invoiceType) {

		Invoice invoice = null;

		switch (invoiceType) {
		case VIRTUAL_INVOICE:
			invoice = new VirtualInvoice();
			break;
		default:
			break;
		}
		return invoice;
	}

}
