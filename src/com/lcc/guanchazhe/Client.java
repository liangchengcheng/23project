package com.lcc.guanchazhe;

public class Client {

    public static void main(String[] args) {
        ITalent juniorEngineer = new JuniorEngineer();
        ITalent seniorEngineer = new SeniorEngineer();
        
        ITalent architect = new Architect();

        AbstractHR subject = new HeadHunter();
        subject.addTalent(juniorEngineer);
        subject.addTalent(seniorEngineer);
        subject.addTalent(architect);

        subject.publishJob("Top 500 big data position");
    }
}
