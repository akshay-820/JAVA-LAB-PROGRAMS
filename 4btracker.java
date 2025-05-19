import java.util.Scanner;

public class 4btracker{
    public static void main(String[] args){
        int n=5;
        Scanner sc= new Scanner(System.in);
        int[] scores= new int[n];
        System.out.println("Enter scores of student");
        for(int i=0;i<n;i++){
            System.out.print("Enter score of student"+(i+1)+" : ");
                scores[i]=sc.nextInt();
        }
        int sum=0;
        int maxScore=scores[0];
        for(int i=0;i<n;i++){
            sum+=scores[i];
            if (scores[i]>maxScore){
                maxScore=scores[i];
            }
        }    
        System.out.println("Stats is ");
        System.out.println("SUM OF SCORES : "+sum);
        System.out.println("Highest score : "+maxScore);
    }   
}
