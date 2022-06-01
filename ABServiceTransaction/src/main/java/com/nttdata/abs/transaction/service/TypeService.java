package com.nttdata.abs.transaction.service;

import java.util.List;

import com.nttdata.abs.transaction.entity.Type;

public interface TypeService {

    public abstract List<Type> findAll();
    public abstract Type findById(Long id);
    
}
