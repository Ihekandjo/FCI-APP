package na.nust.fci_app;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "na.nust.fci_app.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
