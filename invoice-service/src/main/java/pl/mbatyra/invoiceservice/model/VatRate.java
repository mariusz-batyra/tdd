package pl.mbatyra.invoiceservice.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.EnumSet;

@RequiredArgsConstructor
public enum VatRate {

    SERVICE(8),
    BASIC(23);

    @Getter
    private final int rate;

    public static VatRate fromRate(int rate) {
        return EnumSet.allOf(VatRate.class)
                .stream()
                .filter(vatRate -> vatRate.getRate() == rate)
                .findFirst()
                .orElse(null);
    }

}
