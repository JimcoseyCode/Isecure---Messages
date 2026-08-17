.class public final Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u001aJ\"\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001e0\u001d0\u001c2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 J\'\u0010\n\u001a\u0002H\"\"\u0008\u0008\u0000\u0010\"*\u00020\u0018\"\u0008\u0008\u0001\u0010#*\u00020\u001e2\u0006\u0010$\u001a\u0002H#\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\'2\u0006\u0010\u0010\u001a\u00020(J%\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008-\u0010.JM\u0010/\u001a\u0002002\u0006\u0010\u0010\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\u0008\u00102\u001a\u0004\u0018\u0001032\u0008\u00104\u001a\u0004\u0018\u0001032\u0008\u00105\u001a\u0004\u0018\u0001032\u0008\u00106\u001a\u0004\u0018\u000103\u00a2\u0006\u0004\u00087\u00108J\u0014\u00109\u001a\u0008\u0012\u0004\u0012\u00020:0\u001c2\u0006\u0010;\u001a\u00020(R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006<"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "",
        "imageByteArrayConverter",
        "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;",
        "<init>",
        "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V",
        "contactMapper",
        "Lexpo/modules/contacts/next/mappers/ContactMapper;",
        "getContactMapper",
        "()Lexpo/modules/contacts/next/mappers/ContactMapper;",
        "toRecord",
        "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;",
        "existingContact",
        "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/Appendable;",
        "record",
        "Lexpo/modules/contacts/next/records/NewRecord;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/Updatable;",
        "Lexpo/modules/contacts/next/records/ExistingRecord;",
        "toPatchable",
        "Lexpo/modules/contacts/next/records/PatchRecord;",
        "toExtractableFields",
        "",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField;",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "contactFields",
        "",
        "Lexpo/modules/contacts/next/records/fields/ContactField;",
        "TRecord",
        "TModel",
        "model",
        "(Lexpo/modules/contacts/next/domain/model/Extractable;)Lexpo/modules/contacts/next/records/ExistingRecord;",
        "toDomain",
        "Lexpo/modules/contacts/next/domain/model/contact/NewContact;",
        "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;",
        "toUpdateContact",
        "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "toUpdateContact-Z-oEY38",
        "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;",
        "toPatchContact",
        "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
        "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;",
        "structuredNameDataId",
        "Lexpo/modules/contacts/next/domain/wrappers/DataId;",
        "organizationDataId",
        "noteDataId",
        "photoDataId",
        "toPatchContact-k_3S2wM",
        "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;",
        "toContentValues",
        "Landroid/content/ContentValues;",
        "createContactRecord",
        "expo-contacts_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;


