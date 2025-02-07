public class Dice {

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.numRollsToTarget(2, 6, 7));
    }
}
class Solution {
    static long count = 0;
    public int numRollsToTarget(int n, int k, int target) {
        count = 0;
        recursion(n,k,target,0);
        return (int)count;
    }
    static void recursion(int n , int k, int t,long csum){
        if(n == 0){       
            if(csum == k){
                count++;
            }
            return;
        }

        for(int i = 1; i<=k; i++){
            csum += i;
            recursion(n-1,k,t,csum);
            csum -= i;    
        }        
    }
}
