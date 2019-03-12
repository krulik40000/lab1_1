package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {

    private Money value;

    private String cause;

    public Discount(BigDecimal value, String cause) {
        this(value, null, cause);
    }

    public Discount(BigDecimal value, String currency, String cause) {
        this.value = new Money(value, currency);
        this.cause = cause;
    }

    public Money getValue() {
        return value;
    }

    public String getCause() {
        return cause;
    }

}
