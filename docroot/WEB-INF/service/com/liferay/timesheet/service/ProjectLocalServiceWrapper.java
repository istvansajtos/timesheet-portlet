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

package com.liferay.timesheet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProjectLocalService}.
 *
 * @author Istvan Sajtos, Zsolt Szabo
 * @see ProjectLocalService
 * @generated
 */
public class ProjectLocalServiceWrapper implements ProjectLocalService,
	ServiceWrapper<ProjectLocalService> {
	public ProjectLocalServiceWrapper(ProjectLocalService projectLocalService) {
		_projectLocalService = projectLocalService;
	}

	/**
	* Adds the project to the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project addProject(
		com.liferay.timesheet.model.Project project)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.addProject(project);
	}

	/**
	* Creates a new project with the primary key. Does not add the project to the database.
	*
	* @param projectId the primary key for the new project
	* @return the new project
	*/
	@Override
	public com.liferay.timesheet.model.Project createProject(long projectId) {
		return _projectLocalService.createProject(projectId);
	}

	/**
	* Deletes the project with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projectId the primary key of the project
	* @return the project that was removed
	* @throws PortalException if a project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project deleteProject(long projectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.deleteProject(projectId);
	}

	/**
	* Deletes the project from the database. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project deleteProject(
		com.liferay.timesheet.model.Project project)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.deleteProject(project);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _projectLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timesheet.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timesheet.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.timesheet.model.Project fetchProject(long projectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.fetchProject(projectId);
	}

	/**
	* Returns the project with the matching UUID and company.
	*
	* @param uuid the project's UUID
	* @param companyId the primary key of the company
	* @return the matching project, or <code>null</code> if a matching project could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project fetchProjectByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.fetchProjectByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the project matching the UUID and group.
	*
	* @param uuid the project's UUID
	* @param groupId the primary key of the group
	* @return the matching project, or <code>null</code> if a matching project could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project fetchProjectByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.fetchProjectByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the project with the primary key.
	*
	* @param projectId the primary key of the project
	* @return the project
	* @throws PortalException if a project with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project getProject(long projectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProject(projectId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the project with the matching UUID and company.
	*
	* @param uuid the project's UUID
	* @param companyId the primary key of the company
	* @return the matching project
	* @throws PortalException if a matching project could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project getProjectByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjectByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the project matching the UUID and group.
	*
	* @param uuid the project's UUID
	* @param groupId the primary key of the group
	* @return the matching project
	* @throws PortalException if a matching project could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project getProjectByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjectByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the projects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.timesheet.model.impl.ProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projects
	* @param end the upper bound of the range of projects (not inclusive)
	* @return the range of projects
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.timesheet.model.Project> getProjects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjects(start, end);
	}

	/**
	* Returns the number of projects.
	*
	* @return the number of projects
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getProjectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjectsCount();
	}

	/**
	* Updates the project in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param project the project
	* @return the project that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.timesheet.model.Project updateProject(
		com.liferay.timesheet.model.Project project)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.updateProject(project);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _projectLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_projectLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _projectLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.timesheet.model.Project addProject(long userId,
		long departmentId, boolean enabled, long parentProjectId,
		java.lang.String projectName, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.addProject(userId, departmentId, enabled,
			parentProjectId, projectName, description, serviceContext);
	}

	@Override
	public void addProjectResources(
		com.liferay.timesheet.model.Project project,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_projectLocalService.addProjectResources(project, addGroupPermissions,
			addGuestPermissions);
	}

	@Override
	public void addProjectResources(
		com.liferay.timesheet.model.Project project,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_projectLocalService.addProjectResources(project, groupPermissions,
			guestPermissions);
	}

	@Override
	public java.util.List<com.liferay.timesheet.model.Project> getProjects(
		long parentProjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjects(parentProjectId);
	}

	@Override
	public java.util.List<com.liferay.timesheet.model.Project> getProjectsByD_PP(
		long departmentId, long parentProjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjectsByD_PP(departmentId,
			parentProjectId);
	}

	@Override
	public java.util.List<com.liferay.timesheet.model.Project> getProjectsByDepartmentId(
		long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _projectLocalService.getProjectsByDepartmentId(departmentId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ProjectLocalService getWrappedProjectLocalService() {
		return _projectLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedProjectLocalService(
		ProjectLocalService projectLocalService) {
		_projectLocalService = projectLocalService;
	}

	@Override
	public ProjectLocalService getWrappedService() {
		return _projectLocalService;
	}

	@Override
	public void setWrappedService(ProjectLocalService projectLocalService) {
		_projectLocalService = projectLocalService;
	}

	private ProjectLocalService _projectLocalService;
}