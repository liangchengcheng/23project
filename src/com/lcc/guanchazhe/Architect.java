package com.lcc.guanchazhe;

/**
 * 具体的求职者
 */
public class Architect implements ITalent{

    @Override
    public void newJob(String job) {
        System.out.print("求职者获得新的职位"+job);
    }
}
