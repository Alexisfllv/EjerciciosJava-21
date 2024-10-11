package Sealed.sql;

public abstract sealed class SQL permits MySQL,SQLServer {

    //
    public abstract void connect();
    public abstract  void disconnect();
}
