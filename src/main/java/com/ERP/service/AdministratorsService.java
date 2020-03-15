package com.ERP.service;

import com.ERP.domain.Administrators;

public interface AdministratorsService {

    Administrators login(String AdministratorName, String password);
}
