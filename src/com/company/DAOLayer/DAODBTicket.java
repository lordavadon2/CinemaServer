package com.company.DAOLayer;

import com.company.ModelLayer.ITicket;
import com.company.ModelLayer.TicketData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAODBTicket {

    private static String selectTicketQuery = "select id_ticket, user_ticket, name_cinema, row_place, sit_place_place, " +
            "data_session, time_session, name_movie,\n" +
            "grade_price, cost_price, order_id_ticket from cinemadb.tickets\n" +
            "left join cinemadb.places on tickets.place_ticket = places.id_place\n" +
            "left join cinemadb.prices on tickets.session_price_ticket = prices.id_price\n" +
            "left join cinemadb.cinema on prices.cinema_price = cinema.id_cinema\n" +
            "left join cinemadb.sessions on prices.session_price = sessions.id_session\n" +
            "left join cinemadb.movies on sessions.movie_session = movies.id_movie";

    private Connection con;
    private PreparedStatement pstm;

    public DAODBTicket(Connection con) {
        this.con = con;
    }

    public int addTicket(){
        return 0;
    }

    public List<ITicket> getAllTicket(){
        return null;
    }

    private ITicket convertFromResultSet(ResultSet rs) throws SQLException
    {
        int id = rs.getInt(1);
        String user = rs.getString(2);
        String cinema = rs.getString(3);
        int row = rs.getInt(4);
        int sitPlace = rs.getInt(5);
        String dataSession = rs.getString(6);
        String timeSession = rs.getString(7);
        String movie = rs.getString(8);
        String grade = rs.getString(9);
        int cost = rs.getInt(10);
        Integer order = rs.getInt(11);
        return new TicketData(id, user, cinema, row, sitPlace, dataSession, timeSession, movie, grade, cost,order);
    }

    public ITicket getTicket(int id){
        ITicket result = null;
        ResultSet rs = null;
        String selectByCondition = selectTicketQuery + "where id_ticket = ?";
        try {
            pstm = con.prepareStatement(selectByCondition);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if(rs.next()){
                result = convertFromResultSet(rs);
            }

        } catch (SQLException e) {
            System.out.println("getTicket(int id) error." + e.getMessage());
        }
        finally {

        }
        return null;
    }

    public boolean updateTicket(){
        return false;
    }

    public boolean deleteTicket(){
        return false;
    }

    public boolean deleteAllTicket(){
        return false;
    }
}
