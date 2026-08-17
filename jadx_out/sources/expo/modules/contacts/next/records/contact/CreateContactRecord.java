package expo.modules.contacts.next.records.contact;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014¢\u0006\u0004\b\"\u0010#J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0011HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0014HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014HÆ\u0003J¹\u0002\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00142\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00142\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00142\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014HÆ\u0001J\u0013\u0010j\u001a\u00020\u00112\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020nHÖ\u0001J\t\u0010o\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010%\u001a\u0004\b=\u0010'R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010%\u001a\u0004\b?\u0010'R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010%\u001a\u0004\b\u0010\u0010AR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010%\u001a\u0004\bC\u0010'R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010%\u001a\u0004\bE\u0010FR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010%\u001a\u0004\bH\u0010FR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010%\u001a\u0004\bJ\u0010FR$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010%\u001a\u0004\bL\u0010FR$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010%\u001a\u0004\bN\u0010FR$\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010%\u001a\u0004\bP\u0010FR$\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010%\u001a\u0004\bR\u0010F¨\u0006p"}, d2 = {"Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "Lexpo/modules/kotlin/records/Record;", "givenName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "company", "department", "jobTitle", "phoneticCompanyName", "note", "isFavourite", PointerEventHelper.POINTER_TYPE_UNKNOWN, "image", "emails", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "dates", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "phones", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "addresses", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "relations", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "urlAddresses", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "extraNames", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGivenName$annotations", "()V", "getGivenName", "()Ljava/lang/String;", "getMiddleName$annotations", "getMiddleName", "getFamilyName$annotations", "getFamilyName", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getPhoneticGivenName$annotations", "getPhoneticGivenName", "getPhoneticMiddleName$annotations", "getPhoneticMiddleName", "getPhoneticFamilyName$annotations", "getPhoneticFamilyName", "getCompany$annotations", "getCompany", "getDepartment$annotations", "getDepartment", "getJobTitle$annotations", "getJobTitle", "getPhoneticCompanyName$annotations", "getPhoneticCompanyName", "getNote$annotations", "getNote", "isFavourite$annotations", "()Z", "getImage$annotations", "getImage", "getEmails$annotations", "getEmails", "()Ljava/util/List;", "getDates$annotations", "getDates", "getPhones$annotations", "getPhones", "getAddresses$annotations", "getAddresses", "getRelations$annotations", "getRelations", "getUrlAddresses$annotations", "getUrlAddresses", "getExtraNames$annotations", "getExtraNames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateContactRecord implements Record {
    private final List<AddressRecord.New> addresses;
    private final String company;
    private final List<DateRecord.New> dates;
    private final String department;
    private final List<EmailRecord.New> emails;
    private final List<ExtraNameRecord.New> extraNames;
    private final String familyName;
    private final String givenName;
    private final String image;
    private final boolean isFavourite;
    private final String jobTitle;
    private final String middleName;
    private final String note;
    private final List<PhoneRecord.New> phones;
    private final String phoneticCompanyName;
    private final String phoneticFamilyName;
    private final String phoneticGivenName;
    private final String phoneticMiddleName;
    private final String prefix;
    private final List<RelationRecord.New> relations;
    private final String suffix;
    private final List<UrlAddressRecord.New> urlAddresses;

    public CreateContactRecord() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateContactRecord copy$default(CreateContactRecord createContactRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z10, String str14, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, Object obj) {
        List list8;
        List list9;
        String str15 = (i10 & 1) != 0 ? createContactRecord.givenName : str;
        String str16 = (i10 & 2) != 0 ? createContactRecord.middleName : str2;
        String str17 = (i10 & 4) != 0 ? createContactRecord.familyName : str3;
        String str18 = (i10 & 8) != 0 ? createContactRecord.prefix : str4;
        String str19 = (i10 & 16) != 0 ? createContactRecord.suffix : str5;
        String str20 = (i10 & 32) != 0 ? createContactRecord.phoneticGivenName : str6;
        String str21 = (i10 & 64) != 0 ? createContactRecord.phoneticMiddleName : str7;
        String str22 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? createContactRecord.phoneticFamilyName : str8;
        String str23 = (i10 & 256) != 0 ? createContactRecord.company : str9;
        String str24 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? createContactRecord.department : str10;
        String str25 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? createContactRecord.jobTitle : str11;
        String str26 = (i10 & 2048) != 0 ? createContactRecord.phoneticCompanyName : str12;
        String str27 = (i10 & 4096) != 0 ? createContactRecord.note : str13;
        boolean z11 = (i10 & 8192) != 0 ? createContactRecord.isFavourite : z10;
        String str28 = str15;
        String str29 = (i10 & 16384) != 0 ? createContactRecord.image : str14;
        List list10 = (i10 & 32768) != 0 ? createContactRecord.emails : list;
        List list11 = (i10 & 65536) != 0 ? createContactRecord.dates : list2;
        List list12 = (i10 & 131072) != 0 ? createContactRecord.phones : list3;
        List list13 = (i10 & 262144) != 0 ? createContactRecord.addresses : list4;
        List list14 = (i10 & 524288) != 0 ? createContactRecord.relations : list5;
        List list15 = (i10 & 1048576) != 0 ? createContactRecord.urlAddresses : list6;
        if ((i10 & 2097152) != 0) {
            list9 = list15;
            list8 = createContactRecord.extraNames;
        } else {
            list8 = list7;
            list9 = list15;
        }
        return createContactRecord.copy(str28, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, z11, str29, list10, list11, list12, list13, list14, list9, list8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<EmailRecord.New> component16() {
        return this.emails;
    }

    public final List<DateRecord.New> component17() {
        return this.dates;
    }

    public final List<PhoneRecord.New> component18() {
        return this.phones;
    }

    public final List<AddressRecord.New> component19() {
        return this.addresses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    public final List<RelationRecord.New> component20() {
        return this.relations;
    }

    public final List<UrlAddressRecord.New> component21() {
        return this.urlAddresses;
    }

    public final List<ExtraNameRecord.New> component22() {
        return this.extraNames;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCompany() {
        return this.company;
    }

    public final CreateContactRecord copy(String givenName, String middleName, String familyName, String prefix, String suffix, String phoneticGivenName, String phoneticMiddleName, String phoneticFamilyName, String company, String department, String jobTitle, String phoneticCompanyName, String note, boolean isFavourite, String image, List<EmailRecord.New> emails, List<DateRecord.New> dates, List<PhoneRecord.New> phones, List<AddressRecord.New> addresses, List<RelationRecord.New> relations, List<UrlAddressRecord.New> urlAddresses, List<ExtraNameRecord.New> extraNames) {
        return new CreateContactRecord(givenName, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticCompanyName, note, isFavourite, image, emails, dates, phones, addresses, relations, urlAddresses, extraNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateContactRecord)) {
            return false;
        }
        CreateContactRecord createContactRecord = (CreateContactRecord) other;
        return AbstractC2855l.b(this.givenName, createContactRecord.givenName) && AbstractC2855l.b(this.middleName, createContactRecord.middleName) && AbstractC2855l.b(this.familyName, createContactRecord.familyName) && AbstractC2855l.b(this.prefix, createContactRecord.prefix) && AbstractC2855l.b(this.suffix, createContactRecord.suffix) && AbstractC2855l.b(this.phoneticGivenName, createContactRecord.phoneticGivenName) && AbstractC2855l.b(this.phoneticMiddleName, createContactRecord.phoneticMiddleName) && AbstractC2855l.b(this.phoneticFamilyName, createContactRecord.phoneticFamilyName) && AbstractC2855l.b(this.company, createContactRecord.company) && AbstractC2855l.b(this.department, createContactRecord.department) && AbstractC2855l.b(this.jobTitle, createContactRecord.jobTitle) && AbstractC2855l.b(this.phoneticCompanyName, createContactRecord.phoneticCompanyName) && AbstractC2855l.b(this.note, createContactRecord.note) && this.isFavourite == createContactRecord.isFavourite && AbstractC2855l.b(this.image, createContactRecord.image) && AbstractC2855l.b(this.emails, createContactRecord.emails) && AbstractC2855l.b(this.dates, createContactRecord.dates) && AbstractC2855l.b(this.phones, createContactRecord.phones) && AbstractC2855l.b(this.addresses, createContactRecord.addresses) && AbstractC2855l.b(this.relations, createContactRecord.relations) && AbstractC2855l.b(this.urlAddresses, createContactRecord.urlAddresses) && AbstractC2855l.b(this.extraNames, createContactRecord.extraNames);
    }

    public final List<AddressRecord.New> getAddresses() {
        return this.addresses;
    }

    public final String getCompany() {
        return this.company;
    }

    public final List<DateRecord.New> getDates() {
        return this.dates;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final List<EmailRecord.New> getEmails() {
        return this.emails;
    }

    public final List<ExtraNameRecord.New> getExtraNames() {
        return this.extraNames;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNote() {
        return this.note;
    }

    public final List<PhoneRecord.New> getPhones() {
        return this.phones;
    }

    public final String getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final String getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final String getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final List<RelationRecord.New> getRelations() {
        return this.relations;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final List<UrlAddressRecord.New> getUrlAddresses() {
        return this.urlAddresses;
    }

    public int hashCode() {
        String str = this.givenName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.familyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prefix;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.suffix;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneticGivenName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneticMiddleName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phoneticFamilyName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.company;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.department;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.jobTitle;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phoneticCompanyName;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.note;
        int iHashCode13 = (((iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Boolean.hashCode(this.isFavourite)) * 31;
        String str14 = this.image;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<EmailRecord.New> list = this.emails;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<DateRecord.New> list2 = this.dates;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhoneRecord.New> list3 = this.phones;
        int iHashCode17 = (iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AddressRecord.New> list4 = this.addresses;
        int iHashCode18 = (iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<RelationRecord.New> list5 = this.relations;
        int iHashCode19 = (iHashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<UrlAddressRecord.New> list6 = this.urlAddresses;
        int iHashCode20 = (iHashCode19 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ExtraNameRecord.New> list7 = this.extraNames;
        return iHashCode20 + (list7 != null ? list7.hashCode() : 0);
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public String toString() {
        return "CreateContactRecord(givenName=" + this.givenName + ", middleName=" + this.middleName + ", familyName=" + this.familyName + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", phoneticGivenName=" + this.phoneticGivenName + ", phoneticMiddleName=" + this.phoneticMiddleName + ", phoneticFamilyName=" + this.phoneticFamilyName + ", company=" + this.company + ", department=" + this.department + ", jobTitle=" + this.jobTitle + ", phoneticCompanyName=" + this.phoneticCompanyName + ", note=" + this.note + ", isFavourite=" + this.isFavourite + ", image=" + this.image + ", emails=" + this.emails + ", dates=" + this.dates + ", phones=" + this.phones + ", addresses=" + this.addresses + ", relations=" + this.relations + ", urlAddresses=" + this.urlAddresses + ", extraNames=" + this.extraNames + ")";
    }

    public CreateContactRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z10, String str14, List<EmailRecord.New> list, List<DateRecord.New> list2, List<PhoneRecord.New> list3, List<AddressRecord.New> list4, List<RelationRecord.New> list5, List<UrlAddressRecord.New> list6, List<ExtraNameRecord.New> list7) {
        this.givenName = str;
        this.middleName = str2;
        this.familyName = str3;
        this.prefix = str4;
        this.suffix = str5;
        this.phoneticGivenName = str6;
        this.phoneticMiddleName = str7;
        this.phoneticFamilyName = str8;
        this.company = str9;
        this.department = str10;
        this.jobTitle = str11;
        this.phoneticCompanyName = str12;
        this.note = str13;
        this.isFavourite = z10;
        this.image = str14;
        this.emails = list;
        this.dates = list2;
        this.phones = list3;
        this.addresses = list4;
        this.relations = list5;
        this.urlAddresses = list6;
        this.extraNames = list7;
    }

    @Field
    public static /* synthetic */ void getAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void getCompany$annotations() {
    }

    @Field
    public static /* synthetic */ void getDates$annotations() {
    }

    @Field
    public static /* synthetic */ void getDepartment$annotations() {
    }

    @Field
    public static /* synthetic */ void getEmails$annotations() {
    }

    @Field
    public static /* synthetic */ void getExtraNames$annotations() {
    }

    @Field
    public static /* synthetic */ void getFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getImage$annotations() {
    }

    @Field
    public static /* synthetic */ void getJobTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getNote$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhones$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticCompanyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPrefix$annotations() {
    }

    @Field
    public static /* synthetic */ void getRelations$annotations() {
    }

    @Field
    public static /* synthetic */ void getSuffix$annotations() {
    }

    @Field
    public static /* synthetic */ void getUrlAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void isFavourite$annotations() {
    }

    public /* synthetic */ CreateContactRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z10, String str14, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str11, (i10 & 2048) != 0 ? null : str12, (i10 & 4096) != 0 ? null : str13, (i10 & 8192) != 0 ? false : z10, (i10 & 16384) != 0 ? null : str14, (i10 & 32768) != 0 ? AbstractC2800q.j() : list, (i10 & 65536) != 0 ? AbstractC2800q.j() : list2, (i10 & 131072) != 0 ? AbstractC2800q.j() : list3, (i10 & 262144) != 0 ? AbstractC2800q.j() : list4, (i10 & 524288) != 0 ? AbstractC2800q.j() : list5, (i10 & 1048576) != 0 ? AbstractC2800q.j() : list6, (i10 & 2097152) != 0 ? AbstractC2800q.j() : list7);
    }
}
