package phides;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;


public class nhapsotien extends javax.swing.JFrame {
    private double totalSum = 0;
    private DefaultTableModel tableModel;

    public nhapsotien() {
        initComponents();
        // Khởi tạo DefaultTableModel cho jTable1
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        // Áp dụng DocumentFilter cho thutextField
        ((AbstractDocument) thutextField.getDocument()).setDocumentFilter(new NumberFilter());

        // Áp dụng DocumentFilter cho chitextField
        ((AbstractDocument) chitextField.getDocument()).setDocumentFilter(new NumberFilter());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tienLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        thutextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        chitextField = new javax.swing.JTextField();
        tinhtongButton = new javax.swing.JButton();
        noteTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        editButton9 = new javax.swing.JButton();
        deleteButton10 = new javax.swing.JButton();
        editButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Income/ Expense", "Note", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Danh sách", jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("ví:");

        tienLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tienLabel.setForeground(new java.awt.Color(0, 204, 153));
        tienLabel.setText("0 đ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Time");

        jTabbedPane2.setForeground(new java.awt.Color(0, 204, 153));
        jTabbedPane2.setFocusCycleRoot(true);
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        thutextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thutextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(thutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Thu nhập", jPanel3);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setForeground(new java.awt.Color(250, 250, 250));

        chitextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chitextField, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(chitextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Chi tiêu", jPanel4);

        tinhtongButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tinhtongButton.setText("OK");
        tinhtongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtongButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Note:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tinhtongButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(noteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tienLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tinhtongButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        editButton9.setText("Sửa");
        editButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton9ActionPerformed(evt);
            }
        });

        deleteButton10.setText("xóa");
        deleteButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton10ActionPerformed(evt);
            }
        });

        editButton10.setText("Thêm");
        editButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton9)
                    .addComponent(deleteButton10)
                    .addComponent(editButton10))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(editButton9)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton10)
                        .addGap(18, 18, 18)
                        .addComponent(editButton10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tinhtongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtongButtonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        
        
        
        
        double a = 0;
        double b = 0;
        double sum = 0;
        
        

        try {
       

            
            // Lấy giá trị từ thutextField, nếu rỗng thì mặc định a là 0
            String thuNhapText = thutextField.getText().trim();
            String chiTieuText = chitextField.getText().trim();
            String calender =((JTextField)jDateChooser1.getDateEditor()).getText() ;
            
            a = thuNhapText.isEmpty() ? 0 : Double.parseDouble(thuNhapText);
            
            // Thêm chuỗi được định dạng vào jTable1
            if (!thuNhapText.isEmpty()) {
                // Thêm chuỗi được định dạng với dấu "+" và màu xanh vào jTable1
                model.addRow(new Object[]{"<html><font color='green'>+ " + thuNhapText + "</font></html>",noteTextField1.getText(),calender});
            }
            if (!chiTieuText.isEmpty()) {
                // Thêm chuỗi được định dạng với dấu "+" và màu xanh vào jTable1
                model.addRow(new Object[]{"<html><font color='red'>- " + chiTieuText + "</font></html>",noteTextField1.getText(),calender});
            }

            // Lấy giá trị từ chitextField
            b = Double.parseDouble(chitextField.getText());

            // Lấy giá trị từ tientextField
            sum = Double.parseDouble(tienLabel.getText());
        } catch (NumberFormatException e) {
            // Xử lý trường hợp nhập không đúng định dạng double
            // Bạn có thể hiển thị thông báo lỗi hoặc thực hiện hành động phù hợp

        }

        // Cập nhật tientextField với tổng của sum hiện tại và kết quả của (a - b)
        // Cập nhật totalSum với tổng của sum hiện tại và kết quả của (a - b)
        totalSum += sum + (a - b);
        
        
        // Định dạng số theo kiểu tiền tệ và hiển thị trong tientextField
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        tienLabel.setText(currencyFormat.format(totalSum));
        
        
        
        // Làm mới noteTextFiled1
        noteTextField1.setText("");

        
 
        
        // Làm mới mô hình bảng để phản ánh các thay đổi
        model.fireTableDataChanged();
        
        // Làm mới thutextField trong jPanel3
        Document chiDocument = thutextField.getDocument();
        Document tieuDocument = chitextField.getDocument();

        try {
            chiDocument.remove(0, chiDocument.getLength());
            tieuDocument.remove(0, tieuDocument.getLength());
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tinhtongButtonActionPerformed

    private void editButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton9ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
        // Lấy thông tin từ dòng được chọn và hiển thị nó trong các thành phần nhập liệu
        String type = (String) jTable1.getValueAt(selectedRow, 0);
        String note = (String) jTable1.getValueAt(selectedRow, 1);
        String time = (String) jTable1.getValueAt(selectedRow, 2);
        }
    }//GEN-LAST:event_editButton9ActionPerformed

    private void deleteButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton10ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                // Lấy thông tin giao dịch và cập nhật totalSum
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                String type = (String) model.getValueAt(selectedRow, 0);
                double deletedAmount = extractAmountFromType(type);
                boolean isExpense = type.contains("red"); // Kiểm tra xem có phải chi tiêu không

                // Thực hiện phép tính cộng hoặc trừ tùy thuộc vào loại giao dịch
                if (isExpense) {
                    totalSum += deletedAmount; // Nếu là chi tiêu, cộng vào totalSum
                } else {
                    totalSum -= deletedAmount; // Nếu là thu nhập, trừ khỏi totalSum
                }

                // Xóa dòng được chọn từ bảng
                model.removeRow(selectedRow);

                    // Cập nhật nhãn tổng số
                updateTotalSumLabel();
            }
        }
    }//GEN-LAST:event_deleteButton10ActionPerformed

    private void editButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButton10ActionPerformed
    

    
    
    private double extractAmountFromType(String type) {
       // Bạn cần thực hiện phương thức này dựa trên cấu trúc dữ liệu thực tế của bạn
        // Ví dụ: "<html><font color='green'>+ 200.0</font></html>"
        // Trích xuất "200.0" từ chuỗi loại và chuyển đổi nó thành double
        // Trả về số tiền đã trích xuất
        return Double.parseDouble(type.replaceAll("[^0-9.]+", ""));
    }
    
    private void updateTotalSumLabel() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        tienLabel.setText(currencyFormat.format(totalSum));
    }
    private Object currencyFormat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //khóa không cho người dùng nhập kí tự lạ ở mục thêm/bớt tiền
    private class NumberFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.insert(offset, string);

            if (isNumeric(sb.toString())) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            Document doc = fb.getDocument();
            StringBuilder sb = new StringBuilder();
            sb.append(doc.getText(0, doc.getLength()));
            sb.replace(offset, offset + length, text);

            if (isNumeric(sb.toString())) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean isNumeric(String str) {
            return str.matches("-?\\d+(\\.\\d+)?"); // Cho phép số nguyên hoặc số thập phân
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new nhapsotien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chitextField;
    private javax.swing.JButton deleteButton10;
    private javax.swing.JButton editButton10;
    private javax.swing.JButton editButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField noteTextField1;
    private javax.swing.JTextField thutextField;
    private javax.swing.JLabel tienLabel;
    private javax.swing.JButton tinhtongButton;
    // End of variables declaration//GEN-END:variables
}
