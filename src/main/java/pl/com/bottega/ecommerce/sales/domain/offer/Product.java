package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String id;

    private String name;

    private Date snapshotDate;

    private String type;

    private Money price;

    public Product(String id, String name, Date snapshotDate, String type, BigDecimal value) {
        this(id, name, snapshotDate, type, value, null);
    }

    public Product(String id, String name, Date snapshotDate, String type, BigDecimal value, String currency) {
        this.id = id;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;
        this.price = new Money(value, currency);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    public Money getPrice() {
        return price;
    }

}
