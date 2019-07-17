package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

import java.time.DateTimeException;
import java.util.Date;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    public static class TODOENTRIES implements BaseColumns{
        public static final String TABLE_NAME = "TodoListTasks";
        public static final String DATE = "date";
        public static final String CONTENT = "content";
        public static final String STATE = "state";
        public static final String PRIORITY = "priority";
    }

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TODOENTRIES.TABLE_NAME + " (" +
                    TODOENTRIES._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    TODOENTRIES.DATE + " INTEGER," +
                    TODOENTRIES.CONTENT + " TEXT," +
                    TODOENTRIES.STATE + " INTEGER)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TODOENTRIES.TABLE_NAME;
    private TodoContract() {
    }

}
