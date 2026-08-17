package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J)\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0011J+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0012\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Landroid/view/View;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "propName", "value", "Li7/B;", "kotlinCompat$setProperty", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "setProperty", "javaCompat_setProperty", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "kotlinCompat$receiveCommand", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "receiveCommand", "kotlinCompat$receiveCommandNullableArgs", "javaCompat_receiveCommand", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ViewManagerDelegate<T extends View> {
    /* synthetic */ void kotlinCompat$receiveCommand(View view, String commandName, ReadableArray args);

    /* synthetic */ default void kotlinCompat$receiveCommandNullableArgs(View view, String commandName, ReadableArray args) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(commandName, "commandName");
        if (args == null) {
            throw new IllegalStateException("Required value was null.");
        }
        kotlinCompat$receiveCommand(view, commandName, args);
    }

    /* synthetic */ void kotlinCompat$setProperty(View view, String propName, Object value);

    default void receiveCommand(T view, String commandName, ReadableArray args) {
        AbstractC2855l.g(view, "view");
        if (commandName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (args == null) {
            throw new IllegalStateException("Required value was null.");
        }
        kotlinCompat$receiveCommand(view, commandName, args);
    }

    default void setProperty(T view, String propName, Object value) {
        AbstractC2855l.g(view, "view");
        if (propName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        kotlinCompat$setProperty(view, propName, value);
    }
}
