package expo.modules.interfaces.taskManager;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface TaskConsumerInterface {
    boolean canReceiveCustomBroadcast(String str);

    boolean didCancelJob(JobService jobService, JobParameters jobParameters);

    boolean didExecuteJob(JobService jobService, JobParameters jobParameters);

    void didReceiveBroadcast(Intent intent);

    void didRegister(TaskInterface taskInterface);

    void didUnregister();

    void setOptions(Map<String, Object> map);

    String taskType();
}
