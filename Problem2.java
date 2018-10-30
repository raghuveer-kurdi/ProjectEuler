public class Problem2{
    public static void main(String[] args) {
        int a = 1, b = 2, next = 0, sum = 2, n = 4000000;
        while(next < n){
            next = a + b;
            if(next % 2 == 0){
                sum += next;
            }
            a = b;
            b = next;
        }
        System.out.println(sum + "; "+ next);
    }
}