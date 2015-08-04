package com.wonzopein.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * The type User.
 */
@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class User {

    /**
     * The Id.
     */
    @Id
    @Column(name = "user_id", unique = true)
    String id;

    /**
     * The Name.
     */
    @Column(name="user_nm")
    String name;


    /**
     * The Bigo.
     */
    String bigo;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param id the id
     * @param name the name
     */
    public User(String id, String name){
        this.setId(id);
        this.setName(name);
    }


}
