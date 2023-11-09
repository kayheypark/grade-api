package im.grade.api.controller;

import im.grade.api.service.memberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class memberController {

    private final memberService memberService;

    @GetMapping("/member")
    public Map<String, Object> memberController() {

        return memberService.getMemberData();
    }
}
