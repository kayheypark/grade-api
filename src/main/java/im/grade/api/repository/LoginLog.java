package im.grade.api.repository;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_login_log")
public class LoginLog extends _LogBaseEntity {

}
