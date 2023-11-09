package im.grade.api.repository;

import im.grade.api.type.MemberType;
import im.grade.api.type.UserGrade;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_member")
public class Member extends _BaseEntity {

    @Column(columnDefinition = "VARCHAR(10) DEFAULT 'ko_KR'")
    private String locale;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MemberType memberType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserGrade grade;

    @Column(nullable = false, columnDefinition = "DECIMAL(14,4) DEFAULT 0")
    private double point;

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