/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.timesheet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Project service. Represents a row in the &quot;timesheet_Project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.timesheet.model.impl.ProjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.timesheet.model.impl.ProjectImpl}.
 * </p>
 *
 * @author Istvan Sajtos, Zsolt Szabo
 * @see Project
 * @see com.liferay.timesheet.model.impl.ProjectImpl
 * @see com.liferay.timesheet.model.impl.ProjectModelImpl
 * @generated
 */
public interface ProjectModel extends BaseModel<Project> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a project model instance should use the {@link Project} interface instead.
	 */

	/**
	 * Returns the primary key of this project.
	 *
	 * @return the primary key of this project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this project.
	 *
	 * @param primaryKey the primary key of this project
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this project.
	 *
	 * @return the uuid of this project
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this project.
	 *
	 * @param uuid the uuid of this project
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the project ID of this project.
	 *
	 * @return the project ID of this project
	 */
	public long getProjectId();

	/**
	 * Sets the project ID of this project.
	 *
	 * @param projectId the project ID of this project
	 */
	public void setProjectId(long projectId);

	/**
	 * Returns the company ID of this project.
	 *
	 * @return the company ID of this project
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this project.
	 *
	 * @param companyId the company ID of this project
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this project.
	 *
	 * @return the create date of this project
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this project.
	 *
	 * @param createDate the create date of this project
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the creator ID of this project.
	 *
	 * @return the creator ID of this project
	 */
	public long getCreatorId();

	/**
	 * Sets the creator ID of this project.
	 *
	 * @param creatorId the creator ID of this project
	 */
	public void setCreatorId(long creatorId);

	/**
	 * Returns the modified date of this project.
	 *
	 * @return the modified date of this project
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this project.
	 *
	 * @param modifiedDate the modified date of this project
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the project name of this project.
	 *
	 * @return the project name of this project
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this project.
	 *
	 * @param projectName the project name of this project
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the parent project ID of this project.
	 *
	 * @return the parent project ID of this project
	 */
	public Long getParentProjectId();

	/**
	 * Sets the parent project ID of this project.
	 *
	 * @param parentProjectId the parent project ID of this project
	 */
	public void setParentProjectId(Long parentProjectId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Project project);

	public int hashCode();

	public CacheModel<Project> toCacheModel();

	public Project toEscapedModel();

	public String toString();

	public String toXmlString();
}