package com.heoth.connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnectionPool {
    public Connection conn;
    public PreparedStatement pstmt;
    public ResultSet rs;

    public JDBCConnectionPool() {
        try {
            Context initContext = new InitialContext();
            Context context = (Context) initContext.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("dbcp_oracle");
            conn = dataSource.getConnection();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if(conn!=null){
                conn.close();
            }
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
