package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import universidad.Alumno;
import universidad.PAS;
import universidad.Profesor;
import universidad.IT;

public class guiMain extends javax.swing.JFrame {

    boolean isAlumno;
    boolean isProfesor;
    boolean isPAS;
    boolean isIT;

    String nombre;
    String apellido;
    String dni;
    String correo;
    String telefono;
    String direccion;
    String id;

    PAS pas;
    IT it;
    Profesor profesor;
    Alumno alumno;

    public guiMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfAlumno = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelarAlumno = new javax.swing.JButton();
        btnCrearAlumno = new javax.swing.JButton();
        txfHorarioAlumno = new javax.swing.JTextField();
        txfTutorAlumno = new javax.swing.JTextField();
        txfAulaAlumno = new javax.swing.JTextField();
        txfCursoAlumno = new javax.swing.JTextField();
        txfCicloAlumno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jfIT = new javax.swing.JFrame();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnCancelarIT = new javax.swing.JButton();
        btnCrearIT = new javax.swing.JButton();
        txfEstacionDeTrabajoIT = new javax.swing.JTextField();
        txfExtensionIT = new javax.swing.JTextField();
        txfSalarioIT = new javax.swing.JTextField();
        txfHorarioIT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cbHacePracticasIT = new javax.swing.JCheckBox();
        jfPAS = new javax.swing.JFrame();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnCancelarPAS = new javax.swing.JButton();
        btnCrearPAS = new javax.swing.JButton();
        txfExtensionPAS = new javax.swing.JTextField();
        txfOficinasPAS = new javax.swing.JTextField();
        txfHorarioPAS = new javax.swing.JTextField();
        txfSalarioPAS = new javax.swing.JTextField();
        txfRolPAS = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jfProfesor = new javax.swing.JFrame();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnCancelarProfesor = new javax.swing.JButton();
        btnCrearProfesor = new javax.swing.JButton();
        txfGradoProfesor = new javax.swing.JTextField();
        txfAulaProfesor = new javax.swing.JTextField();
        txfSalarioProfesor = new javax.swing.JTextField();
        txfHorarioProfesor = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cbTutorProfesor = new javax.swing.JCheckBox();
        cbProfesor = new javax.swing.JCheckBox();
        cbAlumno = new javax.swing.JCheckBox();
        cbIT = new javax.swing.JCheckBox();
        cbPAS = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txfTelefono = new javax.swing.JTextField();
        txfCorreo = new javax.swing.JTextField();
        txfDNI = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        txfApellido = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jfAlumno.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ciclo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Curso");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Aula");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Tutor");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Horario");

        btnCancelarAlumno.setText("Cancelar");
        btnCancelarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlumnoActionPerformed(evt);
            }
        });

        btnCrearAlumno.setText("Siguiente");
        btnCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAlumnoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Introduce los datos del alumno");

        javax.swing.GroupLayout jfAlumnoLayout = new javax.swing.GroupLayout(jfAlumno.getContentPane());
        jfAlumno.getContentPane().setLayout(jfAlumnoLayout);
        jfAlumnoLayout.setHorizontalGroup(
            jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfAlumnoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfAlumnoLayout.createSequentialGroup()
                        .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jfAlumnoLayout.createSequentialGroup()
                                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfAlumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfAulaAlumno))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfAlumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfCicloAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfAlumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfCursoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfAlumnoLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfTutorAlumno))))
                            .addGroup(jfAlumnoLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jfAlumnoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfHorarioAlumno)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfAlumnoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCrearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        jfAlumnoLayout.setVerticalGroup(
            jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txfCicloAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCursoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTutorAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfAulaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfHorarioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jfAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jfIT.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Horario");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Salario");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Extension");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Hace Practicas");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Estacion de trabajo");

        btnCancelarIT.setText("Cancelar");
        btnCancelarIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarITActionPerformed(evt);
            }
        });

        btnCrearIT.setText("Siguiente");
        btnCrearIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearITActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("Introduce los datos del IT");

        cbHacePracticasIT.setText("Si");
        cbHacePracticasIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHacePracticasITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jfITLayout = new javax.swing.GroupLayout(jfIT.getContentPane());
        jfIT.getContentPane().setLayout(jfITLayout);
        jfITLayout.setHorizontalGroup(
            jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfITLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfITLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jfITLayout.createSequentialGroup()
                        .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfITLayout.createSequentialGroup()
                                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfITLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(2, 2, 2)
                                        .addComponent(txfExtensionIT))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfITLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfHorarioIT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jfITLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfSalarioIT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfITLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbHacePracticasIT))))
                            .addGroup(jfITLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfEstacionDeTrabajoIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfITLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarIT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCrearIT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        jfITLayout.setVerticalGroup(
            jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfITLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfHorarioIT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSalarioIT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfExtensionIT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHacePracticasIT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfEstacionDeTrabajoIT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jfITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarIT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearIT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jfPAS.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Rol");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Salario");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Horario");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Oficina");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Extension");

        btnCancelarPAS.setText("Cancelar");
        btnCancelarPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPASActionPerformed(evt);
            }
        });

        btnCrearPAS.setText("Siguiente");
        btnCrearPAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPASActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Introduce los datos del PAS");

        javax.swing.GroupLayout jfPASLayout = new javax.swing.GroupLayout(jfPAS.getContentPane());
        jfPAS.getContentPane().setLayout(jfPASLayout);
        jfPASLayout.setHorizontalGroup(
            jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfPASLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfPASLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jfPASLayout.createSequentialGroup()
                        .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfPASLayout.createSequentialGroup()
                                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfPASLayout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfHorarioPAS))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfPASLayout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfRolPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfPASLayout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfSalarioPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfPASLayout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfOficinasPAS))))
                            .addGroup(jfPASLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfExtensionPAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfPASLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCrearPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        jfPASLayout.setVerticalGroup(
            jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfPASLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfRolPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSalarioPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfOficinasPAS, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfHorarioPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfExtensionPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jfPASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jfProfesor.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Horario");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Salario");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Aula");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Es tutor");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Grado");

        btnCancelarProfesor.setText("Cancelar");
        btnCancelarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProfesorActionPerformed(evt);
            }
        });

        btnCrearProfesor.setText("Siguiente");
        btnCrearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProfesorActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setText("Introduce los datos del profesor");

        cbTutorProfesor.setText("Si");
        cbTutorProfesor.setActionCommand("Si");

        javax.swing.GroupLayout jfProfesorLayout = new javax.swing.GroupLayout(jfProfesor.getContentPane());
        jfProfesor.getContentPane().setLayout(jfProfesorLayout);
        jfProfesorLayout.setHorizontalGroup(
            jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfProfesorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfProfesorLayout.createSequentialGroup()
                        .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jfProfesorLayout.createSequentialGroup()
                                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jfProfesorLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfAulaProfesor))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfProfesorLayout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfHorarioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jfProfesorLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfSalarioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jfProfesorLayout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbTutorProfesor))))
                            .addGroup(jfProfesorLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jfProfesorLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfGradoProfesor)))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfProfesorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        jfProfesorLayout.setVerticalGroup(
            jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfHorarioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSalarioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfAulaProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTutorProfesor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfGradoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jfProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbProfesor.setText("Profesor");

        cbAlumno.setText("Alumno");

        cbIT.setText("IT");

        cbPAS.setText("PAS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DNI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Direccion");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Selecciona los roles de la persona");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCrear.setText("Siguiente");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Introduce los datos de la persona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfTelefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfDNI))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfCorreo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(cbAlumno)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbProfesor)
                                .addGap(18, 18, 18)
                                .addComponent(cbIT)
                                .addGap(30, 30, 30)
                                .addComponent(cbPAS)))
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlumno)
                    .addComponent(cbProfesor)
                    .addComponent(cbIT)
                    .addComponent(cbPAS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        //Obtengo los checkbox seleccionados
        isAlumno = cbAlumno.isSelected();
        isProfesor = cbProfesor.isSelected();
        isPAS = cbPAS.isSelected();
        isIT = cbIT.isSelected();

        //Si todos los checkboxs estan vacios muestro error
        if (!isAlumno && !isProfesor && !isPAS && !isIT) {
            JOptionPane.showMessageDialog(null, "Debes introducir como minimo un rol",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Obtengo todo los inputs de la clas Persona, excepto el ID
        nombre = txfNombre.getText();
        apellido = txfApellido.getText();
        dni = txfDNI.getText();
        correo = txfCorreo.getText();
        telefono = txfTelefono.getText();
        direccion = txfDireccion.getText();

        //Comprueba si hay campos vacios
        boolean hayCamposVacios = camposVacios(nombre, apellido, dni, correo, telefono, direccion);

        //Si hay campos vacios no hacemos nada
        if (hayCamposVacios) {
            return;
        }

        //Una vez no hay errores generarmos un id de manera aleatoria
        id = generarID();

        /* El orden en que se abriran las ventanas, si no estan todos los roles
           seleccionados saltara aquellos que no lo esten.
            Alumno 
            IT 
            PAS
            Profesor 
         */
        //Siguiente window
        if (isAlumno) {
            abrirJFrame(jfAlumno, this);
        } else if (isIT) {
            abrirJFrame(jfIT, this);
        } else if (isPAS) {
            abrirJFrame(jfPAS, this);
        } else {
            abrirJFrame(jfProfesor, this);
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlumnoActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnCancelarAlumnoActionPerformed

    private void btnCancelarPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPASActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnCancelarPASActionPerformed

    private void btnCrearPASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPASActionPerformed

        //Obtengo todo los inputs de la class PAS
        String horario = txfHorarioPAS.getText();
        String strSalario = txfSalarioPAS.getText();
        String rol = txfRolPAS.getText();
        String extension = txfExtensionPAS.getText();
        String oficina = txfOficinasPAS.getText();

        //Comprueba si hay campos vacios
        boolean hayCamposVacios = camposVacios(horario, strSalario, rol, extension, oficina);

        //Si hay campos vacios no hacemos nada
        if (hayCamposVacios) {
            return;
        }

        try {
            //String to double
            double salario = Double.valueOf(strSalario);

            //Una vez no hay errores instanciamos PAS
            pas = new PAS(rol, salario, horario, oficina, extension, nombre,
                    apellido, dni, correo, telefono, direccion, id, isAlumno,
                    isProfesor, isPAS, isIT);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes introducir un numero "
                    + "en salario",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Siguiente window 
        if (isProfesor) {
            abrirJFrame(jfProfesor, jfPAS);
        } else {
            abrirJFrame(this, jfPAS);
        }
    }//GEN-LAST:event_btnCrearPASActionPerformed

    private void btnCancelarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProfesorActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnCancelarProfesorActionPerformed

    private void btnCrearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProfesorActionPerformed

        //Obtengo todo los inputs de la class Profesor
        String horario = txfHorarioProfesor.getText();
        String strSalario = txfSalarioProfesor.getText();
        Boolean esTutor = this.cbTutorProfesor.isSelected();
        String aula = txfAulaProfesor.getText();
        String grado = txfGradoProfesor.getText();

        //Comprueba si hay campos vacios
        boolean hayCamposVacios = camposVacios(horario, strSalario, aula, grado);

        //Si hay campos vacios no hacemos nada
        if (hayCamposVacios) {
            return;
        }

        try {
            //String to double
            double salario = Double.valueOf(strSalario);

            //Una vez no hay errores instanciamos Profesor
            profesor = new Profesor(horario, salario, aula, esTutor, grado, nombre,
                    apellido, dni, correo, telefono, direccion, id, isAlumno,
                    isProfesor, isPAS, isIT);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes introducir un numero "
                    + "en salario",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        abrirJFrame(this, jfProfesor);
    }//GEN-LAST:event_btnCrearProfesorActionPerformed

    private void btnCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAlumnoActionPerformed

        //Obtengo todo los inputs de la clas Alumno
        String horario = txfHorarioAlumno.getText();
        String ciclo = txfCicloAlumno.getText();
        String tutor = txfTutorAlumno.getText();
        String aula = txfAulaAlumno.getText();
        String curso = txfCursoAlumno.getText();

        //Comprueba si hay campos vacios
        boolean hayCamposVacios = camposVacios(horario, ciclo, tutor, aula, curso);

        //Si hay campos vacios no hacemos nada
        if (hayCamposVacios) {
            return;
        }

        //Una vez no hay errores instanciamos Alumno
        alumno = new Alumno(horario, ciclo, aula, tutor, curso,
                nombre, apellido, dni, correo, telefono, direccion, id, isAlumno,
                isProfesor, isPAS, isIT);

        //Siguiente window 
        if (isIT) {
            abrirJFrame(jfIT, jfAlumno);
        } else if (isPAS) {
            abrirJFrame(jfPAS, jfAlumno);
        } else if (isProfesor) {
            abrirJFrame(jfProfesor, jfAlumno);
        } else {
            abrirJFrame(this, jfAlumno);
        }
    }//GEN-LAST:event_btnCrearAlumnoActionPerformed

    private void btnCrearITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearITActionPerformed

        //Obtengo todo los inputs de la class IT
        String horario = txfHorarioIT.getText();
        String strSalario = txfSalarioIT.getText();
        String estacionDeTrabajo = txfEstacionDeTrabajoIT.getText();
        String extension = txfExtensionIT.getText();
        Boolean hacePracticas = cbHacePracticasIT.isSelected();

        //Comprueba si hay campos vacios
        boolean hayCamposVacios = camposVacios(horario, strSalario,
                estacionDeTrabajo, extension);

        //Si hay campos vacios no hacemos nada
        if (hayCamposVacios) {
            return;
        }

        try {
            //String to double
            double salario = Double.valueOf(strSalario);

            //Una vez no hay errores instanciamos It
            it = new IT(horario, salario, estacionDeTrabajo, extension, hacePracticas,
                    nombre, apellido, dni, correo, telefono, direccion, id, isAlumno,
                    isProfesor, isPAS, isIT);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes introducir un numero "
                    + "en salario",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Siguiente window 
        if (isPAS) {
            abrirJFrame(jfPAS, jfIT);
        } else if (isProfesor) {
            abrirJFrame(jfProfesor, jfIT);
        } else {
            abrirJFrame(this, jfIT);
        }
    }//GEN-LAST:event_btnCrearITActionPerformed

    private void btnCancelarITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarITActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnCancelarITActionPerformed

    private void cbHacePracticasITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHacePracticasITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHacePracticasITActionPerformed

    private void cerrarAplicacion() {
        System.exit(0);
    }

    private void abrirJFrame(JFrame siguienteJFrame, JFrame actualJFrame) {
        siguienteJFrame.setSize(625, 360);
        siguienteJFrame.setVisible(true);
        actualJFrame.setVisible(false);
    }

    private String generarID() {
        int intID = (int) (Math.random() * 1000);
        return String.valueOf(intID);
    }

    private boolean camposVacios(String campo1, String campo2, String campo3,
            String campo4, String campo5, String campo6) {
        if (campo1.isBlank() || campo2.isBlank() || campo3.isBlank()
                || campo4.isBlank() || campo5.isBlank() || campo6.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los campos",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    private boolean camposVacios(String campo1, String campo2, String campo3,
            String campo4, String campo5) {
        if (campo1.isBlank() || campo2.isBlank() || campo3.isBlank()
                || campo4.isBlank() || campo5.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los campos",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    private boolean camposVacios(String campo1, String campo2, String campo3,
            String campo4) {
        if (campo1.isBlank() || campo2.isBlank() || campo3.isBlank()
                || campo4.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes introducir todos los campos",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarAlumno;
    private javax.swing.JButton btnCancelarIT;
    private javax.swing.JButton btnCancelarPAS;
    private javax.swing.JButton btnCancelarProfesor;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearAlumno;
    private javax.swing.JButton btnCrearIT;
    private javax.swing.JButton btnCrearPAS;
    private javax.swing.JButton btnCrearProfesor;
    private javax.swing.JCheckBox cbAlumno;
    private javax.swing.JCheckBox cbHacePracticasIT;
    private javax.swing.JCheckBox cbIT;
    private javax.swing.JCheckBox cbPAS;
    private javax.swing.JCheckBox cbProfesor;
    private javax.swing.JCheckBox cbTutorProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFrame jfAlumno;
    private javax.swing.JFrame jfIT;
    private javax.swing.JFrame jfPAS;
    private javax.swing.JFrame jfProfesor;
    private javax.swing.JTextField txfApellido;
    private javax.swing.JTextField txfAulaAlumno;
    private javax.swing.JTextField txfAulaProfesor;
    private javax.swing.JTextField txfCicloAlumno;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfCursoAlumno;
    private javax.swing.JTextField txfDNI;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfEstacionDeTrabajoIT;
    private javax.swing.JTextField txfExtensionIT;
    private javax.swing.JTextField txfExtensionPAS;
    private javax.swing.JTextField txfGradoProfesor;
    private javax.swing.JTextField txfHorarioAlumno;
    private javax.swing.JTextField txfHorarioIT;
    private javax.swing.JTextField txfHorarioPAS;
    private javax.swing.JTextField txfHorarioProfesor;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfOficinasPAS;
    private javax.swing.JTextField txfRolPAS;
    private javax.swing.JTextField txfSalarioIT;
    private javax.swing.JTextField txfSalarioPAS;
    private javax.swing.JTextField txfSalarioProfesor;
    private javax.swing.JTextField txfTelefono;
    private javax.swing.JTextField txfTutorAlumno;
    // End of variables declaration//GEN-END:variables
}
