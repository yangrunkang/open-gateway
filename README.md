# 当前开发分支 dev-0.0.1

### open-gateway
> 开放网关 —— 意为接纳一切,欢迎进入开放的世界

### 建设目标
1. 整合用户资源 
2. 整合技术能力
3. 快速接入UI层
4. 功能模块复用
5. 流量统一管理
6. 对外开放API服务(可能是收费模式)

![OpenGateWay系统架构](https://github.com/kangrunyang/open-gateway/blob/master/asserts/OpenGateway%E8%AE%BE%E8%AE%A1-%E5%9B%BE%E8%A1%A8.svg)

### open-gateway模块
- gateway-x-server-center  springcloud服务中心
- gateway-framework gateway框架服务
- open-basic-comment 评论服务
- open-basic-user 用户服务
- open-base 主要定义统一接口,用于规范代码,置顶业务框架
- open-tools 工具,主要是便于开发
- open-framework 统一open系列框架服务,例如集成其他中间件服务
- open-experiment 试错服务

### 应用启动顺序
- 服务注册中心
- 配置中心
- 其他

### open-spi系列
- open-spi-user 用户spi

### 技术
- ~~dubbo~~
- springboot
- springcloud

### 资料(要看Finchley.SR2版本的资料)
- Spring Cloud详细教程 https://blog.csdn.net/forezp/article/details/81040925
- Spring Config https://windmt.com/2018/04/19/spring-cloud-7-config-sample/
- 获取依赖关系https://start.spring.io/actuator/info  见本地缓存(20190128):SpringDependencyInfo.json

### 规划
- 缓存服务
- 待定

### V0.0.1 TODO
1. 接口设计符合API规范
2. 通过postman可以发起请求
3. 继承swagger
4. https://www.fangzhipeng.com/springcloud/2019/01/04/sc-f-boot-admin/

### 在上线前,必须完成
1. 高可用的服务注册中心(Finchley版本)
2. 高可用的配置中心(Finchley版本)
3. 多环境打包,集成profile


### 问题总结
1.创建子模块时出现以下错误:<br />
Failed to create a Maven project: 'D:/GitLab/OpenSeries/open-gateway/pom.xml' already exists in VFS<br />
  解决方法:<br />
![新建module命名](https://github.com/kangrunyang/open-gateway/blob/dev-0.0.1/asserts/命名.png)

2.开发过程中,如果看不到父项目了,把父项目放在一个文件夹下,idea打开这个文件夹

3.Idea插件安装<br />
![idea插件安装](https://github.com/kangrunyang/open-gateway/blob/dev-0.0.1/asserts/idea插件安装.png)



