package D;

public class Service implements DatabasePersistence {
    private String database;

    Service(String database){
        this.database = database;
    }

    @Override
    public void save() {
        // this service class should depend on INTERFACE not IMPLEMENT
        // in this example, service depend on INTERFACE by implement save method
        // and when the database we're using is change we just change where we implement not in the INTERFACE
        switch (database){
            case "MSSQL" -> System.out.println("save data into MSSQL database");
            case "MySQL" -> System.out.println("save data into MySQL database");
            case "Oracle" -> System.out.println("save data into Oracle database");
            default -> System.out.println("save data into MongoDB database");
        }
    }
}
