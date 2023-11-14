package im.grade.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_media_bookmark_log")
public class MediaBookmarkLogEntity extends _LikeLogBaseEntity {

}
