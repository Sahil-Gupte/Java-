package controller;

import model.Inventory;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryController {
    public List<Inventory> getAllItems() {
        List<Inventory> items = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM inventory")) {
            
            while (rs.next()) {
                items.add(new Inventory(rs.getInt("id"), rs.getString("name"),
                                        rs.getInt("stock"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }
}
