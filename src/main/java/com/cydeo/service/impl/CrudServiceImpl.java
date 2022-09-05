package com.cydeo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CrudServiceImpl <T, ID>{

    protected Map<ID, T> map = new HashMap<>();

    T create(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void update(ID id, T object) {
        map.put(id, object);
    }

    List<T> readAll() {
        return new ArrayList<>(map.values());
    }

    T readById(ID id) {
        return map.get(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

}
