/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.steup.engineering.ksm.plc.retain;

import java.io.Serializable;

/**
 *
 * @author sascha
 */
public class RetainWhm implements Serializable {

    private static final long serialVersionUID = -4931475735887218287L;

    private int secs;
    private int meters;

    public void update(RetainWhm src) {
        if (src == null) {
            return;
        }

        secs = src.secs;
        meters = src.meters;
    }

    public int getMeters() {
        return meters;
    }

    public void setMeters(int workingMeters) {
        this.meters = workingMeters;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int workingSecs) {
        this.secs = workingSecs;
    }
}
