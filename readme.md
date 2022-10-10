# boot-05-web-1:dog:  
静态资源访问  
### 1、静态资源目录  
```只要静态资源放在类路径下： called /static (or /public or /resources or /META-INF/resources
访问 ： 当前项目根路径/ + 静态资源名 

原理： 静态映射/**。
请求进来，先去找Controller看能不能处理。不能处理的所有请求又都交给静态资源处理器。静态资源也找不到则响应404页面
```
  改变默认的静态资源路径  
``` yaml
spring:
  mvc:
    static-path-pattern: /res/**

  resources:
    static-locations: [classpath:/haha/]
```

### 2、静态资源访问前缀  :dragon:
  默认无前缀
```
spring:
  mvc:
    static-path-pattern: /res/**
```

### 2.2、欢迎页支持  
●
静态资源路径下  index.html  
○
可以配置静态资源路径  
○
但是不可以配置静态资源的访问前缀。否则导致 index.html不能被默认访问  
```
spring:
#  mvc:
#    static-path-pattern: /res/**   这个会导致welcome page功能失效

  resources:
    static-locations: [classpath:/haha/]
```

  controller能处理/index  
  

### 2.3、自定义 Favicon  
 favicon.ico 放在静态资源目录下即可。
 ```spring:
#  mvc:
#    static-path-pattern: /res/**   这个会导致 Favicon 功能失效
```
