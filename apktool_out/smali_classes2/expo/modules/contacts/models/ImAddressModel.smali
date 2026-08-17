.class public final Lexpo/modules/contacts/models/ImAddressModel;
.super Lexpo/modules/contacts/models/BaseModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/contacts/models/ImAddressModel;",
        "Lexpo/modules/contacts/models/BaseModel;",
        "<init>",
        "()V",
        "",
        "protocol",
        "",
        "serializeService",
        "(I)Ljava/lang/String;",
        "Landroid/database/Cursor;",
        "cursor",
        "Li7/B;",
        "fromCursor",
        "(Landroid/database/Cursor;)V",
        "contentType",
        "Ljava/lang/String;",
        "getContentType",
        "()Ljava/lang/String;",
        "dataAlias",
        "getDataAlias",
        "Landroid/content/ContentValues;",
        "getContentValues",
        "()Landroid/content/ContentValues;",
        "contentValues",
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
    const-string v0, "vnd.android.cursor.item/im"

    .line 5
    .line 6
    iput-object v0, p0, Lexpo/modules/contacts/models/ImAddressModel;->contentType:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "username"

    .line 9
    .line 10
    iput-object v0, p0, Lexpo/modules/contacts/models/ImAddressModel;->dataAlias:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method private final serializeService(I)Ljava/lang/String;
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string p1, "unknown"

    .line 5
    .line 6
    return-object p1

    .line 7
    :pswitch_0
    const-string p1, "netmeeting"

    .line 8
    .line 9
    return-object p1

    .line 10
    :pswitch_1
    const-string p1, "jabber"

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_2
    const-string p1, "icq"

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_3
    const-string p1, "googleTalk"

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_4
    const-string p1, "qq"

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_5
    const-string p1, "skype"

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_6
    const-string p1, "yahoo"

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_7
    const-string p1, "msn"

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_8
    const-string p1, "aim"

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_9
    const-string p1, "custom"

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
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
.method public fromCursor(Landroid/database/Cursor;)V
    .locals 2

    .line 1
    const-string v0, "cursor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lexpo/modules/contacts/models/BaseModel;->fromCursor(Landroid/database/Cursor;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lexpo/modules/contacts/models/BaseModel;->getMap()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "data5"

    .line 14
    .line 15
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-direct {p0, p1}, Lexpo/modules/contacts/models/ImAddressModel;->serializeService(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v1, "service"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/ImAddressModel;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentValues()Landroid/content/ContentValues;
    .locals 3

    .line 1
    invoke-super {p0}, Lexpo/modules/contacts/models/BaseModel;->getContentValues()Landroid/content/ContentValues;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "service"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lexpo/modules/contacts/models/BaseModel;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "data5"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getDataAlias()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/ImAddressModel;->dataAlias:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
