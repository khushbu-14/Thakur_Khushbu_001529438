/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author khushbu
 */
public class Customer extends UserAccount {

    private String name;
    private String address;
    private String phone;

    public Customer(String name, String password, String phone, String address, String username) {
        this.name = name;
        setPassword(password);
        setUsername(username);
        this.phone = phone;
        this.address = address;
        setRole(new CustomerRole());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
