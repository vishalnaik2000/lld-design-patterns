package org.example;


import org.example.machine.GumballMachine;
import org.example.states.GumballMachineState;
import org.example.states.NoQuarterState;

public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        int x = 15;
        while(x-- > 0){
            System.out.println("--------"+x+ "\n"+machine);
            machine.insertQuarter();
            machine.turnCrank();
        }
    }
}