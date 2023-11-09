package im.grade.api.repository;

import im.grade.api.type.PlatformType;
import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public class _LogBaseEntity extends _BaseEntity {

    @Column(length = 15)
    private String ip;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PlatformType platform;

    @Column(nullable = false)
    private String agent;

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID memberId;

    @Column(nullable = false)
    private String endpoint;

    @Column(nullable = false)
    private String logKey;

    @Column
    private double valueDouble;

    @Column
    private String valueString;
}
