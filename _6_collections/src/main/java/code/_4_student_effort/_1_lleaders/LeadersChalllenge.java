package code._4_student_effort._1_lleaders;

import java.util.*;

public class LeadersChalllenge
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9,8,7,6 are leaders
        findLeaders(list);
        List<Integer> leadersList=new ArrayList<>();
        leadersList=findLeaders(list);
        afisare(leadersList);
    }
    public static List<Integer> findLeaders(List<Integer> list)
    {
        List<Integer> leadersList=new ArrayList<>();
        for(int i=0;i< list.size();i++)
        {
            boolean isLeader=true;
            for(int j=i+1;j<list.size();j++)
                if(list.get(i)<list.get(j))
                    isLeader=false;
            if(isLeader)
                leadersList.add(list.get(i));
        }
        return leadersList;
    }
    public static void afisare(List<Integer> list)
    {
        ListIterator<Integer> iterator1= list.listIterator();
        while(iterator1.hasNext())
            System.out.println(iterator1.next()+" is a leader");
    }
}
