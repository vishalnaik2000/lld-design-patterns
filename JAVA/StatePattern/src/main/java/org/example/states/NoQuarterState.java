package org.example.states;

import org.example.machine.GumballMachine;

public class NoQuarterState implements GumballMachineState{
    GumballMachine machine;
    public NoQuarterState(GumballMachine machine){
        this.machine = machine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You have successfully inserted a quarter!");
        machine.setCurrentState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("First insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("First insert a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("First insert a quarter");
    }

}
