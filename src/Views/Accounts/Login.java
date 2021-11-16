package Views.Accounts;

import Views.Admin;
import Views.style.GradientStyle;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static javax.swing.BorderFactory.createLineBorder;


public class Login {
    public Login() throws IOException {
        JFrame loginFrame=new JFrame("Sajilo Hotel | Login ");
        loginFrame.setVisible(true);
        loginFrame.setSize(1200,800);
        loginFrame.setDefaultCloseOperation(3);

        GradientStyle sPanel= new GradientStyle();

        loginFrame.getContentPane().add(sPanel);
        sPanel.setBounds(0,0,1200,800);

        JPanel imagePanel=new JPanel();
        imagePanel.setBounds(15,100,600,400);
        imagePanel.setOpaque(false);
        imagePanel.setLayout(new BoxLayout (imagePanel, BoxLayout.Y_AXIS));
        sPanel.add(imagePanel);

        JLabel headerLabel=new JLabel("<html><font size='10'color=white>Sajilo Hotel : </font></html>");
        headerLabel.setFont(new Font("Verdana", Font.PLAIN,10));
        imagePanel.add(headerLabel);

        imagePanel.add(Box.createRigidArea(new Dimension(5, 15)));
        Icon reservationIcon=new ImageIcon(new ImageIcon("./images/wallpaper2.jpg").getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT));
//        BufferedImage image = ImageIO.read(new File("./images/wallpaper.jpeg"));
        JButton wallpaperImage = new JButton(reservationIcon);
        imagePanel.add(wallpaperImage);
        Border blackline = createLineBorder(Color.black);
        JPanel loginFormPanel=new JPanel();
        loginFormPanel.setBounds(650,60,500,550);
        loginFormPanel.setOpaque(false);
        loginFormPanel.setBorder(blackline);
        loginFormPanel.setLayout(null);
        sPanel.add(loginFormPanel);

        JLabel loginLabel=new JLabel("<html><font size='10'color=white>Login : </font></html>");
        loginLabel.setFont(new Font("Verdana", Font.PLAIN,10));
        loginLabel.setBounds(200,10,150,100);
        loginFormPanel.add(loginLabel);

        JLabel usernameLabel=new JLabel("<html><font size='6' color=white>Username : </font></html>");
        usernameLabel.setFont(new Font("Verdana",Font.PLAIN,6));
        usernameLabel.setBounds(20,130,200,50);
        loginFormPanel.add(usernameLabel);

        JTextField usernameInput=new JTextField();
        usernameInput.setBounds(20,190,240,40);
        loginFormPanel.add(usernameInput);

        JLabel passwordLabel=new JLabel("<html><font size='6' color=white>Password : </font></html>");
        passwordLabel.setFont(new Font("Verdana",Font.PLAIN,6));
        passwordLabel.setBounds(20,250,200,50);
        loginFormPanel.add(passwordLabel);

        JPasswordField passwordIp=new JPasswordField();
        passwordIp.setBounds(20,310,240,40);
        loginFormPanel.add(passwordIp);

        JButton loginBtn=new JButton("Login");
        loginBtn.setBounds(200,400,100,40);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    loginFrame.dispose();
                    Admin admin=new Admin();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        loginFormPanel.add(loginBtn);

    }
}
