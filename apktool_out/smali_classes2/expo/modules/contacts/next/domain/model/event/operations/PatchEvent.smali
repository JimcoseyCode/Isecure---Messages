.class public final Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;
.super Lexpo/modules/contacts/next/domain/model/event/EventModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/Updatable$Data;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;",
        "Lexpo/modules/contacts/next/domain/model/event/EventModel;",
        "Lexpo/modules/contacts/next/domain/model/Updatable$Data;",
        "dataId",
        "Lexpo/modules/contacts/next/domain/wrappers/DataId;",
        "startDate",
        "Lexpo/modules/kotlin/types/ValueOrUndefined;",
        "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;",
        "label",
        "Lexpo/modules/contacts/next/domain/model/event/EventLabel;",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getDataId-sXKVoX8",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "contentValues",
        "Landroid/content/ContentValues;",
        "getContentValues",
        "()Landroid/content/ContentValues;",
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
.field private final contentValues:Landroid/content/ContentValues;

.field private final dataId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;",
            ">;",
            "Lexpo/modules/kotlin/types/ValueOrUndefined<",
            "Lexpo/modules/contacts/next/domain/model/event/EventLabel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dataId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->unbox-impl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-interface {p3}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    if-nez v2, :cond_1

    new-instance v2, Lexpo/modules/contacts/next/domain/model/event/EventLabel$Custom;

    const-string v3, "other"

    invoke-direct {v2, v3}, Lexpo/modules/contacts/next/domain/model/event/EventLabel$Custom;-><init>(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, v0, v2, v1}, Lexpo/modules/contacts/next/domain/model/event/EventModel;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/event/EventLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;->dataId:Ljava/lang/String;

    .line 10
    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    .line 11
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result v0

    if-nez v0, :cond_4

    .line 12
    invoke-interface {p2}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/wrappers/ContactDate;->unbox-impl()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_3

    move-object p2, v1

    :cond_3
    const-string v0, "data1"

    invoke-virtual {p1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    :cond_4
    invoke-interface {p3}, Lexpo/modules/kotlin/types/ValueOrUndefined;->isUndefined()Z

    move-result p2

    if-nez p2, :cond_7

    .line 14
    invoke-interface {p3}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->getType()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v1

    :goto_2
    const-string v0, "data2"

    invoke-virtual {p1, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 15
    invoke-interface {p3}, Lexpo/modules/kotlin/types/ValueOrUndefined;->getOptional()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lexpo/modules/contacts/next/domain/model/event/EventLabel;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/event/EventLabel;->getLabel()Ljava/lang/String;

    move-result-object v1

    :cond_6
    const-string p2, "data3"

    invoke-virtual {p1, p2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_7
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;->contentValues:Landroid/content/ContentValues;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    .line 2
    const-string v0, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>"

    if-eqz p5, :cond_0

    .line 3
    sget-object p2, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    .line 4
    sget-object p2, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 5
    sget-object p3, Lexpo/modules/kotlin/types/ValueOrUndefined;->Companion:Lexpo/modules/kotlin/types/ValueOrUndefined$Companion;

    .line 6
    sget-object p3, Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;->INSTANCE:Lexpo/modules/kotlin/types/ValueOrUndefined$Undefined;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    const/4 p4, 0x0

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;)V

    return-void
.end method


# virtual methods
.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDataId-sXKVoX8()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;->dataId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public toUpdateOperation()Landroid/content/ContentProviderOperation;
    .locals 1

    .line 1
    invoke-static {p0}, Lexpo/modules/contacts/next/domain/model/Updatable$Data$DefaultImpls;->toUpdateOperation(Lexpo/modules/contacts/next/domain/model/Updatable$Data;)Landroid/content/ContentProviderOperation;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
