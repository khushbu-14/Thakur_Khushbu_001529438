/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Encounter {

    private Date encounterTime;
    
    private VitalSigns vitalSigns;
    
    public Encounter(){
//        create vital sign object
        vitalSigns = new VitalSigns();
    }

    public Date getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(Date encounterTime) {
        this.encounterTime = encounterTime;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
