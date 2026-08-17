package expo.modules.contacts.next.domain.model.contact;

import android.content.ContentProviderOperation;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bJ\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0013\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006'"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "modifiedFields", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "toAppend", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/Appendable;", "toUpdate", "Lexpo/modules/contacts/next/domain/model/Updatable;", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getModifiedFields", "()Ljava/util/Set;", "getToAppend", "()Ljava/util/List;", "getToUpdate", "toPatchOperations", "Landroid/content/ContentProviderOperation;", "component1", "component1-S9XCBSM", "component2", "component3", "component4", "copy", "copy-n2Ir5_g", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Ljava/util/List;)Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContactPatch {
    private final String contactId;
    private final Set<ExtractableField.Data<?>> modifiedFields;
    private final List<Appendable> toAppend;
    private final List<Updatable> toUpdate;

    public /* synthetic */ ContactPatch(String str, Set set, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, set, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-n2Ir5_g$default, reason: not valid java name */
    public static /* synthetic */ ContactPatch m55copyn2Ir5_g$default(ContactPatch contactPatch, String str, Set set, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = contactPatch.contactId;
        }
        if ((i10 & 2) != 0) {
            set = contactPatch.modifiedFields;
        }
        if ((i10 & 4) != 0) {
            list = contactPatch.toAppend;
        }
        if ((i10 & 8) != 0) {
            list2 = contactPatch.toUpdate;
        }
        return contactPatch.m57copyn2Ir5_g(str, set, list, list2);
    }

    /* JADX INFO: renamed from: component1-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    public final Set<ExtractableField.Data<?>> component2() {
        return this.modifiedFields;
    }

    public final List<Appendable> component3() {
        return this.toAppend;
    }

    public final List<Updatable> component4() {
        return this.toUpdate;
    }

    /* JADX INFO: renamed from: copy-n2Ir5_g, reason: not valid java name */
    public final ContactPatch m57copyn2Ir5_g(String contactId, Set<? extends ExtractableField.Data<?>> modifiedFields, List<? extends Appendable> toAppend, List<? extends Updatable> toUpdate) {
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(modifiedFields, "modifiedFields");
        AbstractC2855l.g(toAppend, "toAppend");
        AbstractC2855l.g(toUpdate, "toUpdate");
        return new ContactPatch(contactId, modifiedFields, toAppend, toUpdate, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactPatch)) {
            return false;
        }
        ContactPatch contactPatch = (ContactPatch) other;
        return ContactId.m132equalsimpl0(this.contactId, contactPatch.contactId) && AbstractC2855l.b(this.modifiedFields, contactPatch.modifiedFields) && AbstractC2855l.b(this.toAppend, contactPatch.toAppend) && AbstractC2855l.b(this.toUpdate, contactPatch.toUpdate);
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name */
    public final String m58getContactIdS9XCBSM() {
        return this.contactId;
    }

    public final Set<ExtractableField.Data<?>> getModifiedFields() {
        return this.modifiedFields;
    }

    public final List<Appendable> getToAppend() {
        return this.toAppend;
    }

    public final List<Updatable> getToUpdate() {
        return this.toUpdate;
    }

    public int hashCode() {
        return (((((ContactId.m133hashCodeimpl(this.contactId) * 31) + this.modifiedFields.hashCode()) * 31) + this.toAppend.hashCode()) * 31) + this.toUpdate.hashCode();
    }

    public final List<ContentProviderOperation> toPatchOperations() {
        List listC = AbstractC2800q.c();
        List<Appendable> list = this.toAppend;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Appendable) it.next()).toAppendOperation());
        }
        listC.addAll(arrayList);
        List<Updatable> list2 = this.toUpdate;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Updatable) it2.next()).toUpdateOperation());
        }
        listC.addAll(arrayList2);
        return AbstractC2800q.a(listC);
    }

    public String toString() {
        return "ContactPatch(contactId=" + ContactId.m134toStringimpl(this.contactId) + ", modifiedFields=" + this.modifiedFields + ", toAppend=" + this.toAppend + ", toUpdate=" + this.toUpdate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ContactPatch(String contactId, Set<? extends ExtractableField.Data<?>> modifiedFields, List<? extends Appendable> toAppend, List<? extends Updatable> toUpdate) {
        AbstractC2855l.g(contactId, "contactId");
        AbstractC2855l.g(modifiedFields, "modifiedFields");
        AbstractC2855l.g(toAppend, "toAppend");
        AbstractC2855l.g(toUpdate, "toUpdate");
        this.contactId = contactId;
        this.modifiedFields = modifiedFields;
        this.toAppend = toAppend;
        this.toUpdate = toUpdate;
    }
}
