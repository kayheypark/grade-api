package im.grade.api.repository;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 상속 구현 전략 선택
public class _BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name="uuid2", strategy = "uuid2")
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
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createAt;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime deleteAt;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime updateAt;
}
