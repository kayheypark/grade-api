package im.grade.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class _CategoryBaseEntity extends _BaseEntity {
    @Column(length = 128, nullable = false)
    private String display;

    @Column(length = 21, nullable = false)
    private String colorText;

    @Column(length = 21, nullable = false)
    private String colorBg;
}