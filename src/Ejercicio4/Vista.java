/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Bryan M
 */
public class Vista extends javax.swing.JFrame{
    
    private javax.swing.JButton Boton;
    private javax.swing.JLabel Interes;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTextField TxtAños;
    private javax.swing.JTextField TxtInteres;
    private javax.swing.JTextField TxtLoan;
    private javax.swing.JTextField TxtMens;
    private javax.swing.JTextField TxtPago;
    private javax.swing.JLabel años;
    private javax.swing.JLabel loan;
    private javax.swing.JLabel mes;
    private javax.swing.JLabel total;
     private Controlador c;
    public Vista(){
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2,dim.height/2-getSize().height/2);
        setResizable(false);
        Panel1 = new javax.swing.JPanel();
        Boton = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        Interes = new javax.swing.JLabel();
        TxtInteres = new javax.swing.JTextField();
        años = new javax.swing.JLabel();
        TxtAños = new javax.swing.JTextField();
        loan = new javax.swing.JLabel();
        TxtLoan = new javax.swing.JTextField();
        mes = new javax.swing.JLabel();
        TxtMens = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        TxtPago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 202, 202));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(330, 225));
        setSize(new java.awt.Dimension(300, 200));

        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Boton.setText("Compute Payment");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  BotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        Panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Interes.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Interes.setText("Annual Interest Rate");

        TxtInteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TxtInteres.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        TxtInteres.setSelectionColor(new java.awt.Color(255, 255, 102));
        TxtInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             //   TxtInteresActionPerformed(evt);
            }
        });

        años.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        años.setText("Number of Years");

        TxtAños.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TxtAños.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        TxtAños.setSelectionColor(new java.awt.Color(255, 255, 102));
        TxtAños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  TxtAñosActionPerformed(evt);
            }
        });

        loan.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        loan.setText("Loan Amount");

        TxtLoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TxtLoan.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        TxtLoan.setSelectionColor(new java.awt.Color(255, 255, 102));
        TxtLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  TxtLoanActionPerformed(evt);
            }
        });

        mes.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        mes.setText("Monthly Payment");

        TxtMens.setEditable(false);
        TxtMens.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TxtMens.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        TxtMens.setSelectionColor(new java.awt.Color(255, 255, 102));
        TxtMens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  TxtMensActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        total.setText("Total Payment ");

        TxtPago.setEditable(false);
        TxtPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        TxtPago.setSelectedTextColor(new java.awt.Color(102, 255, 102));
        TxtPago.setSelectionColor(new java.awt.Color(255, 255, 102));
        TxtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // TxtPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtInteres))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(años, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAños))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPago))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMens, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Interes)
                    .addComponent(TxtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(años)
                    .addComponent(TxtAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loan)
                    .addComponent(TxtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mes)
                    .addComponent(TxtMens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(TxtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
        public void setControlador(Controlador c){
            this.c =c;
         this.Boton.addActionListener(this.c);
         this.TxtInteres.addActionListener(this.c);
         this.TxtAños.addActionListener(this.c);
         this.TxtLoan.addActionListener(this.c);
        }         
        public void Operaciones(JTextField I,JTextField A,JTextField L){
         DecimalFormat df = new DecimalFormat("0.00");
         double a = Double.parseDouble(I.getText())/12;
         double b =  (a/100) * Double.parseDouble(L.getText());
         double c = (1 - (   Math.pow(1+(a/100)  , (-Double.parseDouble(A.getText()) * 12)  )  ));
         String d = df.format(b/c);
         double Nmeses = Double.parseDouble(A.getText()) * 12;
        
   String e = df.format((b/c)*  Nmeses ) ;    
   TxtMens.setText(d);
   TxtPago.setText(e);
     }

    public JTextField getTxtAños() {
        return TxtAños;
    }

    public void setTxtAños(JTextField TxtAños) {
        this.TxtAños = TxtAños;
    }

    public JTextField getTxtInteres() {
        return TxtInteres;
    }

    public void setTxtInteres(JTextField TxtInteres) {
        this.TxtInteres = TxtInteres;
    }

    public JTextField getTxtLoan() {
        return TxtLoan;
    }

    public void setTxtLoan(JTextField TxtLoan) {
        this.TxtLoan = TxtLoan;
    }

    public JButton getBoton() {
        return Boton;
    }

    public void setBoton(JButton Boton) {
        this.Boton = Boton;
    }
        
        
}    
    
    


