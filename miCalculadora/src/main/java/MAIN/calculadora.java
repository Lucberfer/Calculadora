/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MAIN;

/**
 *
 * @author lucas
 */
public class calculadora extends javax.swing.JFrame {

    public float primerNumero;
    public float segundoNumero;
    public String operador;
     
    public calculadora() {
        initComponents();
        
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
        buttonBorrar = new javax.swing.JButton();
        buttonDividir = new javax.swing.JButton();
        buttonRestar = new javax.swing.JButton();
        buttonMultiplicar = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonSumar = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonDecimal = new javax.swing.JButton();
        buttonIgual = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        buttonBorrar.setBackground(new java.awt.Color(51, 51, 51));
        buttonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBorrar.setForeground(new java.awt.Color(255, 153, 0));
        buttonBorrar.setText("C");
        buttonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarActionPerformed(evt);
            }
        });

        buttonDividir.setBackground(new java.awt.Color(51, 51, 51));
        buttonDividir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDividir.setForeground(new java.awt.Color(255, 153, 0));
        buttonDividir.setText("/");
        buttonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDividirActionPerformed(evt);
            }
        });

        buttonRestar.setBackground(new java.awt.Color(51, 51, 51));
        buttonRestar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRestar.setForeground(new java.awt.Color(255, 153, 0));
        buttonRestar.setText("-");
        buttonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestarActionPerformed(evt);
            }
        });

        buttonMultiplicar.setBackground(new java.awt.Color(51, 51, 51));
        buttonMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMultiplicar.setForeground(new java.awt.Color(255, 153, 0));
        buttonMultiplicar.setText("*");
        buttonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicarActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(51, 51, 51));
        button7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(51, 51, 51));
        button8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(51, 51, 51));
        button9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(51, 51, 51));
        button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(51, 51, 51));
        button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(51, 51, 51));
        button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        buttonSumar.setBackground(new java.awt.Color(51, 51, 51));
        buttonSumar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSumar.setForeground(new java.awt.Color(255, 153, 0));
        buttonSumar.setText("+");
        buttonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumarActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 51, 51));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(51, 51, 51));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(51, 51, 51));
        button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button0.setBackground(new java.awt.Color(51, 51, 51));
        button0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button0.setForeground(new java.awt.Color(255, 255, 255));
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        buttonDecimal.setBackground(new java.awt.Color(51, 51, 51));
        buttonDecimal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDecimal.setForeground(new java.awt.Color(255, 153, 0));
        buttonDecimal.setText(".");
        buttonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecimalActionPerformed(evt);
            }
        });

        buttonIgual.setBackground(new java.awt.Color(51, 51, 51));
        buttonIgual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonIgual.setForeground(new java.awt.Color(255, 153, 0));
        buttonIgual.setText("=");
        buttonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIgualActionPerformed(evt);
            }
        });

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pantalla.setForeground(new java.awt.Color(255, 255, 255));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pantalla.setOpaque(true);
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        // Añade el número 1 a la pantalla cuando se pulsa el botón "1"
        this.pantalla.setText(this.pantalla.getText() + "1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        
        // Añade el número 0 a la pantalla cuando se pulsa el botón "0"
        this.pantalla.setText(this.pantalla.getText() + "0");
        
    }//GEN-LAST:event_button0ActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        //pantallote
    }//GEN-LAST:event_pantallaActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       
        // Añade el número 2 a la pantalla cuando se pulsa el botón "2"
        this.pantalla.setText(this.pantalla.getText() + "2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        
        // Añade el número 3 a la pantalla cuando se pulsa el botón "3"
        this.pantalla.setText(this.pantalla.getText() + "3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
       
        // Añade el número 2 a la pantalla cuando se pulsa el botón "4"
        this.pantalla.setText(this.pantalla.getText() + "4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        
        // Añade el número 2 a la pantalla cuando se pulsa el botón "5"
        this.pantalla.setText(this.pantalla.getText() + "5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        
        // Añade el número 2 a la pantalla cuando se pulsa el botón "6"
        this.pantalla.setText(this.pantalla.getText() + "6");
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        
        // Añade el número 2 a la pantalla cuando se pulsa el botón "7"
        this.pantalla.setText(this.pantalla.getText() + "7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        
        // Añade el número 2 a la pantalla cuando se pulsa el botón "8"
        this.pantalla.setText(this.pantalla.getText() + "8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        
        // Añade el número 2 a la pantalla cuando se pulsa el botón "9"
        this.pantalla.setText(this.pantalla.getText() + "9");
    }//GEN-LAST:event_button9ActionPerformed

    private void buttonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarActionPerformed
        // Limpia la pantalla, eliminando cualquier número del TextField
        this.pantalla.setText("");
    }//GEN-LAST:event_buttonBorrarActionPerformed

    private void buttonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumarActionPerformed
        
        /* Al pulsar el botón "+" se guarda el número actual de la pantalla como 'primerNumero'
           y se asigna el operador suma y limpia la pantalla para introducir el siguiente número
        */
        this.primerNumero = Float.parseFloat(this.pantalla.getText());
        this.operador = "+";
        this.pantalla.setText("");
    }//GEN-LAST:event_buttonSumarActionPerformed

    private void buttonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIgualActionPerformed
       
        /*Al pulsar el botón "=", se guarda el segundo número introducido y se realiza la operación
          en función del operador (`+`, `-`, `*`, `/`) guardado anteriormente
        */
        this.segundoNumero = Float.parseFloat(this.pantalla.getText());
        
        switch(this.operador){
            // Suma los dos números y muestra el resultado en pantalla
            case "+" : this.pantalla.setText(sinCero(this.primerNumero + this.segundoNumero));break;
            
            // Resta los dos números y muestra el resultado
            case "-" : this.pantalla.setText(sinCero(this.primerNumero - this.segundoNumero));break; 
            
            // Multiplica los dos números y muestra el resultado
            case "*" : this.pantalla.setText(sinCero(this.primerNumero * this.segundoNumero));break;
            
            // Si el segundo número es 0, muestra un mensaje de error
            case "/" : if(this.segundoNumero==0){this.pantalla.setText("No se divide entre 0");}
            
            else{
                
                // Si no, realiza la división y muestra el resultado
                this.pantalla.setText(sinCero(this.primerNumero/this.segundoNumero)); break;
            }
        }
    }//GEN-LAST:event_buttonIgualActionPerformed

    private void buttonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestarActionPerformed
        
        /* Al pulsar el botón "-", se guarda el número actual de la pantalla como `primerNumero` 
           y se asigna el operador de resta. Luego limpia la pantalla para el siguiente número
        */
        this.primerNumero = Float.parseFloat(this.pantalla.getText());
        this.operador = "-";
        this.pantalla.setText("");
        
    }//GEN-LAST:event_buttonRestarActionPerformed

    private void buttonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicarActionPerformed
       
        /* Al pulsar el botón "*", se guarda el número actual de la pantalla como `primerNumero` 
           y se asigna el operador de multiplicación. Luego limpia la pantalla para el siguiente número
        */
        this.primerNumero = Float.parseFloat(this.pantalla.getText());
        this.operador = "*";
        this.pantalla.setText("");
    }//GEN-LAST:event_buttonMultiplicarActionPerformed

    private void buttonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDividirActionPerformed
        
        /* Al pulsar el botón "/", se guarda el número actual de la pantalla como `primerNumero` 
           y se asigna el operador de división. Luego limpia la pantalla para el siguiente número
        */
        this.primerNumero = Float.parseFloat(this.pantalla.getText());
        this.operador = "/";
        this.pantalla.setText("");
    }//GEN-LAST:event_buttonDividirActionPerformed

    private void buttonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecimalActionPerformed
       
        // Al pulsar el botón ".", añade un punto decimal a la pantalla si no hay uno ya
        if(!this.pantalla.getText().contains(".")){
            this.pantalla.setText(this.pantalla.getText() + ".");
        }
        
    }//GEN-LAST:event_buttonDecimalActionPerformed

    public String sinCero(float resultado){
        
        // Convierte el resultado a texto. Si el número es entero (sin decimales), elimina el ".0"
        String retorno = "";
        retorno = Float.toString(resultado);
        
        // Si el número no tiene decimales, quita los últimos dos caracteres (".0")
        if(resultado % 1 == 0){
            retorno = retorno.substring(0, retorno.length() - 2);     
        }
        return retorno;
     }
    
    
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonDecimal;
    private javax.swing.JButton buttonDividir;
    private javax.swing.JButton buttonIgual;
    private javax.swing.JButton buttonMultiplicar;
    private javax.swing.JButton buttonRestar;
    private javax.swing.JButton buttonSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}