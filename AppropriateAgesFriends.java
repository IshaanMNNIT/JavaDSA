import java.util.*;
public class AppropriateAgesFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ages[] = new int[in.nextInt()];
        int req = 0 ;
        int i,j;
        System.out.println("Enter the ages");
        for(i=0;i<ages.length;i++)
        {
            ages[i] = in.nextInt();
        }
        Arrays.sort(ages);
        for(i=ages.length-1;i>=0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(ages[j]<=(0.5*ages[i]+7) || ages[j]>ages[i] || (ages[j]>100 && ages[i]<100))
                {
                    continue;
                }
                else if(ages[j]==ages[i])
                {
                    req+=2;
                }
                else
                {
                    req++;
                }
            }
        }
        System.out.println("Friend Requests : " + req);
    }
}
