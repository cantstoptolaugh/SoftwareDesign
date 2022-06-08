
package VisitorAccess;

import ForLogin.LoginForm;
import Main.MainDisplay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class OpenDoor extends javax.swing.JFrame {
    
    // Timestamp, SimpleDateFormat 객체 초기화 및 생성

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    // 세션 id 읽기 위한 변수 id
    String id = LoginForm.SessionID;
   
    //제목 설정, 화면 정중앙에 프로그램 출력
    public OpenDoor() {
        initComponents();
        setTitle("방문자 관리 기능");
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        father = new javax.swing.JButton();
        mother = new javax.swing.JButton();
        brother = new javax.swing.JButton();
        sister = new javax.swing.JButton();
        outer = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        jButton1.setText("전체 방문자 확인");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "방문자 출입 확인", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("맑은 고딕", 1, 14))); // NOI18N

        father.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        father.setText("아버지");
        father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherActionPerformed(evt);
            }
        });

        mother.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        mother.setText("어머니");
        mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherActionPerformed(evt);
            }
        });

        brother.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        brother.setText("자녀1");
        brother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brotherActionPerformed(evt);
            }
        });

        sister.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        sister.setText("자녀2");
        sister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisterActionPerformed(evt);
            }
        });

        outer.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        outer.setText("외부인");
        outer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(father, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(father)
                            .addComponent(mother))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brother)
                            .addComponent(sister)))
                    .addComponent(outer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("메뉴");

        jMenuItem1.setText("뒤로가기");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outerActionPerformed

        VisitorAccessTrace vat = new VisitorAccessTrace();
        
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        Visitor v = visitorAccess.checkVisitor("외부인");
        
         if(v instanceof Outer) {
            JOptionPane.showMessageDialog(null, "외부인임을 감지하였습니다. 문을 닫습니다.", "Result", JOptionPane.WARNING_MESSAGE);
         try { 
            String member = v.getOuter();
            
            long timestamp = System.currentTimeMillis();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String date = dateFormat.format(timestamp);
            
            File familyListFile = new File(id+"List.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(familyListFile, true));
            
            if (familyListFile.isFile() && familyListFile.canWrite()) {
                    bufferedWriter.write(member);
                    bufferedWriter.write(" ");
                    bufferedWriter.write(date);
                    bufferedWriter.write(" ");

                    bufferedWriter.newLine();
                    bufferedWriter.close();
            }
            
        } catch(IOException e) {
            System.out.println(e);
        }
        }        
    }//GEN-LAST:event_outerActionPerformed

    // mother, father, brother, sister 모두 같은 로직
    private void motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherActionPerformed
 
        VisitorAccessTrace vat = new VisitorAccessTrace();
        
        vat.familyList();
        
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        try {
            Visitor v = visitorAccess.checkVisitor(vat.family[1]);
        if (v instanceof Family) {
            JOptionPane.showMessageDialog(null, "문이 열립니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, v.getFamily() + "님이 방문하셨습니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "문이 닫힙니다.", "Result", JOptionPane.WARNING_MESSAGE);     
        try { 
            String member = v.getFamily();
            long timestamp = System.currentTimeMillis();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String date = dateFormat.format(timestamp);
            
            File familyListFile = new File(id+"List.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(familyListFile, true));
            
            if (familyListFile.isFile() && familyListFile.canWrite()) {
                    bufferedWriter.write(member);
                    bufferedWriter.write(" ");
                    bufferedWriter.write(date);
                    bufferedWriter.write(" ");

                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    
                }
        } catch(IOException e) {
            System.out.println(e);
        }
            
        }   
        } catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "가족 구성원에 포함되지 않았습니다.", "Result", JOptionPane.WARNING_MESSAGE);  
        }
        
        
    }//GEN-LAST:event_motherActionPerformed

    private void fatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherActionPerformed

        VisitorAccessTrace vat = new VisitorAccessTrace();
        vat.familyList();
        
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        try {
            Visitor v = visitorAccess.checkVisitor(vat.family[0]);

            if (v instanceof Family) {
            JOptionPane.showMessageDialog(null, "문이 열립니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, v.getFamily() + "님이 방문하셨습니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "문이 닫힙니다.", "Result", JOptionPane.WARNING_MESSAGE);     
        try { 
            String member = v.getFamily();
            long timestamp = System.currentTimeMillis();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String date = dateFormat.format(timestamp);
            
            File familyListFile = new File(id+"List.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(familyListFile, true));
            
            if (familyListFile.isFile() && familyListFile.canWrite()) {
                    bufferedWriter.write(member);
                    bufferedWriter.write(" ");
                    bufferedWriter.write(date);
                    bufferedWriter.write(" ");

                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    
                }
        } catch(IOException e) {
            System.out.println(e);
        }
            
        } 
        } catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "가족 구성원에 포함되지 않았습니다.", "Result", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_fatherActionPerformed

    private void brotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brotherActionPerformed

        VisitorAccessTrace vat = new VisitorAccessTrace();
        vat.familyList();
        
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        try {
            Visitor v = visitorAccess.checkVisitor(vat.family[2]);
            
        if (v instanceof Family) {
            JOptionPane.showMessageDialog(null, "문이 열립니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, v.getFamily() + "님이 방문하셨습니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "문이 닫힙니다.", "Result", JOptionPane.WARNING_MESSAGE);     
        try { 
            String member = v.getFamily();
            long timestamp = System.currentTimeMillis();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String date = dateFormat.format(timestamp);
            
            File familyListFile = new File(id+"List.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(familyListFile, true));
            
            if (familyListFile.isFile() && familyListFile.canWrite()) {
                    bufferedWriter.write(member);
                    bufferedWriter.write(" ");
                    bufferedWriter.write(date);
                    bufferedWriter.write(" ");

                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    
                }
        } catch(IOException e) {
            System.out.println(e);
        }
        }   
        } catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "가족 구성원에 포함되지 않았습니다.", "Result", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_brotherActionPerformed

    private void sisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisterActionPerformed
              
        
        VisitorAccessTrace vat = new VisitorAccessTrace();
        vat.familyList();
        
        VisitorAccess visitorAccess = new VisitorAccess(vat);
        
        try {
            Visitor v = visitorAccess.checkVisitor(vat.family[3]);
            
        if (v instanceof Family) {
            JOptionPane.showMessageDialog(null, "문이 열립니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, v.getFamily() + "님이 방문하셨습니다.", "Result", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "문이 닫힙니다.", "Result", JOptionPane.WARNING_MESSAGE);     

        try { 
            String member = v.getFamily();
            long timestamp = System.currentTimeMillis();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String date = dateFormat.format(timestamp);
            
            File familyListFile = new File(id+"List.txt");
            
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(familyListFile, true));
            
            if (familyListFile.isFile() && familyListFile.canWrite()) {
                    bufferedWriter.write(member);
                    bufferedWriter.write(" ");
                    bufferedWriter.write(date);
                    bufferedWriter.write(" ");

                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    
                }
        } catch(IOException e) {
            System.out.println(e);
        }
            
        }
        } catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "가족 구성원에 포함되지 않았습니다.", "Result", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_sisterActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MainDisplay dis = new MainDisplay();
        dis.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CheckVisitor cv = new CheckVisitor();
        cv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(OpenDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenDoor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenDoor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brother;
    private javax.swing.JButton father;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mother;
    private javax.swing.JButton outer;
    private javax.swing.JButton sister;
    // End of variables declaration//GEN-END:variables
}
