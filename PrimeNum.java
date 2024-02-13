public class PrimeNum {
    public static void main(String args[]){
        int num = 6;
        int flag = 0;
        if(num == 1 | num == 0){
            
             System.out.println("please try agin :)");
        }
        else{

            for(int i = 2; i<num+1; i++){
                if (num % i == 0 ) { 
                    System.out.println("is not prime:"+num);
                    flag = 1;
                    break;  
                };        
            };
            if (flag == 0){
                System.out.println("number is prime" + num);
            }
            
        }

    }
}
