package controller;
public interface CRUD <T>{
      int insert(T t);
      int update(T t);
      int delete(T t);
    
}
