package com.devstack.pos.dao;

import java.util.List;

public interface CrudDao<T, ID> extends SuperDao {
    public void Save(T t);

    public void delete(ID id);

    public void update(T t);

    public T find(ID id);

    public List<T> finAll();
}
