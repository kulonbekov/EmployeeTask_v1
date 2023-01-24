package kg.megacom.EmployeeTask.services;

import java.util.List;

public interface BaseService<T>{

    T save (T t);
    T findById(long id);
    void delete(long id);
    List<T> findAll();
    T update(long id, T t);
}
