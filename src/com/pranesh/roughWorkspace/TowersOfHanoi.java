package com.pranesh.roughWorkspace;

/**
 * Created by saip92 on 7/28/2017.
 */
public class TowersOfHanoi {

    public static void main(String[] args) {
        doTowers(3 , 'A', 'B','C');
    }

    public static void doTowers(int topN, char source, char inter, char dest){
        if(topN == 1){
            //Moving from source to destination in case of a single disk
            System.out.println("Disk 1 from: " + source +", to: " + dest);
        }else{
            //System.out.println("Step 1: Moving Disks: " + (topN - 1) + " from: " + source +" to: "+ dest);
            //#1 to move topN-1 disks from source to intermediate tower
            doTowers(topN - 1, source, dest, inter);

            System.out.println("Disk " + topN + " from " + source +" to " + dest);

            //#2 to move remaining disks from intermediate tower to destination tower
            doTowers(topN-1, inter, source, dest);

        }
    }
}
