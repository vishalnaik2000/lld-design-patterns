package org.example.states;

import org.example.machine.GumballMachine;

public class RefillState implements GumballMachineState{
    GumballMachine machine;
    public RefillState(GumballMachine gm){
        this.machine = gm;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Invalid operation");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Invalid operation");
    }

    @Override
    public void turnCrank() {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispense() {
        System.out.println("Invalid operation");
    }
}
