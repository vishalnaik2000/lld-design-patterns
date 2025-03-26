package org.example.states;

import org.example.machine.GumballMachine;

public class WinnerState implements GumballMachineState{
    GumballMachine machine;
    public WinnerState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Invalid operation!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Invalid operation!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Invalid operation!");
    }

    @Override
    public void dispense() {
        if(machine.getGumballs() > 0){
            machine.releaseGumball();
            if(machine.getGumballs() > 0){
                System.out.println("Heyy you are winner so you get 2 gumballs");
                machine.releaseGumball();
            }
        }
        if (machine.getGumballs() > 0) {
            machine.setCurrentState(machine.getNoQuarterState());
        } else {
            machine.refill(5);
        }
    }
}
