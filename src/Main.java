
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hdann
 */
public class Main extends javax.swing.JFrame {

    static ArrayList<Personal> personas = new ArrayList();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        dialogPersonal = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        id_personal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre_personal = new javax.swing.JTextField();
        edad_personal = new javax.swing.JSpinner();
        sexo_personal = new javax.swing.JComboBox<>();
        estado_personal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        altura_personal = new javax.swing.JTextField();
        peso_personal = new javax.swing.JTextField();
        ocupacion_personal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        horario_personal = new javax.swing.JTextField();
        tiempo_personal = new javax.swing.JTextField();
        sueldo_personal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dialogGerente = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        id_gerente = new javax.swing.JTextField();
        nombre_gerente = new javax.swing.JTextField();
        edad_gerente = new javax.swing.JSpinner();
        sexo_gerente = new javax.swing.JComboBox<>();
        estado_gerente = new javax.swing.JComboBox<>();
        altura_gerente = new javax.swing.JTextField();
        peso_gerente = new javax.swing.JTextField();
        usuario_gerente = new javax.swing.JTextField();
        contra_gerente = new javax.swing.JTextField();
        cargo_gerente = new javax.swing.JTextField();
        agregarGerente = new javax.swing.JButton();
        dialogObjeto = new javax.swing.JDialog();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        color_objeto = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        comboBoxPersonas = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botonPersonal = new javax.swing.JButton();
        botonGerente = new javax.swing.JButton();
        botonObjeto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTreePersonal = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTreeObjeto = new javax.swing.JTree();

        Modificar.setText("jMenuItem1");
        jPopupMenu1.add(Modificar);

        Eliminar.setText("jMenuItem1");
        jPopupMenu1.add(Eliminar);

