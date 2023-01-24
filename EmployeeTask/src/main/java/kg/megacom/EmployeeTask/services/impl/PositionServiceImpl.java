package kg.megacom.EmployeeTask.services.impl;

import kg.megacom.EmployeeTask.dao.PositionRep;
import kg.megacom.EmployeeTask.models.entities.Position;
import kg.megacom.EmployeeTask.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRep rep;
    @Override
    public Position save(Position position) {
        return rep.save(position);
    }

    @Override
    public Position findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Position не найден"));
    }

    @Override
    public void delete(long id) {
        Position position = findById(id);
        rep.delete(position);
    }

    @Override
    public List<Position> findAll() {
        return rep.findAll();
    }

    @Override
    public Position update(long id, Position position) {
        return null;
    }
}
