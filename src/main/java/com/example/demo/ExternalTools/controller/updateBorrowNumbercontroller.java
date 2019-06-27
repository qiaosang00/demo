package com.example.demo.ExternalTools.controller;

import com.example.demo.ExternalTools.entity.updateBorrowNumber;
import com.example.demo.ExternalTools.service.updateBorrowNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/update")
public class updateBorrowNumbercontroller {

    @Autowired
    updateBorrowNumberService updateBorrowNumberService;
    @RequestMapping(value="/loan_invoice_id",method = RequestMethod.GET)
    public boolean updateInvoice(String loan_invoice_id,int date){
        return updateBorrowNumberService.update_loan_invoice_id(loan_invoice_id,date);
    }
    
    @RequestMapping(value="/invoice_list",method = RequestMethod.GET)
    public List<updateBorrowNumber> sel(String loan_invoice_id){
        return updateBorrowNumberService.selBorrowNumber(loan_invoice_id);
    }
}
