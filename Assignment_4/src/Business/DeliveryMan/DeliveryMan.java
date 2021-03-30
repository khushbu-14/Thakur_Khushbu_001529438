/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author khushbu
 */
public class DeliveryMan extends UserAccount {

    private String name;

    private String phone;

    public DeliveryMan(String name, String password, String phone, String username) {
        this.name = name;
        setPassword(password);
        setUsername(username);
        this.phone = phone;
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
        if (name == null) {
            return "";
        }
        return this.name;
    }
}
