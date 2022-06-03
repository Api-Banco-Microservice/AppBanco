package com.nttdata.abs.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.nttdata.abs.product.models.entity.Account;
import com.nttdata.abs.product.models.service.AccountService;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

	@Autowired(required=false)
	private AccountService service;
	

    @GetMapping("/findAll")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> findAllAccounts(){
    	Map<String, Object> result = new HashMap<>();

        try {
            List<Account> list = service.findAll();
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
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Integer id) {
    	Map<String, Object> result = new HashMap<>();

		try {
			Account transaction = service.findById(id);
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
    public ResponseEntity<Map<String, Object>> createAccount(@RequestBody Account account) {
    	Map<String, Object> result = new HashMap<>();

        try {
            Account account2 = service.createClient(account);
            if (account2 == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            result.put("data", account2);
            result.put("message", "Se ha creado correctamente");
        } catch (Exception e) {
			e.printStackTrace();
        }
		return ResponseEntity.ok(result);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Map<String, Object>> updateAccount(@PathVariable("id") Integer id, @RequestBody Account account) {
    	Map<String, Object> result = new HashMap<>();

        try {
            account.setNumber(id);
            Account account2 = service.updateClient(account);
            if (account2 == null) {
				result.put("message", "No existe un registro con el id indicado");
            }
            result.put("data", account2);
            result.put("message", "Se ha actualizado correctamente");
        } catch (Exception e) {
			e.printStackTrace();
        }
		return ResponseEntity.ok(result);
    }
    
    @GetMapping("find/{id}")
    public Account findById_2(@PathVariable("id") Integer id) {
    	return service.findById(id);
    }
	
}
