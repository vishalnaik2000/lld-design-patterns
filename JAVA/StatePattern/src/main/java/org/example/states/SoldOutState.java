package org.example.states;

import org.example.machine.GumballMachine;

public class SoldOutState implements GumballMachineState{
    GumballMachine machine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out. Insert Gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("The machine is sold out. Insert Gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("The machine is sold out. Insert Gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("The machine is sold out. Insert Gumballs");
    }
    public void refill(int count){
        machine.setGumballs(count);
        machine.setCurrentState(machine.getNoQuarterState());
    }
}
