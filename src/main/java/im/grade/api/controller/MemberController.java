package im.grade.api.controller;

import im.grade.api.entity.MemberEntity;
import im.grade.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Map<String, List<MemberEntity>>> getEmailById(@PathVariable(value="id") UUID id) {
        Map<String, List<MemberEntity>> data = memberService.findEmailById(id);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

}
