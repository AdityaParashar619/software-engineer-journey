public class sumAndMultiply{
    public long sumAndmultiply(int n){
        long x=0;
        long sum=0;
        String s=String.valueOf(n);
        for(char c : s.toCharArray()){
            int digit=c-'0';
            if(digit!=0){
            x=x*10+digit;
            sum+=x;
            }
        }
        return x*sum;
    }
}