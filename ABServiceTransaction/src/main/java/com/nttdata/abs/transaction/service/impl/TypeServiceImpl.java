package com.nttdata.abs.transaction.service.impl;

import java.util.List;

import com.nttdata.abs.transaction.entity.Type;
import com.nttdata.abs.transaction.repository.TypeRepository;
import com.nttdata.abs.transaction.service.TypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository repository;

    @Override
    public List<Type> findAll() {
        return repository.findAll();
    }

    @Override
    public Type findById(int id) {
        return repository.findById(id).orElse(null);
    }
    
}
