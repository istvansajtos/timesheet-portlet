/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.timesheet.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author Istvan Sajtos, Zsolt Szabo
 * @see Department
 * @generated
 */
public class DepartmentWrapper implements Department, ModelWrapper<Department> {
	public DepartmentWrapper(Department department) {
		_department = department;
	}

	@Override
	public Class<?> getModelClass() {
		return Department.class;
	}

	@Override
	public String getModelClassName() {
		return Department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("departmentId", getDepartmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("departmentName", getDepartmentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String departmentName = (String)attributes.get("departmentName");

		if (departmentName != null) {
			setDepartmentName(departmentName);
		}
	}

	/**
	* Returns the primary key of this department.
	*
	* @return the primary key of this department
	*/
	@Override
	public long getPrimaryKey() {
		return _department.getPrimaryKey();
	}

	/**
	* Sets the primary key of this department.
	*
	* @param primaryKey the primary key of this department
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_department.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the department ID of this department.
	*
	* @return the department ID of this department
	*/
	@Override
	public long getDepartmentId() {
		return _department.getDepartmentId();
	}

	/**
	* Sets the department ID of this department.
	*
	* @param departmentId the department ID of this department
	*/
	@Override
	public void setDepartmentId(long departmentId) {
		_department.setDepartmentId(departmentId);
	}

	/**
	* Returns the group ID of this department.
	*
	* @return the group ID of this department
	*/
	@Override
	public long getGroupId() {
		return _department.getGroupId();
	}

	/**
	* Sets the group ID of this department.
	*
	* @param groupId the group ID of this department
	*/
	@Override
	public void setGroupId(long groupId) {
		_department.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this department.
	*
	* @return the company ID of this department
	*/
	@Override
	public long getCompanyId() {
		return _department.getCompanyId();
	}

	/**
	* Sets the company ID of this department.
	*
	* @param companyId the company ID of this department
	*/
	@Override
	public void setCompanyId(long companyId) {
		_department.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this department.
	*
	* @return the user ID of this department
	*/
	@Override
	public long getUserId() {
		return _department.getUserId();
	}

	/**
	* Sets the user ID of this department.
	*
	* @param userId the user ID of this department
	*/
	@Override
	public void setUserId(long userId) {
		_department.setUserId(userId);
	}

	/**
	* Returns the user uuid of this department.
	*
	* @return the user uuid of this department
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _department.getUserUuid();
	}

	/**
	* Sets the user uuid of this department.
	*
	* @param userUuid the user uuid of this department
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_department.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this department.
	*
	* @return the user name of this department
	*/
	@Override
	public java.lang.String getUserName() {
		return _department.getUserName();
	}

	/**
	* Sets the user name of this department.
	*
	* @param userName the user name of this department
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_department.setUserName(userName);
	}

	/**
	* Returns the create date of this department.
	*
	* @return the create date of this department
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _department.getCreateDate();
	}

	/**
	* Sets the create date of this department.
	*
	* @param createDate the create date of this department
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_department.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this department.
	*
	* @return the modified date of this department
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _department.getModifiedDate();
	}

	/**
	* Sets the modified date of this department.
	*
	* @param modifiedDate the modified date of this department
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_department.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the department name of this department.
	*
	* @return the department name of this department
	*/
	@Override
	public java.lang.String getDepartmentName() {
		return _department.getDepartmentName();
	}

	/**
	* Sets the department name of this department.
	*
	* @param departmentName the department name of this department
	*/
	@Override
	public void setDepartmentName(java.lang.String departmentName) {
		_department.setDepartmentName(departmentName);
	}

	@Override
	public boolean isNew() {
		return _department.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_department.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _department.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_department.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _department.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _department.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_department.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _department.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_department.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_department.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_department.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DepartmentWrapper((Department)_department.clone());
	}

	@Override
	public int compareTo(com.liferay.timesheet.model.Department department) {
		return _department.compareTo(department);
	}

	@Override
	public int hashCode() {
		return _department.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.timesheet.model.Department> toCacheModel() {
		return _department.toCacheModel();
	}

	@Override
	public com.liferay.timesheet.model.Department toEscapedModel() {
		return new DepartmentWrapper(_department.toEscapedModel());
	}

	@Override
	public com.liferay.timesheet.model.Department toUnescapedModel() {
		return new DepartmentWrapper(_department.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _department.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _department.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_department.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DepartmentWrapper)) {
			return false;
		}

		DepartmentWrapper departmentWrapper = (DepartmentWrapper)obj;

		if (Validator.equals(_department, departmentWrapper._department)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Department getWrappedDepartment() {
		return _department;
	}

	@Override
	public Department getWrappedModel() {
		return _department;
	}

	@Override
	public void resetOriginalValues() {
		_department.resetOriginalValues();
	}

	private Department _department;
}