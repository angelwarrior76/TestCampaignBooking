package com.homework.hsqldb.spring.model;

import java.io.Serializable;

import javax.persistence.Convert;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AdId implements Serializable {

    private static final long serialVersionUID = 4702260095379136658L;

    private int adId;
    @Convert(converter = CampaignConverter.class)
    private Campaign campaign;

}
