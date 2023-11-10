package im.grade.api.controller;

import im.grade.api.entity.MemberEntity;
import im.grade.api.model.response.MemberDTO;
import im.grade.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /*
     * 회원 정보 API
     *
     * */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Map<String, Object>> getMemberById(@PathVariable(value="id") UUID id) {
        Map<String, Object> data = memberService.getMemberData();
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }



}
