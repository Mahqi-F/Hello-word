import javax.swing.JOptionPane; 
 public class yuan{
  public static void main(String[ ] args){ 
    int r;
    double p=3.1415926,s; 
    r=Integer.parseInt(JOptionPane.showInputDialog("请输入半径")); 
    s=p*r*r; 
    JOptionPane.showMessageDialog(null,"圆的面积是:"+s);    
            
  } 
  
 } 