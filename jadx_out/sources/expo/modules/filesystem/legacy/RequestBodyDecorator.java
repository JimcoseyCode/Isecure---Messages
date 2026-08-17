package expo.modules.filesystem.legacy;

import com.facebook.react.uimanager.events.PointerEventHelper;
import e9.C;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/legacy/RequestBodyDecorator;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Le9/C;", "requestBody", "decorate", "(Le9/C;)Le9/C;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RequestBodyDecorator {
    C decorate(C requestBody);
}
