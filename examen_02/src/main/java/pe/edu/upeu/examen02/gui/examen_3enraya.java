package pe.edu.upeu.examen02.gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;

public class examen_3enraya extends javax.swing.JFrame {
    
    
    
    
    private int jugador;
    private int modo;
    
    public String mensaje;
    public int estado;
    public int respuesta;
    public boolean valido;
    
    Random r = new Random();
    private JLabel[][] casillas;

    public examen_3enraya() {
        initComponents();
        jugador=1;
        modo=1;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorSuperior = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_turno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        victoriasJ2 = new javax.swing.JLabel();
        victoriasJ1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_casilla1 = new javax.swing.JButton();
        btn_casilla2 = new javax.swing.JButton();
        btn_casilla3 = new javax.swing.JButton();
        btn_casilla4 = new javax.swing.JButton();
        btn_casilla5 = new javax.swing.JButton();
        btn_casilla6 = new javax.swing.JButton();
        btn_casilla7 = new javax.swing.JButton();
        btn_casilla8 = new javax.swing.JButton();
        btn_casilla9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnIniciar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtDni1 = new javax.swing.JTextField();
        menu = new javax.swing.JMenuBar();
        menu_partida = new javax.swing.JMenu();
        btn_1jugador = new javax.swing.JRadioButtonMenuItem();
        btn_2jugadores = new javax.swing.JRadioButtonMenuItem();
        menu_opciones = new javax.swing.JMenu();
        btn_aCercaDe = new javax.swing.JMenuItem();
        btn_reiniciar = new javax.swing.JMenuItem();
        btn_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_titulo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lbl_titulo.setText("EVALUACION UNIDAD 2");

        jLabel1.setText("Nombre: yhojana uscamayta mamani ");

        lbl_turno.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbl_turno.setText("Turno de X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lbl_turno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbl_turno))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel10.setText("jugador 1 :");

        victoriasJ2.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        victoriasJ2.setText("0");

        victoriasJ1.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        victoriasJ1.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        jLabel11.setText("jugador 2 :");

        btn_casilla1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla1ActionPerformed(evt);
            }
        });

        btn_casilla2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla2ActionPerformed(evt);
            }
        });

        btn_casilla3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla3ActionPerformed(evt);
            }
        });

        btn_casilla4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla4ActionPerformed(evt);
            }
        });

        btn_casilla5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla5ActionPerformed(evt);
            }
        });

        btn_casilla6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla6ActionPerformed(evt);
            }
        });

        btn_casilla7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla7ActionPerformed(evt);
            }
        });

        btn_casilla8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla8ActionPerformed(evt);
            }
        });

        btn_casilla9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        btn_casilla9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_casilla9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(victoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(victoriasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(victoriasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(victoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("TABLA DE PUNTUACION ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de partido", "Nombre del jugador", "Nombre del ganador", "Puntuacion ", "Estado"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 446, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnAnular.setText("ANULAR");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre del jugador 1:");

        jLabel4.setText("Nombre del jugador 2:");

        menu_partida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Component.png"))); // NOI18N
        menu_partida.setText("Partida");

        btn_1jugador.setSelected(true);
        btn_1jugador.setText("Un jugador");
        btn_1jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Male.png"))); // NOI18N
        btn_1jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1jugadorActionPerformed(evt);
            }
        });
        menu_partida.add(btn_1jugador);

        btn_2jugadores.setText("Dos jugadores");
        btn_2jugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/People.png"))); // NOI18N
        btn_2jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2jugadoresActionPerformed(evt);
            }
        });
        menu_partida.add(btn_2jugadores);

        menu.add(menu_partida);

        menu_opciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Application.png"))); // NOI18N
        menu_opciones.setText("Opciones");

        btn_aCercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/About.png"))); // NOI18N
        btn_aCercaDe.setText("A cerca de");
        btn_aCercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aCercaDeActionPerformed(evt);
            }
        });
        menu_opciones.add(btn_aCercaDe);

        btn_reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Refresh.png"))); // NOI18N
        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });
        menu_opciones.add(btn_reiniciar);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Exit.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        menu_opciones.add(btn_salir);

        menu.add(menu_opciones);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(separadorSuperior))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnular))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_aCercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aCercaDeActionPerformed
    
    }//GEN-LAST:event_btn_aCercaDeActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        
        reiniciar();
    }//GEN-LAST:event_btn_reiniciarActionPerformed

    private void btn_1jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1jugadorActionPerformed

        
        if(btn_1jugador.isSelected()) {
            setModo(1);
            reiniciar();
        }
        btn_1jugador.setSelected(true);
        btn_2jugadores.setSelected(false);
    }//GEN-LAST:event_btn_1jugadorActionPerformed

    private void btn_2jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2jugadoresActionPerformed
        
        
        if(btn_2jugadores.isSelected()) {
            setModo(2);
            reiniciar();
        }
        btn_1jugador.setSelected(false);
        btn_2jugadores.setSelected(true);
    }//GEN-LAST:event_btn_2jugadoresActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btn_casilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla4ActionPerformed

        if (btn_casilla4.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla4.setForeground(Color.blue);
                btn_casilla4.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla4.setForeground(Color.red);
                btn_casilla4.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla4ActionPerformed

    private void btn_casilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla3ActionPerformed

        if (btn_casilla3.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla3.setForeground(Color.blue);
                btn_casilla3.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla3.setForeground(Color.red);
                btn_casilla3.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla3ActionPerformed

    private void btn_casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla2ActionPerformed

        if (btn_casilla2.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla2.setForeground(Color.blue);
                btn_casilla2.setText("X");

                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla2.setForeground(Color.red);
                btn_casilla2.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla2ActionPerformed

    private void btn_casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla1ActionPerformed

        if (btn_casilla1.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla1.setForeground(Color.blue);
                btn_casilla1.setText("X");

                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla1.setForeground(Color.red);
                btn_casilla1.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",
            JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla1ActionPerformed

    private void btn_casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla5ActionPerformed

        if (btn_casilla5.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla5.setForeground(Color.blue);
                btn_casilla5.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla5.setForeground(Color.red);
                btn_casilla5.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla5ActionPerformed

    private void btn_casilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla6ActionPerformed

        if (btn_casilla6.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla6.setForeground(Color.blue);
                btn_casilla6.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla6.setForeground(Color.red);
                btn_casilla6.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla6ActionPerformed

    private void btn_casilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla7ActionPerformed

        if (btn_casilla7.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla7.setForeground(Color.blue);
                btn_casilla7.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla7.setForeground(Color.red);
                btn_casilla7.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla7ActionPerformed

    private void btn_casilla8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla8ActionPerformed

        if (btn_casilla8.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla8.setForeground(Color.blue);
                btn_casilla8.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla8.setForeground(Color.red);
                btn_casilla8.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        paintForm();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_casilla9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_casilla9ActionPerformed

        if (btn_casilla9.getText().isEmpty()) {
            if (getJugador()==1) {
                btn_casilla9.setForeground(Color.blue);
                btn_casilla9.setText("X");
                if (getModo()==2) {
                    setJugador(2);
                    lbl_turno.setText("Turno de O");
                }
            }else{
                btn_casilla9.setForeground(Color.red);
                btn_casilla9.setText("O");
                setJugador(1);
                lbl_turno.setText("Turno de X");
            }

            estado=comprobarEstado();

            if (getModo()==1 && estado==0) {
                jugadaOrdenador();
                estado=comprobarEstado();
            }

            if (estado != 0)
            finalizarPartida();

        }else
        JOptionPane.showMessageDialog(null,"Ya hay una ficha en esta casilla.","Jugada no válida",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_casilla9ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(examen_3enraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examen_3enraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examen_3enraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examen_3enraya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                examen_3enraya t = new examen_3enraya();
                t.setTitle("Tres En Raya");
                t.setVisible(true);
                t.setLocationRelativeTo(null);
                t.setResizable(false);
                
                ImageIcon icono= new ImageIcon("/iconos/Application.png");
                t.setIconImage(icono.getImage());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JRadioButtonMenuItem btn_1jugador;
    private javax.swing.JRadioButtonMenuItem btn_2jugadores;
    private javax.swing.JMenuItem btn_aCercaDe;
    private javax.swing.JButton btn_casilla1;
    private javax.swing.JButton btn_casilla2;
    private javax.swing.JButton btn_casilla3;
    private javax.swing.JButton btn_casilla4;
    private javax.swing.JButton btn_casilla5;
    private javax.swing.JButton btn_casilla6;
    private javax.swing.JButton btn_casilla7;
    private javax.swing.JButton btn_casilla8;
    private javax.swing.JButton btn_casilla9;
    private javax.swing.JMenuItem btn_reiniciar;
    private javax.swing.JMenuItem btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_opciones;
    private javax.swing.JMenu menu_partida;
    private javax.swing.JSeparator separadorSuperior;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JLabel victoriasJ1;
    private javax.swing.JLabel victoriasJ2;
    // End of variables declaration//GEN-END:variables
 
    public int comprobarEstado() {
        
        if(btn_casilla1.getText().equals("X") && btn_casilla2.getText().equals("X") && btn_casilla3.getText().equals("X") ||
           btn_casilla4.getText().equals("X") && btn_casilla5.getText().equals("X") && btn_casilla6.getText().equals("X") ||
           btn_casilla7.getText().equals("X") && btn_casilla8.getText().equals("X") && btn_casilla9.getText().equals("X") ||
           btn_casilla1.getText().equals("X") && btn_casilla4.getText().equals("X") && btn_casilla7.getText().equals("X") ||
           btn_casilla2.getText().equals("X") && btn_casilla5.getText().equals("X") && btn_casilla8.getText().equals("X") ||     
           btn_casilla3.getText().equals("X") && btn_casilla6.getText().equals("X") && btn_casilla9.getText().equals("X") ||
           btn_casilla1.getText().equals("X") && btn_casilla5.getText().equals("X") && btn_casilla9.getText().equals("X") ||     
           btn_casilla3.getText().equals("X") && btn_casilla5.getText().equals("X") && btn_casilla7.getText().equals("X"))
            return 1;
        
        else if(btn_casilla1.getText().equals("O") && btn_casilla2.getText().equals("O") && btn_casilla3.getText().equals("O") ||
                btn_casilla4.getText().equals("O") && btn_casilla5.getText().equals("O") && btn_casilla6.getText().equals("O") ||
                btn_casilla7.getText().equals("O") && btn_casilla8.getText().equals("O") && btn_casilla9.getText().equals("O") ||
                btn_casilla1.getText().equals("O") && btn_casilla4.getText().equals("O") && btn_casilla7.getText().equals("O") ||
                btn_casilla2.getText().equals("O") && btn_casilla5.getText().equals("O") && btn_casilla8.getText().equals("O") ||     
                btn_casilla3.getText().equals("O") && btn_casilla6.getText().equals("O") && btn_casilla9.getText().equals("O") ||
                btn_casilla1.getText().equals("O") && btn_casilla5.getText().equals("O") && btn_casilla9.getText().equals("O") ||     
                btn_casilla3.getText().equals("O") && btn_casilla5.getText().equals("O") && btn_casilla7.getText().equals("O"))
            return 2;
        
        if (btn_casilla1.getText().isEmpty() || btn_casilla2.getText().isEmpty() || btn_casilla3.getText().isEmpty() ||
            btn_casilla4.getText().isEmpty() || btn_casilla5.getText().isEmpty() || btn_casilla6.getText().isEmpty() ||
            btn_casilla7.getText().isEmpty() || btn_casilla8.getText().isEmpty() || btn_casilla9.getText().isEmpty())
            return 0;
        
        return 3;
    }
    
    public void reiniciar() {
        
        btn_casilla1.setText("");
        btn_casilla2.setText("");
        btn_casilla3.setText("");
        btn_casilla4.setText("");
        btn_casilla5.setText("");
        btn_casilla6.setText("");
        btn_casilla7.setText("");
        btn_casilla8.setText("");
        btn_casilla9.setText("");
        setJugador(1);
        lbl_turno.setText("Turno de X");
    }
    
    public void jugadaOrdenador() {
        
        valido=false;
        
        do {
            switch(r.nextInt(9)+1) {
                case 1:
                    if (btn_casilla1.getText().isEmpty()) {
                        btn_casilla1.setForeground(Color.red);
                        btn_casilla1.setText("O");
                        valido=true;
                    }
                    break;
                case 2:
                    if (btn_casilla2.getText().isEmpty()) {
                        btn_casilla2.setForeground(Color.red);
                        btn_casilla2.setText("O");
                        valido=true;
                    }
                    break;
                case 3:
                    if (btn_casilla3.getText().isEmpty()) {
                        btn_casilla3.setForeground(Color.red);
                        btn_casilla3.setText("O");
                        valido=true;
                    }
                    break;
                case 4:
                    if (btn_casilla4.getText().isEmpty()) {
                        btn_casilla4.setForeground(Color.red);
                        btn_casilla4.setText("O");
                        valido=true;
                    }
                    break;
                case 5:
                    if (btn_casilla5.getText().isEmpty()) {
                        btn_casilla5.setForeground(Color.red);
                        btn_casilla5.setText("O");
                        valido=true;
                    }
                    break;
                case 6:
                    if (btn_casilla6.getText().isEmpty()) {
                        btn_casilla6.setForeground(Color.red);
                        btn_casilla6.setText("O");
                        valido=true;
                    }
                    break;
                case 7:
                    if (btn_casilla7.getText().isEmpty()) {
                        btn_casilla7.setForeground(Color.red);
                        btn_casilla7.setText("O");
                        valido=true;
                    }
                    break;
                case 8:
                    if (btn_casilla8.getText().isEmpty()) {
                        btn_casilla8.setForeground(Color.red);
                        btn_casilla8.setText("O");
                        valido=true;
                    }
                    break;
                case 9:
                    if (btn_casilla9.getText().isEmpty()) {
                        btn_casilla9.setForeground(Color.red);
                        btn_casilla9.setText("O");
                        valido=true;
                    }
                    break;
            }
        }while(!valido);
    }
    
    public void finalizarPartida() {
        switch(estado) {
            case 1:
                mensaje="¡El jugador X gana la partida!\n¿Quieres volver a jugar?";
                break;
            case 2:
                mensaje="¡El jugador O gana la partida!\n¿Quieres volver a jugar?";
                break;
            case 3:
                mensaje="¡Partida en tablas!\n¿Quieres volver a jugar?";
                break;
        }
                
        respuesta=JOptionPane.showConfirmDialog(null,mensaje,"Fin de partida",JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_NO_OPTION)
            reiniciar();
        else
            System.exit(0);
    }
    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    private void paintForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JLabel[][] getCasillas(){
        return casillas;
    }
    public JLabel getVictoriasJ1(){
        return victoriasJ1;
    }
    public JLabel getVictoriasJ2(){
        return victoriasJ2;
    }
    public JButton getBotonReset(){
        return btnIniciar;
    }
    
     public JButton getBotonAnular(){
        return btnAnular;
    }
}
