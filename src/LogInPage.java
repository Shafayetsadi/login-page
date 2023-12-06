
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;
import javax.swing.border.LineBorder;

/*
 * @author Shafayet Sadi
 */



public class LogInPage extends JFrame{



    JButton login;
    JTextField tf;
    Font font, eceFont, logFont;
    JLabel userLabel, passLabel, title;
    Cursor cursor;
    JPasswordField passField;
    Container content;

    ImageIcon icon;

    int height = 720;
    int width = 480;


    Color c_1 = new Color(24, 111, 101);
    Color c_2 = new Color(33, 34, 45);
    Color c_3 = new Color(230, 144, 35);




    public LogInPage() {
        setTitle("Log In page");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("fire.png")));
        setIconImage(icon.getImage());
        System.out.println(System.getProperty("user.dir"));





        content = this.getContentPane();
        content.setLayout(null);
        content.setBackground(c_1);
        eceFont = new Font("Cooper Black", Font.BOLD, 32);
        font = new Font("Arial Black", Font.BOLD, 22);
        logFont = new Font("Forte", Font.BOLD + Font.ITALIC, 20);





        title = new JLabel("Welcome to trECEnto!");
        title.setFont(eceFont);
        title.setForeground(c_2);
        title.setBounds(50, 100, 600, 50);
        content.add(title);



        userLabel = new JLabel("Email:");
//        userLabel.setText("Username");
        userLabel.setFont(font);
        userLabel.setForeground(new Color(229, 210, 131));
        userLabel.setBounds(50, 200, 150, 50);
        content.add(userLabel);

        tf = new JTextField();
        tf.setBorder(new LineBorder(c_3, 5));
        tf.setFont(new Font("Arial", Font.BOLD, 16));
        tf.setBounds(200, 200, 250, 50);
        content.add(tf);

        passLabel = new JLabel("Password:");
        passLabel.setFont(font);
        passLabel.setForeground(new Color(229, 210, 131));
        passLabel.setBounds(50, 300, 150, 50);
        content.add(passLabel);

        passField = new JPasswordField();
        passField.setFont(font);
        passField.setBorder(new LineBorder(c_3, 5));
        passField.setBounds(200, 300, 250, 50);
        passField.requestFocus();
        content.add(passField);

        login = new JButton("LOGIN");
        login.setFont(logFont);
        login.setBackground(Color.ORANGE);
        login.setCursor(cursor);
        login.setBounds(width/2-75, 400, 150, 50);
        content.add(login);


        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = tf.getText();
                if(str.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter email.");
                }
                else{
                     JOptionPane.showMessageDialog(null, "Hello");
                }
            }
        });
        // Replaced with lambda
        login.addActionListener((ActionEvent event) -> {
            String username = tf.getText();
            String pass = passField.getText();

            if(username.equals("shafayet.sadi@gmail.com") && pass.equals("1234"))
            {
                JOptionPane.showMessageDialog(null, "Login successful");
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong password or email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            tf.setText("");
            passField.setText("");
        });
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        LogInPage MF = new LogInPage();
        MF.setVisible(true);
    }
}






