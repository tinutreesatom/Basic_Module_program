package ionixx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Admin {

	public static int dis;
	public void menuDriven()
	{
		
		JFrame adminf=new JFrame("home");
		//adminf.dispose();
		
		JButton addProd=new JButton("Add product");
		addProd.setBounds(50, 100, 150, 60);
		adminf.add(addProd);
		
		JButton disp=new JButton("Display inventory");
		disp.setBounds(200, 100, 150, 60);
		adminf.add(disp);
		
		JButton btLogout=new JButton("Logout");
		btLogout.setBounds(350, 100, 150, 60);
		adminf.add(btLogout);
		
		btLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//adminf.dispose();
				//agentf.dispose();
				//Login lobj=new Login();
				//dis=0;
				try {
					adminf.dispose();
					Login.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		disp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JTable tab=new J
				
				ConnectionManager conM=new ConnectionManager();
				DefaultTableModel model = new DefaultTableModel();
			    //Container cnt = this.getContentPane();
			    JTable jtbl = new JTable(model);
			    jtbl.setBounds(100, 300, 500, 200);
				model.addColumn("Product Id");
				model.addColumn("Product Name");
				model.addColumn("Min Sell Quantity");
				model.addColumn("Price");
				model.addColumn("Quantity");
				
				try
				{
					
					Connection c=conM.connection();
					Statement stmnt=c.createStatement();
					ResultSet res=stmnt.executeQuery("Select * from admin");
				//	String[][] str=new String[30][30];
					while(res.next())
					{
						int i=0;
						//for(int j=0;j<)
						model.addRow(new Object[] {res.getString("product_id"),res.getString("product_name"),res.getString("min_sell_quantity"),res.getString("price"),res.getString("quantity")});
					}
					jtbl.setModel(model);
					
					adminf.add(jtbl);
					
				}
				catch (Exception ex) {
					// TODO: handle exception
				}
				
			}
		});
		
		addProd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JLabel pdId,pdName,pdMinSell,pdPrice,pdQunat,pdMob,addpd;
				
				addpd=new JLabel("Add product");
				addpd.setBounds(150, 220, 200, 30);
				
				
				pdId=new JLabel("Product Id");
				pdId.setBounds(50, 300, 200, 30);
							
				JTextField idTxt=new JTextField();
				idTxt.setBounds(300,300, 100, 30);
				
				
				pdName=new JLabel("Product Name");
				pdName.setBounds(50, 350, 200, 30);
							
				JTextField nameTxt=new JTextField();
				nameTxt.setBounds(300,350, 100, 30);
				
				
				pdMinSell=new JLabel("Min sell Quantity");
				pdMinSell.setBounds(50, 400, 200, 30);
							
				JTextField minSellTxt=new JTextField();
				minSellTxt.setBounds(300,400, 100, 30);
				
				pdPrice=new JLabel("Price");
				pdPrice.setBounds(50, 450, 200, 30);
							
				JTextField priceTxt=new JTextField();
				priceTxt.setBounds(300,450, 100, 30);
				
				
				pdQunat=new JLabel("Quantity");
				pdQunat.setBounds(50, 500, 200, 30);
								
				JTextField quantTxt=new JTextField();
				quantTxt.setBounds(300,500, 100, 30);
				
				
				pdMob=new JLabel("Mob No.");
				pdMob.setBounds(50, 550, 200, 30);
								
				JTextField mobTxt=new JTextField();
				mobTxt.setBounds(300,550, 100, 30);
				
				
				
				JButton addBtn=new JButton("Add");
				addBtn.setBounds(150, 600, 100, 30);
				
				adminf.add(addpd);
				adminf.add(mobTxt);
				adminf.add(addBtn);	
				adminf.add(pdMob);
				adminf.add(quantTxt);
				adminf.add(pdQunat);
				adminf.add(priceTxt);
				adminf.add(pdPrice);	
				adminf.add(pdMinSell);	
				adminf.add(minSellTxt);
				adminf.add(nameTxt);
				adminf.add(pdName);	
				adminf.add(idTxt);
				adminf.add(pdId);	
				idTxt.setVisible(true);
				addpd.setVisible(true);
				addBtn.setVisible(true);
				pdMob.setVisible(true);
				
				quantTxt.setVisible(true);
				pdQunat.setVisible(true);
				priceTxt.setVisible(true);
				pdMinSell.setVisible(true);
				
				minSellTxt.setVisible(true);
				nameTxt.setVisible(true);
				pdName.setVisible(true);
				pdId.setVisible(true);
				addBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						ConnectionManager conM=new ConnectionManager();
						String pdid=idTxt.getText();
						String pdname=nameTxt.getText();
						String pdminsellquant=minSellTxt.getText();
						String pdprice=priceTxt.getText();
						String pdquant=quantTxt.getText();
						String pduname=Login.username;
						String pdpassword=Login.password;
						String pdmob=mobTxt.getText();
						try
						{
							Connection c=conM.connection();
							Statement stmnt=c.createStatement();
						//	System.out.println(pduname);
							//System.out.println("insert into admin(product_id,product_name,min_sell_quantity,price,quantity	,username,password,mob_no) values('"+pdid+"','"+pdname+"','"+pdminsellquant+"','"+pdprice+"','"+pdquant+"','"+pduname+"','"+pdpassword+"''"+pdmob+"')");
							int res=stmnt.executeUpdate("insert into admin(product_id,product_name,min_sell_quantity,price,quantity,username,password,mob_no) values('"+pdid+"','"+pdname+"','"+pdminsellquant+"','"+pdprice+"','"+pdquant+"','"+pduname+"','"+pdpassword+"','"+pdmob+"')");
								if(res>0)
								{
									JOptionPane.showMessageDialog(adminf, "Product succefully added");
								}
								else
								{
									JOptionPane.showMessageDialog(adminf, "Product failed to add");
								}
						}
						catch (Exception ex) {
							// TODO: handle exception
						}
						
					}
				});
			}
		});
		
		
		adminf.setLayout(null);
		//adminf.pack();
		adminf.setVisible(true);
		adminf.setSize(600, 1000);
		adminf.setDefaultCloseOperation(adminf.EXIT_ON_CLOSE);
	}
}
