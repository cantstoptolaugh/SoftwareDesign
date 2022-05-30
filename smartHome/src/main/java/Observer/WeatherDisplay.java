package Observer;

import ForLogin.LoginForm;
import Main.MainDisplay;
import java.io.File;
import Observer.WeatherState.*;
import Observer.WeatherData.*;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 이주혁
 */
public class WeatherDisplay extends javax.swing.JFrame {

    Rain rain = new Rain();
    Snow snow = new Snow();
    Sunny sunny = new Sunny();
    Cloud cloud = new Cloud();

    String todayweather;//textfield에 출력할 오늘 날씨 값
    String tomorrowweather;//textfield에 출력할  내일 날씨 값

    Random random = new Random();

    int temperatureR = 27;//random.nextInt(0, 30);
    int humidityR = 40;//random.nextInt(40, 60);

    String temperatureS;
    String humidityS;
    //문자열 변환

    String todayTemperature;
    //출력할 온도
    String todayHumidity;

    WeatherData weatherData = new WeatherData();

    public WeatherDisplay() {
        initComponents();
        setTitle("날씨관리화면");
        setLocationRelativeTo(null);

        temperatureS = Integer.toString(temperatureR);
        humidityS = Integer.toString(humidityR);

        todayTemperature = weatherData.setMeasurements(temperatureS);
        todayHumidity = weatherData.setMeasurements(humidityS);

        //온도, 습도 랜덤 

        /*random = new Random();
            int num = random.nextInt(0, 4);
            
           if (num == 0) {
                tomorrowweather = sunny.Weather("It's sunny tomorrow");
            } else if (num == 1) {
                tomorrowweather = rain.Weather("It's rainy tomorrow");
            } else if (num == 2) {
                tomorrowweather = snow.Weather("It's snowing tomorrow");
            } else if (num == 3) {
                tomorrowweather = cloud.Weather("It's cloudy tomorrow");
            }*/
        tomorrowweather = sunny.Weather("It's sunny tomorrow");

        //온도, 습도 랜덤값-> 오늘 날씨 출력
        if (temperatureR >= 20 && temperatureR <= 30 && humidityR >= 40 && humidityR <= 60) {
            //sunny
            todayweather = sunny.Weather("It's Sunny today");

        } else if (temperatureR >= 10 && temperatureR <= 30 && humidityR >= 40 && humidityR <= 60) {
            //rain
            todayweather = rain.Weather("It's rainy today");

        } else if (temperatureR >= 0 && temperatureR <= 10 && humidityR >= 40 && humidityR <= 60) {
            //snow
            todayweather = snow.Weather("It's snowing today");

        } else if (temperatureR >= 0 && temperatureR <= 30 && humidityR >= 40 && humidityR <= 60) {
            //cloud
            todayweather = cloud.Weather("It's cloudy today");
        }

        temperature.setText(todayTemperature);
        humidity.setText(todayHumidity);
        TomorrowWeather.setText(tomorrowweather);
        TodayWeather.setText(todayweather);

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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(temperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humidity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    private String toString(int temperatureR) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
