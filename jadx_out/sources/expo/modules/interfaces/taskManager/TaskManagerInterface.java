package expo.modules.interfaces.taskManager;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface TaskManagerInterface {
    public static final String ERR_TASK_SERVICE_NOT_FOUND = "ERR_TASK_SERVICE_NOT_FOUND";
    public static final String EVENT_NAME = "TaskManager.executeTask";

    void executeTaskWithBody(Bundle bundle);

    void flushQueuedEvents();

    String getAppScopeKey();

    void registerTask(String str, Class cls, Map<String, Object> map) throws Exception;

    boolean taskHasConsumerOfClass(String str, Class cls);

    void unregisterTask(String str, Class cls) throws Exception;
}
