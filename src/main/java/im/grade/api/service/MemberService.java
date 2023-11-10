package im.grade.api.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface MemberService {
    Map<String, Object> getMemberData();
}
