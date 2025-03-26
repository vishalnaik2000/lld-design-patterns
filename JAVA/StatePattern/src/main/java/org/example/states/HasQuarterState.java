package org.example.states;

import org.example.machine.GumballMachine;

import java.util.Random;

public class HasQuarterState implements GumballMachineState{
    GumballMachine machine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }
    Random randomWinner = new Random(System.currentTimeMillis());

    @Override
    public void insertQuarter() {
        System.out.println("You already have one quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have successfully ejected your quarter. You shall receive it shortly.");
        machine.setCurrentState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have successfully turned the crank");
        int winner = randomWinner.nextInt(10);
        if( (winner == 0) && machine.getGumballs() > 1){
            //10% of the time go to the winner state
            machine.setCurrentState(machine.getWinnerState());
        }else{//90% of the times go to the gumballSold State
            machine.setCurrentState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Invalid Operation for HasQuarter state");
    }
}
