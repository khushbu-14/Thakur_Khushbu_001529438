/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class Community {

    private String communityName;
    private int zipcode;
    private ArrayList<House> houseList;

    public Community() {
        houseList = new ArrayList<>();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public House addNewHouse() {
        House house = new House();
        this.houseList.add(house);
        return house;
    }

    public House searchHouse(String houseNo) {
        for (House house : this.houseList) {
            if (house.getHouseNo().equals(houseNo)) {
                return house;
            }
        }
        return null;
    }
}
