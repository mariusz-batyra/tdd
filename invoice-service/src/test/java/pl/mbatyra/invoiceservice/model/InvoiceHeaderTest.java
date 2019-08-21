package pl.mbatyra.invoiceservice.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InvoiceHeaderTest {

    @Test
    void shouldCreateInvoiceHeader() {
        // given
        InvoiceHeader invoiceHeader;

        // when
        invoiceHeader = new InvoiceHeader(null, null, null, null, null);

        // then
        assertThat(invoiceHeader).isNotNull();
    }

}
