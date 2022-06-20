class Solution {
    public int reverse(int x) {
        long reverse = 0;
        if(x == 0){return 0;}
        
        String[] temp = Integer.toString(x).split("");
        int len = temp.length;
        String[] dest = new String[len];
        
        if(temp[0].equals("-")){
            for(int i = 1; i < dest.length; i++){
                dest[len - 1] = temp[i];
                len--;
            }
        } else{
            for(int i = 0; i < temp.length; i++){
                dest[len - 1] = temp[i];
                len--;
            }  
        }
        
        if(dest[0] == null){
            dest[0] = "-";
        }
        reverse = Long.parseLong(String.join("", dest));
        
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE){
            return 0;
        } 
        
        return (int)reverse;
        
    }
}