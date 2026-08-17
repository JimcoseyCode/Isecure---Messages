package expo.modules.clipboard;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/clipboard/GetStringOptions;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "preferredFormat", "Lexpo/modules/clipboard/StringFormat;", "getPreferredFormat$annotations", "getPreferredFormat", "()Lexpo/modules/clipboard/StringFormat;", "setPreferredFormat", "(Lexpo/modules/clipboard/StringFormat;)V", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetStringOptions implements Record {
    private StringFormat preferredFormat = StringFormat.PLAIN;

    public final StringFormat getPreferredFormat() {
        return this.preferredFormat;
    }

    public final void setPreferredFormat(StringFormat stringFormat) {
        AbstractC2855l.g(stringFormat, "<set-?>");
        this.preferredFormat = stringFormat;
    }

    @Field
    public static /* synthetic */ void getPreferredFormat$annotations() {
    }
}
