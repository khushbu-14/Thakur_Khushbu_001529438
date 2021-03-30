/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */

public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public void addRestaurant(Restaurant r) {
        restaurantList.add(r);
    }

    public void removeRestaurant(Restaurant r) {
        restaurantList.remove(r);
    }

}
