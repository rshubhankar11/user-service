package com.brs.user.service.entity;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "User")
public class User{
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String Name;
    @Column(name = "MailId")
    private String MailId;
    @Column(name = "Details")
    private String Details;

    @Transient
    private List<Rating> ratings;


}
