package code._4_student_effort._6_package_spiral;

public class MatrixSpiral
{
    public static void main(String[] args)
    {
        Integer [][]v=new Integer[4][4];
        v[0][0]=0;
        v[0][1]=1;
        v[0][2]=2;
        v[0][3]=3;
        v[1][0]=4;
        v[1][1]=5;
        v[1][2]=6;
        v[1][3]=7;
        v[2][0]=8;
        v[2][1]=9;
        v[2][2]=10;
        v[2][3]=11;
        v[3][0]=12;
        v[3][1]=13;
        v[3][2]=14;
        v[3][3]=15;
        afisareNormala(v);
        System.out.println("-------------------");
        afisareSpirala(v);
    }
    public static void afisareSpirala(Integer [][] v)
    {
        boolean ok=true;
        Integer n=v.length;
        Integer index=0;
        while(ok)
        {
            ok=false;
            for(int j=index;j<n-index;j++)
            {System.out.print(v[index][j]+" ");
                ok=true;}
            for(int i=index+1;i<n-index-1;i++)
            { System.out.print(v[i][n-index-1]+" ");
                ok=true;}
            for(int j=n-index-1;j>=index;j--)
            {System.out.print(v[n-index-1][j]+" ");
                ok=true;}
            for(int i=n-index-2;i>=index+1;i--)
            {System.out.print(v[i][index]+" ");
                ok=true;}
            index++;
        }
    }
    public static void afisareNormala(Integer [][] v)
    {
        for(int i=0;i<v.length;i++)
        {
            for(int j=0;j<v.length;j++)
                System.out.print(v[i][j]+ " ");
            System.out.println("");
        }
    }
}
