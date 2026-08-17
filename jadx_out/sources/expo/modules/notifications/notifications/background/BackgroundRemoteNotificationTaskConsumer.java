package expo.modules.notifications.notifications.background;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.taskManager.TaskConsumer;
import expo.modules.interfaces.taskManager.TaskConsumerInterface;
import expo.modules.interfaces.taskManager.TaskExecutionCallback;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.interfaces.taskManager.TaskManagerUtilsInterface;
import expo.modules.notifications.notifications.NotificationSerializer;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;", "Landroid/content/Context;", "context", "Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;", "taskManagerUtils", "<init>", "(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "taskType", "()Ljava/lang/String;", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "task", "Li7/B;", "didRegister", "(Lexpo/modules/interfaces/taskManager/TaskInterface;)V", "didUnregister", "()V", "Landroid/app/job/JobService;", "jobService", "Landroid/app/job/JobParameters;", "params", PointerEventHelper.POINTER_TYPE_UNKNOWN, "didExecuteJob", "(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z", "Landroid/os/Bundle;", "bundle", "executeTask", "(Landroid/os/Bundle;)V", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "Companion", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundRemoteNotificationTaskConsumer extends TaskConsumer implements TaskConsumerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NOTIFICATION_KEY = "notification";
    private TaskInterface task;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lexpo/modules/notifications/notifications/background/BackgroundRemoteNotificationTaskConsumer$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "NOTIFICATION_KEY", PointerEventHelper.POINTER_TYPE_UNKNOWN, "bundleToJson", "Lorg/json/JSONObject;", "bundle", "Landroid/os/Bundle;", "jsonStringToBundle", "jsonString", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject bundleToJson(Bundle bundle) {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                try {
                    Object obj = bundle.get(str);
                    if (obj instanceof Bundle) {
                        jSONObject.put(str, bundleToJson((Bundle) obj));
                    } else {
                        jSONObject.put(str, JSONObject.wrap(obj));
                    }
                } catch (JSONException e10) {
                    e10.getMessage();
                }
            }
            return jSONObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle jsonStringToBundle(String jsonString) {
            try {
                return NotificationSerializer.toBundle(new JSONObject(jsonString));
            } catch (JSONException e10) {
                e10.getMessage();
                return null;
            }
        }

        private Companion() {
        }
    }

    public BackgroundRemoteNotificationTaskConsumer(Context context, TaskManagerUtilsInterface taskManagerUtilsInterface) {
        super(context, taskManagerUtilsInterface);
        FirebaseMessagingDelegate.INSTANCE.addBackgroundTaskConsumer(this);
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didExecuteJob(final JobService jobService, final JobParameters params) {
        AbstractC2855l.g(jobService, "jobService");
        TaskInterface taskInterface = this.task;
        if (taskInterface == null) {
            return false;
        }
        Iterator<PersistableBundle> it = getTaskManagerUtils().extractDataFromJobParams(params).iterator();
        while (it.hasNext()) {
            String string = it.next().getString("notification");
            if (string == null) {
                throw new IllegalArgumentException("Job data missing 'notification' entry");
            }
            Bundle bundle = new Bundle();
            bundle.putBundle("notification", INSTANCE.jsonStringToBundle(string));
            taskInterface.execute(bundle, null, new TaskExecutionCallback() { // from class: expo.modules.notifications.notifications.background.a
                @Override // expo.modules.interfaces.taskManager.TaskExecutionCallback
                public final void onFinished(Map map) {
                    jobService.jobFinished(params, false);
                }
            });
        }
        return true;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didRegister(TaskInterface task) {
        this.task = task;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didUnregister() {
        FirebaseMessagingDelegate.INSTANCE.removeBackgroundTaskConsumer(this);
        this.task = null;
    }

    public final void executeTask(Bundle bundle) {
        AbstractC2855l.g(bundle, "bundle");
        TaskInterface taskInterface = this.task;
        if (taskInterface == null) {
            throw new IllegalArgumentException("executeTask called but no task is registered");
        }
        taskInterface.execute(bundle, null);
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public String taskType() {
        return "remote-notification";
    }
}
