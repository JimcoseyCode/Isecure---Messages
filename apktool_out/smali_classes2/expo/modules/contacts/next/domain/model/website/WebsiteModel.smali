.class public abstract Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;",
        "",
        "url",
        "",
        "label",
        "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;)V",
        "getUrl",
        "()Ljava/lang/String;",
        "getLabel",
        "()Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;",
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
.field private final contentValues:Landroid/content/ContentValues;

.field private final label:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

.field private final mimeType:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;)V
    .locals 3

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->url:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->label:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    .line 12
    .line 13
    const-string v0, "vnd.android.cursor.item/website"

    .line 14
    .line 15
    iput-object v0, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->mimeType:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Landroid/content/ContentValues;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "mimetype"

    .line 23
    .line 24
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "data1"

    .line 28
    .line 29
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;->getType()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "data2"

    .line 41
    .line 42
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "data3"

    .line 46
    .line 47
    invoke-virtual {p2}, Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;->getLabel()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->contentValues:Landroid/content/ContentValues;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabel()Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->label:Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/website/WebsiteModel;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
