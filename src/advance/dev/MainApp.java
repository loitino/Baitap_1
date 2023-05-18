package advance.dev;

import java.util.List;

public class MainApp {
	 public static void main(String[] args) {
	        FruitManager manager = new FruitManager();
	        
	        // Thêm fruit
	        manager.addFruit(new Fruit(0.5, "Táo", 20000));
	        manager.addFruit(new Fruit(1.2, "Cam", 15000));
	        manager.addFruit(new Fruit(0.8, "Xoài", 50000));
	        
	        // Sửa fruit
	        manager.editFruit(1, new Fruit(1.5, "Chuối", 10000));
	        
	        // Xóa fruit
	        manager.deleteFruit(0);
	        
	        // Sắp xếp
	        manager.sortFruits((f1, f2) -> Double.compare(f1.getPrice(), f2.getPrice()));
	        
	        // Lấy ra toàn bộ
	        List<Fruit> allFruits = manager.getAllFruits();
	        for (Fruit fruit : allFruits) {
	            System.out.println("Tên: " + fruit.getName() +
	                               ", Khối lượng: " + fruit.getWeight() +
	                               ", Giá: " + fruit.getPrice());
	        }
	    }
}
