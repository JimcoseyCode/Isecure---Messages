.class public final Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;
.super Lexpo/modules/contacts/next/services/properties/ContactsProperty;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TDomain::",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "TDto:",
        "Ljava/lang/Object;",
        ">",
        "Lexpo/modules/contacts/next/services/properties/ContactsProperty<",
        "TTDomain;TTDto;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0004\u0008\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;",
        "Lexpo/modules/contacts/next/domain/model/Extractable;",
        "TDomain",
        "TDto",
        "Lexpo/modules/contacts/next/services/properties/ContactsProperty;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;",
        "field",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;",
        "mapper",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "repository",
        "<init>",
        "(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "value",
        "",
        "set",
        "(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;",
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
.field private final mapper:Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper<",
            "TTDomain;TTDto;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts<",
            "TTDomain;>;",
            "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper<",
            "TTDomain;TTDto;>;",
            "Ljava/lang/String;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            ")V"
        }
    .end annotation

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contactId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 2
    invoke-direct/range {v1 .. v6}, Lexpo/modules/contacts/next/services/properties/ContactsProperty;-><init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v3, v1, Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;->mapper:Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;

    return-void
.end method

.method public synthetic constructor <init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;-><init>(Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;)V

    return-void
.end method


# virtual methods
.method public final set(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTDto;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;->mapper:Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/ContactsProperty;->getContactId-S9XCBSM()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1, p1}, Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;->toUpdatable-D2TBaGg(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Contacts;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lexpo/modules/contacts/next/services/properties/ContactsProperty;->getRepository()Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository;->update(Lexpo/modules/contacts/next/domain/model/Updatable;Ln7/f;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
