package com.example.experiment03.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Address address;
    @Column(columnDefinition = "timestamp not null default current_timestamp",insertable = false,updatable = false)
    private LocalDateTime insertTime;
    public UserAddress(User u,Address a)
    {
        this.address=a;
        this.user=u;
    }
}
