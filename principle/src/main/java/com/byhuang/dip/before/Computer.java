package com.byhuang.dip.before;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 10:51
 * @description TODO
 */
public class Computer {

    private IntelCPU cpu;

    private XiJieHardDisk hardDisk;

    private KingstonMemory memory;

    public Computer(IntelCPU cpu, XiJieHardDisk hardDisk, KingstonMemory memory) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.memory = memory;
    }

    public IntelCPU getCpu() {
        return cpu;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void start() {
        cpu.process();
        hardDisk.save();
        memory.run();
    }
}
