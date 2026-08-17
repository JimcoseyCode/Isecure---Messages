.class public abstract Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B/\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;",
        "",
        "company",
        "",
        "department",
        "jobTitle",
        "phoneticName",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getCompany",
        "()Ljava/lang/String;",
        "getDepartment",
        "getJobTitle",
        "getPhoneticName",
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
.field private final company:Ljava/lang/String;

.field private final contentValues:Landroid/content/ContentValues;

.field private final department:Ljava/lang/String;

.field private final jobTitle:Ljava/lang/String;

.field private final mimeType:Ljava/lang/String;

.field private final phoneticName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->company:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->department:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->jobTitle:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->phoneticName:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "vnd.android.cursor.item/organization"

    .line 13
    .line 14
    iput-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->mimeType:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v1, Landroid/content/ContentValues;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v2, "mimetype"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "data1"

    .line 27
    .line 28
    invoke-virtual {v1, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "data5"

    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "data4"

    .line 37
    .line 38
    invoke-virtual {v1, p1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "data8"

    .line 42
    .line 43
    invoke-virtual {v1, p1, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->contentValues:Landroid/content/ContentValues;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final getCompany()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->company:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContentValues()Landroid/content/ContentValues;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->contentValues:Landroid/content/ContentValues;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDepartment()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->department:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJobTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->jobTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->mimeType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPhoneticName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/next/domain/model/organization/OrganizationModel;->phoneticName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
