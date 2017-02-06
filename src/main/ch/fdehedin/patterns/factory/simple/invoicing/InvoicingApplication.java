package ch.fdehedin.patterns.factory.simple.invoicing;

public abstract class InvoicingApplication {

	/**
	 * used to start the invoice generation process.. it creates, calculates and
	 * prints an invoice. But the invoice creation itself has to be done in the
	 * inherited classes in the generateInvoice factory method.
	 * 
	 * @param invoiceType
	 * @return
	 */
	public final Invoice startGenerateInvoice(InvoiceType invoiceType) {

		Invoice invoice;

		// we do not instantiate invoice in the invoice application!
		// invoice = factory.createInvoice(invoiceType);
		invoice = this.generateInvoice(invoiceType);

		invoice.calculate();
		invoice.print();

		return invoice;
	}

	/**
	 * This method acts as a factory method for creating invoices with the given
	 * Type..
	 * 
	 * @param invoiceType
	 * @return Invoice
	 */
	protected abstract Invoice generateInvoice(InvoiceType invoiceType);

}
