package expo.modules.contacts.next.mappers;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"isChangingStructuredName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "isChangingOrganization", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsChangingAnythingKt {
    public static final boolean isChangingOrganization(PatchContactRecord patchContactRecord) {
        AbstractC2855l.g(patchContactRecord, "<this>");
        return (patchContactRecord.getCompany().isUndefined() && patchContactRecord.getDepartment().isUndefined() && patchContactRecord.getJobTitle().isUndefined() && patchContactRecord.getPhoneticCompanyName().isUndefined()) ? false : true;
    }

    public static final boolean isChangingStructuredName(PatchContactRecord patchContactRecord) {
        AbstractC2855l.g(patchContactRecord, "<this>");
        return (patchContactRecord.getGivenName().isUndefined() && patchContactRecord.getMiddleName().isUndefined() && patchContactRecord.getFamilyName().isUndefined() && patchContactRecord.getPrefix().isUndefined() && patchContactRecord.getSuffix().isUndefined() && patchContactRecord.getPhoneticGivenName().isUndefined() && patchContactRecord.getPhoneticMiddleName().isUndefined() && patchContactRecord.getPhoneticFamilyName().isUndefined()) ? false : true;
    }
}
