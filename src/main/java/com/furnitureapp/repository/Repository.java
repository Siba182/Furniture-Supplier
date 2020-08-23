/*
    Coder: Elvis Gene
    Description: Repository interface extended by specific class repositories.
    Date:
 */

package com.furnitureapp.repository;

public interface Repository<T, ID> {

    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
