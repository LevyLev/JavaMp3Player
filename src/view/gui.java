/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import main.FileTypeFilter;

/**
 *
 * @author Administrator
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form gui
     */
    //MP3Player class form jaco-mp3-player
    MP3Player player;
    
    File songFile;
    String currentDirectory="home.user";
    String currentPath;
    String imagePath;
    String appName="MP3-Player by Levent Cadir";
    
    boolean repeat=false;
    boolean playing = false;
    boolean windowCollapsed=false;
    
    int xMouse,yMouse;
    
    public gui() {
        initComponents();
        
        
        
        appTitle.setText(appName);
        
        songFile=new File("Hello! Click on BROWSE to select an mp3 file.There is an mp3 file to use as example in this folder");
        
        String fileName=songFile.getName();
    
        songNameDisplay.setText(fileName);
        
        player=mp3Player();
        
        player.addToPlayList(songFile);
        
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath = "\\images";
        
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        repeatBtn = new javax.swing.JLabel();
        playBtn = new javax.swing.JLabel();
        volumeMaxBtn = new javax.swing.JLabel();
        pauseBtn = new javax.swing.JLabel();
        volumeMuteBtn = new javax.swing.JLabel();
        volumeDownBtn = new javax.swing.JLabel();
        volumeUpBtn = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        browseBtn = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        songNamePanel = new javax.swing.JPanel();
        songNameDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        controlPanel.setBackground(new java.awt.Color(153, 0, 153));

        repeatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/repeat.png"))); // NOI18N
        repeatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatBtnMouseClicked(evt);
            }
        });

        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/play.png"))); // NOI18N
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });

        volumeMaxBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/volume_max.png"))); // NOI18N
        volumeMaxBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeMaxBtnMouseClicked(evt);
            }
        });

        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/pause.png"))); // NOI18N
        pauseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseBtnMouseClicked(evt);
            }
        });

        volumeMuteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/volume_mute.png"))); // NOI18N
        volumeMuteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeMuteBtnMouseClicked(evt);
            }
        });

        volumeDownBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/volume_low.png"))); // NOI18N
        volumeDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeDownBtnMouseClicked(evt);
            }
        });

        volumeUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/volume_high.png"))); // NOI18N
        volumeUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeUpBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(repeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(volumeDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeMaxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeMuteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(repeatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
            .addComponent(playBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pauseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(volumeMaxBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(volumeMuteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(volumeDownBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(volumeUpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        headerPanel.setBackground(new java.awt.Color(153, 0, 153));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/close.png"))); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        browseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/mp3-icons/browse.png"))); // NOI18N
        browseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseBtnMouseClicked(evt);
            }
        });

        appTitle.setText("Java MP3 Player");
        appTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                appTitleMouseDragged(evt);
            }
        });
        appTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTitleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appTitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(browseBtn)
                .addGap(6, 6, 6)
                .addComponent(exitBtn)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(exitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(appTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(browseBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        songNamePanel.setBackground(new java.awt.Color(255, 255, 255));

        songNameDisplay.setText("PLAYING");

        javax.swing.GroupLayout songNamePanelLayout = new javax.swing.GroupLayout(songNamePanel);
        songNamePanel.setLayout(songNamePanelLayout);
        songNamePanelLayout.setHorizontalGroup(
            songNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNameDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        songNamePanelLayout.setVerticalGroup(
            songNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNamePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(songNameDisplay)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(songNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        // TODO add your handling code here:
        player.play();
        playing = true;
    }//GEN-LAST:event_playBtnMouseClicked

    private void pauseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseBtnMouseClicked
        // TODO add your handling code here:
        player.pause();
        playing = false;
    }//GEN-LAST:event_pauseBtnMouseClicked

    private void repeatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatBtnMouseClicked
        // TODO add your handling code here:
        if(playing == true){
            player.play();
            playing = false;
            

        }else if(playing==false){
            player.play();
            player.play();
            playing=true;
            
        }
        
    }//GEN-LAST:event_repeatBtnMouseClicked

    
    private void appTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_appTitleMousePressed

    private void appTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseDragged
        // TODO add your handling code here:
        int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_appTitleMouseDragged

    private void volumeDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeDownBtnMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_volumeDownBtnMouseClicked

    private void volumeUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeUpBtnMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_volumeUpBtnMouseClicked

    private void volumeMaxBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeMaxBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(1.0);
    }//GEN-LAST:event_volumeMaxBtnMouseClicked

    private void volumeMuteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeMuteBtnMouseClicked
        // TODO add your handling code here:
        volumeControl(0.0);
    }//GEN-LAST:event_volumeMuteBtnMouseClicked

    private void browseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open mp3 files only"));
        int result = openFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            songFile = openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            songNameDisplay.setText("Playing now ... "+ songFile.getName());
        }
    }//GEN-LAST:event_browseBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void appTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if(windowCollapsed == false ){
                windowCollapsed = true;
                this.setSize(new Dimension(this.getSize().width,50));
            }else if(windowCollapsed == true ){
                windowCollapsed = false;
                this.setSize(new Dimension(this.getSize().width,250));
            }
        }
    }//GEN-LAST:event_appTitleMouseClicked

    
    
    /**
     * @param args the command line arguments
     */

    
    private MP3Player mp3Player(){
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }
    
    private void volumeUpControl(Double valueToPlusMinus){
        //get mixer information from audiosystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //Now use a for loop to list all mixers
        for(Mixer.Info mixerInfo:mixers){
            //get mixer
            Mixer mixer= AudioSystem.getMixer(mixerInfo);
            //get target line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            for(Line.Info lineInfo:lineInfos){
                //make a null line;
                Line line=null;
                
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        //open line
                        line.open();
                    }
                    //float control
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    float currentVolume = volControl.getValue();
                    
                    Double volumeToCut = valueToPlusMinus;
                    
                    float changedCalc = (float) ((float)currentVolume + (double)volumeToCut);
                    
                    volControl.setValue(changedCalc);
                }catch(LineUnavailableException lineException){
                }catch(IllegalArgumentException illException){
                }finally{
                    if(line !=null && !opened){
                        line.close();
                    }
                }

            }
            
        }
    }
    
    private void volumeDownControl(Double valueToPlusMinus){
        //get mixer information from audiosystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //Now use a for loop to list all mixers
        for(Mixer.Info mixerInfo:mixers){
            //get mixer
            Mixer mixer= AudioSystem.getMixer(mixerInfo);
            //get target line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            for(Line.Info lineInfo:lineInfos){
                //make a null line;
                Line line=null;
                
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        //open line
                        line.open();
                    }
                    //float control
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    float currentVolume = volControl.getValue();
                    
                    Double volumeToCut = valueToPlusMinus;
                    
                    float changedCalc = (float) ((float)currentVolume - (double)volumeToCut);
                    
                    volControl.setValue(changedCalc);
                }catch(LineUnavailableException lineException){
                }catch(IllegalArgumentException illException){
                }finally{
                    if(line !=null && !opened){
                        line.close();
                    }
                }

            }
            
        }
    }
    
    private void volumeControl(Double valueToPlusMinus){
        //get mixer information from audiosystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //Now use a for loop to list all mixers
        for(Mixer.Info mixerInfo:mixers){
            //get mixer
            Mixer mixer= AudioSystem.getMixer(mixerInfo);
            //get target line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            
            for(Line.Info lineInfo:lineInfos){
                //make a null line;
                Line line=null;
                
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        //open line
                        line.open();
                    }
                    //float control
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    
                    float currentVolume = volControl.getValue();
                    
                    Double volumeToCut = valueToPlusMinus;
                    
                    float changedCalc = (float) ((double)volumeToCut);
                    
                    volControl.setValue(changedCalc);
                }catch(LineUnavailableException lineException){
                }catch(IllegalArgumentException illException){
                }finally{
                    if(line !=null && !opened){
                        line.close();
                    }
                }

            }
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JLabel browseBtn;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel pauseBtn;
    private javax.swing.JLabel playBtn;
    private javax.swing.JLabel repeatBtn;
    private javax.swing.JLabel songNameDisplay;
    private javax.swing.JPanel songNamePanel;
    private javax.swing.JLabel volumeDownBtn;
    private javax.swing.JLabel volumeMaxBtn;
    private javax.swing.JLabel volumeMuteBtn;
    private javax.swing.JLabel volumeUpBtn;
    // End of variables declaration//GEN-END:variables
}


