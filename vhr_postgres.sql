CREATE TABLE adjustsalary (
                              id serial primary key NOT NULL,
                              eid int DEFAULT NULL,
                              asDate date DEFAULT NULL,
                              beforeSalary int DEFAULT NULL,
                              afterSalary int DEFAULT NULL,
                              reason varchar(255) DEFAULT NULL,
                              remark varchar(255) DEFAULT NULL
--     KEY pid (eid),
--     CONSTRAINT adjustsalary_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id)
);

comment on table adjustsalary is '薪资调整表';
comment on column adjustsalary.asDate is '调薪日期';
comment on column adjustsalary.beforeSalary is '调前薪资';
comment on column adjustsalary.afterSalary is '调后薪资';
comment on column adjustsalary.reason is '调薪原因';
comment on column adjustsalary.remark is '备注';


CREATE TABLE appraise (
                          id serial primary key NOT NULL,
                          eid int DEFAULT NULL,
                          appDate date DEFAULT NULL,
                          appResult varchar(32) DEFAULT NULL,
                          appContent varchar(255) DEFAULT NULL,
                          remark varchar(255) DEFAULT NULL
--                       ,
--     KEY pid (eid),
--     CONSTRAINT appraise_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id)
);
comment on table appraise is '考评表';
comment on column appraise.appDate is '考评日期';
comment on column appraise.appResult is '考评结果';
comment on column appraise.appContent is '考评内容';
comment on column appraise.remark is '备注';

CREATE TABLE mail_send_log (
                               msgId varchar(255) DEFAULT NULL,
                               empId int DEFAULT NULL,
                               status int DEFAULT '0',
                               routeKey varchar(255)  DEFAULT NULL,
                               exchange varchar(255) DEFAULT NULL,
                               count int DEFAULT NULL,
                               tryTime date DEFAULT NULL,
                               createTime date DEFAULT NULL,
                               updateTime date DEFAULT NULL
);
comment on table mail_send_log is '邮件发送log';
comment on column mail_send_log.status is '0发送中，1发送成功，2发送失败';
comment on column mail_send_log.count is '重试次数';
comment on column mail_send_log.tryTime is '第一次重试时间';

CREATE TABLE department (
                            id serial primary key NOT NULL,
                            name varchar(32) DEFAULT NULL,
                            parentId int DEFAULT NULL,
                            depPath varchar(255) DEFAULT NULL,
                            enabled smallint DEFAULT '1',
                            isParent smallint DEFAULT '0'
);
comment on table department is '部门表';
comment on column department.name is '部门名称';

CREATE TABLE employee (
                          id serial primary key NOT NULL ,
                          name varchar(10) DEFAULT NULL,
                          gender char(4) DEFAULT NULL,
                          birthday date DEFAULT NULL,
                          idCard char(18) DEFAULT NULL,
                          wedlock ENUM_wedState DEFAULT NULL,
                          nationId int DEFAULT NULL,
                          nativePlace varchar(20) DEFAULT NULL,
                          politicId int DEFAULT NULL,
                          email varchar(20) DEFAULT NULL,
                          phone varchar(11) DEFAULT NULL ,
                          address varchar(64) DEFAULT NULL ,
                          departmentId int DEFAULT NULL ,
                          jobLevelId int DEFAULT NULL ,
                          posId int DEFAULT NULL ,
                          engageForm varchar(8) DEFAULT NULL,
                          tiptopDegree ENUM_DegreeState DEFAULT NULL,
                          specialty varchar(32) DEFAULT NULL,
                          school varchar(32) DEFAULT NULL,
                          beginDate date DEFAULT NULL ,
                          workState ENUM_workState DEFAULT '在职',
                          workID char(8) DEFAULT NULL,
                          contractTerm smallint DEFAULT NULL,
                          conversionTime date DEFAULT NULL,
                          notWorkDate date DEFAULT NULL,
                          beginContract date DEFAULT NULL ,
                          endContract date DEFAULT NULL ,
                          workAge int DEFAULT NULL
--                       ,
--     KEY departmentId (departmentId),
--     KEY jobId (jobLevelId),
--     KEY dutyId (posId),
--     KEY nationId (nationId),
--     KEY politicId (politicId),
--     KEY workID_key (workID),
--     CONSTRAINT employee_ibfk_1 FOREIGN KEY (departmentId) REFERENCES department (id),
--     CONSTRAINT employee_ibfk_2 FOREIGN KEY (jobLevelId) REFERENCES joblevel (id),
--     CONSTRAINT employee_ibfk_3 FOREIGN KEY (posId) REFERENCES position (id),
--     CONSTRAINT employee_ibfk_4 FOREIGN KEY (nationId) REFERENCES nation (id),
--     CONSTRAINT employee_ibfk_5 FOREIGN KEY (politicId) REFERENCES politicsstatus (id)
--
);

