package com.ERP.service.impl;

import com.ERP.dao.AdministratorsDao;
import com.ERP.domain.Administrators;
import com.ERP.service.AdministratorsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service(value ="administratorsService")
public class AdministratorsServiceImpl implements AdministratorsService {

    @Resource
    private AdministratorsDao administratorsDao;

    public Administrators login(String administratorName, String password) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("administratorName", administratorName);
        map.put("password", password);
        return administratorsDao.findByNameAndPwd(map);
    }
}
