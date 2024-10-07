import java.util.*;
class ArrayListProg1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(10);
        int i;
        while(true)
        {
            System.out.println();
            System.out.println("Choose 1 : To input");
            System.out.println("Choose 2 : To Exit Input");
            i=in.nextInt();
            if(i==1) {
                System.out.println("Enter an element : ");
                list.add(in.nextInt());
            }
            else if(i==2){
                break;
            }
            else
            {
                System.out.println("Wrong Input");
                continue;
            }




        }
        System.out.println(list.contains(965)); // Checks if list contains 965
        System.out.println(list.size()); //size of given list
        //Output Way 1
        System.out.println(list);
        //Output Way 2
        for(i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");

        }
    }
}