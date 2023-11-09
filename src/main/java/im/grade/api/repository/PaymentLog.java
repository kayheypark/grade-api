package im.grade.api.repository;

import im.grade.api.type.StatusType;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_payment_log")
public class PaymentLog extends _LogBaseEntity {
    @Column(nullable = false)
    private String pg;

    @Column(nullable = false)
    private String payMethod;

    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private Long productId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusType status;

}
