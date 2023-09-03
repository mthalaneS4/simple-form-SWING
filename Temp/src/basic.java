import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic extends JFrame {
   // JFrame frame1 = new JFrame("Welcome");
    JLabel Name = new JLabel("NAME: ");
    JLabel Surname = new JLabel("SURNAME: ");
     JTextField txtName = new JTextField();
     JTextField txtsurname = new JTextField();
     JCheckBox Nextwork = new JCheckBox("Network");
     JCheckBox Java = new JCheckBox("Java");
     JCheckBox Os = new JCheckBox("OS");
     JRadioButton Male = new JRadioButton("Male");
     JRadioButton Female = new JRadioButton("Female");

    JButton Add = new JButton("ADD");
     basic(){
         setLayout(null);
         setBounds(30,40,420,300);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         //
         Name.setBounds(10,20,180,25);
         Name.setFont(new Font(null,Font.PLAIN,25));
         txtName.setBounds(150,20,150,25);
         //
         Surname.setBounds(10,60,180,25);
         Surname.setFont(new Font(null,Font.PLAIN,25));
         txtsurname.setBounds(150,60,150,25);
         //
         Nextwork.setBounds(10,100,120,30);
         Java.setBounds(10,120,120,30);
         Os.setBounds(10,140,120,30);
         //
         Male.setBounds(10,180,100,30);
         Female.setBounds(180,180,100,30);
         //
         Add.setBounds(10,220,150,25);
//adding to the frame
         add(Name);
                 add(Surname);
                 add(txtName);
                 add(txtsurname);
                 add(Nextwork);
                 add(Java);
                 add(Os);
                 add(Male);
                 add(Female);
                 add(Add);

                 Add.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         String gname = txtName.getText();
                         String gsurname = txtsurname.getText();
                         boolean lnetwork = Nextwork.isSelected();
                         boolean ljava = Java.isSelected();
                         boolean los = Os.isSelected();
                         String choose = Male.isSelected()? "Male": "Female";
                         if(Male.isSelected()) Female.disable();

                         String courses = "";
                         if(lnetwork){
                             courses = courses + Nextwork.getText() + "\n";
                         } if(ljava){
                             courses = courses + Java.getText() + "\n";
                         } if(los){
                             courses = courses + Os.getText() + "\n";
                         }
                         String reslut = "your name: "+gname+"\n"
                                 +"your surname: "+gsurname+"\n"
                                 +courses
                                 +"gender: "+choose;
                         JOptionPane.showMessageDialog(basic.this, reslut);
                     }
                 });
     }
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new basic();
             }
         });
    }
}