CREATE TYPE ENUM_wedState AS ENUM ('已婚','未婚','离异');
CREATE TYPE ENUM_DegreeState as ENUM ('博士','硕士','本科','大专','高中','初中','小学','其他');
CREATE TYPE ENUM_workState AS ENUM ('在职','离职','未知');
comment on table employee is '员工表';
comment on column employee.id is '员工编号';
comment on column employee.name is '员工姓名';
comment on column employee.gender is '性别';
comment on column employee.birthday is '出生日期';
comment on column employee.idCard is '身份证号';
comment on column employee.wedlock is '婚姻状况';
comment on column employee.nationId is '民族';
comment on column employee.nativePlace is '籍贯';
comment on column employee.politicId is '政治面貌';
comment on column employee.email is '邮箱';
comment on column employee.phone is '电话号码';
comment on column employee.address is '联系地址';
comment on column employee.departmentId is '所属部门';
comment on column employee.jobLevelId is '职称ID';
comment on column employee.posId is '职位ID';
comment on column employee.engageForm is '聘用形式';
comment on column employee.tiptopDegree is '最高学历';
comment on column employee.specialty is '所属专业';
comment on column employee.school is '毕业院校';
comment on column employee.beginDate is '入职日期';
comment on column employee.workState is '在职状态';
comment on column employee.workID is '工号';
comment on column employee.contractTerm is '合同期限';
comment on column employee.conversionTime is '转正日期';
comment on column employee.notWorkDate is '离职日期';
comment on column employee.beginContract is '合同起始日期';
comment on column employee.endContract is '合同终止日期';
comment on column employee.workAge is '工龄';


CREATE TABLE employeeec
(
    id       serial PRIMARY KEY NOT NULL,
    eid      int          DEFAULT NULL,
    ecDate   date         DEFAULT NULL,
    ecReason varchar(255) DEFAULT NULL,
    ecPoint  int          DEFAULT NULL,
    ecType   int          DEFAULT NULL,
    remark   varchar(255) DEFAULT NULL
--                         ,
--     CONSTRAINT employeeec_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id)
);
comment on table employeeec is '奖罚表';
comment on column employeeec.eid is '员工编号';
comment on column employeeec.eid  is '员工编号';
comment on column employeeec.ecDate is '奖罚日期';
comment on column employeeec.ecReason is '奖罚原因';
comment on column employeeec.ecPoint is '奖罚分';
comment on column employeeec.ecType   is '奖罚类别，0：奖，1：罚';
comment on column employeeec.remark  is '备注';

CREATE TABLE employeeremove (
                                id serial primary key NOT NULL,
                                eid int DEFAULT NULL,
                                afterDepId int DEFAULT NULL,
                                afterJobId int DEFAULT NULL,
                                removeDate date DEFAULT NULL,
                                reason varchar(255) DEFAULT NULL,
                                remark varchar(255) DEFAULT NULL
--                             ,
--     KEY pid (eid),
--     CONSTRAINT employeeremove_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id)
);
comment on table employeeremove is '调动';
comment on column employeeremove.afterDepId is '调动后部门';
comment on column employeeremove.afterJobId is '调动后职位';
comment on column employeeremove.removeDate is '调动日期';
comment on column employeeremove.reason is '调动原因';

