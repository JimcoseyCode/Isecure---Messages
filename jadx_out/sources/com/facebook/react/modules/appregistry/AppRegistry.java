package com.facebook.react.modules.appregistry;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/appregistry/AppRegistry;", "Lcom/facebook/react/bridge/JavaScriptModule;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "appKey", "Lcom/facebook/react/bridge/WritableMap;", "appParameters", "Li7/B;", "runApplication", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rootNodeTag", "unmountApplicationComponentAtRootTag", "(I)V", "taskId", "taskKey", "data", "startHeadlessTask", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppRegistry extends JavaScriptModule {
    void runApplication(String appKey, WritableMap appParameters);

    void startHeadlessTask(int taskId, String taskKey, WritableMap data);

    void unmountApplicationComponentAtRootTag(int rootNodeTag);
}
