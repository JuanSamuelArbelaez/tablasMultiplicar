package tablas;

import javax.swing.JOptionPane;

public class Tablas
{
    public static void main(String[] args)
    {
        imprimir(tablas());
    }
    
    public static void imprimir(String n)
    {
        JOptionPane.showMessageDialog(null, n);
    }
    
    public static String tablas()
    {
        String cad="";
        int i, n, a;
        
        for(i=10; i<=20; i++)
        {
            cad+=("Tabla del "+i+" : "+"\n");
            for(n=1; n<=10; n++)
            {
                a=n*i;
                cad+=" "+i+" * "+n+" = "+a+"\n";
            }
            cad+="\n\n";
        }
        return cad;
    }
}