CREATE TABLE employeetrain (
                               id serial PRIMARY KEY NOT NULL,
                               eid int DEFAULT NULL,
                               trainDate date DEFAULT NULL,
                               trainContent varchar(255) DEFAULT NULL,
                               remark varchar(255) DEFAULT NULL
--                            ,
-- KEY pid (eid),
-- CONSTRAINT employeetrain_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id)
);

comment on table employeetrain is '培训';
comment on column employeetrain.eid is '员工编号';
comment on column employeetrain.trainDate is '培训日期';
comment on column employeetrain.trainContent is '培训内容';
comment on column employeetrain.remark is '备注';

CREATE TABLE empsalary (
                           id serial primary key NOT NULL,
                           eid int unique DEFAULT NULL,
                           sid int DEFAULT NULL
--                        ,
--     KEY empsalary_ibfk_2 (sid),
--     CONSTRAINT empsalary_ibfk_1 FOREIGN KEY (eid) REFERENCES employee (id),
--     CONSTRAINT empsalary_ibfk_2 FOREIGN KEY (sid) REFERENCES salary (id)
);

CREATE TABLE hr (
id serial PRIMARY KEY NOT NULL,
name varchar(32) DEFAULT NULL,
phone char(11) DEFAULT NULL,
telephone varchar(16) DEFAULT NULL ,
address varchar(64) DEFAULT NULL,
enabled smallint DEFAULT '1',
username varchar(255) DEFAULT NULL,
password varchar(255) DEFAULT NULL,
userface varchar(255) DEFAULT NULL,
remark varchar(255) DEFAULT NULL
);
comment on table hr is 'HR';
comment on column hr.id is 'hrID';
comment on column hr.name is '姓名';
comment on column hr.phone is '手机号码';
comment on column hr.telephone is '住宅电话';
comment on column hr.address is '联系地址';
comment on column hr.username is '用户名';
comment on column hr.password is '密码';

CREATE TABLE hr_role (
                         id serial PRIMARY KEY NOT NULL,
                         hrid int DEFAULT NULL,
                         rid int DEFAULT NULL
--                      ,
--     KEY rid (rid),
--     KEY hr_role_ibfk_1 (hrid),
--     CONSTRAINT hr_role_ibfk_1 FOREIGN KEY (hrid) REFERENCES hr (id) ON DELETE CASCADE,
--     CONSTRAINT hr_role_ibfk_2 FOREIGN KEY (rid) REFERENCES role (id)
);

create type enum_titleLevel as ENUM('正高级','副高级','中级','初级','员级');
CREATE TABLE joblevel (
                          id serial PRIMARY KEY NOT NULL,
                          name varchar(32) DEFAULT NULL,
                          titleLevel enum_titleLevel DEFAULT NULL,
                          createDate timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                          enabled smallint DEFAULT '1'
);
comment on table joblevel is '职称表';
comment on column joblevel.name is '职称名称';

CREATE TABLE menu (
                      id serial PRIMARY KEY NOT NULL,
                      url varchar(64) DEFAULT NULL,
                      path varchar(64) DEFAULT NULL,
                      component varchar(64) DEFAULT NULL,
                      name varchar(64) DEFAULT NULL,
                      iconCls varchar(64) DEFAULT NULL,
                      keepAlive smallint DEFAULT NULL,
                      requireAuth smallint DEFAULT NULL,
                      parentId int DEFAULT NULL,
                      enabled smallint DEFAULT '1'
--                   ,
--     KEY parentId (parentId),
--     CONSTRAINT menu_ibfk_1 FOREIGN KEY (parentId) REFERENCES menu (id)
);
comment on table menu is '';

CREATE TABLE menu_role (
                           id serial PRIMARY KEY NOT NULL,
                           mid int DEFAULT NULL,
                           rid int DEFAULT NULL
--                        ,
-- KEY mid (mid),
-- KEY rid (rid),
-- CONSTRAINT menu_role_ibfk_1 FOREIGN KEY (mid) REFERENCES menu (id),
-- CONSTRAINT menu_role_ibfk_2 FOREIGN KEY (rid) REFERENCES role (id)
);
comment on table menu_role is '';

