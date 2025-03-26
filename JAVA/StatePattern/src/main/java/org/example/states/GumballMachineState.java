package org.example.states;

public interface GumballMachineState {
    //actions
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
/**
 * states will have behaviours
 */
/**
 * list of states
 * 1. NoQuarterState
 * 2. HasQuarterState
 * 3. SoldState
 * 4. WinnerState
 * 5. SoldOutState
 */
