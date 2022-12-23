package jar.maven.springboot.services;

import jar.maven.springboot.entities.Column;
import java.util.List;
import java.util.Optional;

public interface ColumnService {
    Column saveColumn(Column column);

    List<Column> getAllColumns();
    Column getColumnById(long id);
}
