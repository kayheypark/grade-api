package im.grade.api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_login_log")
public class LoginLogEntity extends _LogBaseEntity {

}
