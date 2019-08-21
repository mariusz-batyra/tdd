package pl.mbatyra.invoiceservice.creator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.mbatyra.invoiceservice.model.InvoiceBody;
import pl.mbatyra.invoiceservice.model.MeasureUnit;
import pl.mbatyra.invoiceservice.model.VatRate;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceBodyCreatorTest {

    private static final String NAME = "TOMATO";
    private static final int QUANTITY = 20;
    private static final MeasureUnit MEASURE_UNIT = MeasureUnit.KILOGRAMS;
    private static final BigDecimal NET_PRICE = BigDecimal.valueOf(8.99);
    private static final int VAT_RATE = 23;
    private static final BigDecimal NET_VALUE = BigDecimal.valueOf(50.00);
    private static final BigDecimal VAT_AMOUNT = BigDecimal.valueOf(60.00);
    private static final BigDecimal GROSS_VALUE = BigDecimal.valueOf(70.00);

    private InvoiceBodyCreator invoiceBodyCreator;

    @BeforeEach
    void init() {
        invoiceBodyCreator = new InvoiceBodyCreator();
    }

    @Test
    @Disabled("To be implemented by talented SDA students :)")
    void shouldCreateInvoiceBody() {
        // given
        InvoiceBody expectedInvoiceBody = new InvoiceBody(NAME, QUANTITY, MEASURE_UNIT, NET_PRICE, VatRate.BASIC,
                NET_VALUE, VAT_AMOUNT, GROSS_VALUE);

        // when
        InvoiceBody invoiceBody = invoiceBodyCreator.create(NAME, QUANTITY, MEASURE_UNIT, NET_PRICE, VAT_RATE);

        // then
        assertThat(invoiceBody).isEqualTo(expectedInvoiceBody);
    }

}
