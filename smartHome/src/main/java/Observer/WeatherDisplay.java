package Observer;

import ForLogin.LoginForm;
import Main.MainDisplay;
import java.io.File;
import Observer.WeatherState.*;
import Observer.WeatherData.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 이주혁
 */
public class WeatherDisplay extends javax.swing.JFrame {

    File Weather_info;
    // 로그인 파일 읽기 위한 File 객체

    LoginForm abc = new LoginForm();
    String id = abc.SessionID;
    // 세션 id 읽기 위한 변수 id

    BufferedWriter bufferedWriter = null;

    String temperature_num;
    String humidity_num;
    String Tomorrow_weather;

    public WeatherDisplay() {
        initComponents();
        setTitle("날씨관리화면");
        setLocationRelativeTo(null);
        temperature.setText("랜덤 온도 값");
        humidity.setText("랜덤 습도 값");
        TodayWeather.setText("온도습도 맞춘 오늘 날씨");
        TomorrowWeather.setText("랜덤 내일 날씨");
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        temperature = new javax.swing.JTextField();
        humidity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TodayWeather = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TomorrowWeather = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("현재 대기 상태");

        jLabel2.setText("온도");

        jLabel3.setText("습도");

        temperature.setText("jTextField1");
        temperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureActionPerformed(evt);
            }
        });

        humidity.setText("jTextField2");
        humidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humidityActionPerformed(evt);
            }
        });

        jLabel4.setText("오늘의 날씨");

        TodayWeather.setText("jTextField3");
        TodayWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayWeatherActionPerformed(evt);
            }
        });

        jLabel5.setText("내일 예상 날씨");

        TomorrowWeather.setText("jTextField4");
        TomorrowWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowWeatherActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu3.setText("메뉴");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("뒤로가기");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(humidity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TodayWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TomorrowWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TodayWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TomorrowWeather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        MainDisplay dis = new MainDisplay();
        dis.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void temperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureActionPerformed


    }//GEN-LAST:event_temperatureActionPerformed

    private void humidityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humidityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_humidityActionPerformed

    private void TodayWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayWeatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TodayWeatherActionPerformed

    private void TomorrowWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowWeatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TomorrowWeatherActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileWriter fw = null;
        try {
            Weather_info = new File(id + "'sWeather.txt");
            bufferedWriter = new BufferedWriter(new FileWriter(Weather_info, true));
            
            Random random = new Random();
            int temperatureR = random.nextInt(0, 30);
            int humidityR = random.nextInt(20, 60);
            //온도, 습도 랜덤 출력
            
            fw = new FileWriter(Weather_info, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(temperatureR);
            bw.write(humidityR);
            //Weather_info 파일에 랜덤한 온도, 습도 저장
            
            //온도, 습도에 맞춰서 오늘 날씨 출력
            if (temperatureR >= 20 && temperatureR <= 30 && humidityR >= 20 && humidityR <= 30) {
                //sunny
            } else if (temperatureR >= 10 && temperatureR <= 30 && humidityR >= 40 && humidityR <= 60) {
                //rain
            } else if (temperatureR >= 0 && temperatureR <= 10 && humidityR >= 30 && humidityR <= 40) {
                //snow
            } else if (temperatureR >= 10 && temperatureR <= 20 && humidityR >= 30 && humidityR <= 50) {
                //cloud
            }   
            
            //내일 날씨 랜덤 출력
            
            int WeatherR = random.nextInt(0, 3);
            if (WeatherR == 0) {
                //내일 날씨 sunny
            } else if (WeatherR == 1) {
                //내일 날씨 rain
            } else if (WeatherR == 2) {
                //내일 날씨 snow
            } else if (WeatherR == 3) {
                //내일 날씨 cloud
            }
            Scanner scan = new Scanner(Weather_info);
            temperature_num = scan.next();
            humidity_num = scan.next();
            Tomorrow_weather = scan.next();
            //저장된 값 읽어와서 출력
            
            if (Weather_info.exists()) {
                if (Weather_info.delete()) {
                    System.out.println("파일삭제 성공");
                } else {
                    System.out.println("파일삭제 실패");
                }
            } else {
                System.out.println("파일이 존재하지 않습니다.");
            }
        } catch (IOException ex) {
            Logger.getLogger(WeatherDisplay.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(WeatherDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TodayWeather;
    private javax.swing.JTextField TomorrowWeather;
    private javax.swing.JTextField humidity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField temperature;
    // End of variables declaration//GEN-END:variables
}
