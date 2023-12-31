package im.grade.api.entity;

import im.grade.api.type.CurrencyType;
import im.grade.api.type.PaymentTimeType;
import im.grade.api.type.ProductType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_product")
public class ProductEntity extends _BoardBaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentTimeType paymentTimeType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductType productType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CurrencyType currencyType;

    @Column(nullable = false)
    private double currencyAmt;
}