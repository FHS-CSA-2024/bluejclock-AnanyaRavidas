package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3,45);
        String test2Output = test2.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        System.out.println("Tick Test 1 Pre Tick - " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick Test 1 Post Tick - " + tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        System.out.println("Tick Test 2 Pre Tick - " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick Test 2 Post Tick - " + tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        System.out.println("Tick Test 3 Pre Tick - " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick Test 3 Post Tick - " + tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(23,59);
        System.out.println("Tick Test 4 Pre Tick - " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick Test 4 Post Tick - " + tickTest4.getTime());
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        System.out.println(" /n ");
        ClockDisplaySeconds test1seconds = new ClockDisplaySeconds();
        String test1Outputseconds = test1seconds.getTime();
        System.out.println("Empty Con. Test - " + test1Outputseconds);
        
        ClockDisplaySeconds test2seconds = new ClockDisplaySeconds(3,45,30);
        String test2Outputseconds = test2seconds.getTime();
        System.out.println("2 Arg. Con. Test - " + test2Outputseconds);
        
        ClockDisplaySeconds tickTest1seconds = new ClockDisplaySeconds(3,32,59);
        System.out.println("Tick Test 1 Pre Tick - " + tickTest1seconds.getTime());
        tickTest1seconds.timeTick();
        System.out.println("Tick Test 1 Post Tick - " + tickTest1seconds.getTime());
        
        ClockDisplaySeconds tickTest2seconds = new ClockDisplaySeconds(1,0,59);
        System.out.println("Tick Test 2 Pre Tick - " + tickTest2seconds.getTime());
        tickTest2seconds.timeTick();
        System.out.println("Tick Test 2 Post Tick - " + tickTest2seconds.getTime());
        
        ClockDisplaySeconds tickTest3seconds = new ClockDisplaySeconds(1,59,59);
        System.out.println("Tick Test 3 Pre Tick - " + tickTest3seconds.getTime());
        tickTest3seconds.timeTick();
        System.out.println("Tick Test 3 Post Tick - " + tickTest3seconds.getTime());
        
        ClockDisplaySeconds tickTest4seconds = new ClockDisplaySeconds(23,59,59);
        System.out.println("Tick Test 4 Pre Tick - " + tickTest4seconds.getTime());
        tickTest4seconds.timeTick();
        System.out.println("Tick Test 4 Post Tick - " + tickTest4seconds.getTime());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        ClockDisplay12Hour test1Hour12 = new ClockDisplay12Hour();
        String test1OutputHour12 = test1Hour12.getTime();
        System.out.println("Empty Con. Test - " + test1OutputHour12);
        
        ClockDisplay12Hour test2Hour12 = new ClockDisplay12Hour(3,45,"AM");
        String test2OutputHour12 = test2Hour12.getTime();
        System.out.println("2 Arg. Con. Test - " + test2OutputHour12);
        
        ClockDisplay12Hour tickTest1Hour12 = new ClockDisplay12Hour(3,32,"PM");
        System.out.println("Tick Test 1 Pre Tick - " + tickTest1Hour12.getTime());
        tickTest1Hour12.timeTick();
        System.out.println("Tick Test 1 Post Tick - " + tickTest1Hour12.getTime());
        
        ClockDisplay12Hour tickTest2Hour12 = new ClockDisplay12Hour(11,59,"PM");
        System.out.println("Tick Test 2 Pre Tick - " + tickTest2.getTime());
        tickTest2Hour12.timeTick();
        System.out.println("Tick Test 2 Post Tick - " + tickTest2Hour12.getTime());
        
        ClockDisplay12Hour tickTest3Hour12 = new ClockDisplay12Hour(11,59,"AM");
        System.out.println("Tick Test 3 Pre Tick - " + tickTest3Hour12.getTime());
        tickTest3Hour12.timeTick();
        System.out.println("Tick Test 3 Post Tick - " + tickTest3Hour12.getTime());
        
        ClockDisplay12Hour tickTest4Hour12 = new ClockDisplay12Hour(12,59,"PM");
        System.out.println("Tick Test 4 Pre Tick - " + tickTest4Hour12.getTime());
        tickTest4Hour12.timeTick();
        System.out.println("Tick Test 4 Post Tick - " + tickTest4Hour12.getTime());
        
    }
}
