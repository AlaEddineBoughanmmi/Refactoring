package AbstractFactory;

import java.awt.*;

public class PC extends Computer {

    public PC(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }


    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}