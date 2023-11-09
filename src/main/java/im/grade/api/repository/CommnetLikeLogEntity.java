package im.grade.api.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_comment_like_log")
public class CommnetLikeLogEntity extends _LikeLogBaseEntity {

}
