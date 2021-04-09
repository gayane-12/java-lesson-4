package oopExamples.main;

import oopExamples.model.TrainingCenter;

public class Init {
    public static void main(String[] args) {
        TrainingCenter newTrainingCenter = new TrainingCenter();

        newTrainingCenter.getTrainingCenterInfo();
        newTrainingCenter.setName("Code Room", "123456moderator");
        newTrainingCenter.setPhone("044444444", "123456admin");
        System.out.println();
        newTrainingCenter.getTrainingCenterInfo();

        System.out.println();
        newTrainingCenter.setCurrentCourse("Web Programming",40000,true,5,"Ani", "123456admin");
        newTrainingCenter.getCurrentCourse();

    }
}
