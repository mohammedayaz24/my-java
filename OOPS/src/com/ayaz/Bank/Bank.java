package com.ayaz.Bank;


class Account{
    public String name;
    protected String email;
    private String password;

    public String getpassword(){
        return this.password;
    }

    public void setpassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Mohammed Ayaz";
        a1.email = "mohammedayaz2411@gmail.com";
        a1.setpassword("abcd");
        System.out.println(a1.getpassword());
    }

}
