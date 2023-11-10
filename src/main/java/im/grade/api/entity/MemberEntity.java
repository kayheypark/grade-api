package im.grade.api.entity;

import im.grade.api.type.MemberType;
import im.grade.api.type.UserGradeType;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_member")
public class MemberEntity extends _BaseEntity {

    @Column(columnDefinition = "VARCHAR(10)")
    @ColumnDefault("'ko_KR'")
    private String locale;

    @Enumerated(EnumType.STRING)
    @ColumnDefault(value = "'USER'")
    @Column(nullable = false)
    private MemberType memberType = MemberType.USER;

    @Enumerated(EnumType.STRING)
    @ColumnDefault(value = "'D'")
    @Column(nullable = false)
    private UserGradeType grade = UserGradeType.D;

    @ColumnDefault(value = "0")
    @Column(nullable = false, columnDefinition = "DECIMAL(14,4)")
    private double point = 0;

    @Column(nullable = false)
    private String email;

    @Column(length = 80, nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String salt;

    @Column(length = 1000, nullable = false)
    private String passwordHash;

    @Column(length = 2000)
    private String imagePath;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime lastLoginAt;

}