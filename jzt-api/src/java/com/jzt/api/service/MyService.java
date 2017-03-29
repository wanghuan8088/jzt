package com.jzt.api.service;

import com.jzt.api.domain.AppUserFavorite;
import com.jzt.api.domain.UserAttentionPlatform;

import java.util.List;

/**
 * Created by wanghuan on 07/03/2017.
 */
public interface MyService {

    List<AppUserFavorite> favoriteList(String userId);
    List<UserAttentionPlatform> bankList(String uid);
}
