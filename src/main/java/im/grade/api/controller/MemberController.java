package im.grade.api.controller;

import im.grade.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.Map;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getMemberController() {
        return "TEST OK.";
    }

}
