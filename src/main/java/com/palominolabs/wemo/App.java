package com.palominolabs.wemo;

public class App {
    public static void main(String[] args) throws Exception {
        try (InsightSwitchFinder isf = new InsightSwitchFinder("WeMo Switch")) {
            isf.findSwitches();        
        InsightSwitch insightSwitch = isf.getSwitch("WeMo Switch");             
        if(insightSwitch.getState().equals("1"))
        	insightSwitch.switchOff();
        else
        	insightSwitch.switchOn();
    }
    }
}
