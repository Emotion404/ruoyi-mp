[RuoYi](https://gitee.com/y_project/RuoYi) 是非常不错的一个开源框架，源码通俗易懂很容易上手。因为之前在工作中有研究过若依的源码，加之自己接一些小活儿需要一个顺手的脚手架，于是就有了这个项目。

其实有更好的方案，就是用 [jhipster](https://www.jhipster.tech/) 去生成一个 JPA 框架省去写 SQL 的烦恼，加上 JDL 可以很方便生成 CRUD。但是由于本人学艺不精😭，就先按下不表。

## 在线体验
> admin/admin123  

演示地址：http://ruoyi.vip  
文档地址：http://doc.ruoyi.vip

- ruoyi-admin 后台模块（管理员后台）
- ruoyi-common 通用模块（工具类等）
- ruoyi-framework 框架
- ruoyi-generator 代码生成器
- ruoyi-project 业务模块（自己的业务）
- ruoyi-quartz 定时任务
- ruoyi-system 系统

## 若依内置功能
1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 差异

- 支持 Mybatis Plus
```shell script
<!-- pagehelper 分页插件 需要排除 mybatis 依赖-->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <exclusions>
        <exclusion>
            <artifactId>mybatis-spring</artifactId>
            <groupId>org.mybatis</groupId>
        </exclusion>
        <exclusion>
            <artifactId>mybatis</artifactId>
            <groupId>org.mybatis</groupId>
        </exclusion>
    </exclusions>
</dependency>
```
- 添加 JPA 支持，自动生成表


