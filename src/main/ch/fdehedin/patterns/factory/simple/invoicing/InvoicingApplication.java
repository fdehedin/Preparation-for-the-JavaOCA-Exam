package ch.fdehedin.patterns.factory.simple.invoicing;

public class InvoicingApplication {

	private InvoiceFactory factory;

	public InvoicingApplication(InvoiceFactory factory) {
		this.factory = factory;
	}

	public Invoice generateInvoice(Invoice.InvoiceType invoiceType) {

		Invoice invoice;

		// we do not instantiate invoice in the invoice application!
		invoice = factory.createInvoice(invoiceType);

		invoice.calculate();
		invoice.print();

		return invoice;

	}

}
