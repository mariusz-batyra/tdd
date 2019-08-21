package pl.mbatyra.invoiceservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class InvoiceBody {

    @Setter
    private int ordinalNumber;
    private final String name;
    private final int quantity;
    private final MeasureUnit measureUnit;
    private final BigDecimal netPrice;
    private final VatRate vatRate;
    private final BigDecimal netValue;
    private final BigDecimal vatAmount;
    private final BigDecimal grossValue;

}