        dialogPersonal.setBackground(new java.awt.Color(255, 255, 255));
        dialogPersonal.setMaximumSize(new java.awt.Dimension(580, 450));
        dialogPersonal.setModal(true);
        dialogPersonal.setPreferredSize(new java.awt.Dimension(580, 450));
        dialogPersonal.setSize(new java.awt.Dimension(580, 450));
        dialogPersonal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        dialogPersonal.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 37, -1));
        dialogPersonal.getContentPane().add(id_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 119, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        dialogPersonal.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 54, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad");
        dialogPersonal.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 54, -1));
        dialogPersonal.getContentPane().add(nombre_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 119, -1));
        dialogPersonal.getContentPane().add(edad_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 119, -1));

        sexo_personal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        dialogPersonal.getContentPane().add(sexo_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 119, -1));

        estado_personal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        dialogPersonal.getContentPane().add(estado_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 119, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estado");
        dialogPersonal.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 54, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        dialogPersonal.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 54, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Altura");
        dialogPersonal.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 54, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Peso");
        dialogPersonal.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 54, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ocupacion");
        dialogPersonal.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        dialogPersonal.getContentPane().add(altura_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 119, -1));
        dialogPersonal.getContentPane().add(peso_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 119, -1));
        dialogPersonal.getContentPane().add(ocupacion_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 119, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Horario");
        dialogPersonal.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Tiempo");
        dialogPersonal.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sueldo");
        dialogPersonal.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));
        dialogPersonal.getContentPane().add(horario_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 119, -1));
        dialogPersonal.getContentPane().add(tiempo_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 119, -1));
        dialogPersonal.getContentPane().add(sueldo_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 119, -1));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        dialogPersonal.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 141, 55));

        dialogGerente.setBackground(new java.awt.Color(255, 255, 255));
        dialogGerente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID");
        dialogGerente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 27, 43, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nombre");
        dialogGerente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 61, 56, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Edad");
        dialogGerente.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 122, 56, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Sexo");
        dialogGerente.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 184, 56, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Estado");
        dialogGerente.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 218, 56, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Altura");
        dialogGerente.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 252, 56, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Peso");
        dialogGerente.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 286, 56, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Usuario");
        dialogGerente.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 320, 56, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Contra");
        dialogGerente.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 354, 56, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Cargo");
        dialogGerente.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 382, 56, -1));
        dialogGerente.getContentPane().add(id_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 24, 102, -1));
        dialogGerente.getContentPane().add(nombre_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 58, 102, -1));
        dialogGerente.getContentPane().add(edad_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 119, 102, -1));

        sexo_gerente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        dialogGerente.getContentPane().add(sexo_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 181, 102, -1));

        estado_gerente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Divorciado", "Viudo" }));
        dialogGerente.getContentPane().add(estado_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 215, 102, -1));
        dialogGerente.getContentPane().add(altura_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 249, 102, -1));
        dialogGerente.getContentPane().add(peso_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 283, 102, -1));
        dialogGerente.getContentPane().add(usuario_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 317, 102, -1));
        dialogGerente.getContentPane().add(contra_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 351, 102, -1));
        dialogGerente.getContentPane().add(cargo_gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 382, 102, -1));

        agregarGerente.setText("Agregar");
        agregarGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarGerenteMouseClicked(evt);
            }
        });
        dialogGerente.getContentPane().add(agregarGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 162, 77));

        dialogObjeto.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zapatos", "Ropa", "Objetos de Casa" }));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Color");

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Descripcion");

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Marca");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Tamano");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Persona");

        color_objeto.setBackground(new java.awt.Color(0, 0, 0));
        color_objeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color_objetoMouseClicked(evt);
            }
        });

        comboBoxPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout dialogObjetoLayout = new javax.swing.GroupLayout(dialogObjeto.getContentPane());
        dialogObjeto.getContentPane().setLayout(dialogObjetoLayout);
        dialogObjetoLayout.setHorizontalGroup(
            dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogObjetoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogObjetoLayout.createSequentialGroup()
                        .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(color_objeto, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(comboBoxPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        dialogObjetoLayout.setVerticalGroup(
            dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogObjetoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(color_objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(dialogObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(comboBoxPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botonPersonal.setText("Personal");
        botonPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPersonalMouseClicked(evt);
            }
        });

        botonGerente.setText("Gerente");
        botonGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGerenteMouseClicked(evt);
            }
        });

        botonObjeto.setText("Objeto");
        botonObjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonObjetoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(botonPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(botonGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(botonObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personal");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Gerente");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Personal");
        treeNode1.add(treeNode2);
        jTreePersonal.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTreePersonal);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Objetos");
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zapatos");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ropa");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Objetos de Hogar");
        treeNode1.add(treeNode2);
        jTreeObjeto.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTreeObjeto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPersonalMouseClicked
        dialogPersonal.pack();
        dialogPersonal.setModal(true);
        dialogPersonal.setLocationRelativeTo(this);
        dialogPersonal.setVisible(true);
    }//GEN-LAST:event_botonPersonalMouseClicked

    private void botonGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGerenteMouseClicked
        dialogGerente.pack();
        dialogGerente.setModal(true);
        dialogGerente.setLocationRelativeTo(this);
        dialogGerente.setVisible(true);
    }//GEN-LAST:event_botonGerenteMouseClicked

    private void botonObjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonObjetoMouseClicked
        dialogObjeto.pack();
        dialogObjeto.setModal(true);        
        dialogObjeto.setLocationRelativeTo(this);
        dialogObjeto.setVisible(true);
        
    }//GEN-LAST:event_botonObjetoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel) jTreePersonal.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();

        General emp = new General();
        emp.setId(Integer.parseInt(id_personal.getText()));
        emp.setNombre(nombre_personal.getText());
        emp.setEdad((Integer) edad_personal.getValue());
        emp.setSexo((String) sexo_personal.getSelectedItem());
        emp.setEstado((String) estado_personal.getSelectedItem());
        emp.setAltura(Integer.parseInt(altura_personal.getText()));
        emp.setPeso(Integer.parseInt(peso_personal.getText()));
        emp.setOcup(ocupacion_personal.getText());
        emp.setHorario(horario_personal.getText());
        emp.setTiempo(Integer.parseInt(tiempo_personal.getText()));
        emp.setSueldo(Double.parseDouble(sueldo_personal.getText()));
        DefaultMutableTreeNode personal = new DefaultMutableTreeNode(emp);
        ((DefaultMutableTreeNode)root.getChildAt(1)).add(personal);
        
        modelo.reload();
        jTreePersonal.setModel(modelo);
        JOptionPane.showMessageDialog(this, "Personal agregado exitosamente");
        personas.add(emp);
    }//GEN-LAST:event_jButton1MouseClicked

    private void agregarGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarGerenteMouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel) jTreePersonal.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();

        Gerente emp = new Gerente();
        emp.setId(Integer.parseInt(id_gerente.getText()));
        emp.setNombre(nombre_gerente.getText());
        emp.setEdad((Integer) edad_gerente.getValue());
        emp.setSexo((String) sexo_gerente.getSelectedItem());
        emp.setEstado((String) estado_gerente.getSelectedItem());
        emp.setAltura(Integer.parseInt(altura_gerente.getText()));
        emp.setPeso(Integer.parseInt(peso_gerente.getText()));
        emp.setUsuario(usuario_gerente.getText());
        emp.setContra(contra_gerente.getText());
        emp.setCargo(cargo_gerente.getText());
        DefaultMutableTreeNode personal = new DefaultMutableTreeNode(emp);
        ((DefaultMutableTreeNode)root.getChildAt(0)).add(personal);
        
        modelo.reload();
        jTreePersonal.setModel(modelo);
        JOptionPane.showMessageDialog(this, "Gerente agregado exitosamente");
        personas.add(emp);
    }//GEN-LAST:event_agregarGerenteMouseClicked

    private void color_objetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color_objetoMouseClicked
        color_objeto.setBackground(JColorChooser.showDialog(this,"Ingrese color", Color.yellow));
    }//GEN-LAST:event_color_objetoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton agregarGerente;
    private javax.swing.JTextField altura_gerente;
    private javax.swing.JTextField altura_personal;
    private javax.swing.JButton botonGerente;
    private javax.swing.JButton botonObjeto;
    private javax.swing.JButton botonPersonal;
    private javax.swing.JTextField cargo_gerente;
    private javax.swing.JButton color_objeto;
    private javax.swing.JComboBox<String> comboBoxPersonas;
    private javax.swing.JTextField contra_gerente;
    private javax.swing.JDialog dialogGerente;
    private javax.swing.JDialog dialogObjeto;
    private javax.swing.JDialog dialogPersonal;
    private javax.swing.JSpinner edad_gerente;
    private javax.swing.JSpinner edad_personal;
    private javax.swing.JComboBox<String> estado_gerente;
    private javax.swing.JComboBox<String> estado_personal;
    private javax.swing.JTextField horario_personal;
    private javax.swing.JTextField id_gerente;
    private javax.swing.JTextField id_personal;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTreeObjeto;
    private javax.swing.JTree jTreePersonal;
    private javax.swing.JTextField nombre_gerente;
    private javax.swing.JTextField nombre_personal;
    private javax.swing.JTextField ocupacion_personal;
    private javax.swing.JTextField peso_gerente;
    private javax.swing.JTextField peso_personal;
    private javax.swing.JComboBox<String> sexo_gerente;
    private javax.swing.JComboBox<String> sexo_personal;
    private javax.swing.JTextField sueldo_personal;
    private javax.swing.JTextField tiempo_personal;
    private javax.swing.JTextField usuario_gerente;
    // End of variables declaration//GEN-END:variables
}
