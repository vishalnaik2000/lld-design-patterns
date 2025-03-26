package org.example.states;

import org.example.machine.GumballMachine;

public class EjectQuarterState implements GumballMachineState{
    GumballMachine machine;

    public EjectQuarterState(GumballMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You have already inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting your quarter. Pick it up from below");
        machine.setCurrentState(machine.getNoQuarterState());
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
