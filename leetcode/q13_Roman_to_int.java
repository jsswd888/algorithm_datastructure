class Solution {
    public int romanToInt(String s) {
        int transfromedInt = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if ((i+1)<s.length() && s.charAt(i+1) == 'V') {
                        transfromedInt += 4;
                        i++;
                        break;
                    } else if ((i+1)<s.length() && s.charAt(i + 1) == 'X') {
                        transfromedInt += 9;
                        i++;
                        break;
                    } else {
                        transfromedInt += 1;
                        break; 
                    }  
                case 'V':
                    transfromedInt += 5;
                    break;
                case 'X':
                    if ((i+1)<s.length() && s.charAt(i+1) == 'L') {
                        transfromedInt += 40;
                        i++;
                        break;
                    } else if ((i+1)<s.length() && s.charAt(i + 1) == 'C') {
                        transfromedInt += 90;
                        i++;
                        break;
                    } else {
                        transfromedInt += 10;
                        break;
                    }
                case 'L':
                    transfromedInt += 50;
                    break;
                case 'C':
                    if ((i+1)<s.length() && s.charAt(i+1) == 'D') {
                        transfromedInt += 400;
                        i++;
                        break;
                    } else if ((i+1)<s.length() && s.charAt(i + 1) == 'M') {
                        transfromedInt += 900;
                        i++;
                        break;
                    } else {
                        transfromedInt += 100;
                        break;
                    }
                case 'D':
                    transfromedInt += 500;
                    break;
                case 'M':
                    transfromedInt += 1000;
                    break;
                default:
                    break;
            }
        }
        //System.out.println(transfromedInt);
        return transfromedInt;
    }
}