package com.toyshare.entity;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity {

    public Role(){

    }


    public Role(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
