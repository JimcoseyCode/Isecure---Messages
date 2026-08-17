.class public abstract Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001BW\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;",
        "",
        "givenName",
        "",
        "middleName",
        "familyName",
        "prefix",
        "suffix",
        "phoneticGivenName",
        "phoneticMiddleName",
        "phoneticFamilyName",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getGivenName",
        "()Ljava/lang/String;",
        "getMiddleName",
        "getFamilyName",
        "getPrefix",
        "getSuffix",
        "getPhoneticGivenName",
        "getPhoneticMiddleName",
        "getPhoneticFamilyName",
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

.field private final familyName:Ljava/lang/String;

.field private final givenName:Ljava/lang/String;

.field private final middleName:Ljava/lang/String;

.field private final mimeType:Ljava/lang/String;

.field private final phoneticFamilyName:Ljava/lang/String;

.field private final phoneticGivenName:Ljava/lang/String;

.field private final phoneticMiddleName:Ljava/lang/String;

.field private final prefix:Ljava/lang/String;

.field private final suffix:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->givenName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->middleName:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->familyName:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->prefix:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->suffix:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticGivenName:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticMiddleName:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticFamilyName:Ljava/lang/String;

    .line 19
    .line 20
    const-string v0, "vnd.android.cursor.item/name"

    .line 21
    .line 22
    iput-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->mimeType:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, Landroid/content/ContentValues;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v2, "mimetype"

    .line 30
    .line 31
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "data2"

    .line 35
    .line 36
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "data5"

    .line 43
    .line 44
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string p1, "data3"

    .line 48
    .line 49
    invoke-virtual {v1, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p1, "data4"

    .line 53
    .line 54
    invoke-virtual {v1, p1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string p1, "data6"

    .line 58
    .line 59
    invoke-virtual {v1, p1, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string p1, "data7"

    .line 63
    .line 64
    invoke-virtual {v1, p1, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string p1, "data8"

    .line 68
    .line 69
    invoke-virtual {v1, p1, p7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string p1, "data9"

    .line 73
    .line 74
    invoke-virtual {v1, p1, p8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->contentValues:Landroid/content/ContentValues;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFamilyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->familyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGivenName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->givenName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMiddleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->middleName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticFamilyName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticFamilyName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticGivenName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticGivenName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticMiddleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->phoneticMiddleName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredname/StructuredNameModel;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
