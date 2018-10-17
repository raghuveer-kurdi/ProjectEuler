public class Problem1{
    public static void main(String[] args){
        int n = 1000, sum = 0; 
        for(int i = 1; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }
        System.out.println("Multiples of 3 or 5 below "+ n + " is : "+ sum);
    }
}
