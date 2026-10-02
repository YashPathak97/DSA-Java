//LINEAR SEARCH

import java.util.*;
public class LinearSearch
{
    public static int linearsearch(int num[],int key)
    {
        for(int i=0;i<5;i++)
        {
            if(key==num[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num[]={2,4,6,8,10};
        int key=8;
        int index=linearsearch(num,key);
        if(index==-1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("key is at index "+index);
        }
    }
}