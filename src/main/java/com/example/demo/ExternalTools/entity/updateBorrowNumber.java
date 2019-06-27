package com.example.demo.ExternalTools.entity;

import java.util.Date;

public class updateBorrowNumber {
    private String loan_invoice_id;

    private  int date;
    
    private Date START_DATE;

    private Date PRE_REPAY_DATE;

    private Date GRANCE_DATE;

public Date getSTART_DATE() {
    return START_DATE;
}

public void setSTART_DATE(Date START_DATE) {
    this.START_DATE = START_DATE;
}

public Date getPRE_REPAY_DATE() {
    return PRE_REPAY_DATE;
}

public void setPRE_REPAY_DATE(Date PRE_REPAY_DATE) {
    this.PRE_REPAY_DATE = PRE_REPAY_DATE;
}

public Date getGRANCE_DATE() {
    return GRANCE_DATE;
}

public void setGRANCE_DATE(Date GRANCE_DATE) {
    this.GRANCE_DATE = GRANCE_DATE;
}

public String getLoan_invoice_id() {
    return loan_invoice_id;
}

public void setLoan_invoice_id(String loan_invoice_id) {
    this.loan_invoice_id = loan_invoice_id;
}

public int getDate() {
    return date;
}

public void setDate(int date) {
    this.date = date;
}

}
