/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import Classes.Planta;

/**
 *
 * @author l_a_b
 */
public class Control extends javax.swing.JFrame {
    
    class updatedGUI extends Thread{
        
        @Override
        public void run(){
            while(start){
            creadoresText.setText(Integer.toString(p.getCreators().size()));
            creadChasisText.setText(Integer.toString(p.getCreatorOfType(1)));
            creadCarroText.setText(Integer.toString(p.getCreatorOfType(2)));
            creadMotorText.setText(Integer.toString(p.getCreatorOfType(3)));
            creadRuedasText.setText(Integer.toString(p.getCreatorOfType(4)));
            creadAccesText.setText(Integer.toString(p.getCreatorOfType(5)));
            assemblersText.setText(Integer.toString(p.getAssemblers().size()));
            managerActivityText.setText(p.getManager().getActivity());
            countDownText.setText(Integer.toString(p.getCounter().getDaysLeft()));
            finishedCarsText.setText(Integer.toString(p.getCarsCounter()));
            capturedText.setVisible(p.getManager().isCaptured());
            directorActivityText.setText(p.getDirector().getActivity());
            timesCaughtText.setText(Integer.toString(p.getDirector().getTimesPMCaught()));
            finishedChasisText.setText(Integer.toString(p.getChasisStorage().getSpace() - p.getChasisStorage().getSpaceAvailable().availablePermits()));
            finishedCarroceriasText.setText(Integer.toString(p.getCarroceriasStorage().getSpace() - p.getCarroceriasStorage().getSpaceAvailable().availablePermits()));
            finishedAccesText.setText(Integer.toString(p.getMotoresStorage().getSpace() - p.getMotoresStorage().getSpaceAvailable().availablePermits()));
            finishedRuedasText.setText(Integer.toString(p.getRuedasStorage().getSpace() - p.getRuedasStorage().getSpaceAvailable().availablePermits()));
            finishedMotoresText.setText(Integer.toString(p.getAccesoriosStorage().getSpace() - p.getAccesoriosStorage().getSpaceAvailable().availablePermits()));
            daysText.setText(Integer.toString(p.getManager().getDays()));
            hoursText.setText(Integer.toString(p.getManager().getCounter().getHours()));
            managerSalaryText.setText(Double.toString(p.managerSalary()));
            managerSalary2Text.setText(Double.toString(p.managerSalary()));
            creatoresSalaryText.setText(Double.toString(p.allCreatorsSalary()));
            chasisCreaSalaryText.setText(Double.toString(p.creatorOfTypeSalary(1)));
            carroCreaSalaryText.setText(Double.toString(p.creatorOfTypeSalary(2)));
            motorCreaSalaryText.setText(Double.toString(p.creatorOfTypeSalary(3)));
            ruedaCreaSalaryText.setText(Double.toString(p.creatorOfTypeSalary(4)));
            accesSalaryText.setText(Double.toString(p.creatorOfTypeSalary(5)));
            directorSalaryText.setText(Double.toString(p.directorSalary()));
            assemblersSalaryText.setText(Double.toString(p.assemblersSalary()));
            }
        }
    }
    
    private Menu menu;
    private Planta p;   
    private boolean start = false;


    /**
     * Creates new form Control
     */
    public Control(Menu menu) {
        initComponents();
        this.menu = menu;
        this.creadChasisText.setText("TEST");
        this.p = new Planta(this.menu.getLector(), this.menu);
        p.initConditions();
//        prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
//        prodCredText.setText(Integer.toString(e.getProducerOfType(2)));
//        prodInicioText.setText(Integer.toString(e.getProducerOfType(3)));
//        prodCierreText.setText(Integer.toString(e.getProducerOfType(4)));
//        prodTwistText.setText(Integer.toString(e.getProducerOfType(5)));
//        productoresText1.setText(Integer.toString(e.getAssemblers().size()));
    }
    
    public boolean verifyMax(){
        if(p.getCreators().size()>=11){
            JOptionPane.showMessageDialog(null, "Debe haber máximo 11 creadores");
            return false;
        }else return true;
        
    }
    
