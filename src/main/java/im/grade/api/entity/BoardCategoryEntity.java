package im.grade.api.entity;


import im.grade.api.type.UserGradeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tbl_board_category")
public class BoardCategoryEntity extends _CategoryBaseEntity {

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID memberId;

    @Enumerated(EnumType.STRING)
    @Column
    private UserGradeType grade; // 해당 등급 이상의 유저만 볼 수 있다

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID productId; // 이 상품을 구매해야 볼 수 있다

}