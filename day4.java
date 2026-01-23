import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// // loops practise in java 
// System.out.println("enter number of pattern");
// int n = sc.nextInt();
// //outer loop 
// for(int i =1; i <=n; i++){
//     // inner loop
// for(int j=1; j<=i;j++){
//     System.out.print("*");
// }
// System.out.println();
// }


// inverted half triangle pyramid
// System.out.println("enter number of pattern");
// int n = sc.nextInt();
// //outer loop 
// for(int i =n; i>=1; i--){
//     // inner loop
// for(int j=1; j<=i;j++){
//     System.out.print("*");
// }
// System.out.println();
// }

  //Reactangle pattern in java
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of rows");
//         int n = sc.nextInt();
//         System.out.println("enter number of column");
//         int m = sc.nextInt();


// //outer loop
// for(int i = 1; i<=n;i++){
//     //inneer loop
//     for(int j=1;j<=m;j++ ){
//         System.out.print("* ");
//     }
//  System.out.println();
   
// }



//         System.out.println("enter number of rows");
//         int n = sc.nextInt();
//         System.out.println("enter number of column");
//         int m = sc.nextInt();
// // outer loop 
// for(int i=1; i<=n;i++){
//     // inner loop
//     for(int j= 1;j<=m;j++){
// if ( i ==1||j==1||i==n||j==m) {
//     System.out.print("*  ");
// }
// else{
//     System.out.print("   ");
// }
//     }
//     System.out.println();
// }
// pyramid pattern 
int n=sc.nextInt();
//outer loop
for(int i=1; i<=n; i++){
    //inner loop for space
    for(int s=1; s<=n-i; s++){
        System.out.print(" ");
    }
        // inner loop for star
    for(int j=1; j<= 2*i-1;j++){
     System.out.print("*");
}
System.out.println();
    }

    //lower part pyramid pattern
   for(int i=n-1; i>=1; i--){
    //inner loop for space
    for(int s=1; s<=n-i; s++){
        System.out.print(" ");
    }
        // inner loop for star
    for(int j=1; j<= 2*i-1;j++){
     System.out.print("*");
}
System.out.println();
}
    





























}
    }
    

