package com.example.demo.ExternalTools.mapper;

import com.example.demo.ExternalTools.entity.updateBorrowNumber;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface updateBorrowNumberMapper {

    List<updateBorrowNumber> selBorrowNumber(String loan_invoice_id);
    boolean update_loan_invoice_id(String loan_invoice_id,int date);
    int update_loan_invoice(String loan_invoice_id,int date);
}

