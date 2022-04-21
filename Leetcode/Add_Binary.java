class Solution {
    public String addBinary(String a, String b) {
        int num1 = 0;
        int num2 = 0;
        int rem = 0;
        int length=0;
        String ans = "";
        String ans1 = "";
        for(int i=a.length()-1;i>=0;i--){
            num1 = num1 + Character.getNumericValue(a.charAt(i)) * (int)Math.pow(2,length);
            length++;
        }
        length=0;
        for(int i=b.length()-1;i>=0;i--){
            num2 = num2 + Character.getNumericValue(b.charAt(i)) * (int)Math.pow(2,length);
            length++;
        }
        long sum = num1 + num2;
        if(sum != 0){
        while(sum!=0){
            rem = sum%2;
            ans = ans + Integer.toString(rem);
            sum = sum/2;
        }
        }
        else
            ans = "0";
        for(int i=ans.length()-1;i>=0;i--)
            ans1+=ans.charAt(i);
        return ans1;
    }
}
