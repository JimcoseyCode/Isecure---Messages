.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0003H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;",
        "<init>",
        "()V",
        "toNew",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;",
        "record",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;",
        "newValue",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;",
        "toUpdatable",
        "toPatch",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;",
        "Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;

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
    check-cast p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;
    .locals 10

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getStreet()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getCity()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getRegion()Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getPostcode()Ljava/lang/String;

    move-result-object v6

    .line 7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getCountry()Ljava/lang/String;

    move-result-object v7

    .line 8
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    move-result-object v8

    const/4 v9, 0x0

    move-object v2, p2

    .line 9
    invoke-direct/range {v1 .. v9}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/AppendableStructuredPostal;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toDto(Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;)Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;)Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;
    .locals 9

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;->getDataId-sXKVoX8()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getStreet()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getCity()Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getRegion()Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getPostcode()Ljava/lang/String;

    move-result-object v7

    .line 7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getCountry()Ljava/lang/String;

    move-result-object v8

    .line 8
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->getLabel()Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    move-result-object p1

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)Ljava/lang/String;

    move-result-object v3

    .line 9
    new-instance v1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    invoke-direct/range {v1 .. v8}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final toNew(Lexpo/modules/contacts/next/records/fields/AddressRecord$New;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;
    .locals 8

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getStreet()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getCity()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getRegion()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getPostcode()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getCountry()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;

    .line 29
    .line 30
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$New;->getLabel()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-direct/range {v1 .. v7}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/NewStructuredPostal;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V

    .line 39
    .line 40
    .line 41
    return-object v1
.end method

.method public final toPatch(Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;
    .locals 10

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getStreet()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getCity()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getRegion()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getPostcode()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getCountry()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;

    .line 37
    .line 38
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;->getLabel()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->toDomain(Lexpo/modules/kotlin/types/ValueOrUndefined;)Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-direct/range {v1 .. v9}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/PatchStructuredPostal;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    return-object v1
.end method

.method public bridge synthetic toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/StructuredPostalMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable(Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;
    .locals 10

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getStreet()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getCity()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getRegion()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getPostcode()Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getCountry()Ljava/lang/String;

    move-result-object v7

    .line 9
    sget-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/StructuredPostalLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    move-result-object v8

    const/4 v9, 0x0

    .line 10
    invoke-direct/range {v1 .. v9}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
