package pl.mbatyra.invoiceservice.creator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.mbatyra.invoiceservice.model.InvoiceSummary;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceSummaryCreatorTest {

    private static final BigDecimal NET_VALUE = BigDecimal.valueOf(10.00);
    private static final BigDecimal VAT_AMOUNT = BigDecimal.valueOf(20.00);
    private static final BigDecimal GROSS_VALUE = BigDecimal.valueOf(30.00);

    private InvoiceSummaryCreator invoiceSummaryCreator;

    @BeforeEach
    void init() {
        invoiceSummaryCreator = new InvoiceSummaryCreator();
    }

    @Test
    @Disabled("To be implemented by talented SDA students :)")
    void shouldCreateInvoiceSummary() {
        // given
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(NET_VALUE, VAT_AMOUNT, GROSS_VALUE);

        // when
        InvoiceSummary invoiceSummary = invoiceSummaryCreator.create(List.of());

        // then
        assertThat(invoiceSummary).isEqualTo(expectedInvoiceSummary);
    }

}
