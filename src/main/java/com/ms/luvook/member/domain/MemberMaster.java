package com.ms.luvook.member.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vivie on 2017-06-08.
 */
@Data
@Entity
@Table(name = "member_master")
public class MemberMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    @Basic(fetch = FetchType.LAZY)
    private String password;

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "profile_img")
    private String profileImg;

    @Column(name = "background_img")
    private String backgroundImg;

    @Column(name = "member_type")
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    @Column(name = "birthdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;

    @Column(name = "reg_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDate;

    @Column(name = "mod_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;

    public MemberMaster() {}
}