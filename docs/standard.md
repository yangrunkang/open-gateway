# 规范约定(Standard)

### 接口定义规范
例如接口名为  login
操作为读操作,请求对象应为  Read+Login+Req
基于数据交互原则,基本上为读和写,对应Write和Read
接口入参规范:  Write/Read + 接口名 + Req
响应参数规范:  接口名 + Resp



### 注释
类注释
```
/**
 *
 * <p>All rights Reserved, Designed By YangRunkang.</p>
 * @author $user$
 * @date $date$ $time$
 */
```

 
 ### 包名规范
 com.项目名顺序("-" 替换成 ",")

 ### 项目文件编码
 #### idea 设置路径
 > File -> Settings -> Editor -> File Encodings -> Global/Project Encoding
 
 ### 同步分支代码到多个仓库
 进入到当前项目,需要将当前目录雷荣推送到两一个仓库,按照下面的语法进行操作即可<br/>
 git push [远程库名] [本地分支名]:[远程分支名]<br/>
 示例:git push https://github.com/kangrunyang/open-gateway.git master:origin<br/>
 
 ### 在Git命令中提交
 git add . && git commit -m "提交内容描述" && git push
