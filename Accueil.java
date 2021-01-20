import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accueil extends JFrame {
    private final JPanel contentPane;
    private final JTextField classe;
    private final JTextField filiere;
    private final JButton btnRecherce;
    private final JButton btnAddEtudiant;
    private final JButton btnAddFiliere;

    public Accueil() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 140, 1000, 590);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblClasse = new JLabel("Niveau");
        lblClasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblClasse.setBounds(58, 152, 99, 43);
        contentPane.add(lblClasse);

        JLabel lblFiliere = new JLabel("Filiére");
        lblFiliere.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblFiliere.setBounds(280, 165, 99, 24);
        contentPane.add(lblFiliere);

        classe = new JTextField();
        classe.setFont(new Font("Tahoma", Font.PLAIN, 15));
        classe.setBounds(134, 161, 128, 30);
        contentPane.add(classe);
        classe.setColumns(10);

        filiere = new JTextField();
        filiere.setFont(new Font("Tahoma", Font.PLAIN, 15));
        filiere.setBounds(350, 161, 128, 30);
        contentPane.add(filiere);

        btnRecherce = new JButton("Rechercher");
        btnRecherce.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnRecherce.setBounds(499, 161, 159, 30);
        contentPane.add(btnRecherce);

        btnAddEtudiant = new JButton("Ajouter Etudiant");
        btnAddEtudiant.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAddEtudiant.setBounds(199, 80, 220, 30);
        contentPane.add(btnAddEtudiant);

        btnAddFiliere = new JButton("Ajouter Filière");
        btnAddFiliere.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAddFiliere.setBounds(499, 80, 220, 30);
        contentPane.add(btnAddFiliere);

        setVisible(true);

        btnRecherce.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                String nomClasse = classe.getText();
                String nomFiliere = filiere.getText();
                ListEtudiant listEtudiant = new ListEtudiant(nomClasse, nomFiliere);
            }
        });
        btnAddEtudiant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                CreerEtudiant formulaireEtudiant = new CreerEtudiant();
                formulaireEtudiant.setVisible(true);
            }
        });
        btnAddFiliere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
                new CreerFiliere();
            }
        });


    }
}
