package com.toyshare.repository;

import com.toyshare.entity.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Long> {

   // List<Toy> findAll(Long memberId);

}