CREATE TABLE msgcontent (
                            id serial PRIMARY KEY NOT NULL,
                            title varchar(64) DEFAULT NULL,
                            message varchar(255) DEFAULT NULL,
                            createDate timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
comment on table msgcontent is '';

CREATE TABLE nation (
                        id serial PRIMARY KEY NOT NULL ,
                        name varchar(32) DEFAULT NULL
);
comment on table nation is '';


CREATE TABLE oplog (
                       id serial PRIMARY KEY NOT NULL,
                       addDate date DEFAULT NULL,
                       operate varchar(255) DEFAULT NULL,
                       hrid int DEFAULT NULL
--                    ,
--     KEY hrid (hrid),
--     CONSTRAINT oplog_ibfk_1 FOREIGN KEY (hrid) REFERENCES hr (id)
);
comment on column oplog.addDate is '添加日期';
comment on column oplog.operate is '操作内容';
comment on column oplog.hrid is '操作员ID';

CREATE TABLE politicsstatus (
                                id serial PRIMARY KEY NOT NULL ,
                                name varchar(32) DEFAULT NULL
);
comment on table politicsstatus is '';

CREATE TABLE position (
                          id serial PRIMARY KEY NOT NULL ,
                          name varchar(32) UNIQUE DEFAULT NULL,
                          createDate timestamp NULL DEFAULT CURRENT_TIMESTAMP,
                          enabled smallint DEFAULT '1'
);
comment on column position.name is '职位';

CREATE TABLE role (
                      id serial  PRIMARY KEY NOT NULL ,
                      name varchar(64) DEFAULT NULL,
                      nameZh varchar(64) DEFAULT NULL
);
comment on column role.nameZh is '角色名称';

CREATE TABLE salary (
                        id serial PRIMARY KEY NOT NULL ,
                        basicSalary int DEFAULT NULL,
                        bonus int DEFAULT NULL,
                        lunchSalary int DEFAULT NULL,
                        trafficSalary int DEFAULT NULL,
                        allSalary int DEFAULT NULL,
                        pensionBase int DEFAULT NULL,
                        pensionPer float DEFAULT NULL,
                        createDate timestamp NULL DEFAULT NULL,
                        medicalBase int DEFAULT NULL,
                        medicalPer float DEFAULT NULL,
                        accumulationFundBase int DEFAULT NULL,
                        accumulationFundPer float DEFAULT NULL,
                        name varchar(32) DEFAULT NULL
);
comment on column salary.basicSalary is '基本工资';
comment on column salary.bonus is '奖金';
comment on column salary.lunchSalary is '午餐补助';
comment on column salary.trafficSalary is '交通补助';
comment on column salary.allSalary is '应发工资';
comment on column salary.pensionBase is '养老金基数';
comment on column salary.pensionPer is '养老金比率';
comment on column salary.createDate is '启用时间';
comment on column salary.medicalBase is '医疗基数';
comment on column salary.medicalPer is '医疗保险比率';
comment on column salary.accumulationFundBase is '公积金基数';
comment on column salary.accumulationFundPer is '公积金比率';

CREATE TABLE sysmsg (
                        id serial PRIMARY KEY NOT NULL ,
                        mid int DEFAULT NULL,
                        type int DEFAULT '0',
                        hrid int DEFAULT NULL,
                        state int DEFAULT '0'
--                 ,
-- KEY hrid (hrid),
-- KEY sysmsg_ibfk_1 (mid),
-- CONSTRAINT sysmsg_ibfk_1 FOREIGN KEY (mid) REFERENCES msgcontent (id),
-- CONSTRAINT sysmsg_ibfk_2 FOREIGN KEY (hrid) REFERENCES hr (id)
);
comment on column sysmsg.mid is '消息id';
comment on column sysmsg.type is '0表示群发消息';
comment on column sysmsg.hrid is '这条消息是给谁的';
comment on column sysmsg.state is '0 未读 1 已读';