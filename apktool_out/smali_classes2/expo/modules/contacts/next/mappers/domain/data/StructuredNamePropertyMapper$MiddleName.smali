.class public final Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MiddleName"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper<",
        "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;",
        "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;",
        "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;",
        "",
        "<init>",
        "()V",
        "toDto",
        "model",
        "toUpdatable",
        "Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;",
        "dataId",
        "Lexpo/modules/contacts/next/domain/wrappers/DataId;",
        "newValue",
        "toUpdatable-bM46d30",
        "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;",
        "toAppendable",
        "Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;",
        "rawContactId",
        "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;",
        "toAppendable-MYK5hZQ",
        "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;->INSTANCE:Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;

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
.method public bridge synthetic toAppendable-MYK5hZQ(Ljava/lang/Object;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;->toAppendable-MYK5hZQ(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;

    move-result-object p1

    return-object p1
.end method

.method public toAppendable-MYK5hZQ(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;
    .locals 13

    const-string v0, "rawContactId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;

    const/16 v11, 0x1fa

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v12}, Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public bridge synthetic toDto(Lexpo/modules/contacts/next/domain/model/Extractable$Data;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;

    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;->toDto(Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toDto(Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;)Ljava/lang/String;
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->getMiddleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/Object;)Lexpo/modules/contacts/next/domain/model/Updatable$Data;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/mappers/domain/data/StructuredNamePropertyMapper$MiddleName;->toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;

    move-result-object p1

    return-object p1
.end method

.method public toUpdatable-bM46d30(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;
    .locals 13

    const-string v0, "dataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;

    new-instance v4, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;

    invoke-direct {v4, p2}, Lexpo/modules/kotlin/types/ValueOrUndefined$Value;-><init>(Ljava/lang/Object;)V

    const/16 v11, 0x1fa

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
