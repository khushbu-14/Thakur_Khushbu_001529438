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
public class VitalSignHistory {

    ArrayList<VitalSigns> history;

    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }

    public VitalSigns addNewVitals() {
        VitalSigns vitals = new VitalSigns();
        this.history.add(vitals);
        return vitals;
    }
}
