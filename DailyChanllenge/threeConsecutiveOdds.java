class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int sumOdds =0;
        for(int i =0; i < arr.length ; i++){
            if(arr[i]%2==1)
                sumOdds++;
            else sumOdds=0;
            if(sumOdds==3)
                return true;

        }
        return false;
    }
}