.class public final Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000cJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;",
        "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;",
        "<init>",
        "()V",
        "toNew",
        "Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;",
        "record",
        "toPatch",
        "Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;",
        "Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;",
        "newValue",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;",
        "toUpdatable",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;

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
    check-cast p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;
    .locals 3

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;->getAddress()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    move-result-object p1

    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p2, v1, p1, v2}, Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Lexpo/modules/contacts/next/records/ExistingRecord;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toDto(Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;)Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;)Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;
    .locals 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;->getDataId-sXKVoX8()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->getLabel()Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    move-result-object v3

    invoke-virtual {v2, v3}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->toRecord(Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->getAddress()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toNew(Lexpo/modules/contacts/next/records/fields/EmailRecord$New;)Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;
    .locals 3

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;->getAddress()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;

    .line 13
    .line 14
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$New;->getLabel()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v2, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v0, v1, p1}, Lexpo/modules/contacts/next/domain/model/email/operations/NewEmail;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final toPatch(Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;)Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;
    .locals 4

    .line 1
    const-string v0, "record"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;

    .line 7
    .line 8
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;->getId()Ljava/lang/String;

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
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;->getAddress()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;

    .line 21
    .line 22
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;->getLabel()Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->toDomain(Lexpo/modules/kotlin/types/ValueOrUndefined;)Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/email/operations/PatchEmail;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public bridge synthetic toUpdatable(Lexpo/modules/contacts/next/records/ExistingRecord;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/EmailMapper;->toUpdatable(Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;)Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable(Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;)Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;
    .locals 4

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;

    .line 3
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;

    invoke-virtual {p1}, Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;->getLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lexpo/modules/contacts/next/mappers/domain/data/list/label/EmailLabelMapper;->toDomain(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    move-result-object p1

    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
