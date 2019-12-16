package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.CampaignData;
import com.homework.hsqldb.spring.model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Alex on 24.04.2018.
 */
@RestController
@RequestMapping("/summaries")
public class SummaryServiceController {

    @Autowired
    private SummaryService service;
    private static final Logger log = LoggerFactory.getLogger(SummaryServiceController.class);

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<? extends Object> list(@RequestBody CampaignData data) {
        Object response;
        try {
            response = service.listCampaigns(data);
        } catch (Exception e) {
            response = new ErrorSimpleView(e);
        }
        return ResponseEntity.ok().body(response);
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
