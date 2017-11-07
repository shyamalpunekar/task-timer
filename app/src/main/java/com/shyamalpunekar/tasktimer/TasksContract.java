package com.shyamalpunekar.tasktimer;

import android.provider.BaseColumns;

/**
 * Created by spunek on 11/6/17.
 */

public class TasksContract {
    static final String TABLE_NAME = "Tasks";

    public static class Columns {
        public static final String _ID = BaseColumns._ID;
        public static final String TASKS_NAME = "Name";
        public static final String TASKS_DESCRIPTION = "Description";
        public static final String TASKS_SORTORDER = "SortOrder";

        private Columns(){
            //private constructor to provide instantiation
        }
    }

}
