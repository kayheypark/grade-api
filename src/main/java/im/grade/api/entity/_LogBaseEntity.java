package im.grade.api.entity;

import im.grade.api.type.PlatformType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
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
