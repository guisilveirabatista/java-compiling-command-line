package nl.guisilver.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonRepository {

    private Connection conn;

    public PersonRepository(Connection conn) {
        this.conn = conn;
    }

    public Integer save(String person) throws SQLException {
        String query = "INSERT INTO person (name) VALUES (?);";
        PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, person);
        pstmt.executeUpdate();

        Integer getGeneratedKey = null;
        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            getGeneratedKey = rs.getInt(1);
        }
        return getGeneratedKey;
    }

    public String getPerson(int id) throws SQLException {
        String query = "SELECT * FROM person WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        String result = "";
        if (rs.next()) {
            result = rs.getString("name");
        }

        return result;
    }
}
