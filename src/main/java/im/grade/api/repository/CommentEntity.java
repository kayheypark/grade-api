package im.grade.api.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tbl_comment")
public class CommentEntity extends _BoardBaseEntity {
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID boardId;
}