package code._4_student_effort.Pair_of_2;

public class Pair_of_2 {
    public int nr_of_pairs(int[] v)
    {
        int[] aux = new int[v.length];
        boolean exista1;
        boolean exista2;
        int nr = 0;
        int index = 0;
        for (int i = 0; i < v.length - 1; i++)
        {
            exista1 = false;
            for (int k = 0; k < aux.length; k++) {
                if (i == aux[k])
                    exista1 = true;
            }
            if (exista1 == false)
                for (int j = i + 1; j < v.length; j++)
                {
                    exista2=false;
                    for (int k = 0; k < aux.length; k++)
                        if (j == aux[k])
                            exista2 = true;
                    if(exista2==false)
                    {
                        if (v[i]+v[j]==0)
                        {
                            nr++;
                            aux[index] = i;
                            aux[index + 1] = j;
                            index = index + 2;
                        }
                    }
                 }
        }
        return nr;
    }
}
