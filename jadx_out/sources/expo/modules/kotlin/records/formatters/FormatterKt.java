package expo.modules.kotlin.records.formatters;

import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.Formatter;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\b\u0001\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/records/Record;", "RecordType", "Lkotlin/Function1;", "Lexpo/modules/kotlin/records/formatters/Formatter$Builder;", "Li7/B;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Lexpo/modules/kotlin/records/formatters/Formatter;", "formatter", "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/records/formatters/Formatter;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FormatterKt {
    public static final <RecordType extends Record> Formatter<RecordType> formatter(Function1 body) {
        AbstractC2855l.g(body, "body");
        Formatter.Builder builder = new Formatter.Builder();
        body.invoke(builder);
        return builder.build$expo_modules_core_release();
    }
}
