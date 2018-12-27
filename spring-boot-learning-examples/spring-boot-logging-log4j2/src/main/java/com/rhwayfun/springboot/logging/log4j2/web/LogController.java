package com.rhwayfun.springboot.logging.log4j2.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author happyxiaofan
 * @since 0.0.1
 */
@RestController
public class LogController {

    /* Logger */
    private static Logger log = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/now/{id}")
    @ResponseBody
    public LocalDateTime now(@PathVariable String id) {
        log.info("args:{}", id);
        return LocalDateTime.now();
    }

}
