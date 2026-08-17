package expo.modules.camera.common;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/camera/common/CameraMountErrorEvent;", "Lexpo/modules/kotlin/records/Record;", "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;)V", "getMessage$annotations", "()V", "getMessage", "()Ljava/lang/String;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraMountErrorEvent implements Record {
    private final String message;

    public CameraMountErrorEvent(String message) {
        AbstractC2855l.g(message, "message");
        this.message = message;
    }

    public final String getMessage() {
        return this.message;
    }

    @Field
    public static /* synthetic */ void getMessage$annotations() {
    }
}
