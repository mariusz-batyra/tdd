package pl.mbatyra.invoiceservice.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode
@RequiredArgsConstructor
public class InvoiceSummary {

    private final BigDecimal netValue;
    private final BigDecimal vatAmount;
    private final BigDecimal grossValue;

}
