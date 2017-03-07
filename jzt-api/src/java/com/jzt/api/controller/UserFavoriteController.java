package com.jzt.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzt.api.controller.base.BaseController;
import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.service.MyService;

/**
 * Created by wanghuan on 07/03/2017.
 */

@Controller
@RequestMapping("/rest/{version}/my")
public class UserFavoriteController extends BaseController {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/favorite/list/{id}")
    @ResponseBody
    public Map<String, Object> query(@PathVariable String id){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            List<AppUserFavorite> favorite = myService.favoriteList(id);

            data.put("favorite", favorite);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

    @RequestMapping(value = "/favorite/platform/bank/list/{uid}")
    @ResponseBody
    public Map<String, Object> bankList(@PathVariable String uid){

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            Map<String, Object> data = new HashMap<String, Object>();

            List<UserAttentionPlatform> bank = myService.bankList(uid);

            data.put("bank", bank);
            result.put("data", data );
            result.put("res", "0");
            result.put("message", "Success");
        } catch (Exception e) {
            result.put("res", "1");
            result.put("message", "Error-"+e.getMessage());
        }

        return result;
    }

}
