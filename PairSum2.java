import java.util.ArrayList;
//find if any pair in a sorted and rotated Araylist has target sum
public class PairSum2 {


    public static  boolean isPossible(ArrayList<Integer>list, int target){
        int n= list.size();
        int bp= -1;
        for(int i =0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while (lp!=rp){
            int sum = list.get(rp)+list.get(lp);
            if(sum==target){
                return true;
            }
            if(sum>target){
                rp=(n+rp-1)%n;
            }else {
                lp=(lp+1)%n;
            }
        }
        return false;
        }



        public static void main (String args[]){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
            System.out.println(isPossible(list, 16));


        }
}
