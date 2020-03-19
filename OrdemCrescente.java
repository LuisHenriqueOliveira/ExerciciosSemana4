import javax.swing.*;

public class OrdemCrescente
{
   public static void main(String[] args)
   {
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      
      if(n1 < n2 && n1 < n3)
      {
         if(n2 < n3)
         {
            JOptionPane.showMessageDialog(null, n1+""+ n2+""+ n3);
         }
         else
         {
            JOptionPane.showMessageDialog(null, n1+""+ n3+""+ n2);
         }
      }
      else if(n2 < n1 && n2 < n3)
      {
         if(n1 < n3)
         {
            JOptionPane.showMessageDialog(null, n2 +""+  n1 +""+ n3);
         }
         else
         {
            JOptionPane.showMessageDialog(null, n2 +""+  n3 +""+ n1);
         }
      }
      else if(n3 < n1 && n3 < n2)
      {
         if(n2 < n1)
         {
            JOptionPane.showMessageDialog(null, n3+""+ n2+""+ n1);
         }
         else
         {
            JOptionPane.showMessageDialog(null, n3+""+ n1+""+ n2);
         }
      }
      else
      {
         JOptionPane.showMessageDialog(null, "os numeros são iguais");
      }
    
   }
}
