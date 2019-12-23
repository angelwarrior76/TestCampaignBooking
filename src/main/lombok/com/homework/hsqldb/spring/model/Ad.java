package com.homework.hsqldb.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.homework.hsqldb.spring.utils.CampaignDeserializer;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ads")
@IdClass(AdId.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad implements Serializable {

    private static final long serialVersionUID = 8117713037664333649L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ad_id")
    private int adId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campaign_id")
    @Convert(converter = CampaignConverter.class)
    private Campaign campaign;

    @Column(name = "name")
    private String name;

    @Column(name = "asset_url")
    private String assetUrl;

    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "platforms")
    private List<Platform> platforms;

    @Column(name = "status")
    private Status status;

    public Ad(Campaign campaign, String name, String url, List<Platform> platforms, Status status) {
        this();
        this.campaign = campaign;
        this.name = name;
        this.assetUrl = url;
        this.platforms = platforms;
        this.status = status;
    }

}
