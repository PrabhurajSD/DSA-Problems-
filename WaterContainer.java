import java.util.ArrayList;
import java.util.Collections;
//Find maximum water stored in the Arraylist
public class WaterContainer {
    public static  int maxWater(ArrayList<Integer>water){
        int maxVOl = 0;
        int i = 0;
        int j = water.size()-1;
        while(i<j){
            int tempVol = (j-i)*Math.min(water.get(i), water.get(j));
            maxVOl=Math.max(tempVol,maxVOl);
            if(water.get(i)<water.get(j)) {
                i++;
            } else{
                    j--;
                }
            }
        return maxVOl;
        }



    public static void main (String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWater(list));


    }
}
