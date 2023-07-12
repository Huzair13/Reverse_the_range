import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        System.out.println("Enter the Start and end range");
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        //calling the reverse range function
        ReverseRange(array,size,start,end);

    }

    private static void ReverseRange(int[] array, int size,int start,int end) {
        while(start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("REVERSED ARRAY !!!!");
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}