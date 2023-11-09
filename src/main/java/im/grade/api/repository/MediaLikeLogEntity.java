package im.grade.api.repository;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_media_like_log")
public class MediaLikeLogEntity extends _LikeLogBaseEntity {

}
