import javax.swing.*;

public class AdicaoComSubtracao
{
   public static void main(String[] args)
   {
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
      int soma;
      
      soma = n1 + n2;
      
      if (soma >= 20)
      {
         JOptionPane.showMessageDialog(null, soma - 5);
      }
   }
}