package im.grade.api.service;

import im.grade.api.entity.MemberEntity;
import im.grade.api.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class MemberService {
        private final MemberRepository memberRepository;

        @Autowired
        public MemberService(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
        }

        public Map<String, List<MemberEntity>> findEmailById(UUID id) {
            Map<String, List<MemberEntity>> data = new HashMap<String, List<MemberEntity>>();
            data.put("data", memberRepository.findEmailById(id));
            return data;
        }
}
