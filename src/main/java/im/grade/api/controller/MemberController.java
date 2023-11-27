package im.grade.api.controller;

import im.grade.api.entity.MemberEntity;
import im.grade.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Map<String, List<MemberEntity>>> getMemberById(@PathVariable(value="id") String id) {
        Map<String, List<MemberEntity>> data = memberService.findMemberById(id);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }



}
