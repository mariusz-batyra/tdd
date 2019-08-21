package pl.mbatyra.invoiceservice.creator;

import lombok.RequiredArgsConstructor;
import pl.mbatyra.invoiceservice.model.InvoiceHeader;

import java.time.LocalDate;

@RequiredArgsConstructor
public class InvoiceHeaderCreator {

    public InvoiceHeader create(String seller, String buyer, LocalDate issueDate, LocalDate deliveryDate) {
        return null;
    }

}
