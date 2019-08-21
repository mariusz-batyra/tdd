package pl.mbatyra.invoiceservice.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.List;

@EqualsAndHashCode
@RequiredArgsConstructor
public class Invoice {

    private final InvoiceHeader invoiceHeader;
    private final List<InvoiceBody> invoiceBodies;
    private final InvoiceSummary invoiceSummary;

}
