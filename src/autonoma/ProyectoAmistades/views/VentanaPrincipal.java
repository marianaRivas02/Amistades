/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.ProyectoAmistades.views;


import autonoma.ProyectoAmistades.models.DirectorioAmistades;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author maria
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //Atributos 
    /**
    * Instancia de DirectorioAmistades
    */
    DirectorioAmistades directorio;
    
    /**
     * Inicializa los atributos de la clase VentanaPrincipal
     *
     * @param    directorio
    */
    public VentanaPrincipal(DirectorioAmistades directorio) {
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/proyectoAmistades/images/directorioAmistades.png")).getImage());
        }catch (Exception e){
            
        }
        
        this.directorio = directorio;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarAmigo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarAmigo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarAmigo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnActualizarAmigo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnVerAmigos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnVerInfoApp = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(186, 200, 255));

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amistades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Agregar Amigo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/ProyectoAmistades/images/AñadirAmigo.png"))); // NOI18N

        javax.swing.GroupLayout btnAgregarAmigoLayout = new javax.swing.GroupLayout(btnAgregarAmigo);
        btnAgregarAmigo.setLayout(btnAgregarAmigoLayout);
        btnAgregarAmigoLayout.setHorizontalGroup(
            btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addGroup(btnAgregarAmigoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnAgregarAmigoLayout.setVerticalGroup(
            btnAgregarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarAmigoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        btnEliminarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarAmigoMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Eliminar Amigo");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/ProyectoAmistades/images/eliminarAmigo.png"))); // NOI18N

        javax.swing.GroupLayout btnEliminarAmigoLayout = new javax.swing.GroupLayout(btnEliminarAmigo);
        btnEliminarAmigo.setLayout(btnEliminarAmigoLayout);
        btnEliminarAmigoLayout.setHorizontalGroup(
            btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarAmigoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btnEliminarAmigoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnEliminarAmigoLayout.setVerticalGroup(
            btnEliminarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarAmigoMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Buscar Amigo");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/ProyectoAmistades/images/buscarAmigo.png"))); // NOI18N

        javax.swing.GroupLayout btnBuscarAmigoLayout = new javax.swing.GroupLayout(btnBuscarAmigo);
        btnBuscarAmigo.setLayout(btnBuscarAmigoLayout);
        btnBuscarAmigoLayout.setHorizontalGroup(
            btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(btnBuscarAmigoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnBuscarAmigoLayout.setVerticalGroup(
            btnBuscarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnActualizarAmigo.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarAmigoMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Actualizar Amigo");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/ProyectoAmistades/images/actualizarAmigo.png"))); // NOI18N

        javax.swing.GroupLayout btnActualizarAmigoLayout = new javax.swing.GroupLayout(btnActualizarAmigo);
        btnActualizarAmigo.setLayout(btnActualizarAmigoLayout);
        btnActualizarAmigoLayout.setHorizontalGroup(
            btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarAmigoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btnActualizarAmigoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnActualizarAmigoLayout.setVerticalGroup(
            btnActualizarAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarAmigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnVerAmigos.setBackground(new java.awt.Color(186, 200, 255));
        btnVerAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerAmigosMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gabriola", 3, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ver amigos");

        javax.swing.GroupLayout btnVerAmigosLayout = new javax.swing.GroupLayout(btnVerAmigos);
        btnVerAmigos.setLayout(btnVerAmigosLayout);
        btnVerAmigosLayout.setHorizontalGroup(
            btnVerAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerAmigosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        btnVerAmigosLayout.setVerticalGroup(
            btnVerAmigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerAmigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVerInfoApp.setBackground(new java.awt.Color(186, 200, 255));
        btnVerInfoApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerInfoAppMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gabriola", 3, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ver  info App");

        javax.swing.GroupLayout btnVerInfoAppLayout = new javax.swing.GroupLayout(btnVerInfoApp);
        btnVerInfoApp.setLayout(btnVerInfoAppLayout);
        btnVerInfoAppLayout.setHorizontalGroup(
            btnVerInfoAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVerInfoAppLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        btnVerInfoAppLayout.setVerticalGroup(
            btnVerInfoAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVerInfoAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(148, 148, 148))
        );

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Conectate con quienes mas te importan. Agrega, actualiza y encuentra a tus amigos en un solo lugar");

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/ProyectoAmistades/images/salir.png"))); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel12.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Salir");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEliminarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnBuscarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVerAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVerInfoApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnActualizarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel14)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerInfoApp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseEntered
        this.mouseEntered(btnAgregarAmigo);
    }//GEN-LAST:event_btnAgregarAmigoMouseEntered

    private void btnAgregarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseExited
      this.mouseExited(btnAgregarAmigo);
    }//GEN-LAST:event_btnAgregarAmigoMouseExited

    private void btnEliminarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseEntered
         this.mouseEntered(btnEliminarAmigo);
    }//GEN-LAST:event_btnEliminarAmigoMouseEntered

    private void btnEliminarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseExited
        this.mouseExited(btnEliminarAmigo);
    }//GEN-LAST:event_btnEliminarAmigoMouseExited

    private void btnBuscarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseEntered
          this.mouseEntered(btnBuscarAmigo);
    }//GEN-LAST:event_btnBuscarAmigoMouseEntered

    private void btnBuscarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseExited
         this.mouseExited(btnBuscarAmigo);
    }//GEN-LAST:event_btnBuscarAmigoMouseExited

    private void btnActualizarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseEntered
        this.mouseEntered(btnActualizarAmigo);
    }//GEN-LAST:event_btnActualizarAmigoMouseEntered

    private void btnActualizarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseExited
        this.mouseExited(btnActualizarAmigo);
    }//GEN-LAST:event_btnActualizarAmigoMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        this.mouseEntered(btnSalir);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        this.mouseExited(btnSalir);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseClicked
        AgregarAmigo ventanaAgregarAmigo = new AgregarAmigo (this, true, this.directorio, this);
        ventanaAgregarAmigo.setVisible(true);
    }//GEN-LAST:event_btnAgregarAmigoMouseClicked

    private void btnEliminarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAmigoMouseClicked
        if(this.directorio.getAmigos().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe agregar un amigo primero, no puede eliminar amigos inexistentes");
        }
        else{
            EliminarAmigo ventanaEliminarAmigo = new EliminarAmigo (this, true, this.directorio, this);
            ventanaEliminarAmigo.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarAmigoMouseClicked

    private void btnBuscarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarAmigoMouseClicked
        System.out.println("buscar amigo");
    }//GEN-LAST:event_btnBuscarAmigoMouseClicked

    private void btnActualizarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAmigoMouseClicked
        if(this.directorio.getAmigos().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe agregar un amigo primero");
        }
        else{
            ActualizarAmigo ventanaActualizarAmigo = new ActualizarAmigo (this, true, this.directorio, this);
            ventanaActualizarAmigo.setVisible(true);
        }
    }//GEN-LAST:event_btnActualizarAmigoMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnVerAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerAmigosMouseClicked
        VerAmigos ventanaVerAmigos = new VerAmigos (this, true, this.directorio, this);
        ventanaVerAmigos.setVisible(true);
    }//GEN-LAST:event_btnVerAmigosMouseClicked

    private void btnVerInfoAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerInfoAppMouseClicked
        System.out.println("ver informacion de la aplicacion");
    }//GEN-LAST:event_btnVerInfoAppMouseClicked
    
    private void mouseEntered(JPanel panel){


        panel.setBackground(new Color (222, 229, 255));
    

        panel.setBackground(new Color (207, 240, 255));
    }
    
    private void mouseExited (JPanel panel){
        panel.setBackground(Color.white);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnActualizarAmigo;
    private javax.swing.JPanel btnAgregarAmigo;
    private javax.swing.JPanel btnBuscarAmigo;
    private javax.swing.JPanel btnEliminarAmigo;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnVerAmigos;
    private javax.swing.JPanel btnVerInfoApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    // End of variables declaration//GEN-END:variables
}
