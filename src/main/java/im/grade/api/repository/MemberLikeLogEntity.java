package im.grade.api.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_member_like_log")
public class MemberLikeLogEntity extends _LikeLogBaseEntity {

}
