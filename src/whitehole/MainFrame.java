/*
    Copyright 2012 Mega-Mario

    This file is part of Whitehole.

    Whitehole is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    Whitehole is distributed in the hope that it will be useful, but WITHOUT ANY 
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along 
    with Whitehole. If not, see http://www.gnu.org/licenses/.
*/

package whitehole;

import whitehole.smg.GameArchive;
import java.awt.*;
import java.util.*;
import java.util.prefs.Preferences;
import javax.swing.*;
import java.io.*;
import whitehole.fileio.*;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        btnOpenGame = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnOpenGalaxy = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnSettings = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnBcsvEditor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GalaxyList = new javax.swing.JList();
        lbStatusBar = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnOpenGame.setText("Select game folder");
        btnOpenGame.setFocusable(false);
        btnOpenGame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenGame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenGameActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpenGame);
        jToolBar1.add(jSeparator1);

        btnOpenGalaxy.setText("Open galaxy");
        btnOpenGalaxy.setEnabled(false);
        btnOpenGalaxy.setFocusable(false);
        btnOpenGalaxy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpenGalaxy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpenGalaxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenGalaxyActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOpenGalaxy);
        jToolBar1.add(jSeparator2);

        btnSettings.setText("Settings");
        btnSettings.setFocusable(false);
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSettings);

        btnAbout.setText("About...");
        btnAbout.setFocusable(false);
        btnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbout);

        btnBcsvEditor.setText("BCSV editor");
        btnBcsvEditor.setEnabled(false);
        btnBcsvEditor.setFocusable(false);
        btnBcsvEditor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBcsvEditor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBcsvEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBcsvEditorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBcsvEditor);

        GalaxyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GalaxyListMouseClicked(evt);
            }
        });
        GalaxyList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                GalaxyListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(GalaxyList);

        lbStatusBar.setText("jLabel1");
        lbStatusBar.setToolTipText("");
        lbStatusBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addComponent(lbStatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenGameActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setDialogTitle("Open a game archive");
        String lastdir = Preferences.userRoot().get("lastGameDir", null);
        if (lastdir != null) fc.setSelectedFile(new File(lastdir));
        fc.showOpenDialog(this);
        
        String seldir = fc.getSelectedFile().getPath();
        Preferences.userRoot().put("lastGameDir", seldir);
        
        try
        {
            Whitehole.game = new GameArchive(new ExternalFilesystem(seldir));
            lbStatusBar.setText("Game directory successfully opened");
        }
        catch (IOException ex)
        {
            lbStatusBar.setText("Failed to open the directory");
            return;
        }
        
        DefaultListModel galaxylist = new DefaultListModel();
        GalaxyList.setModel(galaxylist);
        java.util.List<String> galaxies = Whitehole.game.getGalaxies();
        for (String galaxy : galaxies)
        {
            galaxylist.addElement(galaxy);
        }
        
        btnBcsvEditor.setEnabled(true);
    }//GEN-LAST:event_btnOpenGameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        btnBcsvEditor.setVisible(Whitehole.isBeta);
        
        this.setTitle(Whitehole.fullName);
        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Whitehole.class.getResource("/Resources/icon.png")));
        lbStatusBar.setText("Ready");
        
        if (Preferences.userRoot().getBoolean("ObjectDBUpdate", true))
        {
            lbStatusBar.setText("Checking for object database updates...");
            ObjectDBUpdater updater = new ObjectDBUpdater(lbStatusBar);
            updater.start();
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAboutActionPerformed
    {//GEN-HEADEREND:event_btnAboutActionPerformed
        String msg =
            Whitehole.name + " " + Whitehole.version + "\n" +
            "\n" +
            "A level editor for Super Mario Galaxy 1 and 2\n" +
            "\n" +
            Whitehole.name + " is free software, and shouldn't be provided as\n" +
            "a part of a paid software package\n" + 
            "\n" +
            "Main coding: Mega-Mario\n" +
            "Credits: Phantom Wings, Treeki, yaz0r, thakis, groepaz/hitmen\n" + 
            "\n" + 
            "See " + Whitehole.websiteURL + " for more details.\n";

        if (Whitehole.version.toLowerCase().contains("private"))
            msg += "\nThis is a private beta version. Leak it out and this'll be the last one you get.\n";
        else if (Whitehole.version.toLowerCase().contains("beta"))
            msg += "\nThis is a beta version so don't expect full stability.\n";
        
        JOptionPane.showMessageDialog(this, msg, "About " + Whitehole.name + "...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnBcsvEditorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBcsvEditorActionPerformed
    {//GEN-HEADEREND:event_btnBcsvEditorActionPerformed
        new BcsvEditorForm().setVisible(true);
    }//GEN-LAST:event_btnBcsvEditorActionPerformed

    private void GalaxyListMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_GalaxyListMouseClicked
    {//GEN-HEADEREND:event_GalaxyListMouseClicked
        if (evt.getClickCount() < 2) return;
        new GalaxyEditorForm((String)GalaxyList.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_GalaxyListMouseClicked

    private void btnOpenGalaxyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOpenGalaxyActionPerformed
    {//GEN-HEADEREND:event_btnOpenGalaxyActionPerformed
        new GalaxyEditorForm((String)GalaxyList.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_btnOpenGalaxyActionPerformed

    private void GalaxyListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_GalaxyListValueChanged
    {//GEN-HEADEREND:event_GalaxyListValueChanged
        Boolean hasSelection = GalaxyList.getSelectedIndex() >= 0;
        btnOpenGalaxy.setEnabled(hasSelection);
    }//GEN-LAST:event_GalaxyListValueChanged

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSettingsActionPerformed
    {//GEN-HEADEREND:event_btnSettingsActionPerformed
        new SettingsForm(this, true).setVisible(true);
    }//GEN-LAST:event_btnSettingsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList GalaxyList;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBcsvEditor;
    private javax.swing.JButton btnOpenGalaxy;
    private javax.swing.JButton btnOpenGame;
    private javax.swing.JButton btnSettings;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbStatusBar;
    // End of variables declaration//GEN-END:variables
}
