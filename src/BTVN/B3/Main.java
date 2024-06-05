package BTVN.B3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//        System.out.println("end");
//        stopWatch.stop();
//        System.out.println(stopWatch.display());
//        System.out.println("ElapsedTime: " + stopWatch.getElapsedTime());
        StopWatch sw = new StopWatch();
        sw.start();
        int[] numbers = new int[10000000];
        Random rand = new Random();

        for (int i = 0; i < 10000000; i++) {
            numbers[i] = rand.nextInt(10000000);
        }


        sw.stop();

        System.out.println(sw.getElapsedTime() + " milliseconds");
    }
}

