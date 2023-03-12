package com.brs.user.service.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Rating")
public class Rating{

    @Id
    private String ratingId;
    private String userId;
    private String hotelId;
    private Integer rating;
    private String feedBack;
}
