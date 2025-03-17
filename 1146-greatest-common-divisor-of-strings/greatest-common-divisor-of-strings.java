class Solution {
    public int gcd(int a,int b){
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdlen = gcd(n1,n2);
        return str1.substring(0,gcdlen);
    }

}