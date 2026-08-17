.class public final Lexpo/modules/contacts/models/UrlAddressModel;
.super Lexpo/modules/contacts/models/BaseModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000cH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/contacts/models/UrlAddressModel;",
        "Lexpo/modules/contacts/models/BaseModel;",
        "<init>",
        "()V",
        "contentType",
        "",
        "getContentType",
        "()Ljava/lang/String;",
        "dataAlias",
        "getDataAlias",
        "getLabelFromCursor",
        "cursor",
        "Landroid/database/Cursor;",
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
.field private final contentType:Ljava/lang/String;

.field private final dataAlias:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/models/BaseModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "vnd.android.cursor.item/website"

    .line 5
    .line 6
    iput-object v0, p0, Lexpo/modules/contacts/models/UrlAddressModel;->contentType:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "url"

    .line 9
    .line 10
    iput-object v0, p0, Lexpo/modules/contacts/models/UrlAddressModel;->dataAlias:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/UrlAddressModel;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDataAlias()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/UrlAddressModel;->dataAlias:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected getLabelFromCursor(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "cursor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lexpo/modules/contacts/models/BaseModel;->getLabelFromCursor(Landroid/database/Cursor;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "data2"

    .line 13
    .line 14
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const-string p1, "unknown"

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    const-string p1, "other"

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    const-string p1, "ftp"

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_2
    const-string p1, "work"

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_3
    const-string p1, "home"

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_4
    const-string p1, "profile"

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_5
    const-string p1, "blog"

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_6
    const-string p1, "homepage"

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    return-object v0

    .line 50
    nop

    .line 51
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
