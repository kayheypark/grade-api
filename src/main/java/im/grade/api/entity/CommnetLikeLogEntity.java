package im.grade.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_comment_like_log")
public class CommnetLikeLogEntity extends _LikeLogBaseEntity {

}
