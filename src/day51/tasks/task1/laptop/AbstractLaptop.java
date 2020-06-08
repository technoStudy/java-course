package day51.tasks.task1.laptop;

import day51.tasks.task1.AbstractDevice;
import day51.tasks.task1.DisplayType;

public abstract class AbstractLaptop extends AbstractDevice {

    private int RAM;
    private double screenSize;
    private DisplayType displayType;// 4K, HD, FHD, Retina


    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }
}
