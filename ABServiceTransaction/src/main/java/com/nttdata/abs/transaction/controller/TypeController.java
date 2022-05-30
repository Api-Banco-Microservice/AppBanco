package com.nttdata.abs.transaction.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nttdata.abs.transaction.entity.Type;
import com.nttdata.abs.transaction.service.TypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/type")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeController {

    @Autowired
    private TypeService service;

    @GetMapping("/findAll")
    public ResponseEntity<Map<String, Object>> findAllTypes() {

        Map<String, Object> result = new HashMap<>();

        try {
            List<Type> list = service.findAll();
            if (CollectionUtils.isEmpty(list))
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            else
                result.put("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Long id) {

        Map<String, Object> result = new HashMap<>();

        try {
            Type type = service.findById(id);
            if (type == null) {
                result.put("message", "No existe un registro con el id indicado");
            } else {
                result.put("data", type);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

}
