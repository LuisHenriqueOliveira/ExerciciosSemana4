import javax.swing.*;

public class RaizQuadradaOuExponencial
{
   public static void main(String[] args)
   {
      int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero Positivo ou Negativo"));
      int calc;
      
      if (n > 0)
      {
         JOptionPane.showMessageDialog(null, Math.sqrt(n));
      }
      else
      {
         JOptionPane.showMessageDialog(null, Math.pow(n,2));
      }
   }
}