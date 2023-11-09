package im.grade.api.repository;


import im.grade.api.type.UserGrade;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "tbl_board_category")
public class BoardCategory extends _CategoryBaseEntity {

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID memberId;

    @Enumerated(EnumType.STRING)
    @Column
    private UserGrade grade; // 해당 등급 이상의 유저만 볼 수 있다

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID productId; // 이 상품을 구매해야 볼 수 있다

}