package expo.modules.contacts.next.mappers;

import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.operations.AppendableNote;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.note.operations.NewNote;
import expo.modules.contacts.next.domain.model.note.operations.PatchNote;
import expo.modules.contacts.next.domain.model.organization.operations.AppendableOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.NewOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.PatchOrganization;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.AppendablePhoto;
import expo.modules.contacts.next.domain.model.photo.operations.NewPhoto;
import expo.modules.contacts.next.domain.model.photo.operations.PatchPhoto;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.operations.AppendableStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.NewStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.PatchStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.mappers.domain.data.list.EmailMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EventMapper;
import expo.modules.contacts.next.mappers.domain.data.list.NicknameMapper;
import expo.modules.contacts.next.mappers.domain.data.list.PhoneMapper;
import expo.modules.contacts.next.mappers.domain.data.list.RelationMapper;
import expo.modules.contacts.next.mappers.domain.data.list.StructuredPostalMapper;
import expo.modules.contacts.next.mappers.domain.data.list.WebsiteMapper;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import expo.modules.kotlin.types.ValueOrUndefined;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u001d\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010$J\u001d\u0010%\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001b¢\u0006\u0004\b1\u00102J\u000e\u00103\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\u001d\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b7\u00109J\u001d\u0010:\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u000e\u0010?\u001a\u00020@2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006A"}, d2 = {"Lexpo/modules/contacts/next/mappers/ContactMapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "<init>", "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V", "getImageByteArrayConverter", "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "toRecord", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "existingContact", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "toNewStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/NewStructuredName;", "record", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "toAppendableStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendableStructuredName-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "toPatchStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;", "structuredNameDataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "toPatchStructuredName-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;", "toNewOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/NewOrganization;", "toAppendableOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "toAppendableOrganization-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "toPatchOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "organizationDataId", "toPatchOrganization-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendableNote", "Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "toAppendableNote-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "toPatchNote", "Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "noteDataId", "toPatchNote-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "toNewNote", "Lexpo/modules/contacts/next/domain/model/note/operations/NewNote;", "toAppendablePhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "toAppendablePhoto-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "toPatchPhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/PatchPhoto;", "photoDataId", "toPatchPhoto-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/PatchPhoto;", "toNewPhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/NewPhoto;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContactMapper {
    private final ImageByteArrayConverter imageByteArrayConverter;

    public ContactMapper(ImageByteArrayConverter imageByteArrayConverter) {
        AbstractC2855l.g(imageByteArrayConverter, "imageByteArrayConverter");
        this.imageByteArrayConverter = imageByteArrayConverter;
    }

    public final ImageByteArrayConverter getImageByteArrayConverter() {
        return this.imageByteArrayConverter;
    }

    /* JADX INFO: renamed from: toAppendableNote-MYK5hZQ, reason: not valid java name */
    public final AppendableNote m152toAppendableNoteMYK5hZQ(PatchContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableNote(rawContactId, record.getNote().getOptional(), null);
    }

    /* JADX INFO: renamed from: toAppendableOrganization-MYK5hZQ, reason: not valid java name */
    public final AppendableOrganization m154toAppendableOrganizationMYK5hZQ(PatchContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableOrganization(rawContactId, record.getCompany().getOptional(), record.getDepartment().getOptional(), record.getJobTitle().getOptional(), record.getPhoneticCompanyName().getOptional(), null);
    }

    /* JADX INFO: renamed from: toAppendablePhoto-MYK5hZQ, reason: not valid java name */
    public final AppendablePhoto m156toAppendablePhotoMYK5hZQ(PatchContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        String optional = record.getImage().getOptional();
        return new AppendablePhoto(rawContactId, optional != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(optional)) : null, null);
    }

    /* JADX INFO: renamed from: toAppendableStructuredName-MYK5hZQ, reason: not valid java name */
    public final AppendableStructuredName m158toAppendableStructuredNameMYK5hZQ(PatchContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableStructuredName(rawContactId, record.getGivenName().getOptional(), record.getMiddleName().getOptional(), record.getFamilyName().getOptional(), record.getPrefix().getOptional(), record.getSuffix().getOptional(), record.getPhoneticGivenName().getOptional(), record.getPhoneticMiddleName().getOptional(), record.getPhoneticFamilyName().getOptional(), null);
    }

    public final NewNote toNewNote(CreateContactRecord record) {
        AbstractC2855l.g(record, "record");
        return new NewNote(record.getNote());
    }

    public final NewOrganization toNewOrganization(CreateContactRecord record) {
        AbstractC2855l.g(record, "record");
        return new NewOrganization(record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName());
    }

    public final NewPhoto toNewPhoto(CreateContactRecord record) {
        AbstractC2855l.g(record, "record");
        String image = record.getImage();
        return new NewPhoto(image != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(image)) : null);
    }

    public final NewStructuredName toNewStructuredName(CreateContactRecord record) {
        AbstractC2855l.g(record, "record");
        return new NewStructuredName(record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName());
    }

    /* JADX INFO: renamed from: toPatchNote-JtfS1E8, reason: not valid java name */
    public final PatchNote m159toPatchNoteJtfS1E8(PatchContactRecord record, String noteDataId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(noteDataId, "noteDataId");
        return new PatchNote(noteDataId, record.getNote(), null);
    }

    /* JADX INFO: renamed from: toPatchOrganization-JtfS1E8, reason: not valid java name */
    public final PatchOrganization m160toPatchOrganizationJtfS1E8(PatchContactRecord record, String organizationDataId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(organizationDataId, "organizationDataId");
        return new PatchOrganization(organizationDataId, record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName(), null);
    }

    /* JADX INFO: renamed from: toPatchPhoto-JtfS1E8, reason: not valid java name */
    public final PatchPhoto m161toPatchPhotoJtfS1E8(PatchContactRecord record, String photoDataId) {
        ValueOrUndefined value;
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(photoDataId, "photoDataId");
        ValueOrUndefined<String> image = record.getImage();
        if (image instanceof ValueOrUndefined.Value) {
            String str = (String) ((ValueOrUndefined.Value) image).getValue();
            value = new ValueOrUndefined.Value(str != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(str)) : null);
        } else {
            if (!(image instanceof ValueOrUndefined.Undefined)) {
                throw new C2750m();
            }
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            value = ValueOrUndefined.Undefined.INSTANCE;
            AbstractC2855l.e(value, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
        }
        return new PatchPhoto(photoDataId, value, null);
    }

    /* JADX INFO: renamed from: toPatchStructuredName-JtfS1E8, reason: not valid java name */
    public final PatchStructuredName m162toPatchStructuredNameJtfS1E8(PatchContactRecord record, String structuredNameDataId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(structuredNameDataId, "structuredNameDataId");
        return new PatchStructuredName(structuredNameDataId, record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName(), null);
    }

    public final GetContactDetailsRecord toRecord(ExistingContact existingContact) {
        Boolean boolValueOf;
        AbstractC2855l.g(existingContact, "existingContact");
        String strM66getContactIdS9XCBSM = existingContact.m66getContactIdS9XCBSM();
        DisplayName displayNameM67getDisplayNameakshqVY = existingContact.m67getDisplayNameakshqVY();
        String strM83unboximpl = displayNameM67getDisplayNameakshqVY != null ? displayNameM67getDisplayNameakshqVY.m83unboximpl() : null;
        Starred starredM70getStarred9dN_u_E = existingContact.m70getStarred9dN_u_E();
        if (starredM70getStarred9dN_u_E != null) {
            boolValueOf = Boolean.valueOf(starredM70getStarred9dN_u_E.m107unboximpl() == 1);
        } else {
            boolValueOf = null;
        }
        ExistingStructuredName structuredName = existingContact.getStructuredName();
        String givenName = structuredName != null ? structuredName.getGivenName() : null;
        ExistingStructuredName structuredName2 = existingContact.getStructuredName();
        String middleName = structuredName2 != null ? structuredName2.getMiddleName() : null;
        ExistingStructuredName structuredName3 = existingContact.getStructuredName();
        String familyName = structuredName3 != null ? structuredName3.getFamilyName() : null;
        ExistingStructuredName structuredName4 = existingContact.getStructuredName();
        String prefix = structuredName4 != null ? structuredName4.getPrefix() : null;
        ExistingStructuredName structuredName5 = existingContact.getStructuredName();
        String suffix = structuredName5 != null ? structuredName5.getSuffix() : null;
        ExistingStructuredName structuredName6 = existingContact.getStructuredName();
        String phoneticGivenName = structuredName6 != null ? structuredName6.getPhoneticGivenName() : null;
        ExistingStructuredName structuredName7 = existingContact.getStructuredName();
        String phoneticMiddleName = structuredName7 != null ? structuredName7.getPhoneticMiddleName() : null;
        ExistingStructuredName structuredName8 = existingContact.getStructuredName();
        String phoneticFamilyName = structuredName8 != null ? structuredName8.getPhoneticFamilyName() : null;
        ExistingOrganization organization = existingContact.getOrganization();
        String company = organization != null ? organization.getCompany() : null;
        ExistingOrganization organization2 = existingContact.getOrganization();
        String department = organization2 != null ? organization2.getDepartment() : null;
        ExistingOrganization organization3 = existingContact.getOrganization();
        String jobTitle = organization3 != null ? organization3.getJobTitle() : null;
        ExistingOrganization organization4 = existingContact.getOrganization();
        String phoneticName = organization4 != null ? organization4.getPhoneticName() : null;
        ExistingNote note = existingContact.getNote();
        String note2 = note != null ? note.getNote() : null;
        PhotoUri photoUriM69getPhotoUrizVP6rjE = existingContact.m69getPhotoUrizVP6rjE();
        String strM99unboximpl = photoUriM69getPhotoUrizVP6rjE != null ? photoUriM69getPhotoUrizVP6rjE.m99unboximpl() : null;
        PhotoThumbnailUri photoThumbnailUriM68getPhotoThumbnailUrifITejg0 = existingContact.m68getPhotoThumbnailUrifITejg0();
        String strM91unboximpl = photoThumbnailUriM68getPhotoThumbnailUrifITejg0 != null ? photoThumbnailUriM68getPhotoThumbnailUrifITejg0.m91unboximpl() : null;
        List<ExistingEmail> emails = existingContact.getEmails();
        String str = strM83unboximpl;
        EmailMapper emailMapper = EmailMapper.INSTANCE;
        String str2 = givenName;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(emails, 10));
        Iterator<T> it = emails.iterator();
        while (it.hasNext()) {
            arrayList.add(emailMapper.toDto((ExistingEmail) it.next()));
        }
        List<ExistingEvent> events = existingContact.getEvents();
        EventMapper eventMapper = EventMapper.INSTANCE;
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(events, 10));
        Iterator<T> it2 = events.iterator();
        while (it2.hasNext()) {
            arrayList2.add(eventMapper.toDto((ExistingEvent) it2.next()));
        }
        List<ExistingPhone> phones = existingContact.getPhones();
        PhoneMapper phoneMapper = PhoneMapper.INSTANCE;
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(phones, 10));
        Iterator<T> it3 = phones.iterator();
        while (it3.hasNext()) {
            arrayList3.add(phoneMapper.toDto((ExistingPhone) it3.next()));
        }
        List<ExistingStructuredPostal> structuredPostals = existingContact.getStructuredPostals();
        StructuredPostalMapper structuredPostalMapper = StructuredPostalMapper.INSTANCE;
        ArrayList arrayList4 = new ArrayList(AbstractC2800q.u(structuredPostals, 10));
        Iterator<T> it4 = structuredPostals.iterator();
        while (it4.hasNext()) {
            arrayList4.add(structuredPostalMapper.toDto((ExistingStructuredPostal) it4.next()));
        }
        List<ExistingRelation> relations = existingContact.getRelations();
        RelationMapper relationMapper = RelationMapper.INSTANCE;
        ArrayList arrayList5 = new ArrayList(AbstractC2800q.u(relations, 10));
        Iterator<T> it5 = relations.iterator();
        while (it5.hasNext()) {
            arrayList5.add(relationMapper.toDto((ExistingRelation) it5.next()));
        }
        List<ExistingWebsite> websites = existingContact.getWebsites();
        WebsiteMapper websiteMapper = WebsiteMapper.INSTANCE;
        ArrayList arrayList6 = new ArrayList(AbstractC2800q.u(websites, 10));
        Iterator<T> it6 = websites.iterator();
        while (it6.hasNext()) {
            arrayList6.add(websiteMapper.toDto((ExistingWebsite) it6.next()));
        }
        List<ExistingNickname> nicknames = existingContact.getNicknames();
        NicknameMapper nicknameMapper = NicknameMapper.INSTANCE;
        ArrayList arrayList7 = new ArrayList(AbstractC2800q.u(nicknames, 10));
        Iterator<T> it7 = nicknames.iterator();
        while (it7.hasNext()) {
            arrayList7.add(nicknameMapper.toDto((ExistingNickname) it7.next()));
        }
        return new GetContactDetailsRecord(strM66getContactIdS9XCBSM, str, str2, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticName, note2, strM99unboximpl, strM91unboximpl, boolValueOf, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    /* JADX INFO: renamed from: toAppendablePhoto-MYK5hZQ, reason: not valid java name */
    public final AppendablePhoto m155toAppendablePhotoMYK5hZQ(CreateContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        String image = record.getImage();
        return new AppendablePhoto(rawContactId, image != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(image)) : null, null);
    }

    /* JADX INFO: renamed from: toAppendableOrganization-MYK5hZQ, reason: not valid java name */
    public final AppendableOrganization m153toAppendableOrganizationMYK5hZQ(CreateContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableOrganization(rawContactId, record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName(), null);
    }

    /* JADX INFO: renamed from: toAppendableStructuredName-MYK5hZQ, reason: not valid java name */
    public final AppendableStructuredName m157toAppendableStructuredNameMYK5hZQ(CreateContactRecord record, String rawContactId) {
        AbstractC2855l.g(record, "record");
        AbstractC2855l.g(rawContactId, "rawContactId");
        return new AppendableStructuredName(rawContactId, record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName(), null);
    }
}
