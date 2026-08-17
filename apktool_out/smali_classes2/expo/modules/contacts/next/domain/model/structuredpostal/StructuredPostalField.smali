.class public final Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;",
        "<init>",
        "()V",
        "mimeType",
        "",
        "getMimeType",
        "()Ljava/lang/String;",
        "projection",
        "",
        "getProjection",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "extract",
        "cursor",
        "Landroid/database/Cursor;",
        "extractLabel",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

.field private static final mimeType:Ljava/lang/String;

.field private static final projection:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    .line 7
    .line 8
    const-string v0, "vnd.android.cursor.item/postal-address_v2"

    .line 9
    .line 10
    sput-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->mimeType:Ljava/lang/String;

    .line 11
    .line 12
    const-string v7, "data2"

    .line 13
    .line 14
    const-string v8, "data3"

    .line 15
    .line 16
    const-string v1, "_id"

    .line 17
    .line 18
    const-string v2, "data4"

    .line 19
    .line 20
    const-string v3, "data7"

    .line 21
    .line 22
    const-string v4, "data8"

    .line 23
    .line 24
    const-string v5, "data9"

    .line 25
    .line 26
    const-string v6, "data10"

    .line 27
    .line 28
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->projection:[Ljava/lang/String;

    .line 33
    .line 34
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

.method private final extractLabel(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;
    .locals 2

    .line 1
    const-string v0, "data2"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const-string v0, "data3"

    .line 21
    .line 22
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Custom;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Custom;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    sget-object p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Other;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Other;

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_1
    sget-object p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Work;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Work;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    sget-object p1, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Home;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Home;

    .line 46
    .line 47
    return-object p1
.end method


# virtual methods
.method public bridge synthetic extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/Extractable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    move-result-object p1

    return-object p1
.end method

.method public extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;
    .locals 10

    const-string v0, "cursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;

    .line 3
    const-string v0, "_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4
    const-string v0, "data4"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 5
    const-string v0, "data7"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 6
    const-string v0, "data8"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 7
    const-string v0, "data9"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 8
    const-string v0, "data10"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 9
    sget-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;

    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->extractLabel(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    move-result-object v8

    const/4 v9, 0x0

    .line 10
    invoke-direct/range {v1 .. v9}, Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProjection()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalField;->projection:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
