package im.grade.api.repository;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tbl_product_subscribe")
public class ProductSubscribeEntity extends _BaseEntity {
    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private UUID productId;

    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private Long fromMemberId;

    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private Long toMemberId;
}