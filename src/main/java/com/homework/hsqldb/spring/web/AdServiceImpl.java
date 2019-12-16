package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Ad;
import com.homework.hsqldb.spring.model.Campaign;
import com.homework.hsqldb.spring.model.Platform;
import com.homework.hsqldb.spring.model.Status;

import com.homework.hsqldb.spring.repository.AdsRepository;
import com.homework.hsqldb.spring.repository.CampaignsRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * Created by Alex on 24.04.2018.
 */
@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdsRepository ads;

    @Override
    public int countAds(Campaign campaign) {
        return 0;
    }

    @Override
    public Ad createAd(Ad ad) {
        return ads.save(ad);
    }

    @Override
    public void deleteAd(int id) {
        ads.deleteById(id);
    }

    @Override
    public Optional<Ad> getAdById(int id) {
        return ads.findById(id);
    }

    @Override
    public Ad updateAd(int id, Ad ad) {
        return ads.save(new Ad(id, ad.getCampaign(), ad.getName(), ad.getAssetUrl(), ad.getPlatforms(), ad.getStatus()));
    }

}
