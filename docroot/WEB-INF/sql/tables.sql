create table timesheet_Project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	creatorId LONG,
	modifiedDate DATE null,
	projectName VARCHAR(75) null,
	parentProjectId LONG
);

create table timesheet_Task (
	taskId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	creatorId LONG,
	taskName VARCHAR(75) null,
	projectId LONG
);

create table timesheet_TaskSession (
	taskSessionId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	endTime DATE null,
	startTime DATE null,
	taskId LONG
);