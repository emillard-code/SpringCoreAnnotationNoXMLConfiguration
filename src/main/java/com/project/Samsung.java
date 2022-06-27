package com.project;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

    @Autowired
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Octa Core, 4GB Ram, 12 MP Camera");
        cpu.process();
    }

}