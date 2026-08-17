.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;",
        "<init>",
        "()V",
        "toNew",
        "Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;",
        "record",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;",
        "newValue",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;",
        "toUpdatable",
        "toPatch",
        "Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;",
        "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;",
        "toDto",
        "model",
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


# static fields
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;
    .locals 3

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    move-result-object p1

    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p2, v1, p1, v2}, Lexpo/modules/contacts/next/domain/model/website/operations/AppendableWebsite;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toDto(Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;)Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;)Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;
    .locals 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;->getDataId-sXKVoX8()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->getLabel()Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    move-result-object v3

    invoke-virtual {v2, v3}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->getUrl()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toNew(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;)Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;
    .locals 3

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;->getUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;

    .line 13
    .line 14
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;->getLabel()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v0, v1, p1}, Lexpo/modules/contacts/next/domain/model/website/operations/NewWebsite;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final toPatch(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;)Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;
    .locals 4

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;->getId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;->getUrl()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;

    .line 21
    .line 22
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;->getLabel()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->toDomain(Lexpo/modules/kotlin/types/ValueOrUndefined;)Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/website/operations/PatchWebsite;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public bridge synthetic toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/WebsiteMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable(Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;
    .locals 4

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;->getUrl()Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/WebsiteLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    move-result-object p1

    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
