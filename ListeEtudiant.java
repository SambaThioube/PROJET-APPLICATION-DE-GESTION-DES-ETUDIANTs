import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class ListeEtudiant extends JFrame implements ActionListener {
  private JLabel label1;
  private JPanel panel1,panel2,panel3;
  private JButton qt;
  private JTable table;
  private Vector<String> colonnes;
  private Vector <String> tuple;
  private Vector <Vector>  lignes;
  ArrayList<Etudiant> etudiants = null;
public ListeEtudiant(String classe,String filiere, ArrayList<Etudiant> etudiants){
   label1 = new JLabel("Liste Des Etudiant Du Niveau "+classe+" De La Filiere "+filiere);
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
    table.setRowHeight(20);
    JScrollPane scrollPane = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setBorder(new LineBorder(UIManager.getColor("Table.highlight")));
    sl_panel2.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel2);
    sl_panel2.putConstraint(SpringLayout.WEST, scrollPane, 23, SpringLayout.WEST, panel2);
    sl_panel2.putConstraint(SpringLayout.SOUTH, scrollPane, 218, SpringLayout.NORTH, panel2);
    panel2.add(scrollPane);
    qt= new JButton("Quitter");
    panel3=new JPanel();
    panel3.setBackground(UIManager.getColor("Button.background"));
    panel3.add(qt);

    getContentPane().add(panel1,BorderLayout.NORTH);
    getContentPane().add(panel2,BorderLayout.CENTER);
    getContentPane().add(panel3,BorderLayout.SOUTH);

    setBounds(200,80,525,332);
    setResizable(false);
    setTitle("Liste Des Etudiant");

    qt.addActionListener(this);
    setVisible(true);

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
