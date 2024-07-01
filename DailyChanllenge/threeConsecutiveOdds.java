class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int sumOdds =0;
        for(int i =0; i < arr.length ; i++){
            if(arr[i]%2==1){
                for(int j = i;j<arr.length;j++){
                    if(arr[j]%2==1){
                        sumOdds++;
                    }
                    else break;
                    if(sumOdds==3){
                        return true;
                    }
                }
                sumOdds=0;
            }
        }
        return false;
    }
}