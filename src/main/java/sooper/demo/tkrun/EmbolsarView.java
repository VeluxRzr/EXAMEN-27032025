package sooper.demo.tkrun;

import javax.swing.JFrame;
		import net.miginfocom.swing.MigLayout;
		import javax.swing.JTextField;
		import javax.swing.JButton;
		import javax.swing.JScrollPane;
		import javax.swing.JTable;
		import java.awt.event.ActionListener;
		import java.awt.event.ActionEvent;
		import java.awt.event.MouseAdapter;
		import java.awt.event.MouseEvent;
		import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;


public class EmbolsarView {
			
protected JFrame frmEmbolsar;	
private JTable table;
private DefaultTableModel ArticulosAEmbolsar;

public EmbolsarView() {
	initialice();
}

private void initialice() {
	
	
	frmEmbolsar = new JFrame();
	frmEmbolsar.setTitle("Embolsado de Articulos");
	frmEmbolsar.setBounds(0, 0, 400, 500);
	frmEmbolsar.getContentPane().setLayout(new MigLayout("", "[grow]", "[][grow][][][][][][][][][][][][][][]"));
	
	ArticulosAEmbolsar = new DefaultTableModel(new Object[][] {
			},
			new String[] {
				"idArticulo", "idContenedor"
			}
		);
	
	JLabel lblNewLabel = new JLabel("Articulos a Embolsar");
	frmEmbolsar.getContentPane().add(lblNewLabel, "cell 0 0");
	
	JScrollPane scrollPane = new JScrollPane();
	frmEmbolsar.getContentPane().add(scrollPane, "cell 0 1 1 14,grow");
	
	table = new JTable();
	table.setModel(ArticulosAEmbolsar);
	scrollPane.setViewportView(table);
	
	JButton btnNewButton = new JButton("Añadir Articulo");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	frmEmbolsar.getContentPane().add(btnNewButton, "cell 0 15");

	frmEmbolsar.setVisible(true);
}}