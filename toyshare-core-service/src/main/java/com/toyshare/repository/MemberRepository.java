package com.toyshare.repository;

import com.toyshare.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMemberId(Long memberId);

    Member findByUsername(String userName);

}
