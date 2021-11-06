package code._4_student_effort.Pair_of_3;

public class Pair_of_3
{
    public int nr_of_pairs(int [] v)
    {
        int nr=0;
        int index=0;
        int [] aux=new int[v.length];
        for(int i=0;i<v.length-2;i++)
            for(int j=i+1;j<v.length-1;j++)
                for(int k=j+1;k<v.length;k++)
                {
                    boolean exista=false;
                    for(int l=0;l<aux.length;l++)
                        if(i==aux[l]||j==aux[l]||k==aux[l])
                            exista=true;
                    if(exista==false&&(v[i]+v[j]+v[k]==0))
                    {
                        nr++;
                        aux[index]=i;
                        aux[index+1]=j;
                        aux[index+2]=k;
                        index=index+3;
                        break;
                    }
                }
        return nr;
    }
}
