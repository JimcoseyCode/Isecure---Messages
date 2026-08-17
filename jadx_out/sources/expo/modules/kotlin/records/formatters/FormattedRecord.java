package expo.modules.kotlin.records.formatters;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00028\u0000HÀ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÀ\u0003¢\u0006\u0002\b\u0011J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0000X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "RecordType", "Lexpo/modules/kotlin/records/Record;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "record", "formatter", "Lexpo/modules/kotlin/records/formatters/Formatter;", "<init>", "(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/records/formatters/Formatter;)V", "getRecord$expo_modules_core_release", "()Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/records/Record;", "getFormatter$expo_modules_core_release", "()Lexpo/modules/kotlin/records/formatters/Formatter;", "component1", "component1$expo_modules_core_release", "component2", "component2$expo_modules_core_release", "copy", "(Lexpo/modules/kotlin/records/Record;Lexpo/modules/kotlin/records/formatters/Formatter;)Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FormattedRecord<RecordType extends Record> {
    private final Formatter<RecordType> formatter;
    private final RecordType record;

    public FormattedRecord(RecordType record, Formatter<RecordType> formatter) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(formatter, "formatter");
        this.record = record;
        this.formatter = formatter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedRecord copy$default(FormattedRecord formattedRecord, Record record, Formatter formatter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            record = formattedRecord.record;
        }
        if ((i10 & 2) != 0) {
            formatter = formattedRecord.formatter;
        }
        return formattedRecord.copy(record, formatter);
    }

    public final RecordType component1$expo_modules_core_release() {
        return this.record;
    }

    public final Formatter<RecordType> component2$expo_modules_core_release() {
        return this.formatter;
    }

    public final FormattedRecord<RecordType> copy(RecordType record, Formatter<RecordType> formatter) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(formatter, "formatter");
        return new FormattedRecord<>(record, formatter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedRecord)) {
            return false;
        }
        FormattedRecord formattedRecord = (FormattedRecord) other;
        return AbstractC2855l.b(this.record, formattedRecord.record) && AbstractC2855l.b(this.formatter, formattedRecord.formatter);
    }

    public final Formatter<RecordType> getFormatter$expo_modules_core_release() {
        return this.formatter;
    }

    public final RecordType getRecord$expo_modules_core_release() {
        return this.record;
    }

    public int hashCode() {
        return (this.record.hashCode() * 31) + this.formatter.hashCode();
    }

    public String toString() {
        return "FormattedRecord(record=" + this.record + ", formatter=" + this.formatter + ")";
    }
}
