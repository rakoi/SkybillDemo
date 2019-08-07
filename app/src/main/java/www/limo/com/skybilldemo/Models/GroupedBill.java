package www.limo.com.skybilldemo.Models;

import www.limo.com.skybilldemo.Models.Bills;

public class GroupedBill {

    public String Token;
    public String date;
    public Bills bill;
    public String AccountNumber;
    public String amount;

    public GroupedBill(String token, String date, Bills bill, String accountNumber, String amount) {
        Token = token;
        this.date = date;
        this.bill = bill;
        AccountNumber = accountNumber;
        this.amount = amount;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bills getBill() {
        return bill;
    }

    public void setBill(Bills bill) {
        this.bill = bill;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
