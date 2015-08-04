package com.wonzopein.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by seunghyeonoh on 15. 7. 21..
 */
@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "user_id", unique = true)
    String id;

    @Column(name="user_nm")
    String name;


    String bigo;


    public User() {
    }

    public User(String id, String name){
        this.setId(id);
        this.setName(name);
    }


}
