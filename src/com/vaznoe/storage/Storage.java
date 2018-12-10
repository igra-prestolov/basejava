package com.vaznoe.storage;

import com.vaznoe.model.Resume;

/**
 * @author vaznoe
 * Date: 12/9/18
 */
public interface Storage {

    void clear();

    void update(Resume r);

    void save(Resume r);

    Resume get(String uuid);

    void delete(String uuid);

    Resume[] getAll();

    int size();
}
