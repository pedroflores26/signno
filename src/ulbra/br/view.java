/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulbra.br;

import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        edDia = new javax.swing.JTextField();
        lbMes = new javax.swing.JLabel();
        edMes = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        edAno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        ldMasc = new javax.swing.JRadioButton();
        ldFem = new javax.swing.JRadioButton();
        btConsultar = new javax.swing.JButton();
        lbResp = new javax.swing.JLabel();
        lbSorte = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        lbNome.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbNome.setText("NOME:");

        lbSexo.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbSexo.setText("SEXO:");

        lbDia.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbDia.setText("DIA NASCIMENTO");

        edDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edDiaActionPerformed(evt);
            }
        });

        lbMes.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbMes.setText("MÊS NASCIMENTO");

        lbAno.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbAno.setText("ANO NASCIMENTO");

        edAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edAnoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("GURU ASTROCONSELHO LTDA");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        buttonGroup1.add(ldMasc);
        ldMasc.setSelected(true);
        ldMasc.setText("MASCULINO");
        ldMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldMascActionPerformed(evt);
            }
        });

        buttonGroup1.add(ldFem);
        ldFem.setText("FEMININO");
        ldFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldFemActionPerformed(evt);
            }
        });

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lbResp.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbResp.setText("RESPOSTA:");

        lbSorte.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        lbSorte.setText("SORTE:");

        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSorte, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSexo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ldMasc)
                                        .addGap(18, 18, 18)
                                        .addComponent(ldFem))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDia)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMes)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbAno))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(edDia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(edMes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(edAno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3))
                            .addComponent(lbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 495, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldMasc)
                            .addComponent(ldFem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDia)
                            .addComponent(lbMes)
                            .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSorte)
                .addGap(552, 552, 552))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
  edNome.setText(null);
  edDia.setText(null);
  edMes.setText(null);
  edAno.setText(null);
  lbResp.setText(null);
  lbSorte.setText(null);     
    }//GEN-LAST:event_btLimparActionPerformed
 
    private void ldMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldMascActionPerformed

    private void ldFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldFemActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
 String tratamento, nome;
   int sexo, dia, mes, ano, idade;
    nome = edNome.getText();
    dia = Integer.parseInt(edDia.getText());
    mes = Integer.parseInt(edMes.getText());
    ano = Integer.parseInt(edAno.getText());
    
    gerarSigno(dia,mes);  
    idade = calcularIdade(dia, mes, ano);
    PorcentagemSorte();
   int sorte;
           sorte = (int)1+(int)(Math.random()*100);
           sorte = (int)1+(int)(Math.random()*10);
            
   int numero1=0;
   while(numero1==0){
      if (ano > 2024 || mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma data válida!");
         }else if(ldFem.isSelected()){
         tratamento = "Sra";
         lbResp.setText(tratamento+" "+nome+" nascida no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade+". seu nº da sorte é: "+sorte);
         lbSorte.setText("Sua porcentagem de sorte é de: "+PorcentagemSorte()+"%");
        
            
         
         
     }else{
         tratamento = "Sr.";
         lbResp.setText(tratamento+" "+nome+" nasceu no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade);
         lbSorte.setText("Sua porcentagem de sorte é de: "+PorcentagemSorte()+"%");
         if(ldMasc.isSelected()){
         tratamento = "Sr.";
         lbResp.setText(tratamento+" "+nome+" nascido no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade+". seu nº da sorte é: "+sorte);
         
        
       
        }}
     break;
   }
    
  
    }//GEN-LAST:event_btConsultarActionPerformed

    private void edAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edAnoActionPerformed

    private void edDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edDiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed
private double PorcentagemSorte() {
        Random random = new Random();
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
            soma += numeros[i];
        }

        return soma / 10.0;
    }
    
   
   public int calcularIdade(int dia, int mes, int ano) {
      
      
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(ano, mes - 1, dia); // mês é baseado em zero em Calendar

        Calendar dataAtual = Calendar.getInstance();
        
        
        int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)
                || (dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
                && dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }
        return idade;}
   

  public String gerarSigno(int dia, int mes){
        String signo="";
        int numero2=0;
        while(numero2==0){
          if(dia>=21 && dia<=31 && mes==3 ||
           dia>=01 && dia<=20 && mes==4){
            signo = "....!!ÁRIES!!";
        }else if(dia>=21 && dia<=30 && mes==4 ||
           dia>=1 && dia<=20 && mes==5){
            signo = "...!!TOURO!!";
        }else if(dia>=21 && dia<=31 && mes==5 ||
           dia>=1 && dia<=20 && mes==6){
            signo = "...!!GÊMEOS!!";
        }else if(dia>=21 && dia<=30 && mes==6 ||
           dia>=1 && dia<=21 && mes==7){
            signo = "...!!CÂNCER!!";
        }else if(dia>=22 && dia<=31 && mes==7 ||
           dia>=1 && dia<=22 && mes==8){
            signo = "...!!LEÂO!!";
        }else if(dia>=23 && dia<=30 && mes==8 ||
           dia>=1 && dia<=22 && mes==9){
            signo = "...!!VIRGEM!!";
        }else if(dia>=23 && dia<=31 && mes==9 ||
           dia>=1 && dia<=22 && mes==10){
            signo = "...!!Libra!!";
        }else if(dia>=23 && dia<=31 && mes==10 ||
           dia>=1 && dia<=21 && mes==11){
            signo = "...!!ESCORPIÃO!!";
        }else if(dia>=22 && dia<=30 && mes==11 ||
           dia>=1 && dia<=21 && mes==12){
            signo = "...!!SAGITÁRIO!!";
        }else if(dia>=22 && dia<=31 && mes==12 ||
           dia>=1 && dia<=20 && mes==1){
            signo = "...!!CAPRICÓRNIO!!";
        }else if(dia>=21 && dia<=31 && mes==1 ||
           dia>=1 && dia<=19 && mes==2){
            signo = "...!!AQUÁRIO!!";
        }else if(dia>=20 && dia<=28 && mes==2 ||
           dia>=1 && dia<=20 && mes==3){
            signo = "...!!PEIXES!!";
        }else{
            signo="ERROR: TENTE NOVAMENTE";
       }
       break; }return signo;
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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField edAno;
    private javax.swing.JTextField edDia;
    private javax.swing.JTextField edMes;
    private javax.swing.JTextField edNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbResp;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbSorte;
    private javax.swing.JRadioButton ldFem;
    private javax.swing.JRadioButton ldMasc;
    // End of variables declaration//GEN-END:variables
}
