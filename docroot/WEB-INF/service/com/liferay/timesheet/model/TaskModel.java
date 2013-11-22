/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Task service. Represents a row in the &quot;timesheet_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.timesheet.model.impl.TaskModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.timesheet.model.impl.TaskImpl}.
 * </p>
 *
 * @author Istvan Sajtos
 * @see Task
 * @see com.liferay.timesheet.model.impl.TaskImpl
 * @see com.liferay.timesheet.model.impl.TaskModelImpl
 * @generated
 */
public interface TaskModel extends BaseModel<Task> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a task model instance should use the {@link Task} interface instead.
	 */

	/**
	 * Returns the primary key of this task.
	 *
	 * @return the primary key of this task
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this task.
	 *
	 * @param primaryKey the primary key of this task
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the task ID of this task.
	 *
	 * @return the task ID of this task
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this task.
	 *
	 * @param taskId the task ID of this task
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the user ID of this task.
	 *
	 * @return the user ID of this task
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this task.
	 *
	 * @param userId the user ID of this task
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this task.
	 *
	 * @return the user uuid of this task
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this task.
	 *
	 * @param userUuid the user uuid of this task
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the task name of this task.
	 *
	 * @return the task name of this task
	 */
	@AutoEscape
	public String getTaskName();

	/**
	 * Sets the task name of this task.
	 *
	 * @param taskName the task name of this task
	 */
	public void setTaskName(String taskName);

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

	public int compareTo(Task task);

	public int hashCode();

	public CacheModel<Task> toCacheModel();

	public Task toEscapedModel();

	public String toString();

	public String toXmlString();
}