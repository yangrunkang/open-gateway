# 规范约定(Standard)

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