package com.example.spring.controller;

import com.example.spring.support.JApiResponse;
import com.example.spring.vo.PkMatchJoinConditionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 探活----勿删
 * 发布服务的时候，会利用该类的hello接口探活，来确定是否启动成功
 */
@Slf4j
@RestController
public class PingController {

    @RequestMapping(value = {"/hello"})
    public Map<String, Object> ping(HttpServletRequest request) {
        Map<String, Object> res = new HashMap<>();
        res.put("code", "SUCCESS");
        return res;
    }

    @RequestMapping(value = {"/hello2"})
    public JApiResponse<PkMatchJoinConditionVO> ping2(HttpServletRequest request) {
        return JApiResponse.success();
    }

    @RequestMapping(value = {"/hello3"})
    public PkMatchJoinConditionVO ping3(HttpServletRequest request) {
        return new PkMatchJoinConditionVO();
    }

    @RequestMapping(value = {"/list"})
    public List<PkMatchJoinConditionVO> list(HttpServletRequest request) {
        return new ArrayList<PkMatchJoinConditionVO>();
    }
}
