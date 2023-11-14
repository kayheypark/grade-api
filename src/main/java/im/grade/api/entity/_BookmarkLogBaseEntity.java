package im.grade.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@MappedSuperclass
public class _BookmarkLogBaseEntity extends _LogBaseEntity {

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID toId;
}
