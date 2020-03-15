package com.ERP.dao;

import com.ERP.domain.Administrators;

import java.util.Map;

public interface AdministratorsDao extends GenericDao<Administrators, Integer> {

    Administrators findByNameAndPwd(Map<String,String> map);
}
