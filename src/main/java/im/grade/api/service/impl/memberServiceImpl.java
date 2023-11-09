package im.grade.api.service.impl;

import im.grade.api.service.memberService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

@Service
public class memberServiceImpl implements memberService {

    @Override
    public Map<String, Object> getMemberData() {
        Map<String, Object> data = new HashMap<>();

        data.put("label1", "check1");
        data.put("label2", "check2");
        data.put("label3", "check3");

        return data;
    }
}
