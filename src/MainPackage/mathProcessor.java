package MainPackage;

import java.util.ArrayList;

public class mathProcessor  {

    /**Generic constructor for object
     *
     */
    public void mathProcessor(){
    }

    public void runprogram(){
        ArrayList<Integer> hostList = singleThreadMath();
        arrAdd t1 = new arrAdd(hostList, 0, 50000000);
        arrAdd t2 = new arrAdd(hostList, 50000001, 100000000);
        arrAdd t3 = new arrAdd(hostList, 100000001, 150000000);
        arrAdd t4 = new arrAdd(hostList, 150000001, 199999999);

        mathStorage.setStartTime();
        t1.run();
        t2.run();
        t3.run();
        t4.run();

    }

    public ArrayList<Integer> singleThreadMath(){
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        int maxCount = 200000000;
        int x = 0;
        int numStorage = 0;
        for( x=0 ; x < maxCount ; x++){
            numStorage = (int) (Math.random()*10);
            integerArrayList.add(numStorage);
            //System.out.println(x + " " + numStorage);
        }


        int addedNumbers =0;

        long startTime = System.nanoTime();
        for(x =0 ; x < maxCount; x++){
            addedNumbers = addedNumbers +integerArrayList.get(x);
        }
        long endTime = System.nanoTime();

        long finalTime = endTime- startTime;
        System.out.println("Final number is! " + addedNumbers);
        System.out.println("Final time is! " + finalTime);
        return integerArrayList;

    }
}
