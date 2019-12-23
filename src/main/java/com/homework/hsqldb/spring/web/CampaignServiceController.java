package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Campaign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 24.04.2018.
 */
@RestController
@RequestMapping("/campaign")
public class CampaignServiceController {

    @Autowired
    private CampaignService service;
    private static final Logger log = LoggerFactory.getLogger(CampaignServiceController.class);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> get(@PathVariable("id") int id) {
        Object response;
        try {
            response = service.getCampaignById(id);
        } catch (Exception e) {
            response = new ErrorSimpleView(e);
        }
        return ResponseEntity.ok().body(response);
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> create(@RequestBody Campaign campaign) {
        Object response;
        try {
            response = service.createCampaign(campaign);
        } catch (Exception e) {
            response = new ErrorSimpleView(e);
        }
        return ResponseEntity.ok().body(response);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> update(@PathVariable("id") int id, @RequestBody Campaign campaign) {
        Object response;
        try {
            response = service.updateCampaign(id, campaign);
        } catch (Exception e) {
            response = new ErrorSimpleView(e);
        }
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable("id") int id) {
        service.deleteCampaign(id);
    }

    /**
     * Метод-обработчик неперехваченных исключений. Выводит соответствующее
     * сообщение в общий лог и на доступную консоль
     *
     * @param e экземпляр исключения
     */
    @ExceptionHandler(value = Exception.class)
    public void handleException(Exception e) {
        log.error("Ошибка при выполнении запроса", e);
    }

}
