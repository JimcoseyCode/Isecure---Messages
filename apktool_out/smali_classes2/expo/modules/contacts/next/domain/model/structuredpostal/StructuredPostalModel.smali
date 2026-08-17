.class public abstract Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001BA\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;",
        "",
        "street",
        "",
        "city",
        "region",
        "postcode",
        "country",
        "label",
        "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V",
        "getStreet",
        "()Ljava/lang/String;",
        "getCity",
        "getRegion",
        "getPostcode",
        "getCountry",
        "getLabel",
        "()Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;",
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
.field private final city:Ljava/lang/String;

.field private final contentValues:Landroid/content/ContentValues;

.field private final country:Ljava/lang/String;

.field private final label:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

.field private final mimeType:Ljava/lang/String;

.field private final postcode:Ljava/lang/String;

.field private final region:Ljava/lang/String;

.field private final street:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;)V
    .locals 3

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->street:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->city:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->region:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->postcode:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->country:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p6, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->label:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    .line 20
    .line 21
    const-string v0, "vnd.android.cursor.item/postal-address_v2"

    .line 22
    .line 23
    iput-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->mimeType:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Landroid/content/ContentValues;

    .line 26
    .line 27
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "mimetype"

    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "data4"

    .line 36
    .line 37
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p1, "data7"

    .line 41
    .line 42
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string p1, "data8"

    .line 46
    .line 47
    invoke-virtual {v1, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "data9"

    .line 51
    .line 52
    invoke-virtual {v1, p1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "data10"

    .line 56
    .line 57
    invoke-virtual {v1, p1, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p6}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;->getType()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string p2, "data2"

    .line 69
    .line 70
    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 71
    .line 72
    .line 73
    const-string p1, "data3"

    .line 74
    .line 75
    invoke-virtual {p6}, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;->getLabel()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->contentValues:Landroid/content/ContentValues;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final getCity()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->city:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->country:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabel()Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->label:Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPostcode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->postcode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRegion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->region:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStreet()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalModel;->street:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
