package com.toyshare.controller;

import com.toyshare.entity.Member;
import com.toyshare.entity.Toy;
import com.toyshare.service.MemberService;
import com.toyshare.service.ToyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1/toy")
@Slf4j
public class ToyController {

    private final ToyService toyService;

    @Autowired
    public ToyController(ToyService toyService) {
        this.toyService = toyService;
    }


    @PostMapping
    public ResponseEntity saveAll(@Valid @RequestBody Toy toy) {
        return ResponseEntity.ok(toyService.save(toy));
    }

}
