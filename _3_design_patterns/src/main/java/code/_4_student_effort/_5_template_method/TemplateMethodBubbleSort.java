package code._4_student_effort._5_template_method;

public abstract class TemplateMethodBubbleSort
{
    public void sort(int [] v)
    {
        for(int i=0;i<v.length-1;i++)
            for(int j=i+1;j<v.length;j++)
                if(compara(v[i],v[j]))
                {
                    int aux;
                    aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
    }
    public abstract boolean compara(int a,int b);
}
