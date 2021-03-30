/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */

public class Menu {

    ArrayList<Dish> menuList = new ArrayList<Dish>();

    public ArrayList<Dish> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Dish> menuList) {
        this.menuList = menuList;
    }

    public void addDish(Dish d) {
        menuList.add(d);
    }

    public void removeDish(Dish d) {
        menuList.remove(d);
    }
}
