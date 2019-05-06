package com.toyshare.service;

import com.toyshare.entity.Member;
import com.toyshare.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public List<Member> saveAll(List<Member> members) {

        return memberRepository.saveAll(members);
    }

    public Member findByMemberId(long id) {
        return memberRepository.findByMemberId(new Long(id));
    }


    public Member save(Member members) {
        return memberRepository.save(members);
    }
}
