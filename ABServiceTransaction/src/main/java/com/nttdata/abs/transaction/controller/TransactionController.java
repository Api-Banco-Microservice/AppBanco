package com.nttdata.abs.transaction.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Long id) {

		Map<String, Object> result = new HashMap<>();

		try {
			Transaction transaction = service.findById(id);
			if (transaction == null) {
				result.put("message", "No existe un registro con el id indicado");
			} else {
				result.put("data", transaction);
				result.put("message", "Se ha encontrado un registro con el id indicado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(result);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createTransaction(@RequestBody Transaction trans) {

		Map<String, Object> result = new HashMap<>();

        try {
            LocalDateTime ldt = LocalDateTime.now();
            trans.setDateRegister(Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));

            Transaction transaction = service.createTransaction(trans);
            if (transaction == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            result.put("data", transaction);
            result.put("message", "Se ha creado correctamente");
        } catch (Exception e) {
			e.printStackTrace();
        }
		return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateTransaction(@PathVariable("id") Long id, @RequestBody Transaction trans) {

		Map<String, Object> result = new HashMap<>();

        try {
            trans.setId(id);
            Transaction transaction = service.updateTransaction(trans);
            if (transaction == null) {
				result.put("message", "No existe un registro con el id indicado");
            }
            result.put("data", transaction);
            result.put("message", "Se ha actualizado correctamente");
        } catch (Exception e) {
			e.printStackTrace();
        }
		return ResponseEntity.ok(result);
    }
    
}
