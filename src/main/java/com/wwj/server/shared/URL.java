package com.wwj.server.shared;

/**
 * 该文件用来存放所有API的路径，如有新增的API，需要在该文档先定义
 */
public class URL {

    /** 模块定义部分 **/
    public static final String MODULE_SYSTEM="api/web/system";
    public static final String MODULE_SYS_USER="api/web/user";
    public static final String MODULE_COMMON="api/web/common";
    public static final String MODULE_SYS_CODE="api/web/sysCode";
    public static final String MODULE_SYS_OPERATE="api/web/operate";
    public static final String MODULE_SYS_MENU="api/web/menu";
    public static final String MODULE_SYS_ROLE="api/web/role";

    /** **/
    public static final String CHANGE_LOCALE="changeLocale";

    /** 菜单及按钮操作定义部分 **/
    public static final String SYS_USER_SEARCH="searchUsers";
    public static final String SYS_USER_SAVE="saveUser";
    public static final String SYS_USER_DETAIL="getUserDetail/{userId}";
    public static final String SYS_USER_DELETE="deleteUser/{userId}";


    public static final String AUTH_ACTIVE_SEARCH="searchAuthActive";
    public static final String AUTH_ACTIVE_SAVE="saveAuthActive";
    public static final String AUTH_ACTIVE_DETAILS="getAuthActiveDetails";
    public static final String AUTH_ACTIVE_DELETE="deleteAuthActive";

    public static final String SYS_OPERATE_SEARCH="searchOperate";
    public static final String SYS_OPERATE_SAVE="saveOperate";
    public static final String SYS_OPERATE_DETAILS="getOperateDetails";
    public static final String SYS_OPERATE_DELETE="deleteOperate";

    public static final String SYS_MENU_SEARCH_ALL="searchSysMenu";
    public static final String SYS_MENU_SAVE="saveSysMenu";
    public static final String SYS_MENU_DETAILS="getSysMenuDetails";
    public static final String SYS_MENU_DELETE="deleteSysMenu";

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
