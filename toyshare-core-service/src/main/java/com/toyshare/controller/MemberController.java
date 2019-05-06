package com.toyshare.controller;

import com.toyshare.entity.Member;
import com.toyshare.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1/toy/member")
@Slf4j
public class MemberController {

    private final MemberService memberService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<List<Member>> findAll() {
        return ResponseEntity.ok(memberService.findAll());
    }

    @PostMapping
    public ResponseEntity saveAll(@Valid @RequestBody Member member) {
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        return ResponseEntity.ok(memberService.save(member));
    }

    @GetMapping("/id")
    public ResponseEntity<Member> findById(@RequestParam long memberId) {
        return ResponseEntity.ok(memberService.findByMemberId(memberId));
    }

}
