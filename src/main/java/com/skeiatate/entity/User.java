package com.skeiatate.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * @author SkeiATate
 *
 * 用户实体类
 */
@Entity
@Data
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    //用户名
    private String userName;

    @Column()
    //密码
    private String password;
}
