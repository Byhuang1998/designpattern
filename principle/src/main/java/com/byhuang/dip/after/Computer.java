package com.byhuang.dip.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 10:51
 * @description TODO
 */
public class Computer {

    private CPU cpu;

    private HardDisk hardDisk;

    private Memory memory;

    public Computer(CPU cpu, HardDisk hardDisk, Memory memory) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void start() {
        cpu.process();
        hardDisk.save();
        memory.run();
    }
}
