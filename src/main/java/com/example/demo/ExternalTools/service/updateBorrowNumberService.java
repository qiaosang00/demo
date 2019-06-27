package com.example.demo.ExternalTools.service;

import com.example.demo.ExternalTools.entity.updateBorrowNumber;
import com.example.demo.ExternalTools.mapper.updateBorrowNumberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class updateBorrowNumberService {

    @Autowired
    updateBorrowNumberMapper updateBorrowNumberMapper;
    
public List<updateBorrowNumber> selBorrowNumber(String loan_invoice_id) {
    return updateBorrowNumberMapper.selBorrowNumber(loan_invoice_id);
}

public int update_loan_invoice(String loan_invoice_id,int date){
    return updateBorrowNumberMapper.update_loan_invoice(loan_invoice_id,date);
}

public boolean update_loan_invoice_id(String loan_invoice_id,int date){
    return updateBorrowNumberMapper.update_loan_invoice_id(loan_invoice_id,date);
}
}

