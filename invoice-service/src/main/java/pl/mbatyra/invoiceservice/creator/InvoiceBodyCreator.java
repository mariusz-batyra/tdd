package pl.mbatyra.invoiceservice.creator;

import lombok.RequiredArgsConstructor;
import pl.mbatyra.invoiceservice.model.InvoiceBody;
import pl.mbatyra.invoiceservice.model.MeasureUnit;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class InvoiceBodyCreator {

    public InvoiceBody create(String name, int quantity, MeasureUnit measureUnit, BigDecimal netPrice, int vatRateValue) {
        return null;
    }

}
