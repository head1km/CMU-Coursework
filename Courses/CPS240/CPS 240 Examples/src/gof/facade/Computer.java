/*
 * Computer
 * 
 * Author albee
 * 
 * $Id$
 * 
 * Oct 27, 2011
 * 
 *  From : http://en.wikipedia.org/wiki/Facade_pattern
 */
package gof.facade;

/**
 * Computer is a facade
 * @author albee
 *
 * @version $Id$
 */

public class Computer {
	final private int BOOT_ADDRESS = 12;
	final private int BOOT_SECTOR = 3425;
	final private int SECTOR_SIZE = 1024;
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
 
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
 
    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
