public class Fibo {
    public static void main(String[]args){
        int i = 0;
        int sum = 0;
        int j =1;
        int n = 100;
        for (int k=2; k<n;++k){
            sum = i + j;
            System.out.printf("%d+%d = %d\n",i,j,sum);
            i=j;
            j=sum;


        };

    }

} 
