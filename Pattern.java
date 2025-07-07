import java.util.Arrays;
import java.util.Scanner;

public class Pattern {
  
//     static int isPali(int num){
//            int rev=0;
//         while(num>0){
//         rev=rev*10+num%10;
//         num=num/10;
//         }
//         return rev;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int result=isPali(n);
//         // System.out.println(result);

//         if (result==n){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }

//     }
    
public static void isDup(int[] num,int n){
    Arrays.sort(num);
    for (int i=0;i<n-1;i++){
        if (num[i]!=num[i+1]){
            System.out.println("nit");

        }
    }
    System.out.println("yes");

}

public static void main (String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("size :");
int size=sc.nextInt();
System.out.println("elements :");
int[] arr=new int[size];
for (int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
isDup(arr,size);
// for (int i=0;i<size;i++){
//     System.out.print(arr[i]);
// }







    // for(int i=0;i<5;i++){
    //     for (int j=i+1;j<5;j++){
    //         System.out.print("* ");

    //     }
    //     System.out.println();
    // }
    // for (int i=0;i<5;i++){
    //     for (int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    //  for (int i=1;i<=5;i++){
    //     for (int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //  for (int i=1;i<=5;i++){
    //     for (int j=1;j<=5-i+1;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    //  for (int i=0;i<7;i++){
    //     for (int j=0;j>7-i+1;j++){
    //         System.out.print(" ");
    //     }
    //     for (int j=0;j<2*i+1;j++){
    //         System.out.print("*");
    //     }
    //     for (int j=0;j>7-i+1;j++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }





    
}

}


