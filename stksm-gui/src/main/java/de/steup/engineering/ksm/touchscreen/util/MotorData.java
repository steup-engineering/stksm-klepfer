/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.steup.engineering.ksm.touchscreen.util;

import de.steup.engineering.ksm.plc.entities.GuiInStationInterface;
import de.steup.engineering.ksm.plc.entities.GuiOutStationInterface;

/**
 *
 * @author sascha
 */
public class MotorData {

    private final String defaultCaption;
    private final GuiInStationInterface inData;
    private final GuiOutStationInterface outData;

    public MotorData(String defaultCaption, GuiInStationInterface inData, GuiOutStationInterface outData) {
        this.defaultCaption = defaultCaption;
        this.inData = inData;
        this.outData = outData;
    }

    public String getDefaultCaption() {
        return defaultCaption;
    }

    public boolean isCaptionEditable() {
        return inData.isCaptionEditable();
    }

    public String getCaption() {
        return inData.getCaption();
    }

    public void setCaption(String caption) {
        inData.setCaption(caption);
    }

    public String getEffCaption() {
        String caption = inData.getCaption();
        if (caption == null || caption.isEmpty()) {
            return defaultCaption;
        }
        return caption;
    }

    public GuiInStationInterface getInData() {
        return inData;
    }

    public GuiOutStationInterface getOutData() {
        return outData;
    }

}
