package code._4_student_effort._7_my_hashhtable;

public class Challenge <K,V>
{
    public static void main(String[] args)
    {
        MyHashhTable<Integer,String> map=new MyHashhTableImpl<Integer,String>();
        map=createMap();
        afisare(map);
    }
    public static MyHashhTable<Integer,String> createMap()
    {
        Integer[] a=new Integer[]{1,2,3};
        String[] s=new String[]{"unu","doi","trei"};
        MyHashhTable<Integer,String> map=new MyHashhTableImpl<Integer,String>();
        map.put(a[0],s[0]);
        map.put(a[1],s[1]);
        map.put(a[2],s[2]);
        return map;
    }
    public static void afisare(MyHashhTable<Integer,String> map)
    {
        for(int i=0;i<map.size();i++)
            System.out.println(map.get(i+1));
    }
}
