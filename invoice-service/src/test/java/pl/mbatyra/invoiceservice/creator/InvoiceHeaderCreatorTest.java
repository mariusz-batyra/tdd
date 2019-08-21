package pl.mbatyra.invoiceservice.creator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.mbatyra.invoiceservice.model.InvoiceHeader;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceHeaderCreatorTest {

    private static final String INVOICE_NUMBER = "FVS/31/10/19";
    private static final String SELLER = "MARIUSZ BATYRA";
    private static final String BUYER = "SOFTWARE DEVELOPMENT ACADEMY";
    private static final LocalDate ISSUE_DATE = LocalDate.of(2019, 10, 31);
    private static final LocalDate DELIVERY_DATE = LocalDate.of(2019, 10, 31);

    private InvoiceHeaderCreator invoiceHeaderCreator;

    @BeforeEach
    void init() {
        invoiceHeaderCreator = new InvoiceHeaderCreator();
    }

    @Test
    @Disabled("To be implemented by talented SDA students :)")
    void shouldCreateInvoiceHeader() {
        // given
        InvoiceHeader expectedInvoiceHeader = new InvoiceHeader(INVOICE_NUMBER, SELLER, BUYER, ISSUE_DATE, DELIVERY_DATE);

        // when
        InvoiceHeader invoiceHeader = invoiceHeaderCreator.create(SELLER, BUYER, ISSUE_DATE, DELIVERY_DATE);

        // then
        assertThat(invoiceHeader).isEqualTo(expectedInvoiceHeader);
    }

}
