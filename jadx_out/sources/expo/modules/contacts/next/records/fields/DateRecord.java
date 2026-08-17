package expo.modules.contacts.next.records.fields;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.PatchRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.Required;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Existing", "New", "Patch", "ContactDateRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DateRecord {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "Lexpo/modules/contacts/next/records/NewRecord;", "label", PointerEventHelper.POINTER_TYPE_UNKNOWN, "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)V", "getLabel$annotations", "()V", "getLabel", "()Ljava/lang/String;", "getDate$annotations", "getDate", "()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "component1", "component2", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NewRecord {
        private final ContactDateRecord date;
        private final String label;

        /* JADX WARN: Multi-variable type inference failed */
        public New() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ New copy$default(New r02, String str, ContactDateRecord contactDateRecord, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r02.label;
            }
            if ((i10 & 2) != 0) {
                contactDateRecord = r02.date;
            }
            return r02.copy(str, contactDateRecord);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ContactDateRecord getDate() {
            return this.date;
        }

        public final New copy(String label, ContactDateRecord date) {
            return new New(label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r52 = (New) other;
            return AbstractC2855l.b(this.label, r52.label) && AbstractC2855l.b(this.date, r52.date);
        }

        public final ContactDateRecord getDate() {
            return this.date;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            String str = this.label;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ContactDateRecord contactDateRecord = this.date;
            return iHashCode + (contactDateRecord != null ? contactDateRecord.hashCode() : 0);
        }

        public String toString() {
            return "New(label=" + this.label + ", date=" + this.date + ")";
        }

        public New(String str, ContactDateRecord contactDateRecord) {
            this.label = str;
            this.date = contactDateRecord;
        }

        public /* synthetic */ New(String str, ContactDateRecord contactDateRecord, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : contactDateRecord);
        }

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "Lexpo/modules/kotlin/records/Record;", "year", PointerEventHelper.POINTER_TYPE_UNKNOWN, "month", "day", "<init>", "(Ljava/lang/Integer;II)V", "getYear$annotations", "()V", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMonth$annotations", "getMonth", "()I", "getDay$annotations", "getDay", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;II)Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactDateRecord implements Record {
        private final int day;
        private final int month;
        private final Integer year;

        public ContactDateRecord(Integer num, int i10, int i11) {
            this.year = num;
            this.month = i10;
            this.day = i11;
        }

        public static /* synthetic */ ContactDateRecord copy$default(ContactDateRecord contactDateRecord, Integer num, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = contactDateRecord.year;
            }
            if ((i12 & 2) != 0) {
                i10 = contactDateRecord.month;
            }
            if ((i12 & 4) != 0) {
                i11 = contactDateRecord.day;
            }
            return contactDateRecord.copy(num, i10, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getYear() {
            return this.year;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDay() {
            return this.day;
        }

        public final ContactDateRecord copy(Integer year, int month, int day) {
            return new ContactDateRecord(year, month, day);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactDateRecord)) {
                return false;
            }
            ContactDateRecord contactDateRecord = (ContactDateRecord) other;
            return AbstractC2855l.b(this.year, contactDateRecord.year) && this.month == contactDateRecord.month && this.day == contactDateRecord.day;
        }

        public final int getDay() {
            return this.day;
        }

        public final int getMonth() {
            return this.month;
        }

        public final Integer getYear() {
            return this.year;
        }

        public int hashCode() {
            Integer num = this.year;
            return ((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day);
        }

        public String toString() {
            return "ContactDateRecord(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ")";
        }

        public /* synthetic */ ContactDateRecord(Integer num, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? null : num, i10, i11);
        }

        @Field
        @Required
        public static /* synthetic */ void getDay$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getMonth$annotations() {
        }

        @Field
        public static /* synthetic */ void getYear$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "label", "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLabel$annotations", "getLabel", "getDate$annotations", "getDate", "()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "component1", "component2", "component3", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Existing implements ExistingRecord {
        private final ContactDateRecord date;
        private final String id;
        private final String label;

        public Existing(String id, String str, ContactDateRecord contactDateRecord) {
            AbstractC2855l.g(id, "id");
            this.id = id;
            this.label = str;
            this.date = contactDateRecord;
        }

        public static /* synthetic */ Existing copy$default(Existing existing, String str, String str2, ContactDateRecord contactDateRecord, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = existing.id;
            }
            if ((i10 & 2) != 0) {
                str2 = existing.label;
            }
            if ((i10 & 4) != 0) {
                contactDateRecord = existing.date;
            }
            return existing.copy(str, str2, contactDateRecord);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ContactDateRecord getDate() {
            return this.date;
        }

        public final Existing copy(String id, String label, ContactDateRecord date) {
            AbstractC2855l.g(id, "id");
            return new Existing(id, label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Existing)) {
                return false;
            }
            Existing existing = (Existing) other;
            return AbstractC2855l.b(this.id, existing.id) && AbstractC2855l.b(this.label, existing.label) && AbstractC2855l.b(this.date, existing.date);
        }

        public final ContactDateRecord getDate() {
            return this.date;
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ContactDateRecord contactDateRecord = this.date;
            return iHashCode2 + (contactDateRecord != null ? contactDateRecord.hashCode() : 0);
        }

        public String toString() {
            return "Existing(id=" + this.id + ", label=" + this.label + ", date=" + this.date + ")";
        }

        public /* synthetic */ Existing(String str, String str2, ContactDateRecord contactDateRecord, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : contactDateRecord);
        }

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "Lexpo/modules/contacts/next/records/PatchRecord;", "<init>", "()V", "id", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "label", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "getLabel$annotations", "getLabel", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "getDate$annotations", "getDate", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Patch implements PatchRecord {
        private final ValueOrUndefined<ContactDateRecord> date;
        public String id;
        private final ValueOrUndefined<String> label;

        public Patch() {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.label = undefined;
            AbstractC2855l.e(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.date = undefined;
        }

        public final ValueOrUndefined<ContactDateRecord> getDate() {
            return this.date;
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            String str = this.id;
            if (str != null) {
                return str;
            }
            AbstractC2855l.y("id");
            return null;
        }

        public final ValueOrUndefined<String> getLabel() {
            return this.label;
        }

        public void setId(String str) {
            AbstractC2855l.g(str, "<set-?>");
            this.id = str;
        }

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }
    }
}
