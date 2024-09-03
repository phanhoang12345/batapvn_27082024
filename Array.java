
package array;


public class Array {

    public static void main(String[] args) {
      int[] number = new int[10];
        System.out.print("number");
        for (int i=0;i<10; i++){
            System.out.print(number[i]+"");
        }
           number[0] = 27;
           number[3]=-6;
          System.out.print("sau ghi gan gia tri");
          for(int i=0; i<10;i++){
              System.out.println(number[i]+" ");
          }
          System.out.print(" ");
          if (number[3]<0){
              System.out.print("\nElement 3 is negatlive.");
          }
      }
    }
    

