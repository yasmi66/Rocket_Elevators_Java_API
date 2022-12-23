package jar.maven.springboot.service.impl;

import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.entities.Column;
import jar.maven.springboot.repositories.ColumnRepository;
import jar.maven.springboot.services.ColumnService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ColumnServiceImpl implements ColumnService {
    private ColumnRepository columnRepository;

    public ColumnServiceImpl(ColumnRepository columnRepository) {
        super();
        this.columnRepository = columnRepository;
    }

    @Override
    public Column saveColumn(Column column) {
        return columnRepository.save(column);
    }

    @Override
    public List<Column> getAllColumns() {
        return columnRepository.findAll();
    }

    @Override
    public Column getColumnById(long id) {
        Optional<Column> column = columnRepository.findAllById(id);
        if (column.isPresent()) {
            return column.get();
        } else {
            throw new ResourceNotFoundException("columns", "id", id);
        }
    }
}
