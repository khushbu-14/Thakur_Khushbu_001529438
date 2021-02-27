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
public class City {

    private String cityName;
    private ArrayList<Community> communityList;

    public City() {
        communityList = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Community addNewCommunity(String communityName) {
        Community community = new Community();
        community.setCommunityName(communityName);
        this.communityList.add(community);
        return community;
    }

    public Community searchCommunity(String communityName) {
        for (Community community : this.communityList) {
            if (community.getCommunityName().equals(communityName)) {
                return community;
            }
        }
        return null;
    }
}