    public boolean verifyMin(int type){
        if(p.getCreatorOfType(type) <=1){
            JOptionPane.showMessageDialog(null, "Debe haber mínimo 1 creador de cada tipo");
            return false;
        }else return true;
        
    }
    
    public boolean verifyMin(){
        if(p.getAssemblers().size() <= 1){
            JOptionPane.showMessageDialog(null, "Debe haber mínimo 1 ensamblador");
            return false;
        }else return true;
    }

    public void setStart(boolean start) {
        this.start = start;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        creadoresLabel = new javax.swing.JLabel();
        creadChasisText = new javax.swing.JTextField();
        creadChasisLabel = new javax.swing.JLabel();
        creadCarroceriaLabel = new javax.swing.JLabel();
        creadMotorLabel = new javax.swing.JLabel();
        creadRuedasLabel = new javax.swing.JLabel();
        creadAccesLabel = new javax.swing.JLabel();
        creadCarroText = new javax.swing.JTextField();
        creadMotorText = new javax.swing.JTextField();
        creadRuedasText = new javax.swing.JTextField();
        creadAccesText = new javax.swing.JTextField();
        hireChasisButton = new javax.swing.JButton();
        fireChasisButton = new javax.swing.JButton();
        creadoresText = new javax.swing.JTextField();
        hireCarroButton = new javax.swing.JButton();
        fireCarroButton = new javax.swing.JButton();
        hireMotorButton = new javax.swing.JButton();
        hireRuedasButton = new javax.swing.JButton();
        hireAccesButton = new javax.swing.JButton();
        fireMotorButton = new javax.swing.JButton();
        fireRuedaButton = new javax.swing.JButton();
        fireAccesButton = new javax.swing.JButton();
        assemblersLabel = new javax.swing.JLabel();
        assemblersText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        countDownText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        finishedCarsText = new javax.swing.JTextField();
        hoursLabel = new javax.swing.JLabel();
        hoursText = new javax.swing.JTextField();
        carsLabel = new javax.swing.JLabel();
        carsText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chasisLabel = new javax.swing.JLabel();
        finishedChasisText = new javax.swing.JTextField();
        ruedasLabel = new javax.swing.JLabel();
        carroceriaLabel = new javax.swing.JLabel();
        accesoriosLabel = new javax.swing.JLabel();
        motoresLabel = new javax.swing.JLabel();
        finishedRuedasText = new javax.swing.JTextField();
        finishedCarroceriasText = new javax.swing.JTextField();
        finishedAccesText = new javax.swing.JTextField();
        finishedMotoresText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        managerSalary2Text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        directorActivityText = new javax.swing.JTextField();
        capturedText = new javax.swing.JTextField();
        hireAssemblerButton = new javax.swing.JButton();
        fireAssemblerButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        carsText1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        earningsText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        earningText1 = new javax.swing.JTextField();
        earningsText2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        managerActivityText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        timesCaughtText = new javax.swing.JTextField();
        spendingText = new javax.swing.JTextField();
        accesSalaryText = new javax.swing.JTextField();
        directorSalaryText = new javax.swing.JTextField();
        managerSalaryText = new javax.swing.JTextField();
        creatoresSalaryText = new javax.swing.JTextField();
        assemblersSalaryText = new javax.swing.JTextField();
        chasisCreaSalaryText = new javax.swing.JTextField();
        carroCreaSalaryText = new javax.swing.JTextField();
        motorCreaSalaryText = new javax.swing.JTextField();
        ruedaCreaSalaryText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        carsLabel2 = new javax.swing.JLabel();
        carsText2 = new javax.swing.JTextField();
        carsLabel4 = new javax.swing.JLabel();
        daysText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMaximumSize(new java.awt.Dimension(770, 700));
        Fondo.setMinimumSize(new java.awt.Dimension(770, 700));
        Fondo.setPreferredSize(new java.awt.Dimension(770, 700));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creadoresLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        creadoresLabel.setText("Cantidad de Creadores");
        Fondo.add(creadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 24));

