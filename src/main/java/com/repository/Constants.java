package com.repository;

/**
 * Created by Finderlo on 11/17/2016.
 */
public interface Constants {
    /**
     * 需要模块引擎前缀
     * */
    String TILES_PREFIX = "tiles/";
    /**
     * 重定向前缀
     * */
    String REDIRECT = "redirect:";
    /**
     * 默认允许借用的数量
     * */
    int ALLOW_COUNT = 5;
    /**
     * 一天的毫秒数
     * */
    long DAY_1_MILLIS = 1000 * 60 * 60 * 24;



    String URL_ADD_NEW_CATEGORY = "/newcategory";
    String URL_ADD_NEW_COMPANY = "/newcompany";

    //session
    String SESSION_STORAGE_FORM = "storageForm";
    String SESSION_APPLY_FORM = "apply_form";
    String SESSION_USER = "user";
    String SESSION_COMPANIES = "companies";
    String SESSION_CATEGORIES_A = "categoriesA";
    String SESSION_CATEGORIES = "categories";
    //login
    String URL_INDEX = "/";
    String URL_SIGNIN = "/signin";
    String URL_SIGNIN_SUCCESS = "/signinsuccess";
    String URL_SIGNIN_FAIL = "/signinfail";
    String HTML_LOGIN_SIGNIN = TILES_PREFIX + "login/signin";

    //query
    String URL_QUERY = "/query";
    String URL_QUERY_QUERYITEM = URL_QUERY + "/queryItem";
    String HTML_QUERY_LIST = "query/list";

    //storage
    String URL_STORAGE = "/storage";
    String HTML_STORAGE_PREFIX = "storage/";
    String HTML_STORAGE_HISTORY = HTML_STORAGE_PREFIX + "history";
    //storage-add
    String URL_STORAGE_ADD = URL_STORAGE + "/add";
    String URL_STORAGE_ADD_AJAX = URL_STORAGE + "/addajax";
    String URL_STORAGE_ADD_ADDITEM = URL_STORAGE_ADD + "/additem";
    String URL_STORAGE_ADD_ADDITEM_AJAX = URL_STORAGE_ADD + "/additemajax";
    String URL_STORAGE_ADD_SET_ITEM_INFO = URL_STORAGE_ADD + "/set_item_info";
    String URL_STORAGE_ADD_SET_ITEM_INFO_AJAX = URL_STORAGE_ADD + "/set_item_info_ajax";
    String URL_STORAGE_ADD_DELETEITEM_AJAX = URL_STORAGE_ADD + "/deleteItem";
    String URL_STORAGE_ADD_DELETEALL_AJAX = URL_STORAGE_ADD + "/deleteAll";
    String URL_STORAGE_ADD_SUBMIT = URL_STORAGE_ADD + "/submit";
    String HTML_STORAGE_ADD_PREFIX = HTML_STORAGE_PREFIX + "add/";
    String HTML_STORAGE_ADD_STORAGE_FORM = HTML_STORAGE_ADD_PREFIX + "storage_form";
    String HTML_STORAGE_ADD_ADDITEM = HTML_STORAGE_ADD_PREFIX + "additem";
    String HTML_STORAGE_ADD_GETINFO = HTML_STORAGE_ADD_PREFIX + "getinfo";
    String HTML_STORAGE_ADD_SETINFO = HTML_STORAGE_ADD_PREFIX + "setinfo";


    //apply
    String URL_APPLY = "/apply";
    String HTML_APPLY_PREFIX = "apply/";
    String HTML_APPLY_HISTORY = HTML_APPLY_PREFIX + "history";

    String URL_APPLY_AJAX = "/applyajax";
    //APPLY ADD
    String URL_APPLY_ADD = URL_APPLY + "/add";
    String URL_APPLY_ADD_ADDITEM = URL_APPLY_ADD + "/additem";
    String URL_APPLY_ADD_ADDITEMS = URL_APPLY_ADD + "/additems";
    String URL_APPLY_ADD_QUERY_ITEM = URL_APPLY_ADD + "/queryItem";
    String URL_APPLY_ADD_SUBMIT = URL_APPLY_ADD + "/submit";

    String URL_APPLY_ADD_AJAX = URL_APPLY + "/addajax";
    String URL_APPLY_CLEARFORM_AJAX = URL_APPLY_ADD + "/clearformajax";
    String URL_APPLY_ADD_DELETE_AJAX = URL_APPLY_ADD + "/deleteajax";
    String URL_APPLY_ADD_ADDITEMAJAX = URL_APPLY_ADD + "/additemajax";

    String HTML_APPLY_ADD_PREFIX = HTML_APPLY_PREFIX + "add/";
    String HTML_APPLY_ADD_APPLYFORM = HTML_APPLY_ADD_PREFIX + "apply_form";
    String HTML_APPLY_ADD_ADDITEM = HTML_APPLY_ADD_PREFIX + "additem";


    //borrow
    String URL_BORROW = "/borrow";
    String HTML_BORROW_PREFIX = TILES_PREFIX + "borrow/";
    String HTML_BORROW_HISTORY = HTML_BORROW_PREFIX + "history";


    //message
    String URL_MESSAGE = "/message";
    String URL_MESSAGE_SEND_AJAX = URL_MESSAGE + "/sendajax";
    String URL_MESSAGE_FINDBYID_AJAX = URL_MESSAGE + "/findbyid";
    String URL_MESSAGE_FIND_WARNTYPE_AJAX = URL_MESSAGE + "/warnmsg";
    String URL_MESSAGE_FINDMESSAGE_BY_ID_AJAX = URL_MESSAGE + "/findmessagebyid";
    String URL_MESSAGE_READWHITID_AJAX = URL_MESSAGE + "/read";
    String URL_MESSAGE_DELETWHITID_AJAX = URL_MESSAGE + "/delete";

    String URL_MESSAGE_NEW = "/newMessage";
    String HTML_MESSAGE_PREFIX = TILES_PREFIX + "message/";
    String HTML_MESSAGE_LIST = HTML_MESSAGE_PREFIX + "list";
    String HTML_MESSAGE_NEWMESSAGE = HTML_MESSAGE_PREFIX + "new";


    //log
    String URL_LOG = "/log";

    String URL_LOG_SYSTEM_AJAX = URL_LOG + "/system";
    String URL_LOG_INSTORAGE_AJAX = URL_LOG + "/instorage";
    String URL_LOG_OUTSTORAGE_AJAX = URL_LOG + "/outsturage";
    String URL_LOG_APPLY_AJAX = URL_LOG + "/apply";
    String URL_LOG_BORROW_AJAX = URL_LOG + "/borrow";
    String URL_LOG_MAINTAIN_AJAX = URL_LOG + "/maintain";

    String HTML_LOG_PREFIX = "log/";
    String HTML_LOG_HISTORY = HTML_LOG_PREFIX + "history";
    String HTML_LOG_LOG = HTML_LOG_PREFIX + "log";



    //error
    String URL_ERROR_GENERAL = "/generalError";
    String HTML_ERROR_GENERAL = "error/general";
    String HTML_ERROR_404 = "/404error";
}
