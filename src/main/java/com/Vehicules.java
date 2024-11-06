package com;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
public class Vehicules implements JavaDelegate{

    @Override
    public String toString() {
        return "Optimize []";
    }

    @Override
    public void execute(DelegateExecution arg0) throws Exception {
        System.out.println("Véhicule");
    }
    
}