        creadChasisText.setEditable(false);
        creadChasisText.setBackground(new java.awt.Color(255, 255, 255));
        creadChasisText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creadChasisText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadChasisText.setText("T");
        creadChasisText.setBorder(null);
        creadChasisText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadChasisTextActionPerformed(evt);
            }
        });
        Fondo.add(creadChasisText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 40, -1));

        creadChasisLabel.setText("Crea. de Chasis");
        Fondo.add(creadChasisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, -1));

        creadCarroceriaLabel.setText("Crea. de Carro.");
        Fondo.add(creadCarroceriaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, -1));

        creadMotorLabel.setText("Crea. de Motores");
        Fondo.add(creadMotorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 90, -1));

        creadRuedasLabel.setText("Crea. de Ruedas");
        Fondo.add(creadRuedasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 90, -1));

        creadAccesLabel.setText("Crea. de Accesorios");
        Fondo.add(creadAccesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 100, -1));

        creadCarroText.setEditable(false);
        creadCarroText.setBackground(new java.awt.Color(255, 255, 255));
        creadCarroText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creadCarroText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadCarroText.setText("T");
        creadCarroText.setBorder(null);
        creadCarroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadCarroTextActionPerformed(evt);
            }
        });
        Fondo.add(creadCarroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 40, -1));

        creadMotorText.setEditable(false);
        creadMotorText.setBackground(new java.awt.Color(255, 255, 255));
        creadMotorText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creadMotorText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadMotorText.setText("T");
        creadMotorText.setBorder(null);
        creadMotorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadMotorTextActionPerformed(evt);
            }
        });
        Fondo.add(creadMotorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 30, -1));

        creadRuedasText.setEditable(false);
        creadRuedasText.setBackground(new java.awt.Color(255, 255, 255));
        creadRuedasText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creadRuedasText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadRuedasText.setText("T");
        creadRuedasText.setBorder(null);
        creadRuedasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadRuedasTextActionPerformed(evt);
            }
        });
        Fondo.add(creadRuedasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 30, -1));

        creadAccesText.setEditable(false);
        creadAccesText.setBackground(new java.awt.Color(255, 255, 255));
        creadAccesText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        creadAccesText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadAccesText.setText("T");
        creadAccesText.setBorder(null);
        creadAccesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadAccesTextActionPerformed(evt);
            }
        });
        Fondo.add(creadAccesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 30, -1));

        hireChasisButton.setText("Contratar");
        hireChasisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireChasisButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireChasisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 89, -1));

        fireChasisButton.setText("Despedir");
        fireChasisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireChasisButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireChasisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 89, -1));

        creadoresText.setEditable(false);
        creadoresText.setBackground(new java.awt.Color(255, 255, 255));
        creadoresText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        creadoresText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creadoresText.setText("T");
        creadoresText.setBorder(null);
        creadoresText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadoresTextActionPerformed(evt);
            }
        });
        Fondo.add(creadoresText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 79, -1));

        hireCarroButton.setText("Contratar");
        hireCarroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireCarroButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireCarroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 89, -1));

        fireCarroButton.setText("Despedir");
        fireCarroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireCarroButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireCarroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 89, -1));

        hireMotorButton.setText("Contratar");
        hireMotorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireMotorButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireMotorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 89, -1));

        hireRuedasButton.setText("Contratar");
        hireRuedasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireRuedasButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireRuedasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 89, -1));

        hireAccesButton.setText("Contratar");
        hireAccesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireAccesButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireAccesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 89, -1));

        fireMotorButton.setText("Despedir");
        fireMotorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireMotorButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireMotorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 89, -1));

        fireRuedaButton.setText("Despedir");
        fireRuedaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireRuedaButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireRuedaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 89, -1));

        fireAccesButton.setText("Despedir");
        fireAccesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireAccesButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireAccesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 89, -1));

        assemblersLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assemblersLabel.setText("Cantidad de Ensambladores");
        Fondo.add(assemblersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 230, 24));

        assemblersText.setEditable(false);
        assemblersText.setBackground(new java.awt.Color(255, 255, 255));
        assemblersText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assemblersText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        assemblersText.setText("TEST");
        assemblersText.setBorder(null);
        assemblersText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblersTextActionPerformed(evt);
            }
        });
        Fondo.add(assemblersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 79, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Días para la Entrega:");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 200, -1));

        countDownText.setEditable(false);
        countDownText.setBackground(new java.awt.Color(255, 255, 255));
        countDownText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        countDownText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countDownText.setText("TEST");
        countDownText.setBorder(null);
        countDownText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countDownTextActionPerformed(evt);
            }
        });
        Fondo.add(countDownText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 79, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Carros terminados:");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 200, -1));

        finishedCarsText.setEditable(false);
        finishedCarsText.setBackground(new java.awt.Color(255, 255, 255));
        finishedCarsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        finishedCarsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedCarsText.setText("TEST");
        finishedCarsText.setBorder(null);
        finishedCarsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedCarsTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedCarsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 79, -1));

        hoursLabel.setText("Horas transcurridas");
        Fondo.add(hoursLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, -1));

        hoursText.setEditable(false);
        hoursText.setBackground(new java.awt.Color(255, 255, 255));
        hoursText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hoursText.setText("TEST");
        hoursText.setBorder(null);
        hoursText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursTextActionPerformed(evt);
            }
        });
        Fondo.add(hoursText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, -1));

        carsLabel.setText("Carro. SIN Accesorios");
        Fondo.add(carsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 120, -1));

        carsText.setEditable(false);
        carsText.setBackground(new java.awt.Color(255, 255, 255));
        carsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carsText.setText("TEST");
        carsText.setBorder(null);
        carsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsTextActionPerformed(evt);
            }
        });
        Fondo.add(carsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Partes Disponibles en Almacén:");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, -1));

        chasisLabel.setText("Chasis");
        Fondo.add(chasisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));

        finishedChasisText.setEditable(false);
        finishedChasisText.setBackground(new java.awt.Color(255, 255, 255));
        finishedChasisText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedChasisText.setText("TEST");
        finishedChasisText.setBorder(null);
        finishedChasisText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedChasisTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedChasisText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 79, -1));

        ruedasLabel.setText("Ruedas");
        Fondo.add(ruedasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 70, -1));

        carroceriaLabel.setText("Carrocerías");
        Fondo.add(carroceriaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));

        accesoriosLabel.setText("Accesorios");
        Fondo.add(accesoriosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 70, -1));

        motoresLabel.setText("Motores");
        Fondo.add(motoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, -1));

        finishedRuedasText.setEditable(false);
        finishedRuedasText.setBackground(new java.awt.Color(255, 255, 255));
        finishedRuedasText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedRuedasText.setText("TEST");
        finishedRuedasText.setBorder(null);
        finishedRuedasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedRuedasTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedRuedasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 79, -1));

        finishedCarroceriasText.setEditable(false);
        finishedCarroceriasText.setBackground(new java.awt.Color(255, 255, 255));
        finishedCarroceriasText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedCarroceriasText.setText("TEST");
        finishedCarroceriasText.setBorder(null);
        finishedCarroceriasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedCarroceriasTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedCarroceriasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 79, -1));

        finishedAccesText.setEditable(false);
        finishedAccesText.setBackground(new java.awt.Color(255, 255, 255));
        finishedAccesText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedAccesText.setText("TEST");
        finishedAccesText.setBorder(null);
        finishedAccesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedAccesTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedAccesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 79, -1));

        finishedMotoresText.setEditable(false);
        finishedMotoresText.setBackground(new java.awt.Color(255, 255, 255));
        finishedMotoresText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finishedMotoresText.setText("TEST");
        finishedMotoresText.setBorder(null);
        finishedMotoresText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedMotoresTextActionPerformed(evt);
            }
        });
        Fondo.add(finishedMotoresText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 79, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("El Gerente está:");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 151, -1));

        managerSalary2Text.setEditable(false);
        managerSalary2Text.setBackground(new java.awt.Color(255, 255, 255));
        managerSalary2Text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managerSalary2Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        managerSalary2Text.setText("TEST");
        managerSalary2Text.setBorder(null);
        managerSalary2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerSalary2TextActionPerformed(evt);
            }
        });
        Fondo.add(managerSalary2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 79, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("El Director está:");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 165, -1));

        directorActivityText.setEditable(false);
        directorActivityText.setBackground(new java.awt.Color(255, 255, 255));
        directorActivityText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        directorActivityText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directorActivityText.setText("TEST");
        directorActivityText.setBorder(null);
        directorActivityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorActivityTextActionPerformed(evt);
            }
        });
        Fondo.add(directorActivityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 250, 120, -1));

        capturedText.setEditable(false);
        capturedText.setBackground(new java.awt.Color(255, 255, 255));
        capturedText.setForeground(new java.awt.Color(255, 0, 0));
        capturedText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        capturedText.setText("CAPTURADO!");
        capturedText.setBorder(null);
        capturedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturedTextActionPerformed(evt);
            }
        });
        Fondo.add(capturedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 100, -1));

        hireAssemblerButton.setText("Contratar");
        hireAssemblerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireAssemblerButtonActionPerformed(evt);
            }
        });
        Fondo.add(hireAssemblerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 89, -1));

        fireAssemblerButton.setText("Despedir");
        fireAssemblerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireAssemblerButtonActionPerformed(evt);
            }
        });
        Fondo.add(fireAssemblerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 89, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 343, 20, 280));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad de capítulos:");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 286, -1));

        carsText1.setEditable(false);
        carsText1.setBackground(new java.awt.Color(255, 255, 255));
        carsText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        carsText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carsText1.setText("TEST");
        carsText1.setBorder(null);
        carsText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsText1ActionPerformed(evt);
            }
        });
        Fondo.add(carsText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 51, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ganancias totales (USD):");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 286, -1));

        earningsText.setEditable(false);
        earningsText.setBackground(new java.awt.Color(255, 255, 255));
        earningsText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        earningsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        earningsText.setText("TEST");
        earningsText.setBorder(null);
        earningsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningsTextActionPerformed(evt);
            }
        });
        Fondo.add(earningsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 51, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gastos totales (USD):");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 286, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Ganancias netas (USD):");
        Fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 286, -1));

        earningText1.setEditable(false);
        earningText1.setBackground(new java.awt.Color(255, 255, 255));
        earningText1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        earningText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        earningText1.setText("TEST");
        earningText1.setBorder(null);
        earningText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningText1ActionPerformed(evt);
            }
        });
        Fondo.add(earningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 51, -1));

        earningsText2.setEditable(false);
        earningsText2.setBackground(new java.awt.Color(255, 255, 255));
        earningsText2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        earningsText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        earningsText2.setText("TEST");
        earningsText2.setBorder(null);
        earningsText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningsText2ActionPerformed(evt);
            }
        });
        Fondo.add(earningsText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 51, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Gastos Actuales:");
        Fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 200, -1));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 740, 10));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 740, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Salario de Ensambladores:");
        Fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 210, -1));

        managerActivityText.setEditable(false);
        managerActivityText.setBackground(new java.awt.Color(255, 255, 255));
        managerActivityText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managerActivityText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        managerActivityText.setText("TEST");
        managerActivityText.setBorder(null);
        managerActivityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerActivityTextActionPerformed(evt);
            }
        });
        Fondo.add(managerActivityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 220, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Número de veces capturado:");
        Fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 210, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 33, 20, 170));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Último Lote");
        Fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 200, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Salario del Gte:");
        Fondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Salario del Director:");
        Fondo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Salario de Crea. de Acces:");
        Fondo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 210, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Salario del Gte:");
        Fondo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 210, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Salario de Creadores:");
        Fondo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 210, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Salario de Crea. de Chasis:");
        Fondo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 210, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Salario de Crea. de Carro.:");
        Fondo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 210, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Salario de Crea. de Motores:");
        Fondo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 210, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Salario de Crea. de Ruedas:");
        Fondo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 210, -1));

        timesCaughtText.setEditable(false);
        timesCaughtText.setBackground(new java.awt.Color(255, 255, 255));
        timesCaughtText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timesCaughtText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timesCaughtText.setText("TEST");
        timesCaughtText.setBorder(null);
        timesCaughtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesCaughtTextActionPerformed(evt);
            }
        });
        Fondo.add(timesCaughtText, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 79, 20));

        spendingText.setEditable(false);
        spendingText.setBackground(new java.awt.Color(255, 255, 255));
        spendingText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spendingText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        spendingText.setText("TEST");
        spendingText.setBorder(null);
        spendingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spendingTextActionPerformed(evt);
            }
        });
        Fondo.add(spendingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 79, 20));

        accesSalaryText.setEditable(false);
        accesSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        accesSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accesSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        accesSalaryText.setText("TEST");
        accesSalaryText.setBorder(null);
        accesSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accesSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(accesSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 79, 20));

        directorSalaryText.setEditable(false);
        directorSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        directorSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        directorSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directorSalaryText.setText("TEST");
        directorSalaryText.setBorder(null);
        directorSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(directorSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 79, 20));

        managerSalaryText.setEditable(false);
        managerSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        managerSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        managerSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        managerSalaryText.setText("TEST");
        managerSalaryText.setBorder(null);
        managerSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(managerSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 79, 20));

        creatoresSalaryText.setEditable(false);
        creatoresSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        creatoresSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        creatoresSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creatoresSalaryText.setText("TEST");
        creatoresSalaryText.setBorder(null);
        creatoresSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatoresSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(creatoresSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 79, 20));

        assemblersSalaryText.setEditable(false);
        assemblersSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        assemblersSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assemblersSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        assemblersSalaryText.setText("TEST");
        assemblersSalaryText.setBorder(null);
        assemblersSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assemblersSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(assemblersSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 79, 20));

        chasisCreaSalaryText.setEditable(false);
        chasisCreaSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        chasisCreaSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chasisCreaSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chasisCreaSalaryText.setText("TEST");
        chasisCreaSalaryText.setBorder(null);
        chasisCreaSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisCreaSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(chasisCreaSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 79, 20));

        carroCreaSalaryText.setEditable(false);
        carroCreaSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        carroCreaSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        carroCreaSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carroCreaSalaryText.setText("TEST");
        carroCreaSalaryText.setBorder(null);
        carroCreaSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carroCreaSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(carroCreaSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 79, 20));

        motorCreaSalaryText.setEditable(false);
        motorCreaSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        motorCreaSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        motorCreaSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        motorCreaSalaryText.setText("TEST");
        motorCreaSalaryText.setBorder(null);
        motorCreaSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorCreaSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(motorCreaSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 79, 20));

        ruedaCreaSalaryText.setEditable(false);
        ruedaCreaSalaryText.setBackground(new java.awt.Color(255, 255, 255));
        ruedaCreaSalaryText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ruedaCreaSalaryText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ruedaCreaSalaryText.setText("TEST");
        ruedaCreaSalaryText.setBorder(null);
        ruedaCreaSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruedaCreaSalaryTextActionPerformed(evt);
            }
        });
        Fondo.add(ruedaCreaSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 79, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Volver al Menú");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 130, 20));
        Fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 740, 10));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DETENER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 90, 20));

        carsLabel2.setText("Carro. CON Accesorios");
        Fondo.add(carsLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        carsText2.setEditable(false);
        carsText2.setBackground(new java.awt.Color(255, 255, 255));
        carsText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carsText2.setText("TEST");
        carsText2.setBorder(null);
        carsText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsText2ActionPerformed(evt);
            }
        });
        Fondo.add(carsText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, -1));

        carsLabel4.setText("Días transcurridos");
        Fondo.add(carsLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        daysText.setEditable(false);
        daysText.setBackground(new java.awt.Color(255, 255, 255));
        daysText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        daysText.setText("TEST");
        daysText.setBorder(null);
        daysText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysTextActionPerformed(evt);
            }
        });
        Fondo.add(daysText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creadChasisTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadChasisTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadChasisTextActionPerformed

    private void creadCarroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadCarroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadCarroTextActionPerformed

    private void creadMotorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadMotorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadMotorTextActionPerformed

    private void creadRuedasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadRuedasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadRuedasTextActionPerformed

    private void creadAccesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadAccesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadAccesTextActionPerformed

    private void hireChasisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireChasisButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMax()){
            p.hireCreator(1);
            p.getCreators().get(p.getCreators().size()-1).start();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }

    }//GEN-LAST:event_hireChasisButtonActionPerformed

    private void fireChasisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireChasisButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin(1)){
            p.fireCreator(1);
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireChasisButtonActionPerformed

    private void creadoresTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadoresTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadoresTextActionPerformed

    private void hireCarroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireCarroButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMax()){
            p.hireCreator(2);
            p.getCreators().get(p.getCreators().size()-1).start();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_hireCarroButtonActionPerformed

    private void fireCarroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireCarroButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin(2)){
            p.fireCreator(2);
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireCarroButtonActionPerformed

    private void hireMotorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireMotorButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMax()){
            p.hireCreator(3);
            p.getCreators().get(p.getCreators().size()-1).start();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_hireMotorButtonActionPerformed

    private void hireRuedasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireRuedasButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMax()){
            p.hireCreator(4);
            p.getCreators().get(p.getCreators().size()-1).start();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_hireRuedasButtonActionPerformed

    private void hireAccesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireAccesButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMax()){
            p.hireCreator(5);
            p.getCreators().get(p.getCreators().size()-1).start();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_hireAccesButtonActionPerformed

    private void fireMotorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireMotorButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin(3)){
            p.fireCreator(3);
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireMotorButtonActionPerformed

    private void fireRuedaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireRuedaButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin(4)){
            p.fireCreator(4);
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireRuedaButtonActionPerformed

    private void fireAccesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireAccesButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin(5)){
            p.fireCreator(5);
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireAccesButtonActionPerformed

    private void assemblersTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblersTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assemblersTextActionPerformed

    private void countDownTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countDownTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countDownTextActionPerformed

    private void finishedCarsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedCarsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedCarsTextActionPerformed

    private void hoursTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursTextActionPerformed

    private void carsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carsTextActionPerformed

    private void finishedChasisTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedChasisTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedChasisTextActionPerformed

    private void finishedRuedasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedRuedasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedRuedasTextActionPerformed

    private void finishedCarroceriasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedCarroceriasTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedCarroceriasTextActionPerformed

    private void finishedAccesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedAccesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedAccesTextActionPerformed

    private void finishedMotoresTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishedMotoresTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishedMotoresTextActionPerformed

    private void managerSalary2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerSalary2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerSalary2TextActionPerformed

    private void directorActivityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorActivityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorActivityTextActionPerformed

    private void capturedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturedTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capturedTextActionPerformed

    private void hireAssemblerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireAssemblerButtonActionPerformed
        // TODO add your handling code here:
        p.hireAssembler();
        p.getAssemblers().get(p.getAssemblers().size()-1).start();
    }//GEN-LAST:event_hireAssemblerButtonActionPerformed

    private void fireAssemblerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireAssemblerButtonActionPerformed
        // TODO add your handling code here:
        if(verifyMin()){
            p.fireAssembler();
            //            productoresText.setText(Integer.toString(e.getProducers().size()));
            //            prodIntroText.setText(Integer.toString(e.getProducerOfType(1)));
        } else {
        }
    }//GEN-LAST:event_fireAssemblerButtonActionPerformed

    private void carsText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carsText1ActionPerformed

    private void earningsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_earningsTextActionPerformed

    private void earningText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_earningText1ActionPerformed

    private void earningsText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningsText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_earningsText2ActionPerformed

    private void managerActivityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerActivityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerActivityTextActionPerformed

    private void timesCaughtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesCaughtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timesCaughtTextActionPerformed

    private void spendingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spendingTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spendingTextActionPerformed

    private void accesSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accesSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accesSalaryTextActionPerformed

    private void directorSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorSalaryTextActionPerformed

    private void managerSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerSalaryTextActionPerformed

    private void creatoresSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatoresSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creatoresSalaryTextActionPerformed

    private void assemblersSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assemblersSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assemblersSalaryTextActionPerformed

    private void chasisCreaSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisCreaSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasisCreaSalaryTextActionPerformed

    private void carroCreaSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carroCreaSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carroCreaSalaryTextActionPerformed

    private void motorCreaSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorCreaSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorCreaSalaryTextActionPerformed

    private void ruedaCreaSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruedaCreaSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruedaCreaSalaryTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
        p.stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void carsText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carsText2ActionPerformed

    private void daysTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysTextActionPerformed

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
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Control().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField accesSalaryText;
    private javax.swing.JLabel accesoriosLabel;
    private javax.swing.JLabel assemblersLabel;
    private javax.swing.JTextField assemblersSalaryText;
    private javax.swing.JTextField assemblersText;
    private javax.swing.JTextField capturedText;
    private javax.swing.JTextField carroCreaSalaryText;
    private javax.swing.JLabel carroceriaLabel;
    private javax.swing.JLabel carsLabel;
    private javax.swing.JLabel carsLabel2;
    private javax.swing.JLabel carsLabel4;
    private javax.swing.JTextField carsText;
    private javax.swing.JTextField carsText1;
    private javax.swing.JTextField carsText2;
    private javax.swing.JTextField chasisCreaSalaryText;
    private javax.swing.JLabel chasisLabel;
    private javax.swing.JTextField countDownText;
    private javax.swing.JLabel creadAccesLabel;
    private javax.swing.JTextField creadAccesText;
    private javax.swing.JTextField creadCarroText;
    private javax.swing.JLabel creadCarroceriaLabel;
    private javax.swing.JLabel creadChasisLabel;
    private javax.swing.JTextField creadChasisText;
    private javax.swing.JLabel creadMotorLabel;
    private javax.swing.JTextField creadMotorText;
    private javax.swing.JLabel creadRuedasLabel;
    private javax.swing.JTextField creadRuedasText;
    private javax.swing.JLabel creadoresLabel;
    private javax.swing.JTextField creadoresText;
    private javax.swing.JTextField creatoresSalaryText;
    private javax.swing.JTextField daysText;
    private javax.swing.JTextField directorActivityText;
    private javax.swing.JTextField directorSalaryText;
    private javax.swing.JTextField earningText1;
    private javax.swing.JTextField earningsText;
    private javax.swing.JTextField earningsText2;
    private javax.swing.JTextField finishedAccesText;
    private javax.swing.JTextField finishedCarroceriasText;
    private javax.swing.JTextField finishedCarsText;
    private javax.swing.JTextField finishedChasisText;
    private javax.swing.JTextField finishedMotoresText;
    private javax.swing.JTextField finishedRuedasText;
    private javax.swing.JButton fireAccesButton;
    private javax.swing.JButton fireAssemblerButton;
    private javax.swing.JButton fireCarroButton;
    private javax.swing.JButton fireChasisButton;
    private javax.swing.JButton fireMotorButton;
    private javax.swing.JButton fireRuedaButton;
    private javax.swing.JButton hireAccesButton;
    private javax.swing.JButton hireAssemblerButton;
    private javax.swing.JButton hireCarroButton;
    private javax.swing.JButton hireChasisButton;
    private javax.swing.JButton hireMotorButton;
    private javax.swing.JButton hireRuedasButton;
    private javax.swing.JLabel hoursLabel;
    private javax.swing.JTextField hoursText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField managerActivityText;
    private javax.swing.JTextField managerSalary2Text;
    private javax.swing.JTextField managerSalaryText;
    private javax.swing.JTextField motorCreaSalaryText;
    private javax.swing.JLabel motoresLabel;
    private javax.swing.JTextField ruedaCreaSalaryText;
    private javax.swing.JLabel ruedasLabel;
    private javax.swing.JTextField spendingText;
    private javax.swing.JTextField timesCaughtText;
    // End of variables declaration//GEN-END:variables
}
