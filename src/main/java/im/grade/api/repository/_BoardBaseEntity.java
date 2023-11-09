package im.grade.api.repository;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

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