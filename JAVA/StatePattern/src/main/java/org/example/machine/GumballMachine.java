package org.example.machine;

import org.example.states.*;

public class GumballMachine {
    Integer gumballs;
    GumballMachineState noQuarterState;
    GumballMachineState hasQuarterState;
    GumballMachineState soldOutState;
    GumballMachineState soldState;
    GumballMachineState winnerState;
    GumballMachineState currentState;
    GumballMachineState ejectQuarterState;

    public GumballMachine(int gumballs){
        this.gumballs = gumballs;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        this.ejectQuarterState = new EjectQuarterState(this);
        if(gumballs > 0){
            this.currentState = this.noQuarterState;
        }else{
            this.currentState = this.soldOutState;
        }
    }
    public void refill(int cnt){
        if(cnt > 0) gumballs = cnt;
        currentState = noQuarterState;
    }

    public void setCurrentState(GumballMachineState currentState) {
        this.currentState = currentState;
    }
    public void releaseGumball(){
        System.out.println("Releasing one gumball!");
        if(gumballs > 0) gumballs--;
    }


    public void insertQuarter() {
        this.currentState.insertQuarter();
    }


    public void ejectQuarter() {
        this.currentState.ejectQuarter();
    }

    public void turnCrank() {
        this.currentState.turnCrank();
        this.currentState.dispense();
    }


    public GumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(GumballMachineState noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public Integer getGumballs() {
        return gumballs;
    }

    public void setGumballs(Integer gumballs) {
        this.gumballs = gumballs;
    }

    public GumballMachineState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(GumballMachineState winnerState) {
        this.winnerState = winnerState;
    }

    public GumballMachineState getCurrentState() {
        return currentState;
    }

    public GumballMachineState getSoldState() {
        return soldState;
    }

    public void setSoldState(GumballMachineState soldState) {
        this.soldState = soldState;
    }

    public GumballMachineState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(GumballMachineState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public GumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(GumballMachineState hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "gumballs = " + gumballs +" }";
    }
}
