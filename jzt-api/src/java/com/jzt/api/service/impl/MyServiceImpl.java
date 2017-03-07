package com.jzt.api.service.impl;

import com.jzt.api.dao.AppUserFavoriteMapper;
import com.jzt.api.dao.UserAttentionPlatformMapper;
import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.UserAttentionPlatform;
import com.jzt.api.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanghuan on 07/03/2017.
 */
@Service
public class MyServiceImpl implements MyService {


    @Autowired
    private AppUserFavoriteMapper appUserFavoriteMapper;
    @Autowired
    private UserAttentionPlatformMapper userAttentionPlatformMapper;

    @Override
    public List<AppUserFavorite> favoriteList(String userId) {
        return appUserFavoriteMapper.selectByUserId(userId);
    }

    @Override
    public List<UserAttentionPlatform> bankList(String uid) {
        return userAttentionPlatformMapper.selectByUserId(uid);
    }
}
