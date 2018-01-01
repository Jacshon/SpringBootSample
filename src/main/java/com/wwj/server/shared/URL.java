package com.wwj.server.shared;

/**
 * 该文件用来存放所有API的路径，如有新增的API，需要在该文档先定义
 */
public class URL {

    /** 模块定义部分 **/
    public static final String MODULE_SYSTEM="api/web/system";
    public static final String MODULE_COMMON="api/web/common";
    public static final String MODULE_SYS_CODE="api/web/sysCode";

    /** 菜单及按钮操作定义部分 **/
    public static final String SYSTEM_USER_SEARCH="searchUser";
    public static final String SYSTEM_USER_SAVE="saveUser";
    public static final String SYSTEM_USER_DETAIL="getUserDetail/{id}";

    public static final String SYS_CODE_SEARCH="searchSysCode";
    public static final String SYS_CODE_SAVE="saveSysCode";
    public static final String SYS_CODE_DETAILS="getSysCodeDetails";
    public static final String SYS_CODE_BY_TYPE="getCodesByType";
    public static final String SYS_CODE_GET_ALL="getAllCodes";

    public static final String SYS_CODE_TYPE_GET_ALL="searchAllSysCodeType";
    public static final String SYS_CODE_TYPE_SEARCH="searchSysCodeType";
    public static final String SYS_CODE_TYPE_SAVE="saveSysCodeType";
    public static final String SYS_CODE_TYPE_DETAILS="getSysCodeTypeDetails";

    public static final String SYS_CODE_TRAN_SEARCH="searchSysCodeTran";
    public static final String SYS_CODE_TRAN_SAVE="saveSysCodeTran";
    public static final String SYS_CODE_TRAN_DETAILS="getSysCodeTranDetails";
}
