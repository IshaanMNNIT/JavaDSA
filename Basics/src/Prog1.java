import java.util.*;
public class Prog1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s = in.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        int count=0;
        int i,j,temp1,l,a=0;
        String temp2;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                count++;
        }
        String words[]=new String[count];

        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                w+=s.charAt(i);
            else
            {
                words[a]=w;
                a++;
                w="";
            }

        }
        System.out.println("Given Sentence : ");
        for(i=0;i< words.length;i++)
        {
            System.out.print(words[i]+" ");
        }
        System.out.println("\nOutput Sentence : ");
        int length[] = new int[count];
        for(i=0;i<count;i++)
        {
            length[i]=words[i].length();
        }
        System.out.println();
        for(i=0;i<count;i++)
        {
            System.out.print(length[i]+" ");
        }
          for(i=0;i<count;i++)
          {
              for(j=0;j<count-1-i;j++)
              {
                  if(length[j]>length[j+1])
                  {
                      temp1=length[j];
                      length[j]=length[j+1];
                      length[j+1]=temp1;

                      temp2=words[j];
                      words[j]=words[j+1];
                      words[j+1]=temp2;

                  }

              }

          }

              for(i=0;i<count;i++)
              {
                  for(j=0;j<count-1;j++)
                  {
                      if(length[j]==length[j+1] && words[j].compareToIgnoreCase(words[j+1])>0)
                      {
                          temp1=length[j];
                          length[j]=length[j+1];
                          length[j+1]=temp1;

                          temp2=words[j];
                          words[j]=words[j+1];
                          words[j+1]=temp2;
                      }
                  }
              }
              System.out.println();
              for(i=0;i<count;i++)
              {
                  System.out.print(words[i]+" ");
              }
              System.out.println();
    }

}


