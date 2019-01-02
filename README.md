### open-gateway
> 开放网关

### 建设目标
1. 整合用户资源 
2. 整合技术能力
3. 快速接入UI层
4. 功能模块复用
5. 流量统一管理
6. 对外开放API服务(可能是收费模式)

![输入图片说明](https://images.gitee.com/uploads/images/2018/1204/015815_debe4523_112702.jpeg "9.jpg")

### open-gateway模块
- gateway-dubbo  dubbo相关服务处理
- gateway-framework gateway框架服务
- open-basic-comment 评论服务
- open-basic-user 用户服务
- open-basic-inter 主要定义统一接口,用于规范代码,置顶业务框架
- open-service-framework 主要做一些服务框架,用于服务业务(不服务于中间件)

### 技术
- dubbo
- springboot
- guava

### V0.0.1 TODO
1. 接口设计符合API规范
2. 通过postman可以发起请求
3. 继承swagger


### 问题总结
1.创建子模块时出现以下错误:
    Failed to create a Maven project: 'D:/GitLab/OpenSeries/open-gateway/pom.xml' already exists in VFS
  解决方法:



