import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreerFiliere extends JFrame {
    private JPanel contentPane;
    private JTextField filiere;
    private JButton btnAdd;
    public CreerFiliere(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 140, 1000, 590);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Nouvelle Filière");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblFiliere = new JLabel("Nom de la filiere :");
        lblFiliere.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFiliere.setBounds(108, 152, 919, 43);
        contentPane.add(lblFiliere);

        filiere = new JTextField();
        filiere.setFont(new Font("Tahoma", Font.PLAIN, 20));
        filiere.setBounds(310, 152, 138, 35);
        contentPane.add(filiere);
        filiere.setColumns(10);

        setVisible(true);

        btnAdd = new JButton("Ajouter");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAdd.setBounds(455, 152, 123, 34);
        contentPane.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nom  = filiere.getText();
                try {

                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant", "root", "");

                    String query = "INSERT INTO filiere values(0,'" + nom + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x== 0) {
                        JOptionPane.showMessageDialog(btnAdd, "Cette filiere existe déja dans la base de données");
                    } else {
                        JOptionPane.showMessageDialog(btnAdd,
                                "Vous avez ajouté la filiére : "+nom.toUpperCase());
                    }

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
}
