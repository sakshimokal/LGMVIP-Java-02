import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author saksh
 */
public class tictactoegame extends javax.swing.JFrame {
    private String startGame="X";
    private int xCount=0;
    private int oCount=0;

    /**
     * Creates new form tictactoegame
     */
    public tictactoegame() {
        initComponents();
    }
          private void gameScore()
          {
              playerxxx.setText(String.valueOf(xCount));
              playerooo.setText(String.valueOf(oCount));
          }
          
          private void choose_a_Player()
          {
              if(startGame.equalsIgnoreCase("X"))
              {
startGame = "O";
              }
else
              {
startGame = "X";
          }
          }
          private void WinningGame()
          {
              String b1=txtbtn1.getText();
              String b2=txtbtn2.getText();
              String b3=txtbtn3.getText();
              
              String b4=txtbtn4.getText();
              String b5=txtbtn5.getText();
              String b6=txtbtn6.getText();
              
              String b7=txtbtn7.getText();
              String b8=txtbtn8.getText();
              String b9=txtbtn9.getText();
              
              //Player x coding
              if(b1==("X") && b2==("X") && b3==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn2.setBackground(Color.yellow);
                  txtbtn3.setBackground(Color.yellow);
                  
              }
              if(b4==("X") && b5==("X") && b6==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn4.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn6.setBackground(Color.yellow);
                  
              }
              
              if(b7==("X") && b8==("X") && b9==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn7.setBackground(Color.yellow);
                  txtbtn8.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }
              if(b1==("X") && b4==("X") && b7==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn4.setBackground(Color.yellow);
                  txtbtn7.setBackground(Color.yellow);
                  
              }
              if(b2==("X") && b5==("X") && b8==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn2.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn8.setBackground(Color.yellow);
                  
              }
              if(b3==("X") && b6==("X") && b9==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn3.setBackground(Color.yellow);
                  txtbtn6.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }
              if(b1==("X") && b5==("X") && b9==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }
            if(b3==("X") && b5==("X") && b7==("X"))
              {
                  JOptionPane.showMessageDialog(this, "Player X is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  xCount++;
                  gameScore();
                  
                  txtbtn3.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn7.setBackground(Color.yellow);
                  
              }  
            if(b1==("O") && b2==("O") && b3==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn2.setBackground(Color.yellow);
                  txtbtn3.setBackground(Color.yellow);
                  
              }  
            if(b4==("O") && b5==("O") && b6==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn4.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn6.setBackground(Color.yellow);
                  
              }  
            if(b7==("O") && b8==("O") && b9==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn7.setBackground(Color.yellow);
                  txtbtn8.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }  
            if(b1==("O") && b4==("O") && b7==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn4.setBackground(Color.yellow);
                  txtbtn7.setBackground(Color.yellow);
                  
              }  
            if(b2==("O") && b5==("O") && b8==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn2.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn8.setBackground(Color.yellow);
                  
              }  
            if(b3==("O") && b6==("O") && b9==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn3.setBackground(Color.yellow);
                  txtbtn6.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }  
            if(b1==("O") && b5==("O") && b9==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn1.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn9.setBackground(Color.yellow);
                  
              }  
            if(b3==("O") && b5==("O") && b7==("O"))
              {
                  JOptionPane.showMessageDialog(this, "Player O is a Winner", "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
                  oCount++;
                  gameScore();
                  
                  txtbtn3.setBackground(Color.yellow);
                  txtbtn5.setBackground(Color.yellow);
                  txtbtn7.setBackground(Color.yellow);
                  
              }  
          }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        txtexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE ");
        setBackground(new java.awt.Color(204, 0, 102));

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setForeground(new java.awt.Color(204, 51, 255));

        txtbtn1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(0, 204, 102));
        txtreset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        playerx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playerx.setText("PLAYER X:");

        playero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playero.setText("PLAYER O:");

        playerxxx.setBackground(new java.awt.Color(204, 204, 204));
        playerxxx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playerxxx.setText("xxxxxxxxxxxxx");

        playerooo.setBackground(new java.awt.Color(204, 204, 204));
        playerooo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        playerooo.setText("xxxxxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerxxx, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(playerooo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerxxx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(playerooo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        txtexit.setBackground(new java.awt.Color(255, 51, 51));
        txtexit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtreset, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(txtexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
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

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");

if(JOptionPane.showConfirmDialog (frame, "Are you sure, you want to exit?", "Tic Tac Toe", JOptionPane. YES_NO_OPTION) == JOptionPane. YES_NO_OPTION)
{
    System.exit(0);
}
    }                                       

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
       txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn1.setForeground(Color.black);
              }
else
              {
                 txtbtn1.setForeground(Color.blue);
          }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn2.setForeground(Color.black);
              }
else
              {
                 txtbtn2.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn3.setForeground(Color.black);
              }
else
              {
                 txtbtn3.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn4.setForeground(Color.black);
              }
else
              {
                 txtbtn4.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn5.setForeground(Color.black);
              }
else
              {
                 txtbtn5.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn6.setForeground(Color.black);
              }
else
              {
                 txtbtn6.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn7.setForeground(Color.black);
              }
else
              {
                 txtbtn7.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn8.setForeground(Color.black);
              }
else
              {
                 txtbtn8.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
              {
             txtbtn9.setForeground(Color.black);
              }
else
              {
                 txtbtn9.setForeground(Color.blue);
          }
        choose_a_Player();
                        WinningGame();
    }                                       

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
        
        
    }                                        

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
            java.util.logging.Logger.getLogger(tictactoegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoegame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration                   
}
