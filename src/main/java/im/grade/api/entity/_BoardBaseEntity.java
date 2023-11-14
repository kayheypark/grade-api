package im.grade.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@MappedSuperclass
public class _BoardBaseEntity extends _BaseEntity {
    @Column(length = 15)
    private String ip;

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID categoryId;

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID memberId;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000, nullable = false)
    private String description;

    @Column
    private int viewCount;
}