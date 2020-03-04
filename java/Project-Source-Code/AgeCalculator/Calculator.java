/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;
import java.util.*;

import javax.swing.*;
public class Calculator extends javax.swing.JFrame {

	
	static int bday;
	static int bmonth;
	static int byear;
	


    public Calculator() {
        initComponents();
    }




    public void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton4.setText("Monir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });




        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setForeground(new java.awt.Color(0, 102, 102));






        jPanel1.setBackground(new java.awt.Color(0, 153, 153));





        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Welcome to Age Calculator");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));






        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Enter yout birth date (day/ month/year):");







        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });






        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("About");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });






        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });






        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });




        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });






        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });







        jLabel4.setBackground(new java.awt.Color(255, 51, 0));
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 153));
        jLabel4.setText("Output");





        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)


                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(192, 192, 192))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()


                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))

        );


        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        

.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)


                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))))))
        );



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //String strScore = JOptionPane.showInputDialog(null, "Enter your grade","About");
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images2.jpg")); // NOI18N
        
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\about.jpg")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images1.jpg")); // NOI18N

    	JOptionPane.showMessageDialog(null,"Developed by:\n1. Md. Monir Hossain\n2. Md. Manik Hossain","About", JOptionPane.INFORMATION_MESSAGE);
    }                                        

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                



        

    public int jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	String strScore = (String)jComboBox1.getSelectedItem();
    	bday = Integer.parseInt(strScore);
    	return bday;
    }                                     



     

    public int jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	String strScore = (String)jComboBox2.getSelectedItem();
    	bmonth = Integer.parseInt(strScore);
    	return bmonth;
    }                                          





    public int jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	String strScore = (String)jComboBox3.getSelectedItem();
    	byear = Integer.parseInt(strScore);
    	return byear;
    }                                          





    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	int Cday;
    	int Cmonth;
    	int Cyear;
    	
    	//Auto time
    	Calendar cal=Calendar.getInstance();
    	   
    	   int year=cal.get(Calendar.YEAR);
    	   int month=cal.get(Calendar.MONTH);
    	   int day=cal.get(Calendar.DAY_OF_MONTH);
    	   
     	   if(bday>day){               //For day
     		   
     		   day+=30;
     		   Cday=day-bday;
     		   
     		   month-=1;
     		   
     		   if(bmonth>month){
     			   
     			   month+=12;
     			   Cmonth=month-bmonth;
     			   
     			  year-=1;
     			  Cyear=year-byear;
     			  
     			   
     		   }
     		   else{
     			   
     			   Cmonth=month-bmonth;
     		   }
       
     	   }
     	   else{
     		   Cday=day-bday;
     		   
     	   }
     	   
     	   
     	   
     if(bmonth>month){              //For month
     			   
     			   month+=12;
     			   Cmonth=month-bmonth;
     			   
     			  year-=1;
     			  Cyear=year-byear;
     			  
     			   
     		   }
     		   else{
     			   
     			   Cmonth=month-bmonth;
     		   }
     
     Cyear=year-byear;
    	     jLabel4.setText("Your age: "+Cyear+" years "+Cmonth+" months "+Cday+" days");

    	
    
    	     if(Cyear<=10){
    	   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\Untitled.jpg"));
    	     }
    	     
    	     if(Cyear>10 && Cyear<=15){
    	   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\Untitled1.jpg"));
    	     }
    	     
    	     if(Cyear>15 && Cyear<=20) {
    		   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images3.jpg"));   
    	     }
    	     
    	    if(Cyear>20 && Cyear<=25) {
    		   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images4.jpg"));   
    	    }
    	    
    	    if(Cyear>25 && Cyear<=35) {
    		   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images5.jpg"));   
    	    }
    	    
    	    if(Cyear>35) {
    		   jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MONIR\\Desktop\\images\\images6.jpg"));   
    		   
    	    }
    	   // JOptionPane.showMessageDialog(null,"Your age is: "+ Cyear +"  years  "+Cmonth+"  month  "+Cday+" day","About", JOptionPane.INFORMATION_MESSAGE);
    	     
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JComboBox jComboBox2;
    public javax.swing.JComboBox jComboBox3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration              
}
