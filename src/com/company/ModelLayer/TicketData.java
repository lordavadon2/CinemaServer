package com.company.ModelLayer;

public class TicketData implements ITicket {

    private int id;
    private String user;
    private String cinema;
    private int row;
    private int sitPlace;
    private String dataSession;
    private String timeSession;
    private String movie;
    private String grade;
    private int cost;
    private Integer order;


    public TicketData() {
        this.id = -1;
        this.user = "";
        this.cinema = "";
        this.row = 0;
        this.sitPlace = 0;
        this.dataSession = "";
        this.timeSession = "";
        this.movie = "";
        this.grade = "";
        this.cost = 0;
        this.order = null;
    }

    public TicketData(int id, String user, String cinema, int row, int sitPlace, String dataSession,
                      String timeSession, String movie, String grade, int cost, Integer order) {
        this.id = id;
        this.user = user;
        this.cinema = cinema;
        this.row = row;
        this.sitPlace = sitPlace;
        this.dataSession = dataSession;
        this.timeSession = timeSession;
        this.movie = movie;
        this.grade = grade;
        this.cost = cost;
        this.order = order;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getCinema() {
        return cinema;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getSitPlace() {
        return sitPlace;
    }

    @Override
    public String getDataSession() {
        return dataSession;
    }

    @Override
    public String getTimeSession() {
        return timeSession;
    }

    @Override
    public String getMovie() {
        return movie;
    }

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public Integer getOrder() {
        return order;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public void setSitPlace(int sitPlace) {
        this.sitPlace = sitPlace;
    }

    @Override
    public void setDataSession(String dataSession) {
        this.dataSession = dataSession;
    }

    @Override
    public void setTimeSession(String timeSession) {
        this.timeSession = timeSession;
    }

    @Override
    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void setOrder(Integer order) {
        this.order = order;
    }

}
