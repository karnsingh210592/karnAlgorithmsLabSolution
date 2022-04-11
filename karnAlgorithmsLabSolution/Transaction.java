import java.util.Scanner;

class Transaction {
    public static void main(String s[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of transaction");
        int size = scan.nextInt();
        int a[] = new int[size];
        for(int i=0; i< size; i++){
            System.out.println("Enter transaction " + (i+1));
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the value of target");
        int sum = 0;
        int target = scan.nextInt();
        Boolean flag = false;
        int index = 0;
         for(int i=0; i< size; i++){
           sum += a[i];
           if(sum >=target)
           {
                flag = true;
                index = i;
                break;
           }
         }
         if(flag){
             System.out.println("Target achieved in " + (index+1));
         }else{
              System.out.println("Target not achieved");
         }
    }
}