# direct methods
.method public constructor <init>(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V
    .locals 1

    .line 1
    const-string v0, "imageByteArrayConverter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;-><init>(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getContactMapper()Lexpo/modules/contacts/next/mappers/ContactMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 2

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rawContactId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 16
    .line 17
    check-cast p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 29
    .line 30
    check-cast p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/phone/operations/AppendablePhone;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 42
    .line 43
    check-cast p1, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 55
    .line 56
    check-cast p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    .line 57
    .line 58
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/nickname/operations/AppendableNickname;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 68
    .line 69
    check-cast p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    .line 70
    .line 71
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 81
    .line 82
    check-cast p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    .line 83
    .line 84
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/RelationRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 94
    .line 95
    check-cast p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    .line 96
    .line 97
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, LC7/d;->o()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v1, "Unsupported \'NewRecord\' type: "

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p2
.end method

.method public final toContentValues(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "createContactRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lj7/q;->c()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewStructuredName(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/NewStructuredName;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->getContentValues()Landroid/content/ContentValues;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewOrganization(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/organization/operations/NewOrganization;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->getCompany()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->getDepartment()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->getJobTitle()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-nez v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->getPhoneticName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->getContentValues()Landroid/content/ContentValues;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewNote(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/note/operations/NewNote;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/note/NoteModel;->getNote()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/note/NoteModel;->getContentValues()Landroid/content/ContentValues;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 80
    .line 81
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewPhoto(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/photo/operations/NewPhoto;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;->getPhoto()[B

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/model/photo/PhotoModel;->getContentValues()Landroid/content/ContentValues;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getEmails()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/16 v2, 0xa

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    new-instance v3, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_4

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    .line 130
    .line 131
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 132
    .line 133
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toNew(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;)Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->getContentValues()Landroid/content/ContentValues;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_4
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getPhones()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_7

    .line 153
    .line 154
    new-instance v3, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_6

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    .line 178
    .line 179
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 180
    .line 181
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toNew(Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;)Lexpo/modules/contacts/next/domain/model/phone/operations/NewPhone;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/phone/PhoneModel;->getContentValues()Landroid/content/ContentValues;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_6
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 194
    .line 195
    .line 196
    :cond_7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getDates()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-eqz v1, :cond_9

    .line 201
    .line 202
    new-instance v3, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_8

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    .line 226
    .line 227
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 228
    .line 229
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toNew(Lexpo/modules/contacts/next/records/fields/DateRecord$New;)Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/event/EventModel;->getContentValues()Landroid/content/ContentValues;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_8
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 242
    .line 243
    .line 244
    :cond_9
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getAddresses()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    new-instance v3, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_a

    .line 268
    .line 269
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    .line 274
    .line 275
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 276
    .line 277
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toNew(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getContentValues()Landroid/content/ContentValues;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_a
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 290
    .line 291
    .line 292
    :cond_b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getRelations()Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-eqz v1, :cond_d

    .line 297
    .line 298
    new-instance v3, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_c

    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    check-cast v4, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    .line 322
    .line 323
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 324
    .line 325
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toNew(Lexpo/modules/contacts/next/records/fields/RelationRecord$New;)Lexpo/modules/contacts/next/domain/model/relationship/operations/NewRelation;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/relationship/RelationModel;->getContentValues()Landroid/content/ContentValues;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_c
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 338
    .line 339
    .line 340
    :cond_d
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getUrlAddresses()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-eqz v1, :cond_f

    .line 345
    .line 346
    new-instance v3, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_e

    .line 364
    .line 365
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    check-cast v4, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    .line 370
    .line 371
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 372
    .line 373
    invoke-virtual {v5, v4}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toNew(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;)Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->getContentValues()Landroid/content/ContentValues;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_e
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 386
    .line 387
    .line 388
    :cond_f
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getExtraNames()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    if-eqz p1, :cond_11

    .line 393
    .line 394
    new-instance v1, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-static {p1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_10

    .line 412
    .line 413
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    .line 418
    .line 419
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 420
    .line 421
    invoke-virtual {v3, v2}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toNew(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;)Lexpo/modules/contacts/next/domain/model/nickname/operations/NewNickname;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v2}, Lexpo/modules/contacts/next/domain/model/nickname/NicknameModel;->getContentValues()Landroid/content/ContentValues;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_10
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 434
    .line 435
    .line 436
    :cond_11
    invoke-static {v0}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    return-object p1
.end method

.method public final toDomain(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/contact/NewContact;
    .locals 6

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lj7/q;->c()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewStructuredName(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/NewStructuredName;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewOrganization(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/organization/operations/NewOrganization;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewNote(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/note/operations/NewNote;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toNewPhoto(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;)Lexpo/modules/contacts/next/domain/model/photo/operations/NewPhoto;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getEmails()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/16 v2, 0xa

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 55
    .line 56
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_0

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    .line 80
    .line 81
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toNew(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;)Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getPhones()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_3

    .line 97
    .line 98
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 99
    .line 100
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    .line 124
    .line 125
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toNew(Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;)Lexpo/modules/contacts/next/domain/model/phone/operations/NewPhone;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    .line 135
    .line 136
    :cond_3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getDates()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 143
    .line 144
    new-instance v4, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_4

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    check-cast v5, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    .line 168
    .line 169
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toNew(Lexpo/modules/contacts/next/records/fields/DateRecord$New;)Lexpo/modules/contacts/next/domain/model/event/operations/NewEvent;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 178
    .line 179
    .line 180
    :cond_5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getExtraNames()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-eqz v1, :cond_7

    .line 185
    .line 186
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 187
    .line 188
    new-instance v4, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-eqz v5, :cond_6

    .line 206
    .line 207
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    check-cast v5, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    .line 212
    .line 213
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toNew(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;)Lexpo/modules/contacts/next/domain/model/nickname/operations/NewNickname;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_6
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 222
    .line 223
    .line 224
    :cond_7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getAddresses()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-eqz v1, :cond_9

    .line 229
    .line 230
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 231
    .line 232
    new-instance v4, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_8

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    .line 256
    .line 257
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toNew(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 266
    .line 267
    .line 268
    :cond_9
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getRelations()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    if-eqz v1, :cond_b

    .line 273
    .line 274
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 275
    .line 276
    new-instance v4, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_a

    .line 294
    .line 295
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    check-cast v5, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    .line 300
    .line 301
    invoke-virtual {v3, v5}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toNew(Lexpo/modules/contacts/next/records/fields/RelationRecord$New;)Lexpo/modules/contacts/next/domain/model/relationship/operations/NewRelation;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_a
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 310
    .line 311
    .line 312
    :cond_b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getUrlAddresses()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    if-eqz v1, :cond_d

    .line 317
    .line 318
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 319
    .line 320
    new-instance v4, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_c

    .line 338
    .line 339
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    .line 344
    .line 345
    invoke-virtual {v3, v2}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toNew(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;)Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_c
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 354
    .line 355
    .line 356
    :cond_d
    invoke-static {v0}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    new-instance v1, Lexpo/modules/contacts/next/domain/model/contact/NewContact;

    .line 361
    .line 362
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->isFavourite()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;->constructor-impl(I)I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    const/4 v2, 0x0

    .line 371
    invoke-direct {v1, p1, v0, v2}, Lexpo/modules/contacts/next/domain/model/contact/NewContact;-><init>(ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 372
    .line 373
    .line 374
    return-object v1
.end method

.method public final toExtractableFields(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lexpo/modules/contacts/next/records/fields/ContactField;",
            ">;)",
            "Ljava/util/List<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/Extractable;",
            ">;>;"
        }
    .end annotation

    .line 1
    const-string v0, "contactFields"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lexpo/modules/contacts/next/records/fields/ContactField;

    .line 26
    .line 27
    sget-object v2, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    aget v1, v2, v1

    .line 34
    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    new-instance p1, Li7/m;

    .line 39
    .line 40
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :pswitch_0
    const/4 v1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :pswitch_1
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/DisplayNameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/DisplayNameField;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :pswitch_2
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUriField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUriField;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_3
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/PhotoUriField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/PhotoUriField;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_4
    sget-object v1, Lexpo/modules/contacts/next/domain/model/note/NoteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/note/NoteField;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_5
    sget-object v1, Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_6
    sget-object v1, Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_7
    sget-object v1, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :pswitch_8
    sget-object v1, Lexpo/modules/contacts/next/domain/model/relationship/RelationField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationField;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :pswitch_9
    sget-object v1, Lexpo/modules/contacts/next/domain/model/event/EventField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/event/EventField;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_a
    sget-object v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_b
    sget-object v1, Lexpo/modules/contacts/next/domain/model/phone/PhoneField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneField;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_c
    sget-object v1, Lexpo/modules/contacts/next/domain/model/email/EmailField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/email/EmailField;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :pswitch_d
    sget-object v1, Lexpo/modules/contacts/next/domain/model/organization/OrganizationField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/organization/OrganizationField;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_e
    sget-object v1, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameField;

    .line 86
    .line 87
    :goto_1
    if-eqz v1, :cond_0

    .line 88
    .line 89
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    return-object v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final toPatchContact-k_3S2wM(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;
    .locals 3

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p2, p0, v1}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    invoke-static {p1}, Lexpo/modules/contacts/next/mappers/IsChangingAnythingKt;->isChangingStructuredName(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p4, :cond_0

    .line 3
    iget-object v2, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {v2, p1, p4}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toPatchStructuredName-JtfS1E8(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    goto :goto_0

    .line 4
    :cond_0
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p2}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendableStructuredName-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withAppendable(Lexpo/modules/contacts/next/domain/model/Appendable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    .line 5
    :cond_1
    :goto_0
    invoke-static {p1}, Lexpo/modules/contacts/next/mappers/IsChangingAnythingKt;->isChangingOrganization(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;)Z

    move-result p4

    if-eqz p4, :cond_3

    if-eqz p5, :cond_2

    .line 6
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p5}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toPatchOrganization-JtfS1E8(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    goto :goto_1

    .line 7
    :cond_2
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p2}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendableOrganization-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withAppendable(Lexpo/modules/contacts/next/domain/model/Appendable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    .line 8
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getNote()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p4

    invoke-interface {p4}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-nez p4, :cond_5

    if-eqz p6, :cond_4

    .line 9
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p6}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toPatchNote-JtfS1E8(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    goto :goto_2

    .line 10
    :cond_4
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p2}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendableNote-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;

    move-result-object p4

    invoke-virtual {v0, p4}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withAppendable(Lexpo/modules/contacts/next/domain/model/Appendable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    .line 11
    :cond_5
    :goto_2
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getImage()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p4

    invoke-interface {p4}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-nez p4, :cond_7

    if-eqz p7, :cond_6

    .line 12
    iget-object p2, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p2, p1, p7}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toPatchPhoto-JtfS1E8(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/PatchPhoto;

    move-result-object p2

    invoke-virtual {v0, p2}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    goto :goto_3

    .line 13
    :cond_6
    iget-object p4, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {p4, p1, p2}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendablePhoto-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;

    move-result-object p2

    invoke-virtual {v0, p2}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withAppendable(Lexpo/modules/contacts/next/domain/model/Appendable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    .line 14
    :cond_7
    :goto_3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->isFavourite()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p2

    if-nez p2, :cond_8

    .line 15
    new-instance p2, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->isFavourite()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p4

    invoke-direct {p2, p3, p4, v1}, Lexpo/modules/contacts/next/domain/model/headers/starred/PatchStarred;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p2}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->withUpdatable(Lexpo/modules/contacts/next/domain/model/Updatable;)Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;

    .line 16
    :cond_8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getEmails()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/email/EmailField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/email/EmailField;

    .line 17
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    const/16 p5, 0xa

    if-eqz p4, :cond_9

    goto/16 :goto_b

    .line 18
    :cond_9
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_a

    goto/16 :goto_b

    .line 19
    :cond_a
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_b

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 21
    :cond_b
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;

    if-eqz p6, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 24
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 25
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_c

    .line 26
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 27
    :cond_c
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 28
    :cond_d
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 30
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_e

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 32
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 33
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 34
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 35
    :cond_e
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_6
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_f

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 37
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 38
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 39
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 40
    :cond_f
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_7
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_10

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 41
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 42
    :cond_10
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_11

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 44
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 45
    const-class p6, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 46
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 47
    :cond_11
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_9
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_12

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 49
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 50
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 51
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 52
    :cond_12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_13

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 53
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 54
    :cond_13
    sget-object p2, Li7/B;->a:Li7/B;

    .line 55
    :goto_b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getPhones()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/phone/PhoneField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/phone/PhoneField;

    .line 56
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-eqz p4, :cond_14

    goto/16 :goto_13

    .line 57
    :cond_14
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_15

    goto/16 :goto_13

    .line 58
    :cond_15
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_16

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 60
    :cond_16
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;

    if-eqz p6, :cond_18

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 63
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 64
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_17

    .line 65
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 66
    :cond_17
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 67
    :cond_18
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 69
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_19

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 71
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 72
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 73
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 74
    :cond_19
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_e
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_1a

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 76
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 77
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 78
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 79
    :cond_1a
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_f
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 80
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 81
    :cond_1b
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_10
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 83
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 84
    const-class p6, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 85
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 86
    :cond_1c
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_11
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1d

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 88
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 89
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 90
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 91
    :cond_1d
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_12
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 92
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 93
    :cond_1e
    sget-object p2, Li7/B;->a:Li7/B;

    .line 94
    :goto_13
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getDates()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/event/EventField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/event/EventField;

    .line 95
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-eqz p4, :cond_1f

    goto/16 :goto_1b

    .line 96
    :cond_1f
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_20

    goto/16 :goto_1b

    .line 97
    :cond_20
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_21

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 99
    :cond_21
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 100
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 101
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_14
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;

    if-eqz p6, :cond_23

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 102
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 103
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_22

    .line 104
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 105
    :cond_22
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 106
    :cond_23
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 108
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_15
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_24

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 110
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 111
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 112
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 113
    :cond_24
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_16
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_25

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 115
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 116
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 117
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    .line 118
    :cond_25
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_17
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_26

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 119
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_17

    .line 120
    :cond_26
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_18
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_27

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 122
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 123
    const-class p6, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 124
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 125
    :cond_27
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_19
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_28

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 127
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 128
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 129
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    .line 130
    :cond_28
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_29

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 131
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    .line 132
    :cond_29
    sget-object p2, Li7/B;->a:Li7/B;

    .line 133
    :goto_1b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getExtraNames()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/nickname/NicknameField;

    .line 134
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-eqz p4, :cond_2a

    goto/16 :goto_23

    .line 135
    :cond_2a
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_2b

    goto/16 :goto_23

    .line 136
    :cond_2b
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 137
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2c

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 138
    :cond_2c
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 139
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 140
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;

    if-eqz p6, :cond_2e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 141
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 142
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_2d

    .line 143
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 144
    :cond_2d
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 145
    :cond_2e
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 147
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_2f

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 149
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 150
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 151
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 152
    :cond_2f
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_1e
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_30

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 154
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 155
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 156
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    .line 157
    :cond_30
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1f
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_31

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 158
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    .line 159
    :cond_31
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_20
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_32

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 161
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 162
    const-class p6, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 163
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 164
    :cond_32
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_21
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_33

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 166
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 167
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 168
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 169
    :cond_33
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_22
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_34

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 170
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 171
    :cond_34
    sget-object p2, Li7/B;->a:Li7/B;

    .line 172
    :goto_23
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getAddresses()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    .line 173
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-eqz p4, :cond_35

    goto/16 :goto_2b

    .line 174
    :cond_35
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_36

    goto/16 :goto_2b

    .line 175
    :cond_36
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 176
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_37

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 177
    :cond_37
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 178
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 179
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_24
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;

    if-eqz p6, :cond_39

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 180
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 181
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_38

    .line 182
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 183
    :cond_38
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 184
    :cond_39
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 186
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_25
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_3a

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 188
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 189
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 190
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 191
    :cond_3a
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 192
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_26
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_3b

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 193
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 194
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 195
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_26

    .line 196
    :cond_3b
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_27
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3c

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 197
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    .line 198
    :cond_3c
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 199
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_28
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 200
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 201
    const-class p6, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 202
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_28

    .line 203
    :cond_3d
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_29
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3e

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 205
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 206
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 207
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_29

    .line 208
    :cond_3e
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 209
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2a

    .line 210
    :cond_3f
    sget-object p2, Li7/B;->a:Li7/B;

    .line 211
    :goto_2b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getRelations()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p2

    sget-object p3, Lexpo/modules/contacts/next/domain/model/relationship/RelationField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/relationship/RelationField;

    .line 212
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p4

    if-eqz p4, :cond_40

    goto/16 :goto_33

    .line 213
    :cond_40
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_41

    goto/16 :goto_33

    .line 214
    :cond_41
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 215
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_42

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p2

    .line 216
    :cond_42
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 217
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 218
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const-class p7, Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;

    if-eqz p6, :cond_44

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 219
    move-object v1, p6

    check-cast v1, Lexpo/modules/kotlin/types/Either;

    .line 220
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {v1, p7}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p7

    if-eqz p7, :cond_43

    .line 221
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    .line 222
    :cond_43
    invoke-virtual {p4, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    .line 223
    :cond_44
    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p3, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 225
    new-instance p4, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p4, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 226
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2d
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_45

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 227
    check-cast p6, Lexpo/modules/kotlin/types/Either;

    .line 228
    invoke-static {p7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-virtual {p6, v1}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 229
    invoke-interface {p4, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    .line 230
    :cond_45
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p4, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p6

    invoke-direct {p3, p6}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2e
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_46

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    .line 232
    check-cast p6, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 233
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p7

    invoke-virtual {p7, p6}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p6

    .line 234
    invoke-interface {p3, p6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2e

    .line 235
    :cond_46
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2f
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_47

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 236
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p6

    invoke-interface {p6, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2f

    .line 237
    :cond_47
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_30
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_48

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 239
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 240
    const-class p6, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p4, p6}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 241
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_30

    .line 242
    :cond_48
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_31
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_49

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 244
    check-cast p4, Lexpo/modules/contacts/next/records/NewRecord;

    .line 245
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p6, p4, p7}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p4

    .line 246
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_31

    .line 247
    :cond_49
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_32
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 248
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_32

    .line 249
    :cond_4a
    sget-object p2, Li7/B;->a:Li7/B;

    .line 250
    :goto_33
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/PatchContactRecord;->getUrlAddresses()Lexpo/modules/kotlin/types/ValueOrUndefined;

    move-result-object p1

    sget-object p2, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    .line 251
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p3

    if-eqz p3, :cond_4b

    goto/16 :goto_3b

    .line 252
    :cond_4b
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_4c

    goto/16 :goto_3b

    .line 253
    :cond_4c
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getModifiedFields()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 254
    invoke-interface {p1}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4d

    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    move-result-object p1

    .line 255
    :cond_4d
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 256
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 257
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_34
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    const-class p6, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;

    if-eqz p4, :cond_4f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 258
    move-object p7, p4

    check-cast p7, Lexpo/modules/kotlin/types/Either;

    .line 259
    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p6

    invoke-virtual {p7, p6}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    move-result p6

    if-eqz p6, :cond_4e

    .line 260
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_34

    .line 261
    :cond_4e
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_34

    .line 262
    :cond_4f
    new-instance p1, Lkotlin/Pair;

    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 264
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 265
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_35
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_50

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 266
    check-cast p4, Lexpo/modules/kotlin/types/Either;

    .line 267
    invoke-static {p6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p7

    invoke-virtual {p4, p7}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 268
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_35

    .line 269
    :cond_50
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p3, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 270
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_36
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_51

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 271
    check-cast p4, Lexpo/modules/contacts/next/records/PatchRecord;

    .line 272
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p6

    invoke-virtual {p6, p4}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;

    move-result-object p4

    .line 273
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_36

    .line 274
    :cond_51
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_37
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_52

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/domain/model/Updatable;

    .line 275
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToUpdate()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_37

    .line 276
    :cond_52
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_38
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_53

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 278
    check-cast p3, Lexpo/modules/kotlin/types/Either;

    .line 279
    const-class p4, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    invoke-static {p4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object p4

    invoke-virtual {p3, p4}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lexpo/modules/contacts/next/records/NewRecord;

    .line 280
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_38

    .line 281
    :cond_53
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p2, p5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 282
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_39
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_54

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 283
    check-cast p3, Lexpo/modules/contacts/next/records/NewRecord;

    .line 284
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    move-result-object p4

    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getRawContactId-WW_a-ig()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p4, p3, p5}, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;

    move-result-object p3

    .line 285
    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_39

    .line 286
    :cond_54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_55

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/contacts/next/domain/model/Appendable;

    .line 287
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->getToAppend()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    .line 288
    :cond_55
    sget-object p1, Li7/B;->a:Li7/B;

    .line 289
    :goto_3b
    invoke-virtual {v0}, Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;->build()Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;

    move-result-object p1

    return-object p1
.end method

.method public final toPatchable(Lexpo/modules/contacts/next/records/PatchRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;
    .locals 3

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 11
    .line 12
    check-cast p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;)Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 24
    .line 25
    check-cast p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;)Lexpo/modules/contacts/next/domain/model/phone/operations/PatchPhone;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 37
    .line 38
    check-cast p1, Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;)Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 50
    .line 51
    check-cast p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;)Lexpo/modules/contacts/next/domain/model/nickname/operations/PatchNickname;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 63
    .line 64
    check-cast p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 76
    .line 77
    check-cast p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;)Lexpo/modules/contacts/next/domain/model/relationship/operations/PatchRelation;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 89
    .line 90
    check-cast p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toPatch(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;)Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, LC7/d;->o()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v2, "Unsupported \'PatchRecord\' type: "

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0
.end method

.method public final toRecord(Lexpo/modules/contacts/next/domain/model/Extractable;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TRecord::",
            "Lexpo/modules/contacts/next/records/ExistingRecord;",
            "TModel::",
            "Lexpo/modules/contacts/next/domain/model/Extractable;",
            ">(TTModel;)TTRecord;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    if-eqz v0, :cond_0

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toDto(Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;)Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;

    if-eqz v0, :cond_1

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toDto(Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;)Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    if-eqz v0, :cond_2

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toDto(Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;)Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;

    if-eqz v0, :cond_3

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toDto(Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;)Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    if-eqz v0, :cond_4

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toDto(Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;)Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 7
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;

    if-eqz v0, :cond_5

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toDto(Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;)Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    if-eqz v0, :cond_6

    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    check-cast p1, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toDto(Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;)Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    move-result-object p1

    :goto_0
    const-string v0, "null cannot be cast to non-null type TRecord of expo.modules.contacts.next.mappers.ContactRecordDomainMapper.toRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 9
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported model type for mapping to record"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toRecord(Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;)Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;
    .locals 1

    const-string v0, "existingContact"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;)Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;

    move-result-object p1

    return-object p1
.end method

.method public final toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable;
    .locals 3

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 11
    .line 12
    check-cast p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;)Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 24
    .line 25
    check-cast p1, Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;)Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_1
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 37
    .line 38
    check-cast p1, Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;)Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_2
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 50
    .line 51
    check-cast p1, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;)Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_3
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 63
    .line 64
    check-cast p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_4
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 76
    .line 77
    check-cast p1, Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;)Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1

    .line 84
    :cond_5
    instance-of v0, p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 89
    .line 90
    check-cast p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, LC7/d;->o()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v2, "Unsupported \'ExistingRecord\' type: "

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0
.end method

.method public final toUpdateContact-Z-oEY38(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;
    .locals 7

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contactId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rawContactId"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lj7/q;->c()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 21
    .line 22
    invoke-virtual {v1, p1, p3}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendableStructuredName-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p3}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendableOrganization-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v1, Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;

    .line 39
    .line 40
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getNote()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v1, p3, v2, v3}, Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactMapper;

    .line 52
    .line 53
    invoke-virtual {v1, p1, p3}, Lexpo/modules/contacts/next/mappers/ContactMapper;->toAppendablePhoto-MYK5hZQ(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getEmails()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/16 v2, 0xa

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    new-instance v4, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_0

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    .line 92
    .line 93
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 94
    .line 95
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 104
    .line 105
    .line 106
    :cond_1
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getPhones()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    new-instance v4, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_2

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;

    .line 136
    .line 137
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;

    .line 138
    .line 139
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/PhoneMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/phone/operations/AppendablePhone;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 148
    .line 149
    .line 150
    :cond_3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getDates()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    if-eqz v1, :cond_5

    .line 155
    .line 156
    new-instance v4, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_4

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    check-cast v5, Lexpo/modules/contacts/next/records/fields/DateRecord$New;

    .line 180
    .line 181
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;

    .line 182
    .line 183
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/EventMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/DateRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/event/operations/AppendableEvent;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_4
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 192
    .line 193
    .line 194
    :cond_5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getExtraNames()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    if-eqz v1, :cond_7

    .line 199
    .line 200
    new-instance v4, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-eqz v5, :cond_6

    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    check-cast v5, Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;

    .line 224
    .line 225
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;

    .line 226
    .line 227
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/NicknameMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/nickname/operations/AppendableNickname;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_6
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 236
    .line 237
    .line 238
    :cond_7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getAddresses()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    if-eqz v1, :cond_9

    .line 243
    .line 244
    new-instance v4, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_8

    .line 262
    .line 263
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    check-cast v5, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    .line 268
    .line 269
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 270
    .line 271
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_8
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 280
    .line 281
    .line 282
    :cond_9
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getRelations()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    if-eqz v1, :cond_b

    .line 287
    .line 288
    new-instance v4, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_a

    .line 306
    .line 307
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    check-cast v5, Lexpo/modules/contacts/next/records/fields/RelationRecord$New;

    .line 312
    .line 313
    sget-object v6, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;

    .line 314
    .line 315
    invoke-virtual {v6, v5, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/RelationMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/RelationRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/relationship/operations/AppendableRelation;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_a
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 324
    .line 325
    .line 326
    :cond_b
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->getUrlAddresses()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    if-eqz v1, :cond_d

    .line 331
    .line 332
    new-instance v4, Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_c

    .line 350
    .line 351
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    .line 356
    .line 357
    sget-object v5, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 358
    .line 359
    invoke-virtual {v5, v2, p3}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_c
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 368
    .line 369
    .line 370
    :cond_d
    invoke-static {v0}, Lj7/q;->a(Ljava/util/List;)Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    new-instance v1, Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;

    .line 375
    .line 376
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/contact/CreateContactRecord;->isFavourite()Z

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    invoke-direct {v1, p2, p1, v3}, Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;-><init>(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 381
    .line 382
    .line 383
    new-instance p1, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;

    .line 384
    .line 385
    invoke-direct {p1, p3, v1, v0, v3}, Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/starred/ExistingStarred;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 386
    .line 387
    .line 388
    return-object p1
.end method
