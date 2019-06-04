package com.t9vg.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;

/**
 * @author Tianfusheng
 * @date 2018/12/22
 */
@Controller
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @GetMapping(value = {"/index/",""})
    public String index() {

        return "index";
    }

}
