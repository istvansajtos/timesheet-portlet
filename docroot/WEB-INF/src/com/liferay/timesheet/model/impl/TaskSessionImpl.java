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

package com.liferay.timesheet.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.timesheet.model.Task;
import com.liferay.timesheet.service.TaskLocalServiceUtil;

/**
 * The extended model implementation for the TaskSession service. Represents a row in the &quot;timesheet_TaskSession&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.timesheet.model.TaskSession} interface.
 * </p>
 *
 * @author Istvan Sajtos
 */
public class TaskSessionImpl extends TaskSessionBaseImpl {
	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a task session model instance should use the {@link com.liferay.timesheet.model.TaskSession} interface instead.
	 */
	public TaskSessionImpl() {
	}

	public Task getTask() throws PortalException, SystemException {
		Task task = TaskLocalServiceUtil.getTask(getTaskId());

		return task;
	}

}