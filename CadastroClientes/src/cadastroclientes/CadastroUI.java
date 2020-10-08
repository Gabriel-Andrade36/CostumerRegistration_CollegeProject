
package cadastroclientes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public final class CadastroUI extends javax.swing.JFrame {
    public String name;
    public String CPF;
    public String City;
    public String State;
    public String Address;
    private String[] args;

    public void setNameRestriction(boolean i) {
        this.NameRestriction.setVisible(i);
    }
    public void setAddressError(boolean i) {
        this.AddressError.setVisible(i);
    }

    public void setCPFError(boolean i) {
        this.CPFError.setVisible(i);
    }

    public void setCPFRequired(boolean i) {
        this.CPFRequired.setVisible(i);
    }
    public void setCPFRestriction(boolean i) {
        this.CPFRestriction.setVisible(i);
    }

    public void setCityError(boolean i) {
        this.CityError.setVisible(i);
    }

    public void setCityRequired(boolean i) {
        this.CityRequired.setVisible(i);
    }

    public void setNameError(boolean i) {
        this.NameError.setVisible(i);
    }

    public void setNameRequired(boolean i) {
        this.NameRequired.setVisible(i);
    }

    public void setStateError(boolean i) {
        this.StateError.setVisible(i);
    }

    public void setStateRequired(boolean i) {
        this.StateRequired.setVisible(i);
    }
     
    public void DisableErrors(){
    setNameError(false);
    setNameRequired(false);
    setNameRestriction(false);
    setCPFError(false);
    setCPFRequired(false);
    setCityError(false);
    setCityRequired(false);
    setStateError(false);
    setStateRequired(false);
    setAddressError(false);
    setCPFRestriction(false);
    }
    public CadastroUI() {
        initComponents();
              
      DisableErrors();
        
      StateField.setBackground(new java.awt.Color(0,0,0,1));
      CityField.setBackground(new java.awt.Color(0,0,0,1));
      CPFField.setBackground(new java.awt.Color(0,0,0,1));
      NameField.setBackground(new java.awt.Color(0,0,0,1));
      AddressField.setBackground(new java.awt.Color(0,0,0,1));
      
      ConfirmButton.setVisible(false);
      CancelButton.setVisible(false); 
      
      NameDone.setBackground(new java.awt.Color(0,0,0,1));
      CPFDone.setBackground(new java.awt.Color(0,0,0,1));
      CityDone.setBackground(new java.awt.Color(0,0,0,1));
      StateDone.setBackground(new java.awt.Color(0,0,0,1));
      AddressDone.setBackground(new java.awt.Color(0,0,0,1));
      
      Nametxt.setBackground(new java.awt.Color(0,0,0,1));
      CPFtxt.setBackground(new java.awt.Color(0,0,0,1));
      Citytxt.setBackground(new java.awt.Color(0,0,0,1));
      Statetxt.setBackground(new java.awt.Color(0,0,0,1));
      Addresstxt.setBackground(new java.awt.Color(0,0,0,1));
    

    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CadastroLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        NomeBack = new javax.swing.JLabel();
        CPFField = new javax.swing.JTextField();
        CPFLabel = new javax.swing.JLabel();
        CPFBack = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        CidadeLabel = new javax.swing.JLabel();
        CidadeBack = new javax.swing.JLabel();
        StateField = new javax.swing.JTextField();
        EstadoLabel = new javax.swing.JLabel();
        EstadoBack = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        EnderecoLabel = new javax.swing.JLabel();
        EnderecoBack = new javax.swing.JLabel();
        DoneButton = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        NameError = new javax.swing.JLabel();
        NameRequired = new javax.swing.JLabel();
        NameRestriction = new javax.swing.JLabel();
        CPFError = new javax.swing.JLabel();
        CPFRequired = new javax.swing.JLabel();
        CPFRestriction = new javax.swing.JLabel();
        CityError = new javax.swing.JLabel();
        CityRequired = new javax.swing.JLabel();
        StateError = new javax.swing.JLabel();
        StateRequired = new javax.swing.JLabel();
        AddressError = new javax.swing.JLabel();
        FundoCinza = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        NameDone = new javax.swing.JTextField();
        CPFDone = new javax.swing.JTextField();
        CityDone = new javax.swing.JTextField();
        AddressDone = new javax.swing.JTextField();
        StateDone = new javax.swing.JTextField();
        Addresstxt = new javax.swing.JTextField();
        Citytxt = new javax.swing.JTextField();
        Nametxt = new javax.swing.JTextField();
        CPFtxt = new javax.swing.JTextField();
        Statetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        CadastroLabel.setBackground(new java.awt.Color(255, 255, 255));
        CadastroLabel.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        CadastroLabel.setForeground(new java.awt.Color(255, 255, 255));
        CadastroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/Reduced_user_icon2.png"))); // NOI18N
        CadastroLabel.setText("Costumer Registration");
        jPanel1.add(CadastroLabel);
        CadastroLabel.setBounds(10, 10, 290, 40);

        NameField.setBackground(new java.awt.Color(204, 204, 204));
        NameField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        NameField.setForeground(new java.awt.Color(255, 255, 255));
        NameField.setBorder(null);
        NameField.setCaretColor(new java.awt.Color(255, 255, 255));
        NameField.setName(""); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NameField);
        NameField.setBounds(20, 80, 440, 30);

        NomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        NomeLabel.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        NomeLabel.setText("*Full Name");
        jPanel1.add(NomeLabel);
        NomeLabel.setBounds(10, 60, 90, 14);

        NomeBack.setForeground(new java.awt.Color(255, 255, 255));
        NomeBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/barra_interface.png"))); // NOI18N
        NomeBack.setText("jLabel2");
        NomeBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(NomeBack);
        NomeBack.setBounds(10, 80, 460, 30);

        CPFField.setBackground(new java.awt.Color(204, 204, 204));
        CPFField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        CPFField.setForeground(new java.awt.Color(255, 255, 255));
        CPFField.setBorder(null);
        CPFField.setCaretColor(new java.awt.Color(255, 255, 255));
        CPFField.setName(""); // NOI18N
        CPFField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CPFField);
        CPFField.setBounds(20, 150, 440, 30);

        CPFLabel.setBackground(new java.awt.Color(255, 255, 255));
        CPFLabel.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        CPFLabel.setForeground(new java.awt.Color(255, 255, 255));
        CPFLabel.setText("*Brazilian Id (CPF):");
        jPanel1.add(CPFLabel);
        CPFLabel.setBounds(10, 130, 140, 14);

        CPFBack.setForeground(new java.awt.Color(255, 255, 255));
        CPFBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CPFBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/barra_interface.png"))); // NOI18N
        CPFBack.setText("jLabel2");
        CPFBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CPFBack);
        CPFBack.setBounds(10, 150, 460, 30);

        CityField.setBackground(new java.awt.Color(204, 204, 204));
        CityField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        CityField.setForeground(new java.awt.Color(255, 255, 255));
        CityField.setBorder(null);
        CityField.setCaretColor(new java.awt.Color(255, 255, 255));
        CityField.setName(""); // NOI18N
        CityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(CityField);
        CityField.setBounds(20, 220, 440, 30);

        CidadeLabel.setBackground(new java.awt.Color(255, 255, 255));
        CidadeLabel.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        CidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        CidadeLabel.setText("*City");
        jPanel1.add(CidadeLabel);
        CidadeLabel.setBounds(10, 200, 90, 14);

        CidadeBack.setForeground(new java.awt.Color(255, 255, 255));
        CidadeBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CidadeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/barra_interface.png"))); // NOI18N
        CidadeBack.setText("jLabel2");
        CidadeBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(CidadeBack);
        CidadeBack.setBounds(10, 220, 460, 30);

        StateField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        StateField.setForeground(new java.awt.Color(255, 255, 255));
        StateField.setBorder(null);
        StateField.setCaretColor(new java.awt.Color(255, 255, 255));
        StateField.setName(""); // NOI18N
        StateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(StateField);
        StateField.setBounds(20, 290, 440, 30);

        EstadoLabel.setBackground(new java.awt.Color(255, 255, 255));
        EstadoLabel.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        EstadoLabel.setForeground(new java.awt.Color(255, 255, 255));
        EstadoLabel.setText("*State:");
        jPanel1.add(EstadoLabel);
        EstadoLabel.setBounds(10, 270, 80, 14);

        EstadoBack.setForeground(new java.awt.Color(255, 255, 255));
        EstadoBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EstadoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/barra_interface.png"))); // NOI18N
        EstadoBack.setText("jLabel2");
        EstadoBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(EstadoBack);
        EstadoBack.setBounds(10, 290, 460, 30);

        AddressField.setBackground(new java.awt.Color(204, 204, 204));
        AddressField.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        AddressField.setForeground(new java.awt.Color(255, 255, 255));
        AddressField.setBorder(null);
        AddressField.setCaretColor(new java.awt.Color(255, 255, 255));
        AddressField.setName(""); // NOI18N
        AddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AddressField);
        AddressField.setBounds(20, 360, 440, 30);

        EnderecoLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnderecoLabel.setFont(new java.awt.Font("Unispace", 1, 11)); // NOI18N
        EnderecoLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnderecoLabel.setText("Address:");
        jPanel1.add(EnderecoLabel);
        EnderecoLabel.setBounds(10, 340, 90, 14);

        EnderecoBack.setForeground(new java.awt.Color(255, 255, 255));
        EnderecoBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnderecoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/barra_interface.png"))); // NOI18N
        EnderecoBack.setText("jLabel2");
        EnderecoBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(EnderecoBack);
        EnderecoBack.setBounds(10, 360, 460, 30);

        DoneButton.setBackground(new java.awt.Color(51, 61, 71));
        DoneButton.setForeground(new java.awt.Color(255, 255, 255));
        DoneButton.setText("Done");
        DoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DoneButton);
        DoneButton.setBounds(10, 420, 70, 30);

        CleanButton.setBackground(new java.awt.Color(51, 61, 71));
        CleanButton.setForeground(new java.awt.Color(255, 255, 255));
        CleanButton.setText("Clean");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CleanButton);
        CleanButton.setBounds(100, 420, 70, 30);

        NameError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameError.setForeground(new java.awt.Color(153, 0, 0));
        NameError.setText("* incorrect name");
        jPanel1.add(NameError);
        NameError.setBounds(10, 110, 280, 20);

        NameRequired.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameRequired.setForeground(new java.awt.Color(153, 0, 0));
        NameRequired.setText("* name is a required field");
        jPanel1.add(NameRequired);
        NameRequired.setBounds(10, 110, 180, 20);

        NameRestriction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NameRestriction.setForeground(new java.awt.Color(153, 0, 0));
        NameRestriction.setText("*name accept only letters");
        jPanel1.add(NameRestriction);
        NameRestriction.setBounds(10, 110, 160, 20);

        CPFError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPFError.setForeground(new java.awt.Color(153, 0, 0));
        CPFError.setText("* incorrect CPF");
        jPanel1.add(CPFError);
        CPFError.setBounds(10, 180, 280, 15);

        CPFRequired.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPFRequired.setForeground(new java.awt.Color(153, 0, 0));
        CPFRequired.setText("* CPF is a required field");
        jPanel1.add(CPFRequired);
        CPFRequired.setBounds(10, 180, 160, 15);

        CPFRestriction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPFRestriction.setForeground(new java.awt.Color(153, 0, 0));
        CPFRestriction.setText("* CPF accept only numbers");
        jPanel1.add(CPFRestriction);
        CPFRestriction.setBounds(10, 180, 150, 15);

        CityError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CityError.setForeground(new java.awt.Color(153, 0, 0));
        CityError.setText("* incorrect city");
        jPanel1.add(CityError);
        CityError.setBounds(10, 250, 280, 15);

        CityRequired.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CityRequired.setForeground(new java.awt.Color(153, 0, 0));
        CityRequired.setText("* city is a required field");
        jPanel1.add(CityRequired);
        CityRequired.setBounds(10, 250, 280, 15);

        StateError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StateError.setForeground(new java.awt.Color(153, 0, 0));
        StateError.setText("* incorrect state");
        jPanel1.add(StateError);
        StateError.setBounds(10, 320, 280, 15);

        StateRequired.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StateRequired.setForeground(new java.awt.Color(153, 0, 0));
        StateRequired.setText("* state is a required field");
        jPanel1.add(StateRequired);
        StateRequired.setBounds(10, 320, 280, 15);

        AddressError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressError.setForeground(new java.awt.Color(153, 0, 0));
        AddressError.setText("* incorrect address");
        jPanel1.add(AddressError);
        AddressError.setBounds(10, 390, 280, 15);

        FundoCinza.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pichau\\Documents\\NetBeansProjects\\CadastroClientes\\src\\cadastroclientes\\fundark.png")); // NOI18N
        FundoCinza.setText("dqwdq");
        FundoCinza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(FundoCinza);
        FundoCinza.setBounds(0, 0, 480, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 500);

        ConfirmButton.setBackground(new java.awt.Color(51, 61, 71));
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(500, 420, 80, 30);

        CancelButton.setBackground(new java.awt.Color(51, 61, 71));
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton);
        CancelButton.setBounds(590, 420, 70, 30);

        NameDone.setEditable(false);
        NameDone.setBackground(new java.awt.Color(0, 0, 0));
        NameDone.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        NameDone.setForeground(new java.awt.Color(255, 255, 255));
        NameDone.setBorder(null);
        NameDone.setCaretColor(new java.awt.Color(255, 255, 255));
        NameDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameDoneActionPerformed(evt);
            }
        });
        getContentPane().add(NameDone);
        NameDone.setBounds(500, 80, 430, 30);

        CPFDone.setEditable(false);
        CPFDone.setBackground(new java.awt.Color(0, 0, 0));
        CPFDone.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        CPFDone.setForeground(new java.awt.Color(255, 255, 255));
        CPFDone.setBorder(null);
        CPFDone.setCaretColor(new java.awt.Color(255, 255, 255));
        CPFDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFDoneActionPerformed(evt);
            }
        });
        getContentPane().add(CPFDone);
        CPFDone.setBounds(500, 150, 430, 30);

        CityDone.setEditable(false);
        CityDone.setBackground(new java.awt.Color(0, 0, 0));
        CityDone.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        CityDone.setForeground(new java.awt.Color(255, 255, 255));
        CityDone.setBorder(null);
        CityDone.setCaretColor(new java.awt.Color(255, 255, 255));
        CityDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityDoneActionPerformed(evt);
            }
        });
        getContentPane().add(CityDone);
        CityDone.setBounds(500, 220, 430, 30);

        AddressDone.setEditable(false);
        AddressDone.setBackground(new java.awt.Color(0, 0, 0));
        AddressDone.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        AddressDone.setForeground(new java.awt.Color(255, 255, 255));
        AddressDone.setBorder(null);
        AddressDone.setCaretColor(new java.awt.Color(255, 255, 255));
        AddressDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressDoneActionPerformed(evt);
            }
        });
        getContentPane().add(AddressDone);
        AddressDone.setBounds(500, 360, 430, 30);

        StateDone.setEditable(false);
        StateDone.setBackground(new java.awt.Color(0, 0, 0));
        StateDone.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        StateDone.setForeground(new java.awt.Color(255, 255, 255));
        StateDone.setBorder(null);
        StateDone.setCaretColor(new java.awt.Color(255, 255, 255));
        StateDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateDoneActionPerformed(evt);
            }
        });
        getContentPane().add(StateDone);
        StateDone.setBounds(500, 290, 430, 30);

        Addresstxt.setEditable(false);
        Addresstxt.setBackground(new java.awt.Color(0, 0, 0));
        Addresstxt.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        Addresstxt.setForeground(new java.awt.Color(255, 255, 255));
        Addresstxt.setBorder(null);
        Addresstxt.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(Addresstxt);
        Addresstxt.setBounds(500, 330, 120, 30);

        Citytxt.setEditable(false);
        Citytxt.setBackground(new java.awt.Color(0, 0, 0));
        Citytxt.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        Citytxt.setForeground(new java.awt.Color(255, 255, 255));
        Citytxt.setBorder(null);
        Citytxt.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(Citytxt);
        Citytxt.setBounds(500, 190, 120, 30);

        Nametxt.setEditable(false);
        Nametxt.setBackground(new java.awt.Color(0, 0, 0));
        Nametxt.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        Nametxt.setForeground(new java.awt.Color(255, 255, 255));
        Nametxt.setBorder(null);
        Nametxt.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nametxt);
        Nametxt.setBounds(500, 50, 120, 30);

        CPFtxt.setEditable(false);
        CPFtxt.setBackground(new java.awt.Color(0, 0, 0));
        CPFtxt.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        CPFtxt.setForeground(new java.awt.Color(255, 255, 255));
        CPFtxt.setBorder(null);
        CPFtxt.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(CPFtxt);
        CPFtxt.setBounds(500, 120, 120, 30);

        Statetxt.setEditable(false);
        Statetxt.setBackground(new java.awt.Color(0, 0, 0));
        Statetxt.setFont(new java.awt.Font("Unispace", 0, 11)); // NOI18N
        Statetxt.setForeground(new java.awt.Color(255, 255, 255));
        Statetxt.setBorder(null);
        Statetxt.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(Statetxt);
        Statetxt.setBounds(500, 260, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Made by: Gabriel Andrade Corrêa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(780, 454, 160, 10);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastroclientes/fundo_interface.png"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 950, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateFieldActionPerformed

    private void CityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void AddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFieldActionPerformed

    private void CPFFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFFieldActionPerformed

    private void DoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneButtonActionPerformed
    
        
   DisableErrors();
   int error=0;     
        

    if("".equals(NameField.getText())){
      setNameRequired(true);error++;        
    }else if(NameField.getText().matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")){
    }else{setNameRestriction(true);error++;}
    
    if("".equals(CPFField.getText())){
      setCPFRequired(true);error++;}
    else if(CPFField.getText().matches("^[0-9]*$")){
    }else{setCPFRestriction(true);error++;}
    
    if("".equals(CityField.getText())){
    setCityRequired(true);error++;}
    else{}
    
    if("".equals(StateField.getText())){
    setStateRequired(true);error++;    }
    else{}
    
    
    
    if(error==0){    
                        
        
    NameDone.setText(NameField.getText());
    CPFDone.setText(CPFField.getText());
    CityDone.setText(CityField.getText());
    StateDone.setText(StateField.getText());
    AddressDone.setText(AddressField.getText());
    
    Nametxt.setText("Full name:");
    CPFtxt.setText("CPF:");
    Citytxt.setText("City:");
    Statetxt.setText("State:");
    Addresstxt.setText("Address:");        
    
    DoneButton.setEnabled(false);
    CleanButton.setEnabled(false);
    ConfirmButton.setVisible(true);
    CancelButton.setVisible(true);
    
    NameField.setEditable(false);
    CPFField.setEditable(false);
    CityField.setEditable(false);
    StateField.setEditable(false);
    AddressField.setEditable(false);
    
    ConfirmButton.setVisible(true);
    CancelButton.setVisible(true);
    }
   

    }//GEN-LAST:event_DoneButtonActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
    NameField.setText("");
    CPFField.setText("");
    CityField.setText("");
    StateField.setText("");
    AddressField.setText("");
    
    NameDone.setText("");
    CPFDone.setText("");
    CityDone.setText("");
    StateDone.setText("");
    AddressDone.setText("");
    }//GEN-LAST:event_CleanButtonActionPerformed

    private void CPFDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFDoneActionPerformed

    }//GEN-LAST:event_CPFDoneActionPerformed

    private void NameDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameDoneActionPerformed
    }//GEN-LAST:event_NameDoneActionPerformed

    private void CityDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityDoneActionPerformed
    }//GEN-LAST:event_CityDoneActionPerformed

    private void StateDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateDoneActionPerformed
    }//GEN-LAST:event_StateDoneActionPerformed

    private void AddressDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressDoneActionPerformed
    }//GEN-LAST:event_AddressDoneActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        NameDone.setText("");
        CPFDone.setText("");
        CityDone.setText("");
        StateDone.setText("");
        AddressDone.setText("");
            
        Nametxt.setText("");
        CPFtxt.setText("");
        Citytxt.setText("");
        Statetxt.setText("");
        Addresstxt.setText("");  
        
    DoneButton.setEnabled(true);
    CleanButton.setEnabled(true);
    
    NameField.setEditable(true);
    CPFField.setEditable(true);
    CityField.setEditable(true);
    StateField.setEditable(true);
    AddressField.setEditable(true);
    
      ConfirmButton.setVisible(false);
      CancelButton.setVisible(false);      
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
    this.name = NameDone.getText();
    this.CPF = CPFDone.getText();
    this.City = CityDone.getText();
    this.State = StateDone.getText();
    this.Address = AddressDone.getText(); 
    
    NameField.setText("");
    NameDone.setText("");
    CPFField.setText("");
    CPFDone.setText("");
    CityField.setText("");
    CityDone.setText("");
    StateField.setText("");
    StateDone.setText("");
    AddressField.setText("");
    AddressDone.setText("");
    
        Nametxt.setText("");
        CPFtxt.setText("");
        Citytxt.setText("");
        Statetxt.setText("");
        Addresstxt.setText("");  
        
    DoneButton.setEnabled(true);
    CleanButton.setEnabled(true);
    
    NameField.setEditable(true);
    CPFField.setEditable(true);
    CityField.setEditable(true);
    StateField.setEditable(true);
    AddressField.setEditable(true);
    
    ConfirmButton.setVisible(false);
    CancelButton.setVisible(false);      
        JOptionPane.showMessageDialog(this, "User Cadastration Done!");
        System.out.println();
 
    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressDone;
    private javax.swing.JLabel AddressError;
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CPFBack;
    private javax.swing.JTextField CPFDone;
    private javax.swing.JLabel CPFError;
    private javax.swing.JTextField CPFField;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JLabel CPFRequired;
    private javax.swing.JLabel CPFRestriction;
    private javax.swing.JTextField CPFtxt;
    private javax.swing.JLabel CadastroLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CidadeBack;
    private javax.swing.JLabel CidadeLabel;
    private javax.swing.JTextField CityDone;
    private javax.swing.JLabel CityError;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityRequired;
    private javax.swing.JTextField Citytxt;
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton DoneButton;
    private javax.swing.JLabel EnderecoBack;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JLabel EstadoBack;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JLabel FundoCinza;
    private javax.swing.JTextField NameDone;
    private javax.swing.JLabel NameError;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameRequired;
    private javax.swing.JLabel NameRestriction;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JLabel NomeBack;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField StateDone;
    private javax.swing.JLabel StateError;
    private javax.swing.JTextField StateField;
    private javax.swing.JLabel StateRequired;
    private javax.swing.JTextField Statetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
