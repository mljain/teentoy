package com.toyshare.service;

import com.toyshare.entity.Member;
import com.toyshare.entity.Toy;
import com.toyshare.repository.MemberRepository;
import com.toyshare.repository.ToyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToyService {
    @Autowired
    ToyRepository toyRepository;

    //public List<Toy> findAll() {
    //    return toyRepository.findAll();
   // }

    public List<Toy> saveAll(List<Toy> toys) {

        return toyRepository.saveAll(toys);
    }

   // public List<Toy> findByMemberId(long id) {
   //     return toyRepository.findAll(new Long(id));
   // }


    public Toy save(Toy toy) {
        return toyRepository.save(toy);
    }

    public Toy update(Toy toy) {
        return toyRepository.save(toy);
    }
}
