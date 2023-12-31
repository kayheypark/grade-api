package im.grade.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@MappedSuperclass
public class _LikeLogBaseEntity extends _LogBaseEntity {
    @Column(nullable = false, columnDefinition = "VARCHAR(36)")
    private UUID toId;
}
