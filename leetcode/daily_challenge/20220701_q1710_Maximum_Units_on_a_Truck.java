class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0, i = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        while(i < boxTypes.length && truckSize > 0){
            int availability = Math.min(truckSize, boxTypes[i][0]);
            res += availability * boxTypes[i][1];
            truckSize-= availability;
            i++;
        }

        return res;
    }
}