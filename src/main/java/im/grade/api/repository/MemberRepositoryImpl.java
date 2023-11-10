package im.grade.api.repository;

import im.grade.api.model.MemberDTO;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {
    private final EntityManager em;

    @Override
    public MemberDTO findMember(UUID id) {
        MemberDTO data = em.find(MemberDTO.class, id);
        return data;
    }

}
