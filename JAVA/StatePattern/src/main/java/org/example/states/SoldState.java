package org.example.states;

import org.example.machine.GumballMachine;

public class SoldState implements GumballMachineState{
    GumballMachine machine;

    public SoldState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Invalid operation in sold state");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Invalid operation in sold state");
    }

    @Override
    public void turnCrank() {
        System.out.println("you already turned Crank");
    }

    @Override
    public void dispense() {
        if(machine.getGumballs()>0){
            machine.releaseGumball();
        }else{
            System.out.println("Sorry, out of gumballs");
        }
        if(machine.getGumballs() > 0){
            machine.setCurrentState(machine.getNoQuarterState());
        }else{
            machine.refill(5);
        }
    }
}
