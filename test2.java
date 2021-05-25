import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of boys");
        int m = sc.nextInt();
        System.out.println("Enter number of girls");
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        System.out.println("Enter entries for girls ages");
        for (int i=0; i<arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter entries for boys ages");
        for (int i=0; i<arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i<arr1.length; i++){
            for (int j = 0; j<arr2.length; j++) {
                if(arr1[i]==arr2[j])
                System.out.println(arr1[i]+ " ");
		i++;
		j++;
            }
        }
}
}