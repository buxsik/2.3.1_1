package crud.dao;

import crud.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getRole();
    Role getRoleByName(String roleName);
}
