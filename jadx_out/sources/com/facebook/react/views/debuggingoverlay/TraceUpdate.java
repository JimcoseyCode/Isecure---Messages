package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "rectangle", "Landroid/graphics/RectF;", ViewProps.COLOR, "<init>", "(ILandroid/graphics/RectF;I)V", "getId", "()I", "getRectangle", "()Landroid/graphics/RectF;", "getColor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TraceUpdate {
    private final int color;
    private final int id;
    private final RectF rectangle;

    public TraceUpdate(int i10, RectF rectangle, int i11) {
        AbstractC2855l.g(rectangle, "rectangle");
        this.id = i10;
        this.rectangle = rectangle;
        this.color = i11;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getId() {
        return this.id;
    }

    public final RectF getRectangle() {
        return this.rectangle;
    }
}
