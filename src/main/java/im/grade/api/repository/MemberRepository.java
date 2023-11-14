package im.grade.api.repository;

import im.grade.api.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<MemberEntity, UUID> {
    @Query("SELECT m FROM MemberEntity m")
    List<MemberEntity> findEmailById(
            @Param("id") UUID id
    );
}
