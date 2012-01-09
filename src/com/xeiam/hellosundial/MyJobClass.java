package com.xeiam.hellosundial;

import com.xeiam.sundial.Job;
import com.xeiam.sundial.exceptions.JobInterruptException;

public class MyJobClass extends Job {

    @Override
    public void doRun() throws JobInterruptException {

        System.out.println("MyJobClass is executing.");
    }
}
