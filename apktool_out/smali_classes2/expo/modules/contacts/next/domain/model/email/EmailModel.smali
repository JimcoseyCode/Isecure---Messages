.class public abstract Lexpo/modules/contacts/next/domain/model/email/EmailModel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/email/EmailModel;",
        "",
        "address",
        "",
        "label",
        "Lexpo/modules/contacts/next/domain/model/email/EmailLabel;",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)V",
        "getAddress",
        "()Ljava/lang/String;",
        "getLabel",
        "()Lexpo/modules/contacts/next/domain/model/email/EmailLabel;",
        "mimeType",
        "getMimeType",
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
.field private final address:Ljava/lang/String;

.field private final contentValues:Landroid/content/ContentValues;

.field private final label:Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

.field private final mimeType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)V
    .locals 3

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->address:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->label:Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    .line 4
    const-string v0, "vnd.android.cursor.item/email_v2"

    iput-object v0, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->mimeType:Ljava/lang/String;

    .line 5
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 6
    const-string v2, "mimetype"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    const-string v0, "data1"

    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/email/EmailLabel;->getType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "data2"

    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 9
    const-string p1, "data3"

    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/email/EmailLabel;->getLabel()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->contentValues:Landroid/content/ContentValues;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/contacts/next/domain/model/email/EmailModel;-><init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;)V

    return-void
.end method


# virtual methods
.method public final getAddress()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->address:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabel()Lexpo/modules/contacts/next/domain/model/email/EmailLabel;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->label:Lexpo/modules/contacts/next/domain/model/email/EmailLabel;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/email/EmailModel;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
