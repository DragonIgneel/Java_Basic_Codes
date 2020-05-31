class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int m = flowerbed.length;
        int count = 0;
        for(int i=0; i<m; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                count++;
                flowerbed[i] = 1;
            }   
        }
        return n <= count;
    }
}