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
public class EncounterHistory {

//    make an array of type encounter
    private ArrayList<Encounter> encouterHistory;

//    in constructor initialize array
    public EncounterHistory() {
        this.encouterHistory = new ArrayList<>();
    }

//    getter to get array
    public ArrayList<Encounter> getEncouterHistory() {
        return encouterHistory;
    }

//    array setter
    public void setEncouterHistory(ArrayList<Encounter> encouterHistory) {
        this.encouterHistory = encouterHistory;
    }

//    this adds new record in the array, and returns empty encounter object.
    public Encounter addEncounter() {
        Encounter encounter = new Encounter();
        this.encouterHistory.add(encounter);
        return encounter;
    }
}
