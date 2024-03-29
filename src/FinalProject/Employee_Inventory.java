/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalProject;

/**
 *
 * @author Daanyaal
 */
public class Employee_Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Inventory
     */
    public Employee_Inventory() {
        initComponents();
        setLocationRelativeTo(this); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DinningTable_Quantity = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        CoffeeTable_Quantity = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        Chairs_Quantity = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sofa_Price = new javax.swing.JLabel();
        Chairs__Cost = new javax.swing.JLabel();
        BedFrame_Cost = new javax.swing.JLabel();
        CoffeeTable_Cost = new javax.swing.JLabel();
        DinningTable__Cost = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Chairs_Total = new javax.swing.JFormattedTextField();
        Sofa_Total = new javax.swing.JFormattedTextField();
        Sofa_Item = new javax.swing.JCheckBox();
        CoffeeTable_Total = new javax.swing.JFormattedTextField();
        BedFrame_Item = new javax.swing.JCheckBox();
        DinningTable_Total = new javax.swing.JFormattedTextField();
        BedFrame_Total = new javax.swing.JFormattedTextField();
        CoffeeTable_Item = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        Chairs_Item = new javax.swing.JCheckBox();
        DinningTable_Item = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        Sofa_Quantity = new javax.swing.JSpinner();
        BedFrame_Quantity = new javax.swing.JSpinner();
        Back_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BedFrame_Inventory = new javax.swing.JTextField();
        ArmChair_Inventory = new javax.swing.JTextField();
        ChestOfDrawers_Inventory = new javax.swing.JTextField();
        CoffeeTable_Inventory = new javax.swing.JTextField();
        Chairs_Inventory = new javax.swing.JTextField();
        Desk_Inventory = new javax.swing.JTextField();
        DinningTable_Inventory = new javax.swing.JTextField();
        Cupboard_Inventory = new javax.swing.JTextField();
        Sofa_Inventory = new javax.swing.JTextField();
        TVBench_Inventory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel7.setText("$");

        jLabel8.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel8.setText("$");

        DinningTable_Quantity.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        DinningTable_Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 40, 1));
        DinningTable_Quantity.setEnabled(false);
        DinningTable_Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DinningTable_QuantityStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel9.setText("$");

        CoffeeTable_Quantity.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        CoffeeTable_Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        CoffeeTable_Quantity.setToolTipText("");
        CoffeeTable_Quantity.setEnabled(false);
        CoffeeTable_Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CoffeeTable_QuantityStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel11.setText("$");

        Chairs_Quantity.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Chairs_Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 70, 1));
        Chairs_Quantity.setEnabled(false);
        Chairs_Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Chairs_QuantityStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel2.setText("Item(s)");

        jLabel3.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel3.setText("Quantity");

        Sofa_Price.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Sofa_Price.setText("$63.99");

        Chairs__Cost.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Chairs__Cost.setText("$24.99");

        BedFrame_Cost.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        BedFrame_Cost.setText("$61.99");

        CoffeeTable_Cost.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        CoffeeTable_Cost.setText("$34.99");

        DinningTable__Cost.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        DinningTable__Cost.setText("$70.99");

        jLabel10.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel10.setText("Cost");

        Chairs_Total.setEditable(false);
        Chairs_Total.setEnabled(false);
        Chairs_Total.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N

        Sofa_Total.setEditable(false);
        Sofa_Total.setEnabled(false);
        Sofa_Total.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Sofa_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sofa_TotalActionPerformed(evt);
            }
        });

        Sofa_Item.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Sofa_Item.setText("Sofa");
        Sofa_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sofa_ItemActionPerformed(evt);
            }
        });

        CoffeeTable_Total.setEditable(false);
        CoffeeTable_Total.setEnabled(false);
        CoffeeTable_Total.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        CoffeeTable_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeTable_TotalActionPerformed(evt);
            }
        });

        BedFrame_Item.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        BedFrame_Item.setText("Bed Frame");
        BedFrame_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedFrame_ItemActionPerformed(evt);
            }
        });

        DinningTable_Total.setEditable(false);
        DinningTable_Total.setEnabled(false);
        DinningTable_Total.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        DinningTable_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinningTable_TotalActionPerformed(evt);
            }
        });

        BedFrame_Total.setEditable(false);
        BedFrame_Total.setEnabled(false);
        BedFrame_Total.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N

        CoffeeTable_Item.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        CoffeeTable_Item.setText("Coffee Table");
        CoffeeTable_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeTable_ItemActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel12.setText("Total Cost");

        Chairs_Item.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Chairs_Item.setText("Chairs");
        Chairs_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chairs_ItemActionPerformed(evt);
            }
        });

        DinningTable_Item.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        DinningTable_Item.setText("Dinning Table");
        DinningTable_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinningTable_ItemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel5.setText("$");

        Sofa_Quantity.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Sofa_Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        Sofa_Quantity.setEnabled(false);
        Sofa_Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Sofa_QuantityStateChanged(evt);
            }
        });

        BedFrame_Quantity.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        BedFrame_Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 40, 1));
        BedFrame_Quantity.setEnabled(false);
        BedFrame_Quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BedFrame_QuantityStateChanged(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back_Button.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("KG Blank Space Solid", 0, 18)); // NOI18N
        jLabel1.setText("Item Inventory");

        jLabel13.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel13.setText("Item(s)");

        jLabel14.setFont(new java.awt.Font("KG Blank Space Solid", 0, 14)); // NOI18N
        jLabel14.setText("Quantity Remaining");

        BedFrame_Inventory.setEditable(false);
        BedFrame_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedFrame_InventoryActionPerformed(evt);
            }
        });

        ArmChair_Inventory.setEditable(false);
        ArmChair_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmChair_InventoryActionPerformed(evt);
            }
        });

        ChestOfDrawers_Inventory.setEditable(false);
        ChestOfDrawers_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChestOfDrawers_InventoryActionPerformed(evt);
            }
        });

        CoffeeTable_Inventory.setEditable(false);
        CoffeeTable_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeTable_InventoryActionPerformed(evt);
            }
        });

        Chairs_Inventory.setEditable(false);
        Chairs_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chairs_InventoryActionPerformed(evt);
            }
        });

        Desk_Inventory.setEditable(false);
        Desk_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desk_InventoryActionPerformed(evt);
            }
        });

        DinningTable_Inventory.setEditable(false);
        DinningTable_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinningTable_InventoryActionPerformed(evt);
            }
        });

        Cupboard_Inventory.setEditable(false);
        Cupboard_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cupboard_InventoryActionPerformed(evt);
            }
        });

        Sofa_Inventory.setEditable(false);
        Sofa_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sofa_InventoryActionPerformed(evt);
            }
        });

        TVBench_Inventory.setEditable(false);
        TVBench_Inventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TVBench_InventoryActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel4.setText("Bed Frame");
        jLabel4.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel4.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel4.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel6.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel6.setText("Chairs");
        jLabel6.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel6.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel6.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel15.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel15.setText("Arm Chair");
        jLabel15.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel15.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel15.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel16.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel16.setText("Chest of Drawers");
        jLabel16.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel16.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel16.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel17.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel17.setText("Coffee Table");
        jLabel17.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel17.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel17.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel18.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel18.setText("Cupboard");
        jLabel18.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel18.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel18.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel19.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel19.setText("Sofa");
        jLabel19.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel19.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel19.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel20.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel20.setText("Desk");
        jLabel20.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel20.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel20.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel21.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel21.setText("Dinning Table");
        jLabel21.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel21.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel21.setPreferredSize(new java.awt.Dimension(88, 18));

        jLabel22.setFont(new java.awt.Font("KG Blank Space Solid", 0, 12)); // NOI18N
        jLabel22.setText("TV Bench");
        jLabel22.setMaximumSize(new java.awt.Dimension(88, 18));
        jLabel22.setMinimumSize(new java.awt.Dimension(88, 18));
        jLabel22.setPreferredSize(new java.awt.Dimension(88, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(210, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back_Button)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TVBench_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChestOfDrawers_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CoffeeTable_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BedFrame_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArmChair_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Chairs_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Desk_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DinningTable_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cupboard_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sofa_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(55, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(25, 25, 25))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ArmChair_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(BedFrame_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Chairs_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChestOfDrawers_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CoffeeTable_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cupboard_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Desk_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DinningTable_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sofa_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TVBench_Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Back_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        this.setVisible(false);
        Employee_Interface f = new Employee_Interface();
        f.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void DinningTable_QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DinningTable_QuantityStateChanged
        
    }//GEN-LAST:event_DinningTable_QuantityStateChanged

    private void CoffeeTable_QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CoffeeTable_QuantityStateChanged
        
    }//GEN-LAST:event_CoffeeTable_QuantityStateChanged

    private void Chairs_QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Chairs_QuantityStateChanged
        
    }//GEN-LAST:event_Chairs_QuantityStateChanged

    private void Sofa_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sofa_TotalActionPerformed

    }//GEN-LAST:event_Sofa_TotalActionPerformed

    private void Sofa_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sofa_ItemActionPerformed

    }//GEN-LAST:event_Sofa_ItemActionPerformed

    private void CoffeeTable_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeTable_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoffeeTable_TotalActionPerformed

    private void BedFrame_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedFrame_ItemActionPerformed
        
    }//GEN-LAST:event_BedFrame_ItemActionPerformed

    private void DinningTable_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinningTable_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DinningTable_TotalActionPerformed

    private void CoffeeTable_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeTable_ItemActionPerformed
        
    }//GEN-LAST:event_CoffeeTable_ItemActionPerformed

    private void Chairs_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chairs_ItemActionPerformed
        
    }//GEN-LAST:event_Chairs_ItemActionPerformed

    private void DinningTable_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinningTable_ItemActionPerformed
       
    }//GEN-LAST:event_DinningTable_ItemActionPerformed

    private void Sofa_QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Sofa_QuantityStateChanged

    }//GEN-LAST:event_Sofa_QuantityStateChanged

    private void BedFrame_QuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BedFrame_QuantityStateChanged
        
    }//GEN-LAST:event_BedFrame_QuantityStateChanged

    private void BedFrame_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedFrame_InventoryActionPerformed

    
    }//GEN-LAST:event_BedFrame_InventoryActionPerformed

    private void ArmChair_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmChair_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArmChair_InventoryActionPerformed

    private void ChestOfDrawers_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChestOfDrawers_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChestOfDrawers_InventoryActionPerformed

    private void CoffeeTable_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeTable_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoffeeTable_InventoryActionPerformed

    private void Chairs_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chairs_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Chairs_InventoryActionPerformed

    private void Desk_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Desk_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Desk_InventoryActionPerformed

    private void DinningTable_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinningTable_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DinningTable_InventoryActionPerformed

    private void Cupboard_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cupboard_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cupboard_InventoryActionPerformed

    private void Sofa_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sofa_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sofa_InventoryActionPerformed

    private void TVBench_InventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TVBench_InventoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TVBench_InventoryActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ArmChair_Inventory;
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel BedFrame_Cost;
    public javax.swing.JTextField BedFrame_Inventory;
    private javax.swing.JCheckBox BedFrame_Item;
    public javax.swing.JSpinner BedFrame_Quantity;
    public javax.swing.JFormattedTextField BedFrame_Total;
    public javax.swing.JTextField Chairs_Inventory;
    private javax.swing.JCheckBox Chairs_Item;
    public javax.swing.JSpinner Chairs_Quantity;
    public javax.swing.JFormattedTextField Chairs_Total;
    private javax.swing.JLabel Chairs__Cost;
    public javax.swing.JTextField ChestOfDrawers_Inventory;
    private javax.swing.JLabel CoffeeTable_Cost;
    public javax.swing.JTextField CoffeeTable_Inventory;
    private javax.swing.JCheckBox CoffeeTable_Item;
    public javax.swing.JSpinner CoffeeTable_Quantity;
    public javax.swing.JFormattedTextField CoffeeTable_Total;
    public javax.swing.JTextField Cupboard_Inventory;
    public javax.swing.JTextField Desk_Inventory;
    public javax.swing.JTextField DinningTable_Inventory;
    private javax.swing.JCheckBox DinningTable_Item;
    public javax.swing.JSpinner DinningTable_Quantity;
    public javax.swing.JFormattedTextField DinningTable_Total;
    private javax.swing.JLabel DinningTable__Cost;
    public javax.swing.JTextField Sofa_Inventory;
    private javax.swing.JCheckBox Sofa_Item;
    private javax.swing.JLabel Sofa_Price;
    public javax.swing.JSpinner Sofa_Quantity;
    public javax.swing.JFormattedTextField Sofa_Total;
    public javax.swing.JTextField TVBench_Inventory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
