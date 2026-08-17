.class public final Lexpo/modules/contacts/next/ContactFactory;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/ContactFactory;",
        "",
        "contactRepository",
        "Lexpo/modules/contacts/next/domain/ContactRepository;",
        "contactMapper",
        "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "photoPropertyMapper",
        "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;",
        "contactIntentDelegate",
        "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
        "<init>",
        "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;)V",
        "getContactRepository",
        "()Lexpo/modules/contacts/next/domain/ContactRepository;",
        "getContactMapper",
        "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;",
        "getPhotoPropertyMapper",
        "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;",
        "getContactIntentDelegate",
        "()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;",
        "create",
        "Lexpo/modules/contacts/next/Contact;",
        "contactId",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactId;",
        "create-kDnipiQ",
        "(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;",
        "contactIdString",
        "",
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
.field private final contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

.field private final contactMapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

.field private final contactRepository:Lexpo/modules/contacts/next/domain/ContactRepository;

.field private final photoPropertyMapper:Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;


# direct methods
.method public constructor <init>(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;)V
    .locals 1

    .line 1
    const-string v0, "contactRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contactMapper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "photoPropertyMapper"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "contactIntentDelegate"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lexpo/modules/contacts/next/ContactFactory;->contactRepository:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 25
    .line 26
    iput-object p2, p0, Lexpo/modules/contacts/next/ContactFactory;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 27
    .line 28
    iput-object p3, p0, Lexpo/modules/contacts/next/ContactFactory;->photoPropertyMapper:Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 29
    .line 30
    iput-object p4, p0, Lexpo/modules/contacts/next/ContactFactory;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;
    .locals 1

    .line 1
    const-string v0, "contactIdString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/ContactFactory;->create-kDnipiQ(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final create-kDnipiQ(Ljava/lang/String;)Lexpo/modules/contacts/next/Contact;
    .locals 8

    .line 1
    const-string v0, "contactId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lexpo/modules/contacts/next/Contact;

    .line 7
    .line 8
    iget-object v3, p0, Lexpo/modules/contacts/next/ContactFactory;->contactRepository:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 9
    .line 10
    iget-object v4, p0, Lexpo/modules/contacts/next/ContactFactory;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 11
    .line 12
    iget-object v5, p0, Lexpo/modules/contacts/next/ContactFactory;->photoPropertyMapper:Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 13
    .line 14
    iget-object v6, p0, Lexpo/modules/contacts/next/ContactFactory;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v2, p1

    .line 18
    invoke-direct/range {v1 .. v7}, Lexpo/modules/contacts/next/Contact;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final getContactIntentDelegate()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactFactory;->contactIntentDelegate:Lexpo/modules/contacts/next/intents/ContactIntentDelegate;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContactMapper()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactFactory;->contactMapper:Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContactRepository()Lexpo/modules/contacts/next/domain/ContactRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactFactory;->contactRepository:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhotoPropertyMapper()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/ContactFactory;->photoPropertyMapper:Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;

    .line 2
    .line 3
    return-object v0
.end method
