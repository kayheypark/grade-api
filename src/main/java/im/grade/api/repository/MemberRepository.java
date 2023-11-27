package im.grade.api.repository;

import im.grade.api.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
//    @Query(value = "SELECT email FROM tbl_member WHERE id = '9f44e6a6-7fc9-11ee-93f8-4d1ba1d54af1'", nativeQuery = true)
    @Query(value = "SELECT m.* FROM tbl_member m WHERE id = :id", nativeQuery = true)
    List<MemberEntity> findMemberById(
            @Param("id") String id
    );
}
