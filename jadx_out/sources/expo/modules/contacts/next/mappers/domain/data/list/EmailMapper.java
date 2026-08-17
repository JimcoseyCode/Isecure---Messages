package expo.modules.contacts.next.mappers.domain.data.list;

import expo.modules.contacts.next.domain.model.email.operations.AppendableEmail;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.email.operations.NewEmail;
import expo.modules.contacts.next.domain.model.email.operations.PatchEmail;
import expo.modules.contacts.next.domain.wrappers.DataId;
import expo.modules.contacts.next.mappers.domain.data.list.label.EmailLabelMapper;
import expo.modules.contacts.next.records.fields.EmailRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\fJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "<init>", "()V", "toNew", "Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;", "record", "toPatch", "Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;", "newValue", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;", "toUpdatable", "toDto", "model", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmailMapper implements ListDataPropertyMapper<ExistingEmail, EmailRecord.Existing, EmailRecord.New> {
    public static final EmailMapper INSTANCE = new EmailMapper();

    private EmailMapper() {
    }

    public final NewEmail toNew(EmailRecord.New record) {
        AbstractC2855l.g(record, "record");
        return new NewEmail(record.getAddress(), EmailLabelMapper.INSTANCE.toDomain(record.getLabel()));
    }

    public final PatchEmail toPatch(EmailRecord.Patch record) {
        AbstractC2855l.g(record, "record");
        return new PatchEmail(DataId.m137constructorimpl(record.getId()), record.getAddress(), EmailLabelMapper.INSTANCE.toDomain(record.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    /* JADX INFO: renamed from: toAppendable-MYK5hZQ, reason: not valid java name and merged with bridge method [inline-methods] */
    public AppendableEmail mo204toAppendableMYK5hZQ(EmailRecord.New newValue, String rawContactId) {
        AbstractC2855l.g(newValue, "newValue");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableEmail(rawContactId, newValue.getAddress(), EmailLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public EmailRecord.Existing toDto(ExistingEmail model) {
        AbstractC2855l.g(model, "model");
        return new EmailRecord.Existing(model.getDataId(), EmailLabelMapper.INSTANCE.toRecord(model.getLabel()), model.getAddress());
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper
    public ExistingEmail toUpdatable(EmailRecord.Existing newValue) {
        AbstractC2855l.g(newValue, "newValue");
        return new ExistingEmail(DataId.m137constructorimpl(newValue.getId()), newValue.getAddress(), EmailLabelMapper.INSTANCE.toDomain(newValue.getLabel()), null);
    }
}
