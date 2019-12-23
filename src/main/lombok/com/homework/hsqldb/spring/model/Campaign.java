package com.homework.hsqldb.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "campaigns")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign implements Serializable {

    private static final long serialVersionUID = -4155699811636975519L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "campaign_id")
    private int campaignId;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    @Column(name = "status")
    private Status status;

    public Campaign(int id) {
        this();
        this.campaignId = id;
    }

    public Campaign(String name, Date sdate, Date edate, Status status) {
        this();
        this.name = name;
        this.startDate = sdate;
        this.finishDate = edate;
        this.status = status;
    }

}
