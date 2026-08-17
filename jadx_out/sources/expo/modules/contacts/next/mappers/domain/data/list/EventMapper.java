package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.event.operations.AppendableEvent;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.event.operations.NewEvent;
import expo.modules.contacts.next.domain.model.event.operations.PatchEvent;
import expo.modules.contacts.next.domain.wrappers.ContactDate;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.EventLabelMapper;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.kotlin.types.ValueOrUndefined;
import i7.C2750m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;", "record", "toAppendable", "Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;", "toUpdatable", "toPatch", "Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "toDto", "model", "toDomain", "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "toDomain-xjsikGQ", "(Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventMapper implements ListDataPropertyMapper<ExistingEvent, DateRecord.Existing, DateRecord.New> {
    public static final EventMapper INSTANCE = new EventMapper();

    private EventMapper() {
    }

    /* JADX INFO: renamed from: toDomain-xjsikGQ, reason: not valid java name */
    private final String m206toDomainxjsikGQ(DateRecord.ContactDateRecord record) {
        if (record == null) {
            return null;
        }
        Integer year = record.getYear();
        int month = record.getMonth();
        int day = record.getDay();
        String str = String.format("%02d", Arrays.copyOf(new Object[]{year}, 1));
        AbstractC2855l.f(str, "format(...)");
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(month)}, 1));
        AbstractC2855l.f(str2, "format(...)");
        String str3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(day)}, 1));
        AbstractC2855l.f(str3, "format(...)");
        if (year == null) {
            return ContactDate.m120constructorimpl("--" + str2 + "-" + str3);
        }
        return ContactDate.m120constructorimpl(str + "-" + str2 + "-" + str3);
    }

    public final NewEvent toNew(DateRecord.New record) {
        AbstractC2855l.g(record, "record");
        return new NewEvent(m206toDomainxjsikGQ(record.getDate()), EventLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    public final PatchEvent toPatch(DateRecord.Patch record) {
        ValueOrUndefined value;
        AbstractC2855l.g(record, "record");
        String strM137constructorimpl = DataId.m137constructorimpl(record.getId());
        ValueOrUndefined<DateRecord.ContactDateRecord> date = record.getDate();
        if (date instanceof ValueOrUndefined.Value) {
            String strM206toDomainxjsikGQ = INSTANCE.m206toDomainxjsikGQ((DateRecord.ContactDateRecord) ((ValueOrUndefined.Value) date).getValue());
            value = new ValueOrUndefined.Value(strM206toDomainxjsikGQ != null ? ContactDate.m119boximpl(strM206toDomainxjsikGQ) : null);
        } else {
            if (!(date instanceof ValueOrUndefined.Undefined)) {
                throw new C2750m();
            }
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            value = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(value, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        }
        return new PatchEvent(strM137constructorimpl, value, EventLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* JADX INFO: renamed from: toAppendable-MYK5hZQ, reason: not valid java name and merged with bridge method [inline-methods] */
    public AppendableEvent mo204toAppendableMYK5hZQ(DateRecord.New newValue, String rawContactId) {
        AbstractC2855l.g(newValue, "newValue");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableEvent(rawContactId, m206toDomainxjsikGQ(newValue.getDate()), EventLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public DateRecord.Existing toDto(ExistingEvent model) {
        AbstractC2855l.g(model, "model");
        String startDate = model.getStartDate();
        DateRecord.ContactDateRecord contactDateRecord = null;
        if (startDate != null) {
            String strM125getYearimpl = ContactDate.m125getYearimpl(startDate);
            contactDateRecord = new DateRecord.ContactDateRecord(strM125getYearimpl != null ? Integer.valueOf(Integer.parseInt(strM125getYearimpl)) : null, Integer.parseInt(ContactDate.m124getMonthimpl(startDate)), Integer.parseInt(ContactDate.m123getDayimpl(startDate)));
        }
        return new DateRecord.Existing(model.getDataId(), EventLabelMapper.INSTANCE.toRecord(model.getLabel()), contactDateRecord);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingEvent toUpdatable(DateRecord.Existing newValue) {
        AbstractC2855l.g(newValue, "newValue");
        return new ExistingEvent(DataId.m137constructorimpl(newValue.getId()), m206toDomainxjsikGQ(newValue.getDate()), EventLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }
}
