package com.homework.hsqldb.spring.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AdId implements Serializable {

    private static final long serialVersionUID = 4702260095379136658L;

    private int adId;
    private int campaignId;

}
