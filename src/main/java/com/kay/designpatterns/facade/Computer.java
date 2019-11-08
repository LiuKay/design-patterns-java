package com.kay.designpatterns.facade;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
class Computer {

    private static final long BOOT_ADDRESS = 1000;
    private static final long BOOT_SECTOR = 1;
    private static final int SECTOR_SIZE = 1024;
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
