package proxy.example;

import com.healthmarketscience.jackcess.*;
import org.hsqldb.types.Types;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) throws IOException, SQLException {
        Database db = DatabaseBuilder.create(Database.FileFormat.V2000, new File("shoppingCart.mdb"));
        Table newTable = new TableBuilder("Products")
                .addColumn(new ColumnBuilder("sku")
                        .setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("name")
                        .setSQLType(Types.VARCHAR))
                .addColumn(new ColumnBuilder("price")
                        .setSQLType(Types.INTEGER))
                .toTable(db);
        db.close();
    }
}
