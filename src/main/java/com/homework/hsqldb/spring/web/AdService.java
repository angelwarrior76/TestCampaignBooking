package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Ad;
import com.homework.hsqldb.spring.model.Campaign;

import java.util.Optional;

/**
 * Created by Alex on 24.04.2018.
 */
public interface AdService {

    int countAds(Campaign campaign);

    Ad createAd(Ad ad);

    void deleteAd(int id);

    Optional<Ad> getAdById(int id);

    Ad updateAd(int id, Ad ad);

}
