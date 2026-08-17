package expo.modules.kotlin.records.formatters;

import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"format", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "R", "Lexpo/modules/kotlin/records/Record;", "formatter", "Lexpo/modules/kotlin/records/formatters/Formatter;", "(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/records/formatters/Formatter;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RecordExtensionKt {
    public static final <R extends Record> FormattedRecord<R> format(R r10, Formatter<R> formatter) {
        AbstractC2855l.g(r10, "<this>");
        AbstractC2855l.g(formatter, "formatter");
        return new FormattedRecord<>(r10, formatter);
    }
}
