import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class ListEtudiant extends JFrame implements ActionListener {
  private JLabel label1;
  private JPanel panel1,panel2,panel3;
  private JButton qt;
  private JTable table;
  private Vector<String> colonnes;
  private Vector <String> tuple;
  private Vector <Vector>  lignes;
  ResultSet rs = null;

public ListEtudiant(String classe,String filiere){
    ArrayList<Etudiant> etudiants = new ArrayList<>();
    try {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant", "root", "");

        String query = "SELECT * FROM etudiant";

        Statement sta = connection.createStatement();
        rs = sta.executeQuery(query);

        while (rs.next()){
            Etudiant e = new Etudiant();
            e.setNumeroCarte(rs.getString("carte"));
            e.setNom(rs.getString("nom"));
            e.setPrenom(rs.getString("prenom"));
            e.setClasse(new Classe(rs.getString("classe")));
            e.setFiliere(new Filiere(rs.getString("filiere")));
            if (e.getFiliere().getNom().equalsIgnoreCase(filiere) && e.getClasse().getNom().equalsIgnoreCase(classe)){
                etudiants.add(e);
            }

        }


    } catch (Exception exception) {
        exception.printStackTrace();
    }
   label1 = new JLabel("Liste Des Etudiant Du Niveau "+classe.toUpperCase()+" De La Filiere "+filiere.toUpperCase());
    panel1=new JPanel();
    panel1.add(label1);
    panel2=new JPanel();
    panel2.setBorder(new LineBorder(new Color(255, 255, 255), 0));
    colonnes = new Vector<String>();
    colonnes.add("Numéro Carte");
    colonnes.add("Nom");
    colonnes.add("Prénom");
    lignes = new Vector <Vector>();
    for (int i=0;i<etudiants.size();i++){
        tuple = new Vector<String>();
        Etudiant etudiant = etudiants.get(i);
        tuple.add(etudiant.getNumeroCarte());
        tuple.add(etudiant.getNom());
        tuple.add(etudiant.getPrenom());
        lignes.add(tuple);
    }
    SpringLayout sl_panel2 = new SpringLayout();
    panel2.setLayout(sl_panel2);
    table = new JTable(lignes,colonnes);
    table.setRowHeight(40);
    JScrollPane scrollPane = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setBorder(new LineBorder(UIManager.getColor("Table.highlight")));
    sl_panel2.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel2);
    sl_panel2.putConstraint(SpringLayout.WEST, scrollPane, 2, SpringLayout.WEST, panel2);
    sl_panel2.putConstraint(SpringLayout.SOUTH, scrollPane, 700, SpringLayout.NORTH, panel2);
    sl_panel2.putConstraint(SpringLayout.EAST, scrollPane, 2, SpringLayout.EAST,panel2);
    panel2.add(scrollPane);
    qt= new JButton("Quitter");
    panel3=new JPanel();
    panel3.setBackground(UIManager.getColor("Button.background"));
    panel3.add(qt);

    getContentPane().add(panel1,BorderLayout.NORTH);
    getContentPane().add(panel2,BorderLayout.CENTER);
    getContentPane().add(panel3,BorderLayout.SOUTH);

    setBounds(150, 140, 1000, 590);
    setResizable(false);
    setTitle("Liste Des Etudiant");

    qt.addActionListener(this);
    setVisible(true);

}

    public ListEtudiant(String l2, String classe_préparatoire, ArrayList<Etudiant> etudiants) {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource()==qt)
        {

            dispose();
        }

    }

}
