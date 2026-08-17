package expo.modules.interfaces.taskManager;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface TaskInterface {
    void execute(Bundle bundle, Error error);

    void execute(Bundle bundle, Error error, TaskExecutionCallback taskExecutionCallback);

    String getAppScopeKey();

    String getAppUrl();

    TaskConsumerInterface getConsumer();

    String getName();

    Map<String, Object> getOptions();

    Bundle getOptionsBundle();

    void setOptions(Map<String, Object> map);
}
