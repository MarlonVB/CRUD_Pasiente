/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import Modelo.Paciente;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author velez
 */
public class CrudPacientes extends javax.swing.JFrame {
    
    public static ArrayList <Paciente> pasientes= new ArrayList<Paciente>();
    static Date fecha = new Date();
    public static int objP;
    JRadioButton est_civil, sexo;
    String [][] llenarTabla;
    /**
     * Creates new form CrudPacientes
     */
    public CrudPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        RestrictedTextField restringir= new RestrictedTextField(txtDNIp);
        RestrictedTextField restringirTalla= new RestrictedTextField(txtTallaP);
        RestrictedTextField restringirPeso= new RestrictedTextField(txtPesoP);
        RestrictedTextField restringirTelf= new RestrictedTextField(txtTelefono);
        
        restringir.setLimit(10);
        restringir.setOnlyNums(true);
        restringirPeso.setOnlyNums(true);
        restringirTalla.setOnlyNums(true);
        restringirTelf.setOnlyNums(true);
        restringirTelf.setLimit(10);
        
        buttonGroupEstadoCivil.add(jRadioSoltero);
        buttonGroupEstadoCivil.add(jRadioCasado);
        buttonGroupEstadoCivil.add(jRadioViudo);
        buttonGroupEstadoCivil.add(jRadioUnL);
        buttonGroupSexo.add(jRadioHombre);
        buttonGroupSexo.add(jRadioMujer);
    }
    
    public static String fecha(JDateChooser JDate){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Objeto de la clase SimpleDateFormat para dar un formato a la fecha
        fecha = JDate.getDate(); //Unso el metodo gerDate() para extraer la fecha ingresada el en JChooser y le guardo en el variable fecha
        return formato.format(fecha); //Le doy un formato a la fecha 
    }
    
    public String calcular_Edad(){
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fech_nac= LocalDate.parse(fecha(jDateFech_NAC), formato);
//        LocalDate fech_act= LocalDate.now();
//        
//        Period periodo= Period.between(fech_nac, fech_act);
//        String edad= String.valueOf(periodo.getYears());
        
        return "20";
    }
    
    public static JRadioButton getSelection(ButtonGroup group) {
        for (Enumeration e = group.getElements(); e.hasMoreElements();) {
            JRadioButton b = (JRadioButton) e.nextElement();
            if (b.getModel() == group.getSelection()) {
                return b;
            }
        }
        return null;
    }
    
    public void mostrar(){
        System.out.println(pasientes.size());
        llenarTabla= new String[pasientes.size()][13];
        
        for (int i = 0; i < pasientes.size(); i++) {
            llenarTabla[i][0]=pasientes.get(i).getHistoria_clinica();
            llenarTabla[i][1]=pasientes.get(i).getCedual();
            llenarTabla[i][2]=pasientes.get(i).getNombre();
            llenarTabla[i][3]=pasientes.get(i).getApellido();
            llenarTabla[i][4]=pasientes.get(i).getEstado_civil();
            llenarTabla[i][5]=pasientes.get(i).getTipo_sangre();
            llenarTabla[i][6]=pasientes.get(i).getTalla();
            llenarTabla[i][7]=pasientes.get(i).getPeso();
            llenarTabla[i][8]=pasientes.get(i).getSexo();
            llenarTabla[i][9]=pasientes.get(i).getFecha_nac();
            llenarTabla[i][10]=pasientes.get(i).getPatologia();
            llenarTabla[i][11]=pasientes.get(i).getTelefono(); 
            llenarTabla[i][12]=pasientes.get(i).getDireccion(); 
        }
        TablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            llenarTabla,
            new String [] {
                "#HU", "DNI", "Nombre", "Apellido", "Estado Civil", "Tip. Sangre", "Talla", "Peso", "Sexo", "F. Nacimiento", "Patologia", "Telefono", "Direccion"
            }
        ));
        
    }
    public static void Asignar(String HU, String dni, String nombre, String apellido, String estCi, String tipS, String talla, String peso, String sexo, String fecha, String patologia){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstadoCivil = new javax.swing.ButtonGroup();
        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtHU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDNIp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioSoltero = new javax.swing.JRadioButton();
        jRadioCasado = new javax.swing.JRadioButton();
        jRadioViudo = new javax.swing.JRadioButton();
        jRadioUnL = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jCSangre = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTallaP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPesoP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioHombre = new javax.swing.JRadioButton();
        jRadioMujer = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EDADMOS = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPatolo = new javax.swing.JTextPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/ADD.png"));
        Image image = icon.getImage();
        jButton1 = new javax.swing.JButton(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel15 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/imagen/UPDATE.png"));
        Image image1 = icon1.getImage();
        jButtEditar = new javax.swing.JButton(){
            public void paintComponent(Graphics g){
                g.drawImage(image1,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/imagen/DELETE.png"));
        Image image2 = icon2.getImage();
        jButtEliminar = new javax.swing.JButton(){
            public void paintComponent(Graphics g){
                g.drawImage(image2,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/imagen/BUSCAR.png"));
        Image image3 = icon3.getImage();
        Buscar = new javax.swing.JButton(){
            public void paintComponent(Graphics g){
                g.drawImage(image3,0,0,getWidth(),getHeight(),this);
            }
        };
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPacientes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hoja de Admision del Pasiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(426, 426, 426))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("# Historia Clinica");

        jLabel2.setText("Nombre:");

        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellido:");

        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });

        jLabel4.setText("Cedula:");

        txtDNIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIpActionPerformed(evt);
            }
        });
        txtDNIp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDNIpPropertyChange(evt);
            }
        });
        txtDNIp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIpKeyTyped(evt);
            }
        });

        jLabel5.setText("Estado Civil:");

        jRadioSoltero.setText("Soltero");

        jRadioCasado.setText("Casado");

        jRadioViudo.setText("Viudo");

        jRadioUnL.setText("Union Libre");

        jLabel6.setText("Tipo de Sangre:");

        jCSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORH+", "ORH-", "ARH+", "ARH-", "BRH+", "BRH-", "ABRH+" }));
        jCSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSangreActionPerformed(evt);
            }
        });

        jLabel7.setText("Talla:");

        txtTallaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTallaPActionPerformed(evt);
            }
        });

        jLabel8.setText("Peso:");

        txtPesoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoPActionPerformed(evt);
            }
        });

        jLabel11.setText("Sexo:");

        jRadioHombre.setText("Hombre");

        jRadioMujer.setText("Mujer");

        jLabel9.setText("Fecha de Nacimiento:");

        jLabel13.setText("Edad");

        jLabel12.setText("Patologia:");

        txtPatolo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatoloKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtPatolo);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Telefono");

        jLabel16.setText("Direccion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioSoltero)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioCasado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioViudo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioUnL)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioHombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioMujer)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EDADMOS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtHU, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(txtDNIp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTallaP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesoP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel15)
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel16)))))
                        .addGap(163, 163, 163)))
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtHU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioSoltero)
                            .addComponent(jRadioCasado)
                            .addComponent(jRadioViudo)
                            .addComponent(jRadioUnL)
                            .addComponent(jLabel6)
                            .addComponent(jCSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtTallaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtPesoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jRadioHombre)
                                .addComponent(jRadioMujer)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(EDADMOS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Panel de Edicion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtEditar.setText("Editar");
        jButtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtEditarActionPerformed(evt);
            }
        });

        jButtEliminar.setText("Eliminar");
        jButtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtEliminarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        TablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#HU", "DNI", "Nombre", "Apellido", "Estado Civil", "Tip. Sangre", "Talla", "Peso", "Sexo", "F. Nacimiento", "Patologia", "Telefono", "Direccion"
            }
        ));
        TablaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TablaPacientesMouseEntered(evt);
            }
        });
        TablaPacientes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablaPacientesPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(TablaPacientes);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_undelete_48px.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtEliminar)
                        .addGap(30, 30, 30)
                        .addComponent(Buscar)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIpActionPerformed
        // TODO add your handling code here:
        if(txtDNIp.getText().length()!=10){
            JOptionPane.showMessageDialog(null, "La cedula debe tener 10 digitos","ERROR", JOptionPane.ERROR_MESSAGE);
            txtDNIp.setForeground(Color.RED);
        }else{
            txtDNIp.setForeground(Color.green);
            txtDNIp.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtDNIpActionPerformed

    private void txtDNIpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDNIpPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDNIpPropertyChange

    private void jCSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSangreActionPerformed

    private void txtTallaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTallaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTallaPActionPerformed

    private void txtPesoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoPActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPesoPActionPerformed

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if((letra<'a' || letra>'z') && (letra<'A' || letra>'Z')) evt.consume();
    
    }//GEN-LAST:event_txtNombrePKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if((letra<'a' || letra>'z') && (letra<'A' || letra>'Z')) evt.consume();
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtPatoloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatoloKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if((letra<'a' || letra>'z') && (letra<'A' || letra>'Z')) evt.consume();
    }//GEN-LAST:event_txtPatoloKeyTyped

    private void txtDNIpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIpKeyTyped
        // TODO add your handling code here:
        char letra = evt.getKeyChar();
        if(letra<'0' || letra>'9');
    }//GEN-LAST:event_txtDNIpKeyTyped
    public boolean Validaciones(){
        for (int i = 0; i < pasientes.size(); i++) {

            if (txtDNIp.getText().equals(pasientes.get(i).getCedual())) {
                JOptionPane.showMessageDialog(null, "Este paciente ya fue registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtDNIp.setForeground(Color.RED);
                return false;
            }
            
            if (txtHU.getText().equalsIgnoreCase(pasientes.get(i).getHistoria_clinica())) {
                JOptionPane.showMessageDialog(null, "Esta HU ya esta en uso", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtDNIp.setForeground(Color.RED);
                return false;
            }
        }
        
        if (txtDNIp.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "La cedula debe tener 10 digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDNIp.setForeground(Color.RED);
            return false;
        } 
        
        int peso= Integer.parseInt(txtPesoP.getText());
        int talle= Integer.parseInt(txtTallaP.getText());
        
        if (peso<=0) {
            JOptionPane.showMessageDialog(null, "El peso debe serr mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPesoP.setForeground(Color.RED);
            return false;
        }
        
        if(talle<=0){
            JOptionPane.showMessageDialog(null, "La talla debe serr mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTallaP.setForeground(Color.RED);
            return false;
        }
        
        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (Validaciones() == true) {
            Registro();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void LimpiarCampos(){
        txtHU.setText("");
        txtNombreP.setText("");
        txtApellidoP.setText("");
        txtDNIp.setText("");
        txtPesoP.setText("");
        txtTallaP.setText("");
        txtPatolo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        //jDateFech_NAC.setDate(null);
        EDADMOS.setText("");
    }
    
    public void Registro(){
        try{
            est_civil = getSelection(buttonGroupEstadoCivil);
            sexo = getSelection(buttonGroupSexo);
            String tipS = jCSangre.getSelectedItem().toString();
            //tring fe = fecha(jDateFech_NAC);
            //System.out.println(txtDNIp.getText()+"---"+txtNombreP.getText()+"---"+txtApellidoP.getText()+"---"+calcular_Edad()+"---"+est_civil.getText()+"---"+tipS+"---"+txtPesoP.getText()+"---"+txtTallaP.getText()+"---"+txtHU.getText()+"---"+sexo.getText()+"---"+txtPatolo.getText()+"---"+fe);
            Paciente registrarP = new Paciente(txtDNIp.getText(), txtNombreP.getText(), txtApellidoP.getText(), calcular_Edad(), est_civil.getText(), tipS, txtPesoP.getText(), txtTallaP.getText(), txtHU.getText(), sexo.getText(), txtPatolo.getText(), "20", txtTelefono.getText(), txtDireccion.getText());
            pasientes.add(registrarP);
            JOptionPane.showMessageDialog(null, "¡Pasiente registrado exitosamente!");
            mostrar();
            LimpiarCampos();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void Editar(){
        est_civil = getSelection(buttonGroupEstadoCivil);
        sexo = getSelection(buttonGroupSexo);
        String tipS = jCSangre.getSelectedItem().toString();
        //String fe = fecha(jDateFech_NAC);
        pasientes.get(objP).setHistoria_clinica(txtHU.getText());
        pasientes.get(objP).setCedual(txtDNIp.getText());
        pasientes.get(objP).setNombre(txtNombreP.getText());
        pasientes.get(objP).setApellido(txtApellidoP.getText());
        pasientes.get(objP).setEstado_civil(est_civil.getText());
        pasientes.get(objP).setTipo_sangre(tipS);
        pasientes.get(objP).setTalla(txtTallaP.getText());
        pasientes.get(objP).setPeso(txtPesoP.getText());
        pasientes.get(objP).setSexo(sexo.getText());
        pasientes.get(objP).setFecha_nac("20");
        pasientes.get(objP).setPatologia(txtPatolo.getText());        
        mostrar();
        LimpiarCampos();
    }
    public static void CargarDatos(){
        
    }
    private void TablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPacientesMouseClicked
        // TODO add your handling code here:
        int selection= TablaPacientes.getSelectedRow();
        if(pasientes.get(selection).getEstado_civil()==jRadioCasado.getLabel()){
            jRadioCasado.setSelected(true);
        }
        if(pasientes.get(selection).getEstado_civil()==jRadioSoltero.getLabel()){
            jRadioSoltero.setSelected(true);
        }
        if(pasientes.get(selection).getEstado_civil()==jRadioViudo.getLabel()){
            jRadioViudo.setSelected(true);
        }
        if(pasientes.get(selection).getEstado_civil()==jRadioUnL.getLabel()){
            jRadioUnL.setSelected(true);
        }
        
        if(pasientes.get(selection).getSexo()==jRadioHombre.getLabel()){
            jRadioHombre.setSelected(true);
        }
        if(pasientes.get(selection).getSexo()==jRadioMujer.getLabel()){
            jRadioMujer.setSelected(true);
        }
        
        //jDateFech_NAC.setDateFormatString(pasientes.get(selection).getFecha_nac());
        jCSangre.setSelectedItem(pasientes.get(selection).getTipo_sangre());
        txtDNIp.setText(pasientes.get(selection).getCedual());
        txtHU.setText(pasientes.get(selection).getHistoria_clinica());
        txtNombreP.setText(pasientes.get(selection).getNombre());
        txtApellidoP.setText(pasientes.get(selection).getApellido());
        txtPesoP.setText(pasientes.get(selection).getPeso());
        txtTallaP.setText(pasientes.get(selection).getTalla());
        txtPatolo.setText(pasientes.get(selection).getPatologia());
        txtTelefono.setText(pasientes.get(selection).getTelefono());
        txtDireccion.setText(pasientes.get(selection).getDireccion());
    }//GEN-LAST:event_TablaPacientesMouseClicked
    
    public static void RecibirDatos(int seleccion){
        if(pasientes.get(seleccion).getEstado_civil()==jRadioCasado.getLabel()){
            jRadioCasado.setSelected(true);
        }
        if(pasientes.get(seleccion).getEstado_civil()==jRadioSoltero.getLabel()){
            jRadioSoltero.setSelected(true);
        }
        if(pasientes.get(seleccion).getEstado_civil()==jRadioViudo.getLabel()){
            jRadioViudo.setSelected(true);
        }
        if(pasientes.get(seleccion).getEstado_civil()==jRadioUnL.getLabel()){
            jRadioUnL.setSelected(true);
        }
        
        if(pasientes.get(seleccion).getSexo()==jRadioHombre.getLabel()){
            jRadioHombre.setSelected(true);
        }
        if(pasientes.get(seleccion).getSexo()==jRadioMujer.getLabel()){
            jRadioMujer.setSelected(true);
        }
        
        //jDateFech_NAC.setDateFormatString(pasientes.get(seleccion).getFecha_nac());
        jCSangre.setSelectedItem(pasientes.get(seleccion).getTipo_sangre());
        txtDNIp.setText(pasientes.get(seleccion).getCedual());
        txtHU.setText(pasientes.get(seleccion).getHistoria_clinica());
        txtNombreP.setText(pasientes.get(seleccion).getNombre());
        txtApellidoP.setText(pasientes.get(seleccion).getApellido());
        txtPesoP.setText(pasientes.get(seleccion).getPeso());
        txtTallaP.setText(pasientes.get(seleccion).getTalla());
        txtPatolo.setText(pasientes.get(seleccion).getPatologia());
        txtTelefono.setText(pasientes.get(seleccion).getTelefono());
        txtDireccion.setText(pasientes.get(seleccion).getDireccion());
    }
    private void jButtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtEditarActionPerformed
        try{
            objP=TablaPacientes.getSelectedRow();
            if(objP==-1){
                JOptionPane.showMessageDialog(null, "No hay selccionado ningun pasiente","ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea editar este pasiente", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                        new Object[]{"Si", "No"}, null);
                if (confirmar == 0) {
                    Editar();
                }
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButtEditarActionPerformed

    private void jButtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtEliminarActionPerformed
        // TODO add your handling code here:
        objP=TablaPacientes.getSelectedRow();
        System.out.println(objP);
        try{
            if(objP==-1){
            JOptionPane.showMessageDialog(null, "No hay selccionado ningun pasiente","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea eleminar este registro", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                    new Object[]{"Si", "No"}, null);

            pasientes.remove(objP);
            mostrar();
            LimpiarCampos();
            JOptionPane.showMessageDialog(null, "El registro se elemino existosamente");
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }//GEN-LAST:event_jButtEliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        if(pasientes.size()==0){
            JOptionPane.showMessageDialog(null, "No hay pasientes registrados","ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Consulta abrir = new Consulta();
            abrir.setVisible(true);
        } 
    }//GEN-LAST:event_BuscarActionPerformed

    private void jDateFech_NACPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateFech_NACPropertyChange
        // TODO add your handling code here:
        try{
            EDADMOS.setText(calcular_Edad());
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jDateFech_NACPropertyChange

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void TablaPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPacientesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaPacientesMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaPacientesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaPacientesPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TablaPacientesPropertyChange
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private static javax.swing.JLabel EDADMOS;
    private javax.swing.JTable TablaPacientes;
    private javax.swing.ButtonGroup buttonGroupEstadoCivil;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtEditar;
    private javax.swing.JButton jButtEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JComboBox<String> jCSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JRadioButton jRadioCasado;
    private static javax.swing.JRadioButton jRadioHombre;
    private static javax.swing.JRadioButton jRadioMujer;
    private static javax.swing.JRadioButton jRadioSoltero;
    private static javax.swing.JRadioButton jRadioUnL;
    private static javax.swing.JRadioButton jRadioViudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextField txtApellidoP;
    private static javax.swing.JTextField txtDNIp;
    private static javax.swing.JTextField txtDireccion;
    private static javax.swing.JTextField txtHU;
    private static javax.swing.JTextField txtNombreP;
    private static javax.swing.JTextPane txtPatolo;
    private static javax.swing.JTextField txtPesoP;
    private static javax.swing.JTextField txtTallaP;
    private static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
