package com.toyshare.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity

public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toy_id")
    private Long toyId;

    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.MERGE)
    @JoinColumn(name = "member_id")
   // @JsonManagedReference
    private Member member;

    @Column(name = "toy_url")
    private String toy_url;

    @Column(name = "created_by")
    private String createdBy;


    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    public Long getToyId() {
        return toyId;
    }

    public void setToyId(Long toyId) {
        this.toyId = toyId;
    }


   //  public Long getMemberId() {
   //      return memberId;
   //  }

   //  public void setMemberId(Long memberId) {
   //      this.memberId = memberId;
   // }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getToy_url() {
        return toy_url;
    }

    public void setToy_url(String toy_url) {
        this.toy_url = toy_url;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public static void main(String[] args) {
        Toy t1 = new Toy();
        t1.setCreatedBy("soumya Acharya");
        t1.setToy_url("www.google1.com");
        t1.setCreatedDate(new Date());

        Member m = new Member();
        m.setPassword("hello");
        m.setAddressLine1("xyx");
        m.setAddressLine2("abe");
        m.setCity("Livermore");
        m.setCountry("USA");
        m.setCreatedBy("Soumya Acharya");
        m.setCreatedDate(new Date());
        m.setEmail("cse.soumya@gmail.com");
        m.setFirstName("Soumya");
        m.setLastName("Acharya");
        m.setMemberType("USER");

        t1.setMember(m);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(t1);
            System.out.println(jsonString);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return toyId.equals(toy.toyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyId);
    }

}
