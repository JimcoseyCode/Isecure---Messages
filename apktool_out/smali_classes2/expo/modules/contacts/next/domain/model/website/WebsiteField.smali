.class public final Lexpo/modules/contacts/next/domain/model/website/WebsiteField;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data<",
        "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000c\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0002R\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000b\u001a\u00020\u0007X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/website/WebsiteField;",
        "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;",
        "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;",
        "<init>",
        "()V",
        "projection",
        "",
        "",
        "getProjection",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "mimeType",
        "getMimeType",
        "()Ljava/lang/String;",
        "extract",
        "cursor",
        "Landroid/database/Cursor;",
        "extractLabel",
        "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;",
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
.field public static final INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

.field private static final mimeType:Ljava/lang/String;

.field private static final projection:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    .line 7
    .line 8
    const-string v0, "data2"

    .line 9
    .line 10
    const-string v1, "data3"

    .line 11
    .line 12
    const-string v2, "_id"

    .line 13
    .line 14
    const-string v3, "data1"

    .line 15
    .line 16
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->projection:[Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "vnd.android.cursor.item/website"

    .line 23
    .line 24
    sput-object v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->mimeType:Ljava/lang/String;

    .line 25
    .line 26
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

.method private final extractLabel(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;
    .locals 1

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
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "data3"

    .line 15
    .line 16
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Custom;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p1}, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Custom;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Other;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Other;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Ftp;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Ftp;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Work;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Work;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_3
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Home;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Home;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_4
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Profile;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Profile;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_5
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Blog;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Blog;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_6
    sget-object p1, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Homepage;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Homepage;

    .line 52
    .line 53
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public bridge synthetic extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/Extractable;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    move-result-object p1

    return-object p1
.end method

.method public extract(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;
    .locals 4

    const-string v0, "cursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;

    .line 3
    const-string v1, "_id"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lexpo/modules/contacts/next/domain/wrappers/DataId;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    const-string v2, "data1"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-object v3, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->INSTANCE:Lexpo/modules/contacts/next/domain/model/website/WebsiteField;

    invoke-direct {v3, p1}, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->extractLabel(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    move-result-object p1

    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, p1, v3}, Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;-><init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProjection()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/contacts/next/domain/model/website/WebsiteField;->projection:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
