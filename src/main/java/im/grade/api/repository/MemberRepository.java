package im.grade.api.repository;

import im.grade.api.model.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface MemberRepository {
    MemberDTO findMember(UUID id);

}
