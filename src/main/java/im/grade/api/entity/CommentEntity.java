package im.grade.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "tbl_comment")
public class CommentEntity extends _BoardBaseEntity {
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID boardId;
}