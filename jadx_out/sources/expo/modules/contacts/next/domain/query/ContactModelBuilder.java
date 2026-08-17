package expo.modules.contacts.next.domain.query;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020O0I8\u0006¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020R0I8\u0006¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020U0I8\u0006¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010NR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0I8\u0006¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0I8\u0006¢\u0006\f\n\u0004\b\\\u0010L\u001a\u0004\b]\u0010NR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020^0I8\u0006¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010N¨\u0006a"}, d2 = {"Lexpo/modules/contacts/next/domain/query/ContactModelBuilder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "contactId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lexpo/modules/contacts/next/domain/model/Extractable;", "extractable", "Li7/B;", "addModel", "(Lexpo/modules/contacts/next/domain/model/Extractable;)V", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "build", "()Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "Ljava/lang/String;", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "displayName", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "getDisplayName-akshqVY", "()Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "setDisplayName-WjT8qFk", "(Lexpo/modules/contacts/next/domain/model/headers/DisplayName;)V", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "getStarred-9dN_u_E", "()Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "setStarred-uF3MqA4", "(Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;)V", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "photoUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "getPhotoUri-zVP6rjE", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "setPhotoUri-Gr8pJqk", "(Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;)V", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "photoThumbnailUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "getPhotoThumbnailUri-fITejg0", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "setPhotoThumbnailUri-Go4U3gQ", "(Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;)V", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "structuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "getStructuredName", "()Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "setStructuredName", "(Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;)V", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "organization", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "getOrganization", "()Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "setOrganization", "(Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;)V", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "note", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "getNote", "()Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "setNote", "(Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;)V", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "photo", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "getPhoto", "()Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "setPhoto", "(Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "emails", "Ljava/util/List;", "getEmails", "()Ljava/util/List;", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "events", "getEvents", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "nicknames", "getNicknames", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "phones", "getPhones", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "relations", "getRelations", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "structuredPostals", "getStructuredPostals", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "websites", "getWebsites", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactModelBuilder {
    private final String contactId;
    private DisplayName displayName;
    private final List<ExistingEmail> emails;
    private final List<ExistingEvent> events;
    private final List<ExistingNickname> nicknames;
    private ExistingNote note;
    private ExistingOrganization organization;
    private final List<ExistingPhone> phones;
    private ExistingPhoto photo;
    private PhotoThumbnailUri photoThumbnailUri;
    private PhotoUri photoUri;
    private final List<ExistingRelation> relations;
    private Starred starred;
    private ExistingStructuredName structuredName;
    private final List<ExistingStructuredPostal> structuredPostals;
    private final List<ExistingWebsite> websites;

    public /* synthetic */ ContactModelBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final void addModel(Extractable extractable) {
        if (extractable instanceof Starred) {
            this.starred = (Starred) extractable;
            return;
        }
        if (extractable instanceof DisplayName) {
            this.displayName = (DisplayName) extractable;
            return;
        }
        if (extractable instanceof PhotoUri) {
            this.photoUri = (PhotoUri) extractable;
            return;
        }
        if (extractable instanceof PhotoThumbnailUri) {
            this.photoThumbnailUri = (PhotoThumbnailUri) extractable;
            return;
        }
        if (extractable instanceof ExistingStructuredName) {
            this.structuredName = (ExistingStructuredName) extractable;
            return;
        }
        if (extractable instanceof ExistingOrganization) {
            this.organization = (ExistingOrganization) extractable;
            return;
        }
        if (extractable instanceof ExistingNote) {
            this.note = (ExistingNote) extractable;
            return;
        }
        if (extractable instanceof ExistingPhoto) {
            this.photo = (ExistingPhoto) extractable;
            return;
        }
        if (extractable instanceof ExistingEmail) {
            this.emails.add(extractable);
            return;
        }
        if (extractable instanceof ExistingEvent) {
            this.events.add(extractable);
            return;
        }
        if (extractable instanceof ExistingNickname) {
            this.nicknames.add(extractable);
            return;
        }
        if (extractable instanceof ExistingPhone) {
            this.phones.add(extractable);
            return;
        }
        if (extractable instanceof ExistingRelation) {
            this.relations.add(extractable);
        } else if (extractable instanceof ExistingStructuredPostal) {
            this.structuredPostals.add(extractable);
        } else if (extractable instanceof ExistingWebsite) {
            this.websites.add(extractable);
        }
    }

    public final ExistingContact build() {
        return new ExistingContact(this.contactId, this.displayName, this.starred, this.photoUri, this.photoThumbnailUri, this.structuredName, this.organization, this.photo, this.note, this.emails, this.events, this.nicknames, this.phones, this.relations, this.structuredPostals, this.websites, null);
    }

    /* JADX INFO: renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: getDisplayName-akshqVY, reason: not valid java name and from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    public final List<ExistingEmail> getEmails() {
        return this.emails;
    }

    public final List<ExistingEvent> getEvents() {
        return this.events;
    }

    public final List<ExistingNickname> getNicknames() {
        return this.nicknames;
    }

    public final ExistingNote getNote() {
        return this.note;
    }

    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    public final List<ExistingPhone> getPhones() {
        return this.phones;
    }

    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: getPhotoThumbnailUri-fITejg0, reason: not valid java name and from getter */
    public final PhotoThumbnailUri getPhotoThumbnailUri() {
        return this.photoThumbnailUri;
    }

    /* JADX INFO: renamed from: getPhotoUri-zVP6rjE, reason: not valid java name and from getter */
    public final PhotoUri getPhotoUri() {
        return this.photoUri;
    }

    public final List<ExistingRelation> getRelations() {
        return this.relations;
    }

    /* JADX INFO: renamed from: getStarred-9dN_u_E, reason: not valid java name and from getter */
    public final Starred getStarred() {
        return this.starred;
    }

    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    public final List<ExistingStructuredPostal> getStructuredPostals() {
        return this.structuredPostals;
    }

    public final List<ExistingWebsite> getWebsites() {
        return this.websites;
    }

    /* JADX INFO: renamed from: setDisplayName-WjT8qFk, reason: not valid java name */
    public final void m114setDisplayNameWjT8qFk(DisplayName displayName) {
        this.displayName = displayName;
    }

    public final void setNote(ExistingNote existingNote) {
        this.note = existingNote;
    }

    public final void setOrganization(ExistingOrganization existingOrganization) {
        this.organization = existingOrganization;
    }

    public final void setPhoto(ExistingPhoto existingPhoto) {
        this.photo = existingPhoto;
    }

    /* JADX INFO: renamed from: setPhotoThumbnailUri-Go4U3gQ, reason: not valid java name */
    public final void m115setPhotoThumbnailUriGo4U3gQ(PhotoThumbnailUri photoThumbnailUri) {
        this.photoThumbnailUri = photoThumbnailUri;
    }

    /* JADX INFO: renamed from: setPhotoUri-Gr8pJqk, reason: not valid java name */
    public final void m116setPhotoUriGr8pJqk(PhotoUri photoUri) {
        this.photoUri = photoUri;
    }

    /* JADX INFO: renamed from: setStarred-uF3MqA4, reason: not valid java name */
    public final void m117setStarreduF3MqA4(Starred starred) {
        this.starred = starred;
    }

    public final void setStructuredName(ExistingStructuredName existingStructuredName) {
        this.structuredName = existingStructuredName;
    }

    private ContactModelBuilder(String contactId) {
        AbstractC2855l.g(contactId, "contactId");
        this.contactId = contactId;
        this.emails = new ArrayList();
        this.events = new ArrayList();
        this.nicknames = new ArrayList();
        this.phones = new ArrayList();
        this.relations = new ArrayList();
        this.structuredPostals = new ArrayList();
        this.websites = new ArrayList();
    }
}
