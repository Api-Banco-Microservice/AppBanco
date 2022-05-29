package com.nttdata.abs.transaction.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nttdata.abs.transaction.entity.Transaction;
import com.nttdata.abs.transaction.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {
        
    @Autowired
    private TransactionService service;

    @GetMapping("/findAll")
	@ResponseBody
    public ResponseEntity<Map<String, Object>> findAllTransaction(){

		Map<String, Object> result = new HashMap<>();

        try {
            List<Transaction> list = service.findAll();
            if (CollectionUtils.isEmpty(list)) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } else {
                result.put("list", list);
                result.put("message", "Se obtuvo " + list.size() + " transaccion(es)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return null;
    }

    @PostMapping("/create")
    public String createTransaction(@RequestBody Transaction transaction) {
        return null;
    }

    @PutMapping("/update/{id}")
    public String updateTransaction(@PathVariable("id") Long id, @RequestBody Transaction transaction) {
        return null;
    }
    
}
