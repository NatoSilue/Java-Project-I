//package javaProject;
//
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//         
//
//import uca.mis3339.OracleWrapper;
//
//public class Product {
//	public static class ProductBuilder{
//
//		private static int builderProductSKU;
//		private static double builderUnitPrice;
//		private static String builderProductDescription;
//	
//
//
//		public static Product build() {
//			Product product = new Product( builderProductSKU, builderUnitPrice,builderProductDescription);
//			return product;
//		}//end build
//		public static void setBuilderProductSKU(int  builderProductSKU) {
//			ProductBuilder. builderProductSKU =  builderProductSKU;
//		}// end builderOrderID
//		public static void setBuilderUnitPrice(double builderUnitPrice) {
//			ProductBuilder.builderUnitPrice = builderUnitPrice;
//		}// end builderUnitPrice
//		public static void setBuilderProductDescription(String builderProductDescription) {
//			ProductBuilder.builderProductDescription = builderProductDescription;
//		}//end builderProductDescription
//		
//
//	}// end builder
//	{
//		ArrayList<Product> onlineOrder = new ArrayList<Product>();
//		try {
//			OracleWrapper.prepareStatement("SELECT * FROM TB_Product_T");
//			ResultSet rs = OracleWrapper.queryDB();					
//			while (rs.next()) {
//				ProductBuilder.setBuilderProductSKU(Integer.valueOf(String.valueOf( rs.getObject(1)))); 
//				ProductBuilder.setBuilderUnitPrice(Double.valueOf(String.valueOf( rs.getObject(2)))); 
//				ProductBuilder.setBuilderProductDescription((String.valueOf( rs.getObject(3))));  
//				onlineOrder.add(ProductBuilder.build());
//			} // end while
//			rs.close();
//			for (Product eachOne: onlineOrder) {
//				System.out.println(eachOne.toString());
//			}//end for
//		}/*end try*/ catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} // end catch
//	}
//	private final int productSKU;
//	private final double unitPrice;
//	private final String productDescription;
//	
//	private Product(int productSKU, double unitPrice, String productDescription)
//	{
//		this.productSKU = productSKU;
//		this.unitPrice = unitPrice;
//		this.productDescription = productDescription;
//		
//
//	}//end ctor
//	
//}//end Order
