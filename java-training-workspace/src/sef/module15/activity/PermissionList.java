package sef.module15.activity;

import java.util.HashSet;
import java.util.Set;

public class PermissionList implements Permissable{
	

	
	
	/**
	 * Creates a permission object and provides an identifier for it
	 * 
	 * @param permissionID
	 */
	public PermissionList(String permissionID){
	
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#getPermission()
	 */
//	@Override
	public Set<Permission> getPermission() {

		return null;
		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#removePermission(sef.module14.activity.Permission[])
	 */
//	@Override
	public void removePermission(Permission... permissions) {

		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#setPermission(sef.module14.activity.Permission[])
	 */
//	@Override
	public void setPermission(Permission... permissions) {
		
		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#isPermissable(sef.module14.activity.Permission)
	 */
//	@Override
	public boolean isPermissable(Permission permission) {
		return false;
		
	}
}
