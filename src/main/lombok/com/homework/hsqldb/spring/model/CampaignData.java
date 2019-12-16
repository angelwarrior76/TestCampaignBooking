package com.homework.hsqldb.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignData implements Serializable {

    private static final long serialVersionUID = -6077123317099946469L;

    private int pageNumber;
    private int pageSize;
    private Sort.Direction direction;
    private String name;
    private Status status;

}
