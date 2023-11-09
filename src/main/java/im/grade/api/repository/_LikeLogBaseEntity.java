package im.grade.api.repository;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class _LikeLogBaseEntity extends _LogBaseEntity {
    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private UUID toId;
}
