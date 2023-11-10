package im.grade.api.service.impl;

import im.grade.api.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public Map<String, Object> getMemberData() {
        Map<String, Object> data = new HashMap<>();

        data.put("email", "id@domain.com");

        return data;
    }
}
