<span>1. 权限管理<br>
1.1 对于模块拥有的操作权限，可通过创建模块时确定，也可对其进行修改操作值；<br>如 保存、添加、删除等通过SYSCode来维护
</span>
1.2 权限操作细分到具体模块的按钮或数据上，跟具体的角色没有直接关系，如此方可构建更加灵活的权限系统。
用户拥有角色，角色拥有具体模块的操作


2.公共码值的管理（如何处理代码中的公共码值）

3.日志的统一处理

4.异常的格式化处理及统一处理

5.数据库默认设置
5.1 数据库中的时间统一使用long存储
5.2 主键用64位UUID，用于后续支持分布式
5.3 金额使用bigint型存储，单位为“分”。bigint存储范围为 -2^63 (-9223372036854775808) 到 2^63-1 (9223372036854775807) 的整型数据（所有数字）。存储大小为 8 个字节
