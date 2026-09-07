import java.sql.*;
import javax.servlet.http.*;

public class UserDao {

    public ResultSet getUserById(HttpServletRequest req, Connection conn) throws SQLException {
        String id = req.getParameter("id");
        Statement stmt = conn.createStatement();
        // SQL Injection - direct concat !
        return stmt.executeQuery("SELECT * FROM users WHERE id = " + id);
    }

    public ResultSet searchUsers(HttpServletRequest req, Connection conn) throws SQLException {
        String name = req.getParameter("name");
        Statement stmt = conn.createStatement();
        // SQL Injection - direct concat !
        return stmt.executeQuery("SELECT * FROM users WHERE name = '" + name + "'");
    }

    public ResultSet getOrders(HttpServletRequest req, Connection conn) throws SQLException {
        String status = req.getParameter("status");
        Statement stmt = conn.createStatement();
        // SQL Injection - direct concat
        return stmt.executeQuery("SELECT * FROM orders WHERE status = '" + status + "'");
    }

    public ResultSet getInvoices(HttpServletRequest req, Connection conn) throws SQLException {
        String year = req.getParameter("year");
        Statement stmt = conn.createStatement();
        // SQL Injection - direct concat
        return stmt.executeQuery("SELECT * FROM invoices WHERE year = " + year);
    }

    public ResultSet deleteUser(HttpServletRequest req, Connection conn) throws SQLException {
        String id = req.getParameter("id");
        Statement stmt = conn.createStatement();
        // SQL Injection - direct concat
        return stmt.executeQuery("DELETE FROM users WHERE id = " + id);
    }
}
