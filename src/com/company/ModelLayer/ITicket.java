package com.company.ModelLayer;

public interface ITicket {
    int getId();

    String getUser();

    String getCinema();

    int getRow();

    int getSitPlace();

    String getDataSession();

    String getTimeSession();

    String getMovie();

    String getGrade();

    int getCost();

    Integer getOrder();

    void setUser(String user);

    void setCinema(String cinema);

    void setRow(int row);

    void setSitPlace(int sitPlace);

    void setDataSession(String dataSession);

    void setTimeSession(String timeSession);

    void setMovie(String movie);

    void setGrade(String grade);

    void setCost(int cost);

    void setOrder(Integer order);
}
