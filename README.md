# 轻量级web框架

## 配置项设计
相关的常量放置到interface中

## 类加载器设计
加载包名下的所有类，流程为：  
* 获取类加载器
* 加载类
* 获取指定包名下的所有类

## 注解设计
* @Controller
* @Action
* @Inject
* @Service

## Ioc容器 反射设计
类加载只能加载到相应包下的类，但是无法实例化对象，所以需要封装Java反射相关的API实例化对象，对外提供更好用的工具方法，流程为：
* ClassHelper的getBeanClassSet()获取所有被框架管理的bean类
* 循环调用ReflectionUtil类的newInstance()来实例化对象
* 最后将每次创建的对象放在一个静态的Map中，方便随时获取该map，找到对应的value



## 版本迭代
20170512 将完成的Ioc容器版本，抽离成子模块
