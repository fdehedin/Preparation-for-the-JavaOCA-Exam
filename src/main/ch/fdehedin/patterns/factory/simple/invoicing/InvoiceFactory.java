package ch.fdehedin.patterns.factory.simple.invoicing;

public class InvoiceFactory {

	public Invoice createInvoice(Invoice.InvoiceType invoiceType) {
		Invoice invoice = null;

		switch (invoiceType) {
		case CUSTOMER_MONTHLY_INVOICE:
			invoice = new CustomerMonthlyInvoice();
			break;
		case CUSTOMER_YEARLY_INVOICE:
			invoice = new CustomerYearlyInvoice();
			break;
		case INTERNAL_INVOICE:
			invoice = new InternalInvoice();
			break;
		default:
			break;

		}

		return invoice;
	}

}
