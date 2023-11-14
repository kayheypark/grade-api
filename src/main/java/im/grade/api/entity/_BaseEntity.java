package im.grade.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 상속 구현 전략 선택
public class _BaseEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "VARCHAR(36) DEFAULT (UUID())")
    private UUID id;
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID parentId;

    @Column(columnDefinition = "VARCHAR(36)")
    private UUID mapId;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime startAt;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime endAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private LocalDateTime createAt;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime deleteAt;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime updateAt;
}
