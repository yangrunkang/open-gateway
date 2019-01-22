### open-gateway
> 开放网关 —— 意为接纳一切,欢迎进入开放的世界

### 建设目标
1. 整合用户资源 
2. 整合技术能力
3. 快速接入UI层
4. 功能模块复用
5. 流量统一管理
6. 对外开放API服务(可能是收费模式)

![输入图片说明](https://images.gitee.com/uploads/images/2018/1204/015815_debe4523_112702.jpeg "9.jpg")

### open-gateway模块
- gateway-x-server-center  springcloud服务中心
- gateway-framework gateway框架服务
- open-basic-comment 评论服务
- open-basic-user 用户服务
- open-basic-inter 主要定义统一接口,用于规范代码,置顶业务框架
- open-tools 工具,主要是便于开发
- open-framework 统一open系列框架服务,例如集成其他中间件服务

### open-spi系列
- open-spi-user 用户spi

### 技术
- ~~dubbo~~
- springboot
- springcloud

### 资料
http://blog.didispace.com/springcloud1/

### 规划
- 缓存服务
- 待定

### V0.0.1 TODO
1. 接口设计符合API规范
2. 通过postman可以发起请求
3. 继承swagger


### 问题总结
1.创建子模块时出现以下错误:<br />
Failed to create a Maven project: 'D:/GitLab/OpenSeries/open-gateway/pom.xml' already exists in VFS<br />
  解决方法:<br />
![输入图片说明](https://images.gitee.com/uploads/images/2019/0102/154059_b9b3c39b_112702.png "微信截图_20190102153220.png")

2.开发过程中,如果看不到父项目了,把父项目放在一个文件夹下,idea打开这个文件夹

3.Idea插件安装<br />
![输入图片说明](https://images.gitee.com/uploads/images/2019/0104/095407_b5bea096_112702.png "微信截图_20190104094937.png")



