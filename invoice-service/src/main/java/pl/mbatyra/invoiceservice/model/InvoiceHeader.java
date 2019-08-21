package pl.mbatyra.invoiceservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class InvoiceHeader {

    private final String invoiceNumber;
    private final String seller;
    private final String buyer;
    private final LocalDate issueDate;
    private final LocalDate deliveryDate;